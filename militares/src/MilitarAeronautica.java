public class MilitarAeronautica extends Militar implements Carreira{
    private int anosPatente;
    private int horasVoo;

    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo) {
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }


    public boolean podeProgredir() {
        return (anosPatente > 2 && horasVoo > 100);
    }
}
