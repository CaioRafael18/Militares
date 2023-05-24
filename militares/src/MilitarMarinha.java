public class MilitarMarinha extends Militar implements Carreira{
    private boolean participouConsertoAviao;

    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
        super(matricula, patente);
        this.participouConsertoAviao = participouConsertoAviao;
    }
    public boolean podeProgredir() {
        return (participouConsertoAviao = true);
    }
}
