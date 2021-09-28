package TextilDelValle;

public class ExcepcionPeriodoCerrado extends Exception{
    public ExcepcionPeriodoCerrado(String mensaje) {
        super("Atención!: "+ mensaje);
    }
}
