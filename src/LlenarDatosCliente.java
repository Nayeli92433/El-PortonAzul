import java.util.Scanner;
public class LlenarDatosCliente {
    public void ingresaDatos() {
        Scanner scanner = new Scanner(System.in);
        MostrarTodoDatos mostrarTodoDatos= new MostrarTodoDatos();
        System.out.println("________________________________________________________");
        System.out.println("--------------------------------------------------------");
        System.out.println("Ingrese el numero de clientes que desea ingresar\n ->");
        int cantidad = scanner.nextInt();
        DatosDeRegistro[] adeudos = new DatosDeRegistro[cantidad];

        for (int i = 0; i < adeudos.length; i++) {
            System.out.println("________________________________________________________");
            System.out.println("--------------------------------------------------------");
            System.out.println("               REGISTRO DE CLIENTES Y ADEUDOS");
            System.out.println("--------------------------------------------------------");
            System.out.println("---------------               ---------------");
            System.out.println("                    CLIENTE");
            System.out.println("Ingrese los datos para el cliente " + (i + 1));
            System.out.print("ID del cliente: ");
            int idCliente = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            int telefono = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Correo electrónico: ");
            String correo = scanner.nextLine();
            System.out.print("Estado del adeudo (pagado o pendiente): ");
            String estadoAdeudo = scanner.nextLine();
            if (estadoAdeudo.equals("pendiente")) {
                System.out.println("---------------               ---------------");
                System.out.println("                    ADEUDOS");
                System.out.print("ID del adeudo: ");
                int idAdeudo = scanner.nextInt();
                System.out.print("Tipo de adeudo (renta o comida): ");
                scanner.nextLine();
                String tipoAdeudo = scanner.nextLine();
                System.out.print("Mes del adeudo: ");
                String mes = scanner.nextLine();
                System.out.print("Año del adeudo: ");
                int anno = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Monto del adeudo: ");
                double montoAdeudo = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Días que adeuda: ");
                int diasAdeuda = scanner.nextInt();
                System.out.print("Cantidad de adeudos: ");
                int cantAdeudos = scanner.nextInt();

                adeudos[i] = new DatosDeRegistro(idAdeudo, montoAdeudo, mes, anno, estadoAdeudo, cantAdeudos,
                        new DatosDeRegistro.Clientes(idCliente, nombre, apellido, direccion, telefono, correo), tipoAdeudo, diasAdeuda);
            }
            else {
                adeudos[i] = new DatosDeRegistro(0, 0, "  ", 0, estadoAdeudo,0,
                        new DatosDeRegistro.Clientes(idCliente, nombre, apellido, direccion, telefono, correo), "", 0);
            }
        }
        mostrarTodoDatos.mostrarCliente(adeudos);
        }
    }
