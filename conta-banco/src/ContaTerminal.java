import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu número de conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();

       
        scanner.nextLine();

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine(); 

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

       
        System.out.println("Olá, " + nome + ", obrigado por criar conta em nosso banco. Sua agência é: " + agencia + ", sua conta é: " + numeroConta + " e seu saldo é: " + saldo + ". Já está disponível para saque.");
      
        scanner.close();
    }
}