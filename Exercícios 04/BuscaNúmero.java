/*Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para
buscar no array. O programa deve informar se o número está presente e em
qual posição.
Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no
array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir
"Número não encontrado.".*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int[] array = new int[4];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Insira o " + (i + 1) + " valor: ");
            array[i] = scan.nextInt();
        }
        
        System.out.println();
        
        System.out.print("Valor que deseja encontrar: ");
        int num = scan.nextInt();
        System.out.println();
        
        boolean achou = false;
        
        for(int j = 0; j < array.length; j++){
            if(num == array[j]){
                System.out.print(num + " encontrado na posicao " + j);
                achou = true;
                break;
            }
        }
        
        if(!achou){
            System.out.print("Numero nao encontrado");
        }
    }
}
