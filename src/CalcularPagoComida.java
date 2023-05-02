public class CalcularPagoComida implements Operaciones {
    public double calcular(int dias, int monto, int cantidadAdeudos) {
        double total = 0;
        if (dias < 15) {
            total = monto;
        } else if (dias == 15) {
            total = monto + (monto * 0.1);
        } else {
            total = monto + (monto * 0.2);
        }
        return total;
    }
}


