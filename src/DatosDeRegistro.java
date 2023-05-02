public class DatosDeRegistro {
    private int idAdeudo;
    private double montoAdeudo;
    private String mes;
    private int anno;
    private String estadoAdeudo;
    private String cliente;
    private String tipoAdeudo;
    private int diasAdeuda;
    private int idClienteA;
    private String apellidoA;
    private String direccionA;
    private int telefonoA;
    private String correoA;
    private int cantAdeudos;
    public static class Clientes {
        private int idCliente;
        private String nombre;
        private String apellido;
        private String direccion;
        private int telefono ;
        private String correo;
        public Clientes(int idCliente, String nombre, String apellido, String direccion, int telefono, String correo) {
            this.idCliente = idCliente;
            this.nombre = nombre;
            this.apellido = apellido;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
        }
    }
    public DatosDeRegistro(int idAdeudo, double montoAdeudo, String mes, int anno,
                           String estadoAdeudo, int cantAdeudos, Clientes cliente, String tipoAdeudo, int diasAdeuda) {
        this.idAdeudo = idAdeudo;
        this.montoAdeudo = montoAdeudo;
        this.mes = mes;
        this.anno = anno;
        this.estadoAdeudo = estadoAdeudo;
        this.cliente = cliente.nombre;
        this.tipoAdeudo = tipoAdeudo;
        this.diasAdeuda = diasAdeuda;
        this.idClienteA = cliente.idCliente;
        this.apellidoA = cliente.apellido;
        this.direccionA = cliente.direccion;
        this.telefonoA = cliente.telefono;
        this.correoA = cliente.correo;
    }
    public int getIdAdeudo() {
        return idAdeudo;
    }

    public double getMontoAdeudo() {
        return montoAdeudo;
    }

    public String getEstadoAdeudo() {
        return estadoAdeudo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getTipoAdeudo() {
        return tipoAdeudo;
    }

    public int getDiasAdeuda() {
        return diasAdeuda;
    }

    public String getApellidoA() {
        return apellidoA;
    }

    public String getDireccionA() {
        return direccionA;
    }

    public int getTelefonoA() {
        return telefonoA;
    }
    public String getCorreoA() {
        return correoA;
    }
    public int getCantAdeudos(){return cantAdeudos;}
}



