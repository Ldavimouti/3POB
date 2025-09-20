/*Desenvolva um programa que calcule a média das notas de uma turma,
ondeo usuário informe quantos alunos há na turma e suas respectivas
notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Quantidade de alunos: ");
        int aluno = scan.nextInt();
        System.out.print("\n");
        
        double nota;
        double total = 0;
        
        for(int i = 0; i < aluno; i++){
        System.out.print("Nota do aluno " + (i + 1) +": ");
        nota = scan.nextDouble();
        total += nota;
        }
        
        System.out.println();
        double media = total / aluno;
        System.out.print("Media da turma : " + media);
    }
}
