public class Produto {
  
  
  //////////////
  String codigo;
  
  int quantidade ;
  
  double valor;
  
  String nome;
  
  double tamanho ;
  
  double peso;
  
  String cor;
  
  ////////////
  Produto (String a, int b, double c,
   String d, double e, double f, String g )  {
     
     
     this.codigo = a;
     this.quantidade = b;
     this.valor = c;
     this.nome = d;
     this.tamanho = e;
     this.peso = f;
     this.cor = g;
     
     if( b < 1 ) { this.quantidade = 1 ; }

///////
}

//////////

public void Pagamento( String  forma , double quantia )   {
  
  
  double desconto = 0.0 ;
  double troco = 0.0;
  int items = 0;
  
  System.out.print( "Quantos itens deste poduto voce deseja ?\n")
  
  items = Scanner.nextInt();
  
  if ( items > quantidade )
  ///////////
  if ( forma.equal( "Especie") )  
  
   { 
     
     desconto = 0.15 * valor ; 
     
     //////////
     if( quantia > valor  )
     
       { troco = quantia - ( valor - desconto );
       
       
         System.out.print( "Voce tem troco de " +  troco + "\n");
         
       }                        
       
    }
  
  ///////
  if( forma.equal( "Especie") || forma.equal( "credito") 
   || forma.equal("Transferencia") 
   ||  forma.equal( "Debito")  )          
   
   {
     
     desconto = 0.05 * valor;
     
     System.out.print( "Seu valor fica " + ( valor - desconto ) + "\n");
     
     
     Venda(  items );
     
   }
  
    else 
    
        System.out.print( "Na forma de credito o valor fica " + valor + "\n");
        
        
}

/////////


public void Venda( int itens )  {
  
    
  
    quantidade -= itens ;
  
  
}























public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getTamanho() {
    return tamanho;
}

public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

  
  
  
}
