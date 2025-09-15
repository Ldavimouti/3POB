/*Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazen-os
em um array. O programa deve contar e exibir a quantidade de números
pares no array.
Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números
são pares.
• Exibir a quantidade de números pares encontrados.*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int[] array = new int[8];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Insira o " + (i + 1) + " valor: ");
            array[i] = scan.nextInt();
        }
        
        int cont = 0;
        
        for(int j = 0; j < array.length; j++){
            if(array[j] % 2 == 0){
                cont++;
            }
        }
        
        System.out.println();
        System.out.println("Quantidade de valores pares: " + cont);
    }
}
