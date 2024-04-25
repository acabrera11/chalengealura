import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
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
                    System.out.println("Cual es el valor q desea convertir?");
                    double valorAConvertir = teclado.nextDouble();
                    if(valorAConvertir <=0){
                        System.out.println("No se permite convertir cantidades menores o iguales a cero");
                        System.out.println("\n Saliendo de la Aplicación...");
                    }else{
                        Moneda moneda = consulta.buscaMoneda("USD", "ARS");
                        //System.out.println(moneda);
                        double resultado = consulta.dolarAOtraMoneda(valorAConvertir, moneda.conversion_rate());
                        System.out.println("El valor "+valorAConvertir+" ["+moneda.base_code()+"] corresponde al valor final de =>> "+resultado+"["+moneda.target_code()+"]");
                    }

                    break;
                case 2:
                    System.out.println("Cual es el valor q desea convertir?");
                    double cantidadOtraMoneda = teclado.nextDouble();
                    if(cantidadOtraMoneda <=0){
                        System.out.println("No se permite convertir cantidades menores o iguales a cero");
                        System.out.println("\n Saliendo de la Aplicación...");
                    }else{
                        Moneda moneda = consulta.buscaMoneda("ARS", "USD");
                        //System.out.println(moneda);
                        double resultado = consulta.dolarAOtraMoneda(cantidadOtraMoneda, moneda.conversion_rate());
                        System.out.println("El valor "+cantidadOtraMoneda+" ["+moneda.base_code()+"] corresponde al valor final de =>> "+resultado+"["+moneda.target_code()+"]");
                    }

                    break;
                case 3:
                    System.out.println("Cual es el valor q desea convertir?");
                    double valorAConvertir2 = teclado.nextDouble();
                    if(valorAConvertir2 <=0){
                        System.out.println("No se permite convertir cantidades menores o iguales a cero");
                        System.out.println("\n Saliendo de la Aplicación...");
                    }else{
                        Moneda moneda = consulta.buscaMoneda("USD", "BRL");
                        //System.out.println(moneda);
                        double resultado = consulta.dolarAOtraMoneda(valorAConvertir2, moneda.conversion_rate());
                        System.out.println("El valor "+valorAConvertir2+" ["+moneda.base_code()+"] corresponde al valor final de =>> "+resultado+"["+moneda.target_code()+"]");
                    }
                    break;
                case 4:
                    System.out.println("Cual es el valor q desea convertir?");
                    double cantidadOtraMoneda1 = teclado.nextDouble();
                    if(cantidadOtraMoneda1 <=0){
                        System.out.println("No se permite convertir cantidades menores o iguales a cero");
                        System.out.println("\n Saliendo de la Aplicación...");
                    }else{
                        Moneda moneda = consulta.buscaMoneda("BRL", "USD");
                        //System.out.println(moneda);
                        double resultado = consulta.dolarAOtraMoneda(cantidadOtraMoneda1, moneda.conversion_rate());
                        System.out.println("El valor "+cantidadOtraMoneda1+" ["+moneda.base_code()+"] corresponde al valor final de =>> "+resultado+"["+moneda.target_code()+"]");
                    }
                    break;
                case 5:
                    System.out.println("Cual es el valor q desea convertir?");
                    double valorAConvertir3 = teclado.nextDouble();
                    if(valorAConvertir3 <=0){
                        System.out.println("No se permite convertir cantidades menores o iguales a cero");
                        System.out.println("\n Saliendo de la Aplicación...");
                    }else{
                        Moneda moneda = consulta.buscaMoneda("USD", "COP");
                        //System.out.println(moneda);
                        double resultado = consulta.dolarAOtraMoneda(valorAConvertir3, moneda.conversion_rate());
                        System.out.println("El valor "+valorAConvertir3+" ["+moneda.base_code()+"] corresponde al valor final de =>> "+resultado+"["+moneda.target_code()+"]");
                    }
                    break;
                case 6:
                    System.out.println("Cual es el valor q desea convertir?");
                    double cantidadOtraMoneda2 = teclado.nextDouble();
                    if(cantidadOtraMoneda2 <=0){
                        System.out.println("No se permite convertir cantidades menores o iguales a cero");
                        System.out.println("\n Saliendo de la Aplicación...");
                    }else{
                        Moneda moneda = consulta.buscaMoneda("COP", "USD");
                        //System.out.println(moneda);
                        double resultado = consulta.dolarAOtraMoneda(cantidadOtraMoneda2, moneda.conversion_rate());
                        System.out.println("El valor "+cantidadOtraMoneda2+" ["+moneda.base_code()+"] corresponde al valor final de =>> "+resultado+"["+moneda.target_code()+"]");
                    }
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
