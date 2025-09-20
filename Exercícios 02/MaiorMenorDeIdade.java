/*Exercício 1: construir um programa em Java que leia a idade de uma
pessoa e imprima “Maior de idade”, se a idade lida for maior ou igual a 
18.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira sua idade: ");
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.print("Maior de idade");
        }
        else{
            System.out.print("Menor de idade");
        }
    }
}
