import java.util.Scanner;


public class PasaDecimal {


    public static void main(String[] args) {



        String nGuardado;
        double nLeido;
        String tunc;


        Scanner n = new Scanner(System.in);

        System.out.println("Inserta un numero: ");
        nLeido = n.nextDouble();

        for(double i=1; i<=100; i++){

            for(double j=1; j<=100; j++){


                tunc = String.format("%.5f", i / j);
                nGuardado = String.format("%.5f", nLeido);


                if(!tunc.equals(nGuardado))
                    tunc = String.format("%.5f", ((i / j) - 0.01));


                if(nGuardado.equals(tunc) )
                    System.out.println(i + "/" + j);


            }

        }

    }


}