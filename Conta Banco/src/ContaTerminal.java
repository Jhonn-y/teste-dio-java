import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String name = input.nextLine();
        System.out.println("Digite o sua agencia");
        String agencia = input.nextLine();
        System.out.println("Digite o sua conta");
        String conta = input.nextLine();


        input.close();

        System.out.println("Olá, ".concat(name).concat(", obrigado por criar uma conta em nosso banco, ")
                            .concat("sua agencia é ").concat(agencia).concat(", conta ").concat(conta)
                            .concat(" e seu saldo ja esta disponivel para saque."));
    }
}
