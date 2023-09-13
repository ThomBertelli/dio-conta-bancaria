import java.util.Scanner;

public class ContaTerminal {
    
    public int numeroConta;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    Scanner scanner = new Scanner(System.in);

    private void recebeNumeroAgencia(){
        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.next();
    }

    private void recebeNumeroConta(){
        System.out.println("Por favor, digite o número da Conta");
        numeroConta = scanner.nextInt();
    }

    private void recebeNomeCliente(){
        scanner.nextLine();
        System.out.println("Por favor, digite seu nome completo");
        nomeCliente = scanner.nextLine();
    }

    private void criaSaldo(){
        saldo = Math.random() * 100000.0;
    }

    public void mostraResultado(){
        recebeNumeroAgencia();
        recebeNumeroConta();
        recebeNomeCliente();
        criaSaldo();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +  " e seu saldo de R$ " + String.format("%.2f",saldo) + " já está disponível para saque");
    }

    
    
   
}
