/*Exercício 4: construir um programa em Java que leia um número
inteiro e imprima “PAR”, se o número for par e imprima “ÍMPAR”, se o
número for ímpar.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira um valor: ");
        int num = scan.nextInt();
        
        System.out.print("\n");
        
        if(num % 2 == 0){
            System.out.print("Valor Par");
        }
        else{
            System.out.print("Valor Impar");
        }
    }
}
