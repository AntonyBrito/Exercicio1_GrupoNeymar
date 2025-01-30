public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "Harry Potter", 5, 10);
        Livro livro2 = new Livro(2, "O Senhor dos Anéis", 5.50F, 15);
        Livro livro3 = new Livro(2, "O Código da Vinci", 4.50F, 20);

        Cliente cliente1 = new Cliente(1, "Ronald Araujo", "ronaldinhoarau@email.com");
        Cliente cliente2 = new Cliente(2, "Raphinha", "neymarmeuamor@hotmail.com");
        livro1.exibir_detalhes(livro1);
        livro2.exibir_detalhes(livro2);
        Emprestimo emprestimo1 = new Emprestimo(1, "11/11/2011", cliente1, livro1);
        System.out.println(cliente1.nome +" pegou 3 livros "+"2 "+ livro1.nome + ", "+"1 "+ livro2.nome);
        //emprestimo1.adicionar_livro(livro1, 1);
        livro1.reduzir_estoque(2);
        livro2.reduzir_estoque(1);
        System.out.println("Cliente: "+cliente1.nome+" Preço total a pagar "+((livro1.preco*2)+livro2.preco));

        System.out.println("quantidade em estoque do Harry Potter "+livro1.quantidade_estoque);
        System.out.println("quantidade em estoque do O Senhor dos Anéis "+livro2.quantidade_estoque);
        livro1.exibir_detalhes(livro1);
        livro2.exibir_detalhes(livro2);

        //emprestimo1.finalizar_emprestimo(emprestimo1);
        //emprestimo1.calcular_total();
    }
}