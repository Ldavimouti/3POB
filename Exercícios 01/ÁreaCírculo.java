/*2. Área de um Círculo Desenvolva um programa que leia o raio de um
círculo e calcule sua área.

Fórmula: Área = π * raio²

Considere π = 3.14159.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o raio: ");
        int raio = scan.nextInt();
        
        double pi = 3.14159;
        double area = pi * (raio * raio);
        
        System.out.print("Valor da area do circulo: " + area);
    }
}
