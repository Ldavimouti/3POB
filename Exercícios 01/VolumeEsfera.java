/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o raio: ");
        int raio = scan.nextInt();
        
        System.out.print("\n");
        
        double volume = (4/3) * 3.14159 * (raio * raio * raio);
        
        System.out.print("Volume da esfera: " + volume);
    }
}
