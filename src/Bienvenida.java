import java.util.Scanner;
public class Bienvenida {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String mombreUsuario;
        String celular;
        int edad;

        System.out.println("Bienvenido a la app, por favor ingrese sus datos para ser atendido!");

        System.out.println("Escriba su nombre de usuario: ");
        mombreUsuario = entrada.nextLine();

        System.out.println("Escriba su numero de celular: ");
        celular = entrada.nextLine();

        System.out.println("Escriba su edad: ");
        edad = entrada.nextInt();

        System.out.println("Bienvenido(a) señor(a) " + mombreUsuario + ", es un placer para nosotros contar con una persona de " + edad +
                " años.");

        // otra forma de concatenar string con el metodo concatenar
        String mensaje = ("Próximamente nos comunicaremos con usted al número ") + celular.concat(". \nFeliz día!");
        System.out.println(mensaje);
    }
}
