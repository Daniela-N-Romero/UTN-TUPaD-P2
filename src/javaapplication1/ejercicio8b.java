/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicio8b {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dividir de números enteros");
        System.out.print("Ingresa el primer número (entero): ");
        Double num1 = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa el segundo número (entero): ");
        Double num2 = Double.parseDouble(input.nextLine());
        
        Double resultadoEntero = num1 / num2;
        
        System.out.println("El resultado de la división entera es: " + resultadoEntero);

    }
    
}
