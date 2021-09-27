package TextilDelValle;

public  class CategoriaBono {
    public static  double ObtieneValorCategoria(String categoria, double Eficiencia){
        double valor = 0.0;
        switch(categoria){
            case "Facil":{
                if ( Eficiencia >= 20.0  && Eficiencia < 40){
                    valor = 0.5;
                }
                if ( Eficiencia >= 40.0   && Eficiencia < 60){
                    valor = 1;
                }
                if ( Eficiencia >=60.0 && Eficiencia < 80){
                    valor = 2;

                }
                if ( Eficiencia >=80.0  ){
                    valor = 3;
                }
                break;
            }
            case "Normal":{
                if ( Eficiencia>=20.0  && Eficiencia < 40){
                    valor = 1;
                }
                if ( Eficiencia >= 40.0  && Eficiencia < 60){
                    valor = 2;
                }
                if (Eficiencia >= 60.0 && Eficiencia < 80){
                    valor = 3;

                }
                if ( Eficiencia >= 80.0 ){
                    valor = 5;
                }
                break;
            }
            case "Dificil":{
                if ( Eficiencia>=20.0  && Eficiencia < 40){
                    valor = 5;
                }
                if ( Eficiencia >= 40.0  && Eficiencia < 60){
                    valor = 6;
                }
                if (  Eficiencia >= 60.0 && Eficiencia < 80){
                    valor = 7;

                }
                if ( Eficiencia >= 80 ){
                    valor = 8;
                }
                break;
            }
            case "Muy Dificil":{
                if ( Eficiencia >=20.0  && Eficiencia < 40){
                    valor = 6.0;
                }
                if ( Eficiencia >= 40.0 && Eficiencia < 60){
                    valor = 8.0;
                }
                if ( Eficiencia >= 60.0   && Eficiencia < 80){
                    valor = 10.0;

                }
                if ( Eficiencia > 80.0  ){
                    valor = 13;
                }
                break;
            }
        }
        return valor;
    }
}
