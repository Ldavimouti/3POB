/*Exercício 11: construir um programa em Java que leia os valores de A, B
e C e que imprima “Não forma triângulo”, se um dos valores for maior que a
soma dos outros 2, caso contrário, imprimir “Forma triângulo”.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("C: ");
        int c = scan.nextInt();
    
        System.out.print("\n");
        
        if((a > b + c) || (b > a + c) || (c > a + b)){
            System.out.print("Nao forma triangulo");
        }
        else{
            System.out.print("Forma triangulo");
        }
    }
}
