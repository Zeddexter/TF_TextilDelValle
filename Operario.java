package TextilDelValle;

public class Operario {
    private int dni;
    private String nombres;
    private double sueldobase;

    public Operario(int dni, String nombres, double sueldobase) {
        this.dni = dni;
        this.nombres = nombres;
        this.sueldobase = sueldobase;
    }

    public String getNombres() {
        return nombres;
    }
    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return  " nombre='" + nombres + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldoBasico=" + sueldobase ;
    }
}
