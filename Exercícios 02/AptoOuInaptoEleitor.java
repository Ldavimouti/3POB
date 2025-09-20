/*Exercício 5: construir um programa em Java que leia o ano de
nascimento de uma pessoa e que calcule a sua idade aproximada. Se a
idade aproximada for maior ou igual a 16, imprimir “Apto a ser
eleitor”, imprimir “Inapto a ser eleitor”, caso contrário.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o ano de nascimento: ");
        int ano = scan.nextInt();
        
        System.out.print("\n");
        
        int idade = 2025 - ano;
        
        if(idade >= 16){
            System.out.print("Apto para ser eleitor");
        }
        else{
            System.out.print("Inapto para ser eleitor");
        }
    }
}
