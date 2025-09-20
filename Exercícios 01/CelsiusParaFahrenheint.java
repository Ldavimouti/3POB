/*3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta
para Fahrenheit.

Fórmula: F = (C × 9/5) + 32.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira a temperatura em C: ");
        double celsius = scan.nextDouble();
        
        double fahrenheit = (celsius * 1.8) + 32;
        
        System.out.print("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
