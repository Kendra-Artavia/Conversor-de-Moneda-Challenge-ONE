package org.example;

import org.example.model.ConversorMonedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();

        int opcion = 0;

        while (opcion != 9) {

            conversor.verMenu();

            System.out.print("Selecciona una opción (1-9): ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 9) {
                    System.out.println("\uD83D\uDC4B Gracias por usar el conversor de monedas.");
                    System.out.println(" ¡Hasta luego y que tengas un excelente día!");
                    break;
                }

                System.out.print(" Ingresa el valor que deseas convertir: ");
                double cantidad = Double.parseDouble(scanner.nextLine());

                System.out.println(" Realizando conversión...");
                Thread.sleep(500); // Pausa visual opcional
                conversor.convertir(opcion, cantidad);

            } catch (NumberFormatException e) {
                System.out.println(" Entrada no válida. Por favor, ingresa un número válido.");
            } catch (RuntimeException e) {
                System.out.println(" Error durante la conversión: " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("️ Operación interrumpida.");
            }

            System.out.println("\nPresiona ENTER para continuar...");
            scanner.nextLine(); // Espera antes de repetir el ciclo
        }

        scanner.close();
    }
}
