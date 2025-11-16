import java.util.ArrayList;

public class Utils {

    public static void imprimirLista(ArrayList<Pessoa> lista) {
        for (Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome() + " | Idade: " + p.getIdade());
        }
    }

    public static ArrayList<Pessoa> maioresDeIdade(ArrayList<Pessoa> lista) {
        ArrayList<Pessoa> maiores = new ArrayList<>();

        for (Pessoa p : lista) {
            if (p.getIdade() >= 18) {
                maiores.add(p);
            }
        }
        return maiores;
    }
}
