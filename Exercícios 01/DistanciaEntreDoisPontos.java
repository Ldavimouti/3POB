/*10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois
pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("x1: ");
        double x1 = scan.nextDouble();
        System.out.print("y1: ");
        double y1 = scan.nextDouble();
        System.out.print("x2: ");
        double x2 = scan.nextDouble();
        System.out.print("y2: ");
        double y2 = scan.nextDouble();
        
        System.out.print("\n");
        
        double D = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        
        System.out.print("Distancia: " + df.format(D));
    }
}
