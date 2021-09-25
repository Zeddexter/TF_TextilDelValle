package TextilDelValle;

public class CategoriaBono {

    private String categoria;
    private double porcentaje;
    private double valor;

    public CategoriaBono(String categoria, double porcentaje, double valor) {
        this.categoria = categoria;
        this.porcentaje = porcentaje;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  " Categoria='" + categoria + '\'' +
                ", Porcentaje='" + (porcentaje*100)+" %" + '\'' +
                ", Valor =" + valor ;
    }
}
