public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        cadastro.adicionarPessoa(new Pessoa("Ana", 22));
        cadastro.adicionarPessoa(new Pessoa("Carlos", 17));
        cadastro.adicionarPessoa(new Pessoa("Marcos", 30));

        System.out.println("=== LISTA COMPLETA ===");
        cadastro.listarPessoas();

        System.out.println("\n=== BUSCA POR NOME ===");
        Pessoa achada = cadastro.buscarPorNome("Ana");
        if (achada != null) {
            System.out.println("Encontrada: " + achada);
        }

        System.out.println("\n=== MAIORES DE IDADE ===");
        Utils.imprimirLista(Utils.maioresDeIdade(cadastro.getLista()));
    }
}


