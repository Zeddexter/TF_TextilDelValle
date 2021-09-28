package TextilDelValle;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ejecutora {
    public static void main(String[] args) {

        String linea = "-------------------------------------";
        Empresa emp1 = new Empresa();
        emp1.setNombreEmpresa("Textil del Valle");
        emp1.mostrarNombreEmpresa();

        Operario oper = new Operario();

       try {

            oper.registrarOperario(new MaquinistaCosturaRecta(45877841, "Anderson Fernandez Cruz", 500,true,"REC-010" ));
            oper.registrarOperario(new MaquinistaCosturaRecta(45877844, "Jhon Rojas Martinez", 500,true,"REC-020"));
            oper.registrarOperario(new MaquinistaCosturaRecta(45877455, "Javier Martinez Rojas", 500,true,"REC-040"));

            oper.registrarOperario(new MaquinistaCosturaPlana(21847123, "Juan Carlos Ramos Mata", 500,true,"PL-001"));
            oper.registrarOperario(new MaquinistaCosturaPlana(44877841, "Jair Peña Morán", 500,true,"PL-002"));

            System.out.println(linea);
            System.out.println("Lista de Operarios");
            System.out.println(linea);
            oper.listarOperarios();

           System.out.println("------------------------------------");
           System.out.println("Búsqueda de Operario por DNI        ");
           System.out.println("------------------------------------");

            //hacer una búsqueda de operario por DNI
            oper.encontrarOperario(45877844);

            System.out.println(linea);
            oper.registrarOperario(new Operario(44877841,"Jair Peña Morán",1000,true) );

        } catch (ExcepcionDNIRegistrado ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("");
        System.out.println("");

        System.out.println(linea);
        System.out.println("Reporte Línea Producción");
        System.out.println(linea);

        //Asignación de operario a linea de producción
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","06/09/2021",45877841,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","07/09/2021",45877841,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","08/09/2021",45877841,0,"Muy Dificil",550,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","09/09/2021",45877841,1,"Muy Dificil",0,0,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","10/09/2021",45877841,0,"Muy Dificil",380,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","11/09/2021",45877841,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","12/09/2021",45877841,0,"Muy Dificil",410,540,0,""));


        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","06/09/2021",45877844,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","07/09/2021",45877844,0,"Muy Dificil",550,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","08/09/2021",45877844,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","09/09/2021",45877844,0,"Muy Dificil",470,540,1,"Cometió falta grave al reglamento de la empresa"));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","10/09/2021",45877844,0,"Muy Dificil",180,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","11/09/2021",45877844,0,"Muy Dificil",400,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","12/09/2021",45877844,0,"Muy Dificil",280,540,0,""));

        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","06/09/2021",45877455,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","07/09/2021",45877455,0,"Muy Dificil",310,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","08/09/2021",45877455,0,"Muy Dificil",420,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","09/09/2021",45877455,0,"Muy Dificil",480,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","10/09/2021",45877455,0,"Muy Dificil",300,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","11/09/2021",45877455,0,"Muy Dificil",380,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 01","12/09/2021",45877455,0,"Muy Dificil",410,540,0,""));

        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","06/09/2021",44877841,0,"Normal",340,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","07/09/2021",44877841,0,"Normal",250,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","08/09/2021",44877841,0,"Normal",410,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","09/09/2021",44877841,0,"Normal",400,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","10/09/2021",44877841,0,"Normal",300,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","11/09/2021",44877841,0,"Normal",380,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","12/09/2021",44877841,0,"Normal",409,540,0,""));

        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","06/09/2021",21847123,0,"Normal",340,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","07/09/2021",21847123,0,"Normal",250,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","08/09/2021",21847123,0,"Normal",410,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","09/09/2021",21847123,0,"Normal",400,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","10/09/2021",21847123,0,"Normal",300,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","11/09/2021",21847123,0,"Normal",380,540,0,""));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","12/09/2021",21847123,0,"Normal",409,540,0,""));

        emp1.listarLineasProduccion();
        System.out.println("");
        System.out.println(linea);

        // Se realiza el cierre Semanal
        emp1.CierreSemanal(new CierreSemanal(2021,36));

        System.out.println("------------------------------------------------------------");
        System.out.println("Se intenta registrar un nuevo Operario en un periodo cerrado");
        System.out.println("------------------------------------------------------------");

        //Se intenta realizar una asignación en una semana ya cerrada
        emp1.registrarOperarioLineaProduccion(new LineaProduccion(2021,36,"Linea 02","12/09/2021",44877841,0,"B",409,540,0,""));
        //Mostrar mensaje Excepcion por cierre de mes
        System.out.println("\n");
        //oper.listarOperarios();
        emp1.SueldoTotal(oper);
        System.out.println("\n");
        //Muestra todos los operarios
        //oper.listarOperarios();

    }
}
