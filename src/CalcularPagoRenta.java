public class CalcularPagoRenta implements Operaciones{
    public double calcular(int dias, int monto, int cantidadAdeudos){
        double total=0;
        if (cantidadAdeudos == 1){
            if (dias<15){
                total=monto+(monto*0.05);
            }else {
                total=monto+(monto*0.1);
            }
        } else if (cantidadAdeudos < 3) {
            total=monto+(monto*0.2);
            }else{
                total=monto+(monto*0.4);

            }
        return total;
    }
}
