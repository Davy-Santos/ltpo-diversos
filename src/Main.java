import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        entrada.close();*/

        /*System.out.print("Digite a sua idade: ");
        int idadeDigitada = scanner.nextInt();

        VerificaIdade verificaIdade = new VerificaIdade(idadeDigitada);

        String resultadoFinal = verificaIdade.verificarIdade();
        System.out.println("Resultado:" + resultadoFinal);


        scanner.close();*/

        System.out.print("Digite a nota do aluno: ");
        int notaDigitada = scanner.nextInt();

        VerificaAprovacao verificaAprovacao = new VerificaAprovacao(notaDigitada);

        String resultadoFinal = verificaAprovacao.verificarNota();
        System.out.println("Resultado:" + resultadoFinal);


        scanner.close();


    }
}
