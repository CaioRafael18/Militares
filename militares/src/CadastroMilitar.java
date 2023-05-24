import java.util.ArrayList;
import java.util.List;

public class CadastroMilitar {
    private List<Militar> militares;

    public CadastroMilitar() {
        militares = new ArrayList<>();
    }

    public void adicionarMilitar(Militar militar){
        militares.add(militar);
    }

    public List<Militar> militaresAptosProgredir(){
        List<Militar> aptos = new ArrayList<>();
        for (Militar militar : militares){
            if(militar instanceof Carreira){
                Carreira carreira = (Carreira) militar;
                if (carreira.podeProgredir()){
                    aptos.add(militar);
                }
            }
        }
        return aptos;
    }

    public void realizarProgressao(){
        List<Militar> aptos = militaresAptosProgredir();
        for(Militar militar : aptos){
            System.out.println("O militar com matricula " + militar.getMatricula() + " Evoluiu de patente!");
        }
    }

}


