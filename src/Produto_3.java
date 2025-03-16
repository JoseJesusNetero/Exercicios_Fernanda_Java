public class  Produto_3  {

    public String nome;
    public int quantidade;
    public double valor;

    public Produto_3( String a, int b, double c )  { this.nome = a;
                                                   this.quantidade = b;
                                                   this.valor = c;  }

    ////////

    public int get_estoque()  {  return quantidade ; }

    ///

    public  void Vendas()   {  quantidade -= 1 ; }

    ////

    public  void  Adicionar( int  adicionar )  {  quantidade += adicionar ; }

    ////
}

