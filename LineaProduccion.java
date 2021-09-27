package TextilDelValle;

import java.util.Date;

public class LineaProduccion {
    public int getAnio() {
        return anio;
    }

    public int getSemana() {
        return semana;
    }

    private int anio = 0;
    private int semana = 0;
    private String linea;
    private String dia ;
    private int dni;
    private int nroDiasInjustificados ;
    private String categoria ;
    private double minutosproducidos;
    private double minutosdisponibles;

    public int isAnulaBono() {
        return anulaBono;
    }

    private int anulaBono;
    private String motivo;

    public String getDia() {
        return dia;
    }

    public int getNroDiasInjustificados() {
        return nroDiasInjustificados;
    }

    public String getLinea() {
        return linea;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDni() {
        return dni;
    }

    public LineaProduccion(int anio, int semana,String linea, String dia, int dni, int nroDiasInjustificados, String categoria, double minutosproducidos, double minutosdisponibles, int anulaBono,String motivo) {
        this.anio  = anio;
        this.semana = semana;
        this.linea = linea;
        this.dia = dia;
        this.dni = dni;
        this.nroDiasInjustificados = nroDiasInjustificados;
        this.categoria = categoria;
        this.minutosproducidos = minutosproducidos;
        this.minutosdisponibles = minutosdisponibles;
        this.anulaBono = anulaBono;
        this.motivo = motivo;
    }

    protected double  CalcularEficiencia(){
        //Ubicar categoria
        double eficiencia = 0.0;
        eficiencia = Math.round((minutosproducidos / minutosdisponibles)*100.0);
        return eficiencia;
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
                ", Eficiencia = "+ this.CalcularEficiencia() + " %"+
                ", Anula bono? = "+ this.anulaBono+
                ", MOtivo = "+this.motivo;
    }
}
