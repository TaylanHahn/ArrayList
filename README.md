# Resumo de ArrayList | JAVA ☕

## 1. Criar um ArrayList
````java
import java.util.ArrayList;
ArrayList<String> nomes = new ArrayList<>();
````
  - Com tipo personalizado:
    ````java
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ````
## 2. Adicionar elementos
````java
nomes.add("Ana");
nomes.add("João");
````
## 3. Acessar elementos
````java
String nome = nomes.get(0);
````
## 4. Modificar elementos
````java
nomes.set(0, "Carla");
````
## 5. Remover elementos
````java
nomes.remove("João");      // remove o objeto
nomes.remove(0);           // remove pelo índice
````
## 6. Verificar tamanho
````java
int tamanho = nomes.size();
````
## 7. Verificar existência
````java
if (nomes.contains("Ana")) { ... }
````
## 8. Percorrer o ArrayList > `for-each`
A forma mais limpa e recomendada para ler dados:
````java
for (String nome : nomes) {
    System.out.println(nome);
}
````
## 9. `for` tradicional (para usar o índice)
````java
for (int i = 0; i < nomes.size(); i++) {
    System.out.println(nomes.get(i));
}
````
## 10. `for` aninhado 
Usado quando você tem listas dentro de listas ou precisa comparar objetos:
````java
for (Pessoa p : pessoas) {
    for (Telefone t : p.getTelefones()) {
        System.out.println(p.getNome() + " - " + t.getNumero());
    }
}
````
  - A classe Pessoa possui um atributo do tipo `ArrayList<Telefone>` e o método `getNumero()` na classe Telefone.
  - A classe Telefone possui um atributo `numero` e o método `getNumero()`.
## 11. ArrayList como parâmetro de método
````java
public void imprimirNomes(ArrayList<String> lista) {
    for (String nome : lista) {
        System.out.println(nome);
    }
}
````
## 12. ArrayList retornado por método
````java
public ArrayList<String> gerarLista() {
    ArrayList<String> lista = new ArrayList<>();
    lista.add("A");
    lista.add("B");
    return lista;
}
````
## 13. Manipulação correta (boas práticas)
✔ Sempre usar tipo genérico `ArrayList<Tipo>`.

✔ Evitar remover dentro de `for-each` (use iterator ou for tradicional).

✔ Usar variável local somente quando for necessário armazenar dados temporários ou resultados de métodos dentro do loop.
````java
for (Pessoa p : pessoas) {
    String nomeFormatado = p.getNome().toUpperCase();
    System.out.println(nomeFormatado);
}
````
## 14. Usar de ArrayList dentro da própria classe
````java
public class Turma {

    private ArrayList<String> alunos = new ArrayList<>();

    public void adicionar(String nome) {
        alunos.add(nome);
    }

    public void listar() {
        for (String a : alunos) {
            System.out.println(a);
        }
    }
}
````
## 15. Usar de ArrayList em outra classe (mesmo pacote/pasta)
Classe A:
````java
public class BancoDeDados {
    public ArrayList<String> getUsuarios() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Taylan");
        lista.add("Marcos");
        return lista;
    }
}
````
Classe B:
````java
public class App {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();
        ArrayList<String> usuarios = bd.getUsuarios();

        for (String u : usuarios) {
            System.out.println(u);
        }
    }
}
````
## 16. ArrayList de objetos
````java
ArrayList<Pessoa> pessoas = new ArrayList<>();

pessoas.add(new Pessoa("Ana", 20));
pessoas.add(new Pessoa("João", 30));

for (Pessoa p : pessoas) {
    System.out.println(p.getNome());
}
````
## 17. ArrayList dentro de classe com métodos organizados
````java
public class Cadastro {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public Pessoa buscarPorNome(String nome) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarTodos() {
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
````
## 18. `for-each` vs. `for tradicional`
> Use for-each quando:
- Apenas precisa ler dados
- Não precisa de índice
- Não vai remover itens

> Use for tradicional quando:
- Precisa acessar pelo índice
- Vai remover/modificar elementos durante o loop
- Precisa percorrer duas listas pelo índice ao mesmo tempo
## 19. Importante: ArrayList ≠ Array
- Array é fixo (`String[] nomes = new String[10];`)
- ArrayList é dinâmico (`new ArrayList<>()`)

# Resumindo...
- ***Criar:*** `ArrayList<T> lista = new ArrayList<>();`
- ***Adicionar:*** `lista.add(obj);`
- ***Ler:*** `lista.get(i);` ou `for (Tipo t : lista)`
- ***Editar:*** `lista.set(i, novoValor);`
- ***Remover:*** `lista.remove(obj)` ou `lista.remove(i)`
- ***Usar em métodos:*** passar por parâmetro ou retornar.
- ***Usar em classes:*** declarar como atributo privado e manipular por métodos.
- `For-each` para leitura, `for` tradicional para edição.
- Funciona igual dentro da classe, fora da classe e no mesmo pacote.
  
----------------------------------------------------------------------------------

### ✅ Código de exemplo (Main + 3 Classes)
- Classe Pessoa – representa um objeto.
- Classe Cadastro – gerencia um ArrayList de Pessoa.
- Classe Utils – contém métodos utilitários que recebem/retornam ArrayList.
- Classe Main – demonstra tudo funcionando.
