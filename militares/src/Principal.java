import java.util.List;

public class Principal {
    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();

        MilitarAeronautica militarAeronautica = new MilitarAeronautica(1, "Soldado", 10, 102);
        MilitarExercito militarExercito = new MilitarExercito(2, "Cabo", true, true);
        MilitarMarinha militarMarinha = new MilitarMarinha(3, "Tenente", true);

        cadastro.adicionarMilitar(militarAeronautica);
        cadastro.adicionarMilitar(militarExercito);
        cadastro.adicionarMilitar(militarMarinha);

        List<Militar> aptosProgredir = cadastro.militaresAptosProgredir();
        cadastro.realizarProgressao();
    }
}