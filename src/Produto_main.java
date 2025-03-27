 class Produto_main {
  
      public static void main(String[] args) {
    

        // Cria um objeto Produto
        Produto produto = new Produto("Notebook", 10, 2500.00f);

        // Verifica o estoque
        produto.verificarEstoque();

        // Adiciona 5 unidades ao estoque
        produto.adicionarQuantidade(5);
        produto.verificarEstoque();

        // Tenta vender 8 unidades
        produto.vender(8);
        produto.verificarEstoque();

        // Tenta vender 10 unidades (mais do que há em estoque)
        produto.vender(10);
        produto.verificarEstoque();
    
}
}