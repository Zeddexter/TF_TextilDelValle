package TextilDelValle;
import javax.sound.sampled.Line;
import java.util.ArrayList;

public class Empresa {
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    private String nombreEmpresa;
    ArrayList<Operario> operarios;
    ArrayList<CategoriaBono> categoriaBonos;
    ArrayList<LineaProduccion> lineasProduccion;

    public void setCierreDiario(String cierreDiario) {
        CierreDiario = cierreDiario;
    }

    private String CierreDiario;

    public Empresa(){
        this.operarios = new ArrayList<>();
        this.categoriaBonos = new ArrayList<>();
        this.lineasProduccion = new ArrayList<>();
    }


    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
    public void listarTrabajadores() {
        for (Operario i : operarios) {
            System.out.println(i);
        }
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

    public void registrarCategoriaBono(CategoriaBono categoriabono)  {
        categoriaBonos.add(categoriabono);
    }

    public void listarCategorias() {
        for (CategoriaBono i : categoriaBonos) {
            System.out.println(i);
        }
    }

    public void registrarOperarioLineaProduccion(LineaProduccion lineaProduccion)  {
        lineasProduccion.add(lineaProduccion);
    }
    public void listarLineasProduccion() {
        for (LineaProduccion i : lineasProduccion) {
            System.out.println(i);
        }
    }
}