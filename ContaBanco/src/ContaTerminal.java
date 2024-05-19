import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens par ao nosso usuario
        System.out.print("Por favor, Digite o número da agência: ");
        String Agencia = scanner.next();
        
        System.out.print("Por favor, Digite o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.print("Por favor, Insira seu sobrenome: ");
        String Sobrenome = scanner.next();

        System.out.print("Por favor, Insira o valor do primeiro depósito: ");
        Float Saldo = scanner.nextFloat();

        System.out.print("Numero da conta é: ");
        int Numero = scanner.nextInt();

        scanner.close();

        //Exibir a mensagem conta criada
        System.out.println("Olá Senhor(a) " + NomeCliente.concat(" ").concat(Sobrenome) + ", obrigado por criar uma conta em nosso banco. O numero de sua agencia é " + Agencia + ", e o numero da sua conta é " 
        + Numero + " e seu saldo, é de: " + Saldo + " e já está disponivel para saque."); 

    }
}
