/*Crie um programa que permita ao usuário inserir quantos números
desejar em um ArrayList<Integer>. Após a inserção, o programa deve
exibir todos os números digitados.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop while para permitir múltiplas inserções até o usuário
decidir parar.
• Exibir os números armazenados no ArrayList.*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int fim = 1;
        
        while(fim == 1){
            
            System.out.print("Insira um valor: ");
            int num = scan.nextInt();
            System.out.println();
            
            lista.add(num);
            
            System.out.print("Digite (1) para continuar e (0) para encerrar: ");
            fim = scan.nextInt();
        }
        
        System.out.println();
        for(int i: lista)
            System.out.print(i + " ");
    }
}
