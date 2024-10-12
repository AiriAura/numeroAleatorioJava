import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al juego del número secreto!");
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;


        while (intentos < 5) {
            System.out.println("Introduzca un número del 1 al 100, ");
            int numeroDeUsuario = teclado.nextInt();
            intentos++;

            if (numeroDeUsuario == numeroAleatorio) {
                System.out.println("Felicidades, adivinaste el número en " + intentos + "intentos!" );
                break;
            } else if (numeroDeUsuario < numeroAleatorio) {
                System.out.println("El número que elegiste es menor al número secreto");
            } else {
                System.out.println("El número que elegiste es mayor al número secreto");
            }
        }
        if (intentos == 5){
            System.out.println("Lo siento, no adivinaste el número. El número era: " + numeroAleatorio);
        }
    }
        ;


}




