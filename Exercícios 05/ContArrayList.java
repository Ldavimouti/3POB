/*Desenvolva um programa que solicite ao usuário inserir 10 números
inteiros em um ArrayList<Integer>. Depois, peça ao usuário para digitar
um número e informe quantas vezes esse número aparece na lista.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop for para contar quantas vezes o número aparece na
lista.
• Exibir a quantidade de ocorrências do número digitado pelo usuário.*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        int i = 0;
        while(i < 10){
            
            System.out.print("Digite um valor: ");
            int num = scan.nextInt();
            
            lista.add(num);
            
            i++;
        }
        
        System.out.println();
        System.out.print("Digite o valor que deseja quantificar: ");
        int valor = scan.nextInt();
        
        int cont = 0;
        for(int j: lista)
            if(valor == j)
                cont++;
        
        System.out.println();
        System.out.print(valor + " aparece " + cont + " vezes");
    }
}
