import java.util.Scanner;


public class PasaDecimal {


    public static void main(String[] args) {



        String nGuardado;
        double nLeido;
        String tunc;


        Scanner leer = new Scanner(System.in);

        System.out.println("Inserta un numero: ");
        nLeido = leer.nextDouble();

        for(double i=1; i<=10; i++){

            for(double j=1; j<=10; j++){


                tunc = String.format("%.2f", i / j);
                nGuardado = String.format("%.2f", nLeido);


                if(!tunc.equals(nGuardado))
                    tunc = String.format("%.2f", ((i / j) - 0.01));


                if(nGuardado.equals(tunc) )
                    System.out.println(i + "/" + j);


            }

        }

    }


}