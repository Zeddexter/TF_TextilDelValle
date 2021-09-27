package TextilDelValle;

import java.util.ArrayList;

public class Operario {

    private int dni;
    private String nombres;
    private double sueldobase;
    private boolean isBono;
    public ArrayList<Operario> operarios;
    public boolean isBono() {
        return isBono;
    }

    public  Operario(){
        this.operarios = new ArrayList<>();
    }
    public Operario(int dni, String nombres, double sueldobase, boolean isBono) {
        this.dni = dni;
        this.nombres = nombres;
        this.sueldobase = sueldobase;
        this.isBono = isBono;
    }

    public double getSueldobase() {
        return sueldobase;
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
                ", sueldo Básico Semanal =" + sueldobase ;
    }

    public  void CalcularSueldo(){

        double sueldototal = sueldobase;

          System.out.println("El Sueldo total  es: "+sueldototal) ;
    }

    public void registrarOperario(Operario operario) throws ExcepcionDNIRegistrado {
        int DNIBuscado = operario.getDni();
        if (operarios != null){
            for (Operario t : operarios) {
                if (DNIBuscado==t.getDni()) {
                    throw new ExcepcionDNIRegistrado(
                            "El DNI " + DNIBuscado + " del trabajador " +
                                    operario.getNombres() + " ya está registrado."
                    );
                }
            }
        }
        operarios.add(operario);
    }
    public double EncontrarSueldoBaseOperario(int DNI) {
        double sueldo = 0.0;
        for (Operario t : operarios) {
            if (DNI == t.getDni()) {
                sueldo = t.getSueldobase();
            }
        }
        return sueldo;
    }
    public void listarOperarios() {
        for (Operario i : operarios) {
            System.out.println(i);
        }
    }
    public Operario DatosOperario(int dni){
        Operario oper = new Operario();
        for (Operario t : operarios) {
            if (dni == t.getDni()) {
                oper =    t;
            }
        }
        return oper;
    }


    public void encontrarOperario(int DNI) throws ExcepcionNoEncuentraOperario {
        boolean encontrado = false;
        for (Operario t : operarios) {
            if (DNI == t.getDni()) {
                System.out.println( "Se han encontrado los datos para el trabajador con DNI "
                        + DNI + " y son los siguientes \n" + t.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new ExcepcionNoEncuentraOperario(
                    "El DNI " + DNI + " no está registrado"
            );
        }
    }
    public double EncontrarSueldoBase(int dni){
        double sueldobase=0.0;
        for (Operario t : operarios) {
            if(t.getDni()==dni){
                sueldobase = t.sueldobase;
            }
        }
        return sueldobase;
    }

}
