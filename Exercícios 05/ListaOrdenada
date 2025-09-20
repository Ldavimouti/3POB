/*Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar Collections.sort() para ordenar os números.
• Exibir a lista ordenada após a ordenação.*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite (- 1) para finalizar");
        System.out.print("Insira um valor: ");
        int num = scan.nextInt();
            
        lista.add(num);
            
        while(num != -1){
            System.out.print("Insira um valor: ");
            num = scan.nextInt();
            
            lista.add(num);
        }
        
        lista.remove(lista.indexOf(-1));
        Collections.sort(lista);
        
        System.out.println();
        for(int i : lista)
            System.out.print(i + " ");
    }
}
