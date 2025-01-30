import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos criar seu personagem!");


        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();


        System.out.print("Digite os pontos de vida (HP) do seu personagem: ");
        int hp = scanner.nextInt();


        System.out.print("Digite a força do seu personagem: ");
        int forca = scanner.nextInt();


        System.out.print("Digite a inteligência do seu personagem: ");
        int inteligencia = scanner.nextInt();


        Personagem personagem = new Personagem(1, nome, hp, forca, inteligencia);



        Inimigo dragao = new Inimigo(1, "O Dragão", 3000, 300);
        Inimigo gigante = new Inimigo(2, "O Gigante", 5000, 200);

        System.out.println("Escolha o inimigo a enfrentar:" + "\n1- Dragão\n" + "2- Gigante");
        int escolha = scanner.nextInt();

        Inimigo inimigoEscolhido = (escolha == 1) ? dragao : gigante;


        Ataque ataqueFisico = new Ataque(1, "fisico", 20);
        Ataque ataqueMagico = new Ataque(2, "magico", 50);



        // Simulando a batalha
        System.out.println("Início do combate:\n");

        System.out.println("\nEscolha o tipo de ataque:");
        System.out.println("1 - Ataque Físico");
        System.out.println("2 - Ataque Mágico");
        int escolhaAtaque = scanner.nextInt();


        Ataque ataqueEscolhido = (escolhaAtaque == 1) ? ataqueFisico : ataqueMagico;


        while (personagem.getHp() > 0 && inimigoEscolhido.getHp() > 0) {
            // Atacar o inimigo
            System.out.println("\n" + personagem.getNome() + " ataca " + inimigoEscolhido.getNome() + " com um ataque " + ataqueEscolhido.getTipo());
            personagem.atacar(inimigoEscolhido, ataqueEscolhido);
            System.out.println(inimigoEscolhido.getNome() + " agora tem " + inimigoEscolhido.getHp() + " pontos de vida.");


            if (inimigoEscolhido.getHp() <= 0) {
                System.out.println(inimigoEscolhido.getNome() + " foi derrotado!");
                break;
            }
            System.out.println(inimigoEscolhido.getNome() + " ataca " + personagem.getNome() + " com ataque físico.\n");
            inimigoEscolhido.atacar(personagem, ataqueFisico);  // Usando um ataque físico do inimigo
            System.out.println(personagem.getNome() + " agora tem " + personagem.getHp() + " pontos de vida.\n");


            if (personagem.getHp() <= 0) {
                System.out.println(personagem.getNome() + " foi derrotado!");
                break;
            }

            }

    }

    }
