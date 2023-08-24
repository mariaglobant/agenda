package modelo;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Añadir registro");
            System.out.println("2. Eliminar registro");
            System.out.println("3. Ver registro");
            System.out.println("4. Detalles de registro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                anadirRegistro(scanner, agenda);
                    break;
                case 2:
                
                    break;
                case 3:
                verRegistro(scanner, agenda);
                    break;
                case 4:
                 
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Selección invalida. Por favor seleccione de nuevo.");
            }
        }
    }

    private static void anadirRegistro(Scanner scanner, Agenda agenda){
        System.out.print("Ingrese su nombre completo");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Ingrese su apellido");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese su direccion");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese su telefono");
        String telefono = scanner.nextLine();
        System.out.print("¿Es persona natural (N) o gerente de una empresa (G)?");
        String tipo = scanner.nextLine();

        if (tipo.equalsIgnoreCase("N")){
            Persona persona = new Persona(nombreCompleto, apellido, direccion, telefono);
            agenda.anadirRegistro(persona);
        } else if (tipo.equalsIgnoreCase("G")){
            System.out.print("Ingrese el nombre de su empresa");
            String nombreEmpresa = scanner.nextLine();
            System.out.print("Ingrese la ciudad de su empresa");
            String ciudad = scanner.nextLine();
            System.out.print("Ingrese el sitio web de su empresa");
            String sitioWeb = scanner.nextLine();

            Empresa empresa = new Empresa(nombreCompleto, apellido, direccion, telefono, nombreEmpresa, ciudad, sitioWeb);
            agenda.anadirRegistro(empresa);
        } else {
            System.out.println("Seleccion invalida");
        }
    }

    private static void verRegistro(Scanner scanner, Agenda agenda){
        List<Registro> registros = agenda.verRegistro();

        if (registros.isEmpty()) {
            System.out.println("No hay registros");
        } else {
            System.out.println("Todos los registros");
            for (Registro registro : registros) {
                System.out.println(registro);
                System.out.println("-------------------------");
            }
        }
    }
}

