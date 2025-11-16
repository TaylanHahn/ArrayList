import java.util.ArrayList;

public class Cadastro {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public void listarPessoas() {
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }

    public Pessoa buscarPorNome(String nome) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Pessoa> getLista() {
        return pessoas;
    }
}
