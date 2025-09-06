import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Cofrinho cofrinho = new Cofrinho();
    
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDO AO COFRINHO DE MOEDAS ===\n");
        
        int opcao;
        do {
            exibirMenu();
            opcao = lerOpcao();
            processarOpcao(opcao);
        } while (opcao != 5);
        
        System.out.println("Obrigado por usar o Cofrinho de Moedas!");
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("=== MENU DO COFRINHO ===");
        System.out.println("1. Adicionar Moeda");
        System.out.println("2. Remover Moeda");
        System.out.println("3. Listar Moedas");
        System.out.println("4. Calcular Total em Reais");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static int lerOpcao() {
        try {
            int opcao = scanner.nextInt();
            return opcao;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Opção inválida! Digite um número.\n");
            return 0;
        }
    }
    
    private static void processarOpcao(int opcao) {
        System.out.println();
        
        switch (opcao) {
            case 1:
                adicionarMoeda();
                break;
            case 2:
                removerMoeda();
                break;
            case 3:
                cofrinho.listagemMoedas();
                break;
            case 4:
                calcularTotal();
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.\n");
        }
    }
    
    private static void adicionarMoeda() {
        System.out.println("=== ADICIONAR MOEDA ===");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Real (BRL)");
        System.out.print("Escolha o tipo de moeda: ");
        
        int tipo = lerOpcao();
        
        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de moeda inválido!\n");
            return;
        }
        
        System.out.print("Digite o valor da moeda: ");
        try {
            double valor = scanner.nextDouble();
            
            if (valor <= 0) {
                System.out.println("O valor deve ser positivo!\n");
                return;
            }
            
            Moeda moeda = criarMoeda(tipo, valor);
            if (moeda != null) {
                cofrinho.adicionar(moeda);
            }
            
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Valor inválido! Digite um número.\n");
        }
        
        System.out.println();
    }
    
    private static Moeda criarMoeda(int tipo, double valor) {
        switch (tipo) {
            case 1:
                return new Dolar(valor);
            case 2:
                return new Euro(valor);
            case 3:
                return new Real(valor);
            default:
                return null;
        }
    }
    
    private static void removerMoeda() {
        if (cofrinho.estaVazio()) {
            System.out.println("O cofrinho está vazio! Não há moedas para remover.\n");
            return;
        }
        
        System.out.println("=== REMOVER MOEDA ===");
        cofrinho.listagemMoedas();
        
        System.out.print("Digite o número da moeda a ser removida: ");
        try {
            int indice = scanner.nextInt() - 1;
            
            Moeda moeda = cofrinho.getMoeda(indice);
            if (moeda != null) {
                cofrinho.remover(moeda);
            } else {
                System.out.println("Índice inválido!");
            }
            
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Número inválido!");
        }
        
        System.out.println();
    }
    
    private static void calcularTotal() {
        if (cofrinho.estaVazio()) {
            System.out.println("O cofrinho está vazio!\n");
            return;
        }
        
        double total = cofrinho.totalConvertido();
        System.out.println("=== TOTAL CONVERTIDO ===");
        System.out.println("Total em Reais: R$ " + String.format("%.2f", total));
        System.out.println("======================\n");
    }
}