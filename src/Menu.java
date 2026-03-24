import java.util.Scanner;

public class Menu {
    Scanner leia = new Scanner(System.in);
    Calculator calc = new Calculator();

    public void iniciar() {
        int opcao;

        do {
            mostrarMenu();
            opcao = leia.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    somar();
                    break;
                case 2:
                    subtrair();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    potencia();
                    break;
                case 6:
                    raiz();
                    break;
                case 7:
                    absoluto();
                    break;
                case 8:
                    maior();
                    break;
                case 9:
                    menor();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }

        } while (opcao != 0);
        leia.close();
    }

    private static void mostrarMenu() {
        System.out.println("""
                [1] Soma
                [2] Subtração
                [3] Multiplicação
                [4] Divisão
                [5] Potência
                [6] Raiz quadrada
                [7] Valor absoluto
                [8] Maior entre os números
                [9] Menor entre os números
                [0] Sair""");
    }

    private double[] lerDoisNumeros () {
        System.out.print("Digite dois números: ");
        double a = leia.nextDouble();
        double b = leia.nextDouble();
        return new double[]{a, b};
    }

    private double[] lerVariosNumeros () {
        System.out.println("Quantos números você quer digitar?");
        int qtd = leia.nextInt();

        double[] numeros = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = leia.nextDouble();
        }
        return numeros;
    }

    private void mostrarResultado (double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    private void somar() {
        double[] numeros = lerDoisNumeros();
        double resultado = calc.somar(numeros[0], numeros[1]);
        mostrarResultado(resultado);
    }


    private void subtrair() {
        double[] numeros = lerDoisNumeros();
        double resultado = calc.subtrair(numeros[0], numeros[1]);
        mostrarResultado(resultado);
    }

    private void multiplicar () {
        double[] numeros = lerDoisNumeros();
        double resultado = calc.multiplicar(numeros[0], numeros[1]);
        mostrarResultado(resultado);
    }

    private void dividir () {
        double[] numeros = lerDoisNumeros();
        double resultado = calc.dividir(numeros[0], numeros[1]);
        mostrarResultado(resultado);
    }

    private void potencia () {
        double[] numeros = lerDoisNumeros();
        double resultado = calc.potencia(numeros[0], numeros[1]);
        mostrarResultado(resultado);
    }

    private void raiz () {
        double numero = leia.nextDouble();
        double resultado = calc.raiz(numero);
        mostrarResultado(resultado);
    }

    private void absoluto () {
        double numero = leia.nextDouble();
        double resultado = calc.absoluto(numero);
        mostrarResultado(resultado);
    }

    private void maior () {
        double[] numeros = lerVariosNumeros();
        double resultado = calc.maiorNumero(numeros);
        mostrarResultado(resultado);
    }

    private void menor () {
        double[] numeros = lerVariosNumeros();
        double resultado = calc.menorNumero(numeros);
        mostrarResultado(resultado);
    }

}
