/*Exercício 12: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir qual é o tipo do triângulo, que pode ser “Equilátero”, se tiver os 3 lados iguais,
“Isósceles”, se tiver 2 lados iguais e “Escaleno”, se os 3 lados forem diferentes.*/

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
        
        if((a > b + c) || (b > a + c) || (c > a + b))
            System.out.print("Nao forma triangulo");
        else if((a == b) && (b == c))
            System.out.print("Triangulo Equilatero");
        else if((a == b) || (a == c) || (b == c))
            System.out.print("Triangulo Isosceles");
        else if((a != b) || (a != c) || (b != c))
            System.out.print("Triangulo Escaleno");
    }
}
