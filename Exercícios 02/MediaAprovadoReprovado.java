/*Exercício 9: construir um programa em Java que leia as 2 notas de um
aluno e que calcule, armazene e imprima a média. Se a média for maior ou
igual a 7, imprimir “Aprovado”, caso contrário, realizar a leitura de uma
terceira nota, que terá peso 2 e calcular, armazenar e imprimir uma nova
média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”, caso
contrário, imprimir “Reprovado”.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = scan.nextDouble();
        
        System.out.print("\n");
        
        double media = (nota1 + nota2) / 2;
        System.out.print("Media :" + media);
        
        if(media >= 7){
            System.out.print("\n");
            System.out.print("Aprovado");
        }
        else{
            System.out.print("\n");
            System.out.print("Terceira nota: ");
            double nota3 = scan.nextDouble();
            
            media = (nota1 + nota2 + (nota3 * 2)) / 3;
            
            System.out.print("\n");
            System.out.print("Media: " + media);
            
            if(media >= 6){
                System.out.print("\n");
                System.out.print("Aprovado");
            }
            else{
                System.out.print("\n");
                System.out.print("Reprovado");
            }
        }
    }
}
