import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorIngredientes gerenciador = new GerenciadorIngredientes();
        MostrarIngredientes mostrador = new MostrarIngredientes();
        FiltroIngredientes filtroIngredientes = new FiltroIngredientes();

        while (true) {
            System.out.println("\n--- Controle de Pedidos ---");
            System.out.println("1. Criar novo Ingrediente");
            System.out.println("2. Listar Ingredientes");
            System.out.println("3. Marcar como disponível");
            System.out.println("4. Filtrar por validade");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir \n

            switch (opcao) {
                case 1:
                    System.out.print("Nome do ingrediente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Validade (Longe, Média, Curta): ");
                    String validade = scanner.nextLine();
                    System.out.print("Informe a quantidade do estoque: ");
                    String quantidade = scanner.nextLine();
                    System.out.print("Informe a unidade de medida: ");
                    String unidade = scanner.nextLine();
                    gerenciador.adicionarIngrediente(new Ingrediente(nome, validade, quantidade, unidade));
                    break;

                case 2:
                    mostrador.mostrarIngrediente(gerenciador.listarIngrediente());
                    break;

                case 3:
                    mostrador.mostrarIngrediente(gerenciador.listarIngrediente());
                    System.out.print("Número do Ingrediente para marcar como disponível: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < gerenciador.listarIngrediente().size()) {
                        gerenciador.listarIngrediente().get(index).marcarComoDisponivel();
                        System.out.println("Ingrediente marcado como disponível!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    System.out.print("Validade para filtrar: ");
                    String filtro = scanner.nextLine();

                    // Passar a lista diretamente sem necessidade de conversão explícita
                    mostrador.mostrarIngrediente(filtroIngredientes.filtrarPorValidade(gerenciador.listarIngrediente(), filtro));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}