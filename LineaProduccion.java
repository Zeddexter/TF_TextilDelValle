package TextilDelValle;

import java.util.Date;

public class LineaProduccion {

    private String linea;
    private String dia ;
    private int dni;
    private int nroDiasInjustificados ;
    private String categoria ;

    public LineaProduccion(String linea,String dia, int dni, int nroDiasInjustificados, String categoria, double minutosproducidos, double minutosdisponibles) {
        this.linea = linea;
        this.dia = dia;
        this.dni = dni;
        this.nroDiasInjustificados = nroDiasInjustificados;
        this.categoria = categoria;
        this.minutosproducidos = minutosproducidos;
        this.minutosdisponibles = minutosdisponibles;
    }

    private double minutosproducidos;
    private double minutosdisponibles;
    protected void CalcularPorcentajeBono(){

    }
    @Override
    public String toString() {
        return "" +
                "linea='" + linea + '\'' +
                ", dia='" + dia + '\'' +
                ", dni=" + dni +
                ", nroDiasInjustificados=" + nroDiasInjustificados +
                ", categoria='" + categoria + '\'' +
                ", minutosproducidos=" + minutosproducidos +
                ", minutosdisponibles=" + minutosdisponibles +
                "";
    }
}
