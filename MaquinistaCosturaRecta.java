package TextilDelValle;

public class MaquinistaCosturaRecta extends Operario {
    private String maquinaRectilineo = "";

    public MaquinistaCosturaRecta(int dni, String nombres, double sueldobase, boolean isBono, String maquinaRectilineo) {
        super(dni, nombres, sueldobase, isBono);
        this.maquinaRectilineo = maquinaRectilineo;

    }

    @Override
    public String toString() {
        return
                super.toString() +
                " Maquina = '" + maquinaRectilineo + '\'' ;
    }
}
