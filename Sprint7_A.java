import java.util.Scanner;

public class Sprint7_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bol = true;
        int num = 0;

        while (bol) {
            System.out.println("Introduce un número del 1 al 20:");
            if (input.hasNextInt()) {
                num = input.nextInt();
                if (num >= 1 && num <= 20) {
                    System.out.println("Número válido: " + num);
                    bol = false;
                } else {
                    System.out.println("Introduzca un número entre el 1 y el 20");
                }
            } else {
                System.out.println("Has d'introduir un número sencer.");
                input.next();
            }
        }

        System.out.println("Els múltiples de " + num + " entre 0 i 100 són:");
        for (int i = 0; i <= 100; i += num) {
            System.out.println(i);
        }

        input.close();
    }
}
