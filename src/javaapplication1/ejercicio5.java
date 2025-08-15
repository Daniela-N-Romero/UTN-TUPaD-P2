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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa otro número: ");
        int num2 = Integer.parseInt(input.nextLine());
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        int division = num1/num2;
        System.out.println("La suma de "+num1+" y "+num2+" es "+suma);
        System.out.println("La multiplicacion de "+num1+" y "+num2+" es "+multiplicacion);
        System.out.println("La resta de "+num1+" y "+num2+" es "+resta);
        System.out.println("La division de "+num1+" y "+num2+" es "+division);
        
    }
}
