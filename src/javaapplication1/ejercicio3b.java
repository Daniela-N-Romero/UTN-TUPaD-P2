package javaapplication1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class ejercicio3b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
              
    }
}
