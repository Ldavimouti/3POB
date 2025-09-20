/*6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário e o valor
de desconto do INSS. O programa deve calcular e exibir o salário líquid.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o salario: ");
        double salarioBruto = scan.nextDouble();
        System.out.print("Insira o desconto % do INSS: ");
        double porcentagem = scan.nextDouble();
        
        double desconto1 = porcentagem / 100;
        double desconto2 = salarioBruto * desconto1;
        double salarioLiquido = salarioBruto - desconto2;
        
        System.out.print("\n");
        
        System.out.print("Salario liquido: " + salarioLiquido);
    }
}
