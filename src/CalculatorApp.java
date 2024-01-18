import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true) {
            System.out.println("**** Aplicacion Calculadora *****");
            showMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { // Salir
                    System.out.println("Adiooooss!");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }

                System.out.println();
            }
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void showMenu(){
        System.out.println("""
              1. Suma.
              2. Resta.
              3. Multiplicacion.
              4. Division.
              5. Salir
              """);
        System.out.print("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { // Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> { // Division
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }

}