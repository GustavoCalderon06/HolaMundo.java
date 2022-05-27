import java.util.Scanner;
public class calculadoraBasica {
    static Scanner leer=new Scanner(System.in);

    public static double[] ingresarNumeros(String[] operadores) {
        double[] numeros = new double[operadores.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese "+operadores[i]);
            numeros[i] = leer.nextDouble();
        }
        return numeros;
    }

    public static void sumar() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double suma = a+b;
        resultado(suma);
    }

    public static void restar() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double resta = a-b;
        resultado(resta);
    }

    public static void multiplicar() {
        String[] operadores = {"el 1er factor: ","el 2do factor: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double multiplicacion = a*b;
        resultado(multiplicacion);
    }

    public static void dividir(){
        String[] operadores = {"el dividendo: ","el divisor: "};
        double[] numeros = ingresarNumeros(operadores);
        if(numeros[1]==0){
            System.out.println("No existe solucion");
        }else{
            double a = numeros[0];
            double b = numeros[1];
            double division = a/b;
            resultado(division);
        }
    }

    public static void mayor() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMayor = Math.max(a,b);
        resultado(numeroMayor);
    }

    public static void menor() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMenor = Math.min(a,b);
        resultado(numeroMenor);
    }

    public static void modulo(){
        String[] operadores={"numero: ","numero: "};
        double[] numero=ingresarNumeros(operadores);
        double a=numero[0];
        double b=numero[1];
        double mod=a%b;
        resultado(mod);
    }

    public static void resultado(double resultado){
        System.out.println("El resultado es = "+resultado);
    }
}