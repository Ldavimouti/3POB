/*Exercício 6: construir um programa em Java que leia o salário bruto
e o sexo de um funcionário. Se o sexo for “M” (masculino), calcular,
armazenar e imprimir um desconto de 5% e o salário líquido, caso
contrário, calcular, armazenar e imprimir um desconto de 3% e o
salário líquido.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o salario: ");
        double salarioBruto = scan.nextDouble();
        System.out.print("(M)asculino ou (F)eminino: ");
        char genero = scan.next().charAt(0);
        
        System.out.print("\n");
        
        if((genero == 'M') || (genero == 'm')){
            double descontoM = salarioBruto * (5 / 100);
            double salarioLiquido = salarioBruto - descontoM;
            System.out.print("Salario Liquido: " + salarioLiquido);
        }
        else if((genero == 'F') || (genero == 'f')){
            double descontoF = salarioBruto * (3 / 100);
            double salarioLiquido = salarioBruto - descontoF;
            System.out.print("Salario Liquido: " + salarioLiquido);
        }
        else{
            System.out.print("Genero Invalido");
        }
    }
}
