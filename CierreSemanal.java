package TextilDelValle;

public class CierreSemanal {
    public int getAnio() {
        return anio;
    }

    public int getSemana() {
        return semana;
    }

    private int anio;
    private int semana;

    public CierreSemanal(int anio, int semana) {
        this.anio = anio;
        this.semana = semana;
    }
}
