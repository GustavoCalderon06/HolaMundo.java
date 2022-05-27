import java.util.Scanner;

public class iniciador {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        new menuCientifica();
        new menuBasica();
        try {
        menu();
        }catch (Exception e){
            System.out.println("Valor no valido");
        }

    }

    public static void menu(){
        int eleccion;
        do {
            do {
                opciones();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        menuCientifica.mCientifica();
                        break;
                    case 2:
                        menuBasica.menuBasica();
                        break;
                    case 3:
                        break;
                }
            }while (eleccion<1||eleccion>3);
        }while (eleccion!=3);
    }

    public static void opciones(){
        System.out.println("=====MENU=====");
        System.out.println("[1] Calculadora Cientifica");
        System.out.println("[2] Calculadora Basica");
        System.out.println("[3] Salir");
    }
}
