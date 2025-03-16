class Cliente_4  {

    public double saldo ;
    /////

    public  Cliente_4( double a )   {  this.saldo = a ; }

    ////

    public void sacar( double retirada )    {  if( saldo  <=  0 )

                                                  return;

                                               this.saldo -= retirada ; }
    //////


    public void depositar( double adicionar )     {  if( adicionar <=  0 )

                                                         return;

                                                     this.saldo += adicionar ;         }

    //////
    public  double  consulta()  {   return  saldo ; }


    /////
    /*  Por enquanto comentada..depois melhoro

    public void transferir( double transferencia, Cliente[]  Receptor )

    { if( saldo <=  0  ||  transferencia > saldo )

        return ;

        Receptor.saldo  +=  transferencia ; } */

    //////
    ///
    ///
    public double saldo()  {  return saldo ; }


}
