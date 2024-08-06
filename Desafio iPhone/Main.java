import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Tocar música");
            System.out.println("2. Pausar música");
            System.out.println("3. Selecionar música");
            System.out.println("4. Ligar");
            System.out.println("5. Atender chamada");
            System.out.println("6. Iniciar correio de voz");
            System.out.println("7. Exibir página da web");
            System.out.println("8. Adicionar nova aba");
            System.out.println("9. Atualizar página");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcao) {
                case 1:
                    meuIPhone.tocar();
                    break;
                case 2:
                    meuIPhone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    meuIPhone.selecionarMusica(musica);
                    break;
                case 4:
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    meuIPhone.ligar(numero);
                    break;
                case 5:
                    meuIPhone.atender();
                    break;
                case 6:
                    meuIPhone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    meuIPhone.exibirPagina(url);
                    break;
                case 8:
                    meuIPhone.adicionarNovaAba();
                    break;
                case 9:
                    meuIPhone.atualizarPagina();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
