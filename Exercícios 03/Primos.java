/*Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Primeiro valor: ");
        int num1 = scan.nextInt();
        System.out.print("Segundo Valor: ");
        int num2 = scan.nextInt();
        System.out.print("\n");
        
        System.out.print("Primos: ");
        
        for(int i = num1; i <= num2; i++){
            boolean primo = true;
            
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.print(i + " ");
            }
        }
    }
}
