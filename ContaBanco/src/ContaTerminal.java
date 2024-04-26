import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeUsuario = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número de sua agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldoBancario = scanner.nextDouble();

        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoBancario + " já está disponível para saque");
    }
}
