/*Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.
Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor
valor.
• Exibir o maior e o menor número armazenados no array.*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int[] vet = new int[5];
        
        for(int i = 0; i < vet.length; i++){
            System.out.print("Insira o " + (i + 1) + " valor: ");
            vet[i] = scan.nextInt();
        }
        
        int menor = vet[0];
        int maior = vet[0];
        
        for(int j = 1; j < vet.length; j++){
            if(menor > vet[j]){
                menor = vet[j];
            }
            
            if(maior < vet[j]){
                maior = vet[j];
            }
        }
        
        System.out.println();
        System.out.println("Menor valor: " + menor);
        System.out.print("Maior valor: " + maior);
    }
}
