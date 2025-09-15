/*Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os
armazene em um array. Em seguida, exiba os números na ordem inversa à de
entrada.
Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa.*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int[] array = new int[6];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Insira o " + (i + 1) + " valor: ");
            array[i] = scan.nextInt();
        }
        
        System.out.println();
        for(int j = array.length - 1; j >= 0; j--){
            System.out.print(array[j] + " ");
        }
    }
}
