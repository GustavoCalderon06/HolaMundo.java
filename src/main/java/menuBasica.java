import java.util.Scanner;

public class menuBasica {

    static Scanner leer=new Scanner(System.in);

    public static void menuBasica(){
        try{
            menuCalculadora();
        }catch (Exception e){
            System.out.println("Valor no valido.");
        }
    }

    public static void menuCalculadora(){
        int eleccion;
        do {
            do {
                mostraropciones();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        calculadoraBasica.sumar();
                        break;
                    case 2:
                        calculadoraBasica.restar();
                        break;
                    case 3:
                        calculadoraBasica.multiplicar();
                        break;
                    case 4:
                        calculadoraBasica.dividir();
                        break;
                    case 5:
                        calculadoraBasica.mayor();
                        break;
                    case 6:
                        calculadoraBasica.menor();
                        break;
                    case 7:
                        break;
                }
            }while (eleccion<1 || eleccion >7);
        }while (eleccion!=7);
    }

    public static void mostraropciones(){
        System.out.println("=====MENU=====");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Mayor");
        System.out.println("[6] Menor");
        System.out.println("[7] Salir");
    }
}