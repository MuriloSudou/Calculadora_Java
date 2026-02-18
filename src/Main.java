import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculo calculo = new Calculo();

        double num1;
        double num2;
        String operacao;
        String decisao = "s";

        try{
            do {
                System.out.print("Digite o PRIMEIRO numero: ");
                num1 = scan.nextDouble();

                System.out.print("digite a operação: +, -, * ou / : ");
                operacao = scan.next();

                System.out.print("Digte o SEGUNDO numero: ");
                num2 = scan.nextDouble();

                switch (operacao){
                    case "+":
                        System.out.print("A SOMA de: " + num1 + " + " + num2 + " é igual: ");
                        System.out.println(calculo.somar(num1,num2));

                        System.out.println("Deseja calcular novamente ? S/N ?: ");
                        decisao = scan.next().toLowerCase();
                        break;

                    case "-":
                        System.out.print("A SUBTRAÇÃO de: " + num1 + " - " + num2 + " é igual: ");
                        System.out.println(calculo.subtrair(num1,num2));

                        System.out.println("Deseja calcular novamente ? S/N ?: ");
                        decisao = scan.next().toLowerCase();
                        break;

                    case "*":
                        System.out.print("A MULTIPLICAÇÃO de: " + num1 + " * " + num2 + " é igual: ");
                        System.out.println(calculo.multiplicar(num1,num2));


                        System.out.println("Deseja calcular novamente ? S/N ?: ");
                        decisao = scan.next().toLowerCase();
                        break;

                    case "/":
                        System.out.print("A DIVISÃO de: " + num1 + " / " + num2 + " é igual: ");
                        System.out.println(calculo.dividir(num1,num2));

                        System.out.println("Deseja calcular novamente ? S/N ?: ");
                        decisao = scan.next().toLowerCase();
                        break;
                    default:
                        System.out.println("ERRO! Operação invalida, VERIFIQUE SE COLOCOU OS OPERADORES CERTOS!!");
                }

            } while (decisao.equals("s"));

        } catch (InputMismatchException e){
            System.out.println("Valores para os calculos devem ser numericos!!!");
        }



    }
}