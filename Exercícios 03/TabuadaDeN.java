/*Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("N: ");
        int n = scan.nextInt();
    
        System.out.print("\n");
        
        int i = 1;
        
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }
}
