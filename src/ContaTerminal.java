import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // DECLARAÇÃO DO SCANNER
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // TÍTULO DO PROGRAMA
        System.out.println("[SISTEMA BANCÁRIO]");

        // ENTRADAS DO USUÁRIO
        System.out.println("- - INSIRA AS INFORMAÇÕES A SEGUIR PARA PROSSEGUIR - -");

        System.out.println("> Número: ");
        int numero = scanner.nextInt();

        System.out.println("> Agência: ");
        String agencia = scanner.next();
        // CONSOME A PRÓXIMA LINHA, EVITANDO QUE O NEXLINE SEGUINTE LEIA O PULO DE LINHA E IMPEÇA A ENTRADA DO USUÁRIO
        scanner.nextLine();

        System.out.println("> Nome do Cliente: ");
        String nome = scanner.nextLine(); // ARMAZENA UM STRING COM ESPAÇOS, LENDO A PRÓXIMA LINHA INSERIDA PELO USUÁRIO

        System.out.println("> Saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close(); // FECHA A EXECUÇÃO DO SCANNER (EVITA GASTAR RECURSOS COM O MÉTODO SEMPRE ABERTO)
        
        // SAÍDAS DO PROGRAMA
        System.out.println("===============\n");
        System.out.println("Olá " + nome + ", agradecemos por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para o saque.");
    }
}
