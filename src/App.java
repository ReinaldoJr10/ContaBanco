import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leString = new Scanner(System.in);
        Scanner leNumero = new Scanner(System.in);
        Scanner leDecimal = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Digite seu nome:");
        conta.setNomeCliente(leString.nextLine());
        System.out.println("Digite sua agencia:");
        conta.setAgencia(leString.nextLine());
        System.out.println("Digite seu numero da conta:");
        conta.setNumero(leNumero.nextInt());
        System.out.println("Digite o saldo em conta:");
        conta.setSaldo(leDecimal.nextDouble());

        System.out.println("Olá ".concat(conta.getNomeCliente()).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(conta.getAgencia()).concat(", conta ")+conta.getNumero()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque");

        leString.close();
        leNumero.close();
        leDecimal.close();
    }
}
