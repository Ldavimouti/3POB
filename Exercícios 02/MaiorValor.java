/*Exercício 3: construir um programa em Java que leia 2 números
inteiros e imprima o maior número lido.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o primeiro valor: ");
        int num1 = scan.nextInt();
        System.out.print("Insira o segundo valor: ");
        int num2 = scan.nextInt();
        
        System.out.print("\n");
        
        if(num1 > num2){
            System.out.print("Maior valor: " + num1);
        }
        else{
            System.out.print("Maior valor: " + num2);
        }
    }
}
