/*Exercício 10: construir um programa em Java que leia o ano de nascimento
e o sexo de uma pessoa e que calcule a sua idade aproximada. Se o sexo for
igual a “M” (masculino) e a idade for igual a 18, imprimir “ServiçoMilitar
Obrigatório”, caso contrário, imprimir “Isento de Serviço Militar”.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Ano de nascimento: ");
        int ano = scan.nextInt();
        System.out.print("(M)asculino ou (F)eminino: ");
        char genero = scan.next().charAt(0);
        
        int idade = 2025 - ano;
        
        System.out.print("\n");
        
        if((genero == 'M') || (genero == 'm')){
            if(idade == 18){
                System.out.print("Servico militar obrigatorio");
            }
            else{
                System.out.print("Insento de servico militar");
            }
        }
        else if((genero == 'F') || (genero == 'f')){
            System.out.print("Insento de servico militar");
        }
        else{
            System.out.print("Genero Invalido");
        }
    }
}
