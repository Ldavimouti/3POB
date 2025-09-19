/*Escreva um programa que solicite ao usuário inserir 5 nomes em um
ArrayList<String>. Em seguida, peça para o usuário informar um nome para
ser removido da lista. Exiba a lista após a remoção.
Requisitos:
• Criar um ArrayList<String> para armazenar os nomes.
• Utilizar remove() para excluir o nome informado.
• Se o nome não existir na lista, exibir uma mensagem informando.*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um nome: ");
            String nome = scan.next();
            
            lista.add(nome);
        }
        
        System.out.println();
        for(String j : lista){
            System.out.println(j);
        }
        
        System.out.println();
        System.out.print("Digite o nome que deseja remover: ");
        String removerNome = scan.next();
        
        boolean removido = lista.remove(removerNome);
        
        if(removido){
            System.out.println("Nome removido");
             for(String k : lista){
                System.out.println(k);
            }
        }
        else{
            System.out.print("Nome nao encontrado");
        }
    }
}
