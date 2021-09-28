package TextilDelValle;

public class MaquinistaCosturaPlana extends Operario{
    private String maquiCosturaPlana ="";
    public MaquinistaCosturaPlana(int dni, String nombres, double sueldobase, boolean isBono,String maquiCosturaPlana ) {
        super(dni, nombres, sueldobase, isBono);
        this.maquiCosturaPlana = maquiCosturaPlana;
    }
    @Override
    public String toString() {
        return "MaquinistaCosturaPlana{" + super.toString() +
                        " Maquina = '" + maquiCosturaPlana + '\''
                ;
    }
}
