/*Crie um programa que solicite ao usuário inserir números em um
ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média
dos números inseridos (excluindo o -1).
Requisitos:
• Criar um ArrayList<Double> para armazenar os números.
• Utilizar um loop while para permitir inserções até o usuário digitar
-1.
• Utilizar um loop for para calcular a soma e a média dos números
inseridos.*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Double> lista = new ArrayList<>();
        
        System.out.print("Digite um valor: ");
        double num = scan.nextDouble();
        
        lista.add(num);
        
        while(num != -1){
            
            System.out.print("Digite um valor: ");
            num = scan.nextDouble();
            
            lista.add(num);
        }
        
        lista.remove(lista.indexOf(num));
        
        double soma = 0;
        for(double i: lista){
            soma += i;
        }
        
        double media = soma / lista.size();
        
        System.out.println();
        System.out.print("Media: " + media);
    }
}
