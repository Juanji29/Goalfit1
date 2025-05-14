import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("\nIngrese su apellido: ");
        String apellidos = sc.nextLine();
        System.out.print("\nIngrese su peso: ");
        Double peso = sc.nextDouble();
        System.out.print("\nIngrese su altura: ");
        Double altura = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea pendiente
        String correo = verificarCorreo(sc);
        String contrasena = verificarContraseña(sc);

        // Crear un objeto Usuario  
        
        Usuario usuario = new Usuario(nombre, apellidos, peso, altura, correo, contrasena);

        //Menu
        while(true){
            System.out.println("\n    --Menu--    \n1) Calcular IMC\n2) Realizar pago\n10)Salir  ");
            int seleccion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente
            if (seleccion == 1){
                usuario.CalcularIMC(peso, altura);
            } else if(seleccion == 2){
                System.out.print ("Ingresa el titular de la tarjeta: ");
                String titular = sc.nextLine();
                System.out.print("Ingrese numero de tarjeta: ");
                String nTarjeta = sc.nextLine();
                System.out.print("Ingrese fecha de vencimiento(en formato 'mm/aa'): ");
                String fechaVencimiento = sc.nextLine();
                System.out.print("Ingresa los 3 digitos que aparecen detras de la tarjeta: ");
                String cvv = sc.nextLine();

                Pago tarjeta = new Pago(titular, nTarjeta, fechaVencimiento, cvv);
                tarjeta.pagar();
            } else if (seleccion == 10){
                break;
            }
        }
        

        
    }
    private static String verificarCorreo(Scanner sc) {
        // Verificar si el correo es válido
        while(true){
            System.out.print("\nIngrese su correo: ");
            String correo = sc.nextLine();
            if (correo.contains("@") && correo.contains(".")) {
                System.out.println("El correo es válido.");
                return correo;
            } else {
                System.out.println("El correo no es válido.");
            }
        }
    }
    private static String verificarContraseña(Scanner sc) {
        // Verificar si la contraseña es válida
        while(true){
            System.out.print("\nIngrese su contraseña: ");
            String contraseña = sc.nextLine();
            if (contraseña.length() >= 8) {
                System.out.println("La contraseña es válida.\n");
                return contraseña;
            } else {
                System.out.println("La contraseña no es válida.\nDebe tener al menos 8 caracteres.\n");
            }
        }
       
    }
}
