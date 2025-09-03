/*4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) e
exiba a média aritmética delas.*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Insira a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double nota3 = scan.nextDouble();
        
        System.out.print("\n");
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.print("Media das notas: " + df.format(media));
    }
}
