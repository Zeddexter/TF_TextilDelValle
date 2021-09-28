package TextilDelValle;

import javax.sound.sampled.Line;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Empresa {
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    private String nombreEmpresa;

    ArrayList<LineaProduccion> lineasProduccion;
    ArrayList<CierreSemanal> cierresSemanales;

    public void setCierreDiario(String cierreDiario) {
        CierreDiario = cierreDiario;
    }

    private String CierreDiario;

    public Empresa(){
        this.lineasProduccion = new ArrayList<>();
        this.cierresSemanales = new ArrayList<>();
    }


    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void mostrarNombreEmpresa(){
        System.out.println("***************************");
        System.out.println("Empresa: "+ nombreEmpresa);
        System.out.println("***************************");
    }



    public void registrarOperarioLineaProduccion(LineaProduccion lineaProduccion)  {
        try
        {
            ValidarCierreSemanal(lineaProduccion.getAnio(),lineaProduccion.getSemana());
        }
        catch(ExcepcionPeriodoCerrado ex)
        {
            System.out.println(ex.getMessage());
        }
        lineasProduccion.add(lineaProduccion);
    }
    public void listarLineasProduccion() {
        double totalBonoDiario =0.0;
        double subTotalBonoxLinea =0.0;
        String lineaCostura = "";
        double subtotalBono = 0.0;
        int dni = 0;
        int indicadorDiainjustificado = 0;
        int anulabono = 0;
        for (LineaProduccion i : lineasProduccion) {

            double pagoBono = CategoriaBono.ObtieneValorCategoria(i.getCategoria(), i.CalcularEficiencia());

            indicadorDiainjustificado = indicadorDiainjustificado + i.getNroDiasInjustificados();
            anulabono = anulabono + i.isAnulaBono();


            if(dni != i.getDni()){
                if(dni != 0){

                    if (indicadorDiainjustificado>0){
                        subtotalBono = 0.0;
                        subTotalBonoxLinea = 0.0;
                        indicadorDiainjustificado = 0;
                    }
                    if (anulabono>0){
                        subtotalBono = 0.0;
                        subTotalBonoxLinea = 0.0;
                        anulabono =0;
                    }

                    System.out.println("================================================================");
                    System.out.println("SubTotal Semanal por Operario = "+subtotalBono);
                    System.out.println("================================================================");
                }

                subtotalBono = 0;

                subtotalBono = subtotalBono+pagoBono ;
                dni = i.getDni();
            }
            else
            {
                subtotalBono = subtotalBono+pagoBono ;
            }
            if (lineaCostura != i.getLinea()) {
                System.out.println("==================================================");
                System.out.println("Total bono Grupal por línea = "+subTotalBonoxLinea );
                System.out.println("==================================================");
                lineaCostura = i.getLinea();
                subTotalBonoxLinea = 0;
                subTotalBonoxLinea = subTotalBonoxLinea+pagoBono;
            } else
            {

                subTotalBonoxLinea = subTotalBonoxLinea+pagoBono;
            }
            totalBonoDiario = totalBonoDiario + subtotalBono;

            System.out.println(i+", Pago Bono = "+pagoBono);
        }
        System.out.println("================================================================");
        System.out.println("SubTotal Semanal por Operario = "+subtotalBono);
        System.out.println("================================================================");

        System.out.println("==================================================");
        System.out.println("Total bono Grupal por línea = "+subTotalBonoxLinea );
        System.out.println("==================================================");


        System.out.println("Total Bono =  "+totalBonoDiario);
        System.out.println("================================================================");
    }

    public void ValidarCierreSemanal(int anio, int semana) throws ExcepcionPeriodoCerrado{
        for (CierreSemanal t : cierresSemanales) {
            if (anio == t.getAnio() && semana == t.getSemana()) {
                throw new ExcepcionPeriodoCerrado(
                        "El periodo: "+anio+"-"+semana+" se encuentra cerrado, no puede asignar nuevas líneas"
                );
            }
        }

    }

    public void CierreSemanal(CierreSemanal cierre){
        cierresSemanales.add(cierre);
    }

    public  double ObtenerBonoSemanal(int dni){
        double bono = 0;
        for (LineaProduccion t : lineasProduccion ) {
            if(dni == t.getDni())
            {
                bono = bono+ CategoriaBono.ObtieneValorCategoria(t.getCategoria(), t.CalcularEficiencia());
                if(dni != 0) {

                    if (t.getNroDiasInjustificados() > 0) {
                        return 0.0;

                    }
                    if (t.isAnulaBono() > 0) {
                        return 0.0;
                    }
                }
            }
        }
        return bono;
    }

    public void SueldoTotal(Operario oper){
        double pagototal = 0.0;
        double bono = 0.0;
        //recorro mi lista de lineas de producción -- obtengo su bono x dni

        for(Operario t : oper.operarios)
        {
            //for (LineaProduccion r : lineasProduccion ) {
            // if(t.getDni() == r.getDni())
            // {
            //    bono = bono+ this.ObtenerBonoSemanal(r.getDni())
            // }
            // else
            //  {
            //     bono = CategoriaBono.ObtieneValorCategoria(r.getCategoria(), r.CalcularEficiencia());
            //  }
            // }
            pagototal = t.getSueldobase()+ this.ObtenerBonoSemanal(t.getDni());
            System.out.printf(t.toString()+" Pago Total= "+pagototal+"\n");

        }

        //Total

        //Clase Operario tengo su Sueldo Base


    }
}