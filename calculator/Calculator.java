import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double number1 = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        double number2 = sc.nextDouble();

        System.out.println("Elige una operación: 1-Sumar, 2-Restar, 3-Multiplicar, 4-Dividir");
        int option = sc.nextInt();

        Operation operation = null;

        switch (option) {
            case 1:
                operation = new Addition(number1, number2);
                break;
            case 2:
                operation = new Subtraction(number1, number2);
                break;
            case 3:
                operation = new Multiplication(number1, number2);
                break;
            case 4:
                operation = new Division(number1, number2);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        if (operation != null) {
            operation.operate();
        }

        sc.close();
    }
}
