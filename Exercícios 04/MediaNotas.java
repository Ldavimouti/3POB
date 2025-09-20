/*Descrição:
Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas.
Requisitos:
• Criar um array de tamanho 4 para armazenar as notas.
• Utilizar um loop for para somar todas as notas e calcular a média.
• Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir
"Reprovado".*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        double[] nota = new double[4];
        
        for(int i = 0; i < nota.length; i++){
            System.out.print("Insira o " + (i + 1) + " nota: ");
            nota[i] = scan.nextDouble();
        }
        
        double soma = 0;
        
        for(int j = 0; j < nota.length; j++){
            soma += nota[j];
        }
        
        double media = soma / nota.length;
        
        if(media > 7){
            System.out.println();
            System.out.print("Media: " + media + " Aprovado");
        }
        else{
            System.out.println();
            System.out.print("Media: " + media + " Reprovado");
        }
    }
}
