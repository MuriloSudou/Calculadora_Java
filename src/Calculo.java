public class Calculo {

    public double somar(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public double subtrair(double num1, double num2){
        double result = num1 - num2;
        return result;
    }

    public double multiplicar(double num1, double num2){
        double result = num1 * num2;
        return result;
    }

    public double dividir(double num1, double num2){
        double result = 0;
        if (num1 == 0 && num2 == 0){
            System.out.println("Não é possivel dividir 0 por 0");
        } else {
            result = num1 / num2;
        }

        return result;
    }
}
