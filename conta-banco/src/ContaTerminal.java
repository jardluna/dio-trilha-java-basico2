import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("BANCO DIGITAL INNOVATION ONE");
        System.out.println("----------------------------");

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite o número da agencia: ");
        String agencia = scanner.next();
        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println(", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
