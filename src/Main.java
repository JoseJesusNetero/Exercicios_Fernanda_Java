import  java.util.Scanner ;

/// //


///////

public class Main {
    public static void main(String[] args) {


        // Questao_1

        Notas_1  Joao =      new Notas_1( "Joao" ,     5.6 ,  4.7,  7.8);
        Notas_1  Andressa =  new Notas_1( "Andressa" , 7.9 ,  7.6,  8.2);
        Notas_1  Carvalho =  new Notas_1( "Carvalho" , 2.0 ,  4.7,  3.1);


        Notas_1[]  Vetor_Alunos  =  new  Notas_1 [3] ;

        //


            Vetor_Alunos[ 0 ] =  Joao;
            Vetor_Alunos[ 1 ] = Andressa;
            Vetor_Alunos[ 2 ] = Carvalho;

        //

        for(  int i = 0 ; i < Vetor_Alunos.length ; i++ )

            Vetor_Alunos[ i ].Situacao();








        /* 4_Questao

        Cliente c1  =  new Cliente( 340 );

        System.out.println(" O que deseja fazer ? \n 1_ Sacar" +
                "\n2_ Depositar" +
                "\n3_ Consultar" +
                "\n4_ Transferir" +"\n"  );

        ///

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int option  =  sc2.nextInt();




        switch( option ) {

            case  1:  c1.sacar(100);

            case  2:  c1.depositar(100);

            case  3:  c1.consulta();

            //case  4:   c1.transferir();




        } */
    }
}