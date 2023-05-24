public class MilitarExercito extends Militar implements Carreira{
    private boolean participouGuerra;
    private boolean ganhouGuerra;

    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }

    public boolean podeProgredir() {
        return (participouGuerra == true && ganhouGuerra == true);
    }
}
