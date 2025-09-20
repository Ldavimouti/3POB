/*9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. 
O programa deve calcular e exibir o valor equivalente em dólares (US$).*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("R$ ");
        double reais = scan.nextDouble();
        
        System.out.print("\n");
        
        double dolar = reais * 5.50;
        
        System.out.print("US$ " + dolar);
    }
}
