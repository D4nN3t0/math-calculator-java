public class Calculator {

    public double somar (double a, double b) {
        return a + b;
    }

    public double subtrair (double a, double b){
        return a - b;
    }

    public double multiplicar (double a, double b) {
        return a * b;
    }

    public double dividir (double a, double b) {
        return a / b;
    }

    public double potencia (double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raiz (double num) {
        return Math.sqrt(num);
    }

    public double absoluto (double num) {
        return Math.abs(num);
    }

    public double maiorNumero (double[] numeros) {
        double maior = numeros[0];

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public double menorNumero (double[] numeros) {
        double menor = numeros[0];

        for (double numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
}
