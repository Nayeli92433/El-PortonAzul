public class MostrarTodoDatos {
    double pagoTotal;
    public void mostrarCliente(DatosDeRegistro[] cliente){
        CalcularPagoRenta calcularPagoRenta= new CalcularPagoRenta();
        CalcularPagoComida calcularPagoComida= new CalcularPagoComida();

        for (DatosDeRegistro clientes : cliente) {
            System.out.println("_____________________________________________________________________");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("                          DATOS DEL ClIENTE");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Nombre completo de cliente: "+clientes.getCliente()+clientes.getApellidoA());
            System.out.println("Direccion del cliente: "+clientes.getDireccionA());
            System.out.println("Telfono y correo: "+clientes.getTelefonoA()+ " -- "+clientes.getCorreoA());
            System.out.println("Estado del adeudo: " + clientes.getEstadoAdeudo());
            if (clientes.getEstadoAdeudo().equals("pendiente")) {
                System.out.println("ID del adeudo: " + clientes.getIdAdeudo());
                System.out.println("Tipo de adeudo: " + clientes.getTipoAdeudo());
                if (clientes.getTipoAdeudo().equals("renta")) {
                    pagoTotal= calcularPagoRenta.calcular(clientes.getDiasAdeuda(), (int) clientes.getMontoAdeudo(), clientes.getCantAdeudos());
                } else if (clientes.getTipoAdeudo().equals("Comida")) {
                    pagoTotal = calcularPagoComida.calcular(clientes.getDiasAdeuda(), (int) clientes.getMontoAdeudo(), clientes.getCantAdeudos());
                }
                System.out.println("---------------------------------------------------------------------");
                System.out.println("\t\t El monto total de deuda es: "+ pagoTotal);
            }
        }
    }
}


