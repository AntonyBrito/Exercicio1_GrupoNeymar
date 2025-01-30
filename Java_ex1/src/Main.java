import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando os personagens
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o nome do seu personagem!");
        String nome1 = tec.nextLine();
        System.out.println("Digite o Vida que seu personagem vai ter");
        System.out.println("HP maximo 5000");
        int hp1 = tec.nextInt();
        System.out.println("Digite a Força do seu personagem");
        int forca1 = tec.nextInt();
        System.out.println("Digite a inteligencia do seu personagem");
        int inteligencia1 = tec.nextInt();
        Personagem p1 = new Personagem(0, nome1, hp1, forca1, inteligencia1);

        // Criando os inimigos
        Inimigo dragao = new Inimigo(1, "O Dragão", 3000, 300);

        // Criando os ataques
        Ataque ataqueFisico = new Ataque(1, "fisico", 20);
        Ataque ataqueMagico = new Ataque(2, "magico", 50);
        boolean batalha = true;
        while (batalha){
            batalha = false;
            batalha = true;
        }
        // Simulando a batalha
        System.out.println("Início do combate:\n");

        // Harry ataca o Gigante com ataque mágico
        p1.atacar(dragao, ataqueMagico);

        // Hobbit ataca o Dragão com ataque físico
        p1.atacar(dragao, ataqueFisico);

        // O Dragão ataca o Hobbit com ataque físico
        dragao.atacar(p1, ataqueFisico);
    }
}
