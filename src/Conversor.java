import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        int opcion = 0;
        String menu = """
                *** Bienvenido al conversor de moneda ***
                1 - Dólar >> Peso argentino
                2 - Peso argentino >> Dólar
                3 - Dólar >> Real brasileño
                4 - Real brasileño >> Dólar
                5 - Dólar >> Peso colombiano
                6 - Peso colombiano >> Dólar
                7 - Salir
                Elija una opción válida
                """;
        Scanner teclado =  new  Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    double valorARetirar = teclado.nextDouble();
                    System.out.println("El valor "+valorARetirar+" [USD] corresponde al valor final de =>> "+"ARS");
                    break;
                case 2:
                    System.out.println("Peso argentino >> Dólar");
                    break;
                case 3:
                    System.out.println("Dólar >> Real brasileño");
                    break;
                case 4:
                    System.out.println("Real brasileño >> Dólar");
                    break;
                case 5:
                    System.out.println("Dólar >> Peso colombiano");
                    break;
                case 6:
                    System.out.println("Peso colombiano >> Dólar");
                    break;
                case 7:
                    System.out.println("Saliendo del programa, gracias por usar nuestros servicios");
                    break;

                default:
                    System.out.println("Opción no válida");

            }
        }
    }
}
