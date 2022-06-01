import java.util.Scanner;
public class calculadoraBasica {

    public static void sumar() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double suma = a+b;
        CalculadoraCientifica.resultado(suma);
    }

    public static void restar() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double resta = a-b;
        CalculadoraCientifica.resultado(resta);
    }

    public static void multiplicar() {
        String[] operadores = {"el 1er factor: ","el 2do factor: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double multiplicacion = a*b;
        CalculadoraCientifica.resultado(multiplicacion);
    }

    public static void dividir(){
        String[] operadores = {"el dividendo: ","el divisor: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        if(numeros[1]==0){
            System.out.println("No existe solucion");
        }else{
            double a = numeros[0];
            double b = numeros[1];
            double division = a/b;
            CalculadoraCientifica.resultado(division);
        }
    }

    public static void mayor() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMayor = Math.max(a,b);
        CalculadoraCientifica.resultado(numeroMayor);
    }

    public static void menor() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMenor = Math.min(a,b);
        CalculadoraCientifica.resultado(numeroMenor);
    }

    public static void modulo(){
        String[] operadores={"numero: ","numero: "};
        double[] numero=CalculadoraCientifica.ingresarNumeros(operadores);
        double a=numero[0];
        double b=numero[1];
        double mod=a%b;
        CalculadoraCientifica.resultado(mod);
    }
}