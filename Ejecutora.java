package TextilDelValle;

import java.sql.SQLOutput;

public class Ejecutora {
    public static void main(String[] args) {
        String linea = "-------------------------------------";
        Empresa emp1 = new Empresa();
        emp1.setNombreEmpresa("Textil Del Valle");
        try {
            emp1.registrarOperario(new Operario(45877841, "Anderson Fernandez Cruz", 1000));
            emp1.registrarOperario(new Operario(45877844, "Jhon Rojas Martinez", 1000));
            emp1.registrarOperario(new Operario(45877455, "Javier Martinez Rojas", 1000));
            emp1.registrarOperario(new Operario(21847123, "Juan Carlos Ramos Mata", 1000));
            emp1.registrarOperario(new Operario(44877841, "Jair Peña Morán", 1000));

            System.out.println(linea);
            System.out.println("Empresa: "+emp1.getNombreEmpresa());
            System.out.println(linea);
            emp1.encontrarOperario(45877844);
            System.out.println(linea);
            emp1.registrarOperario(new Operario(44877841,"Jair Peña Morán",1000) );

        } catch (ExcepcionDNIRegistrado ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(linea);
        System.out.println("Categoria de bonos");
        System.out.println(linea);
        emp1.registrarCategoriaBono(new CategoriaBono("A",1.0,12));
        emp1.registrarCategoriaBono(new CategoriaBono("B",0.8,10));
        emp1.registrarCategoriaBono(new CategoriaBono("C",0.6,6));
        emp1.registrarCategoriaBono(new CategoriaBono("D",0.4,4));
        emp1.registrarCategoriaBono(new CategoriaBono("E",0.2,2));
        emp1.listarCategorias();
        System.out.println(linea);
        System.out.println("Reporte Línea Producción");
        System.out.println(linea);
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","06/09/2021",45877841,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","07/09/2021",45877841,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","08/09/2021",45877841,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","09/09/2021",45877841,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","10/09/2021",45877841,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","11/09/2021",45877841,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","12/09/2021",45877841,0,"A",480,540));

        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","06/09/2021",45877844,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","07/09/2021",45877844,0,"A",550,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","08/09/2021",45877844,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","09/09/2021",45877844,0,"A",470,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","10/09/2021",45877844,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","11/09/2021",45877844,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","12/09/2021",45877844,0,"A",280,540));

        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","06/09/2021",45877455,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","07/09/2021",45877455,0,"A",310,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","08/09/2021",45877455,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","09/09/2021",45877455,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","10/09/2021",45877455,0,"A",480,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","11/09/2021",45877455,0,"A",380,540));
        emp1.registrarOperarioLineaProduccion(new LineaProduccion("Linea 01","12/09/2021",45877455,0,"A",410,540));
        emp1.listarLineasProduccion();
        System.out.println(linea);


    }
}
