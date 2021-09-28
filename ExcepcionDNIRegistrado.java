package TextilDelValle;

public class ExcepcionDNIRegistrado extends Exception{
    public ExcepcionDNIRegistrado(String mensaje) {
        super("Atención!: "+ mensaje);
    }
}
    