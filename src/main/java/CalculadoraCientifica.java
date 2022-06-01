/*
*agregar
-integrales
-derivadas
*/
import java.util.LinkedList;
import java.util.Scanner;

public class CalculadoraCientifica {

    static Scanner leer = new Scanner(System.in);

    public static void raiz(){
        String[] operadores={"numero: "};
        double[] numero=ingresarNumeros(operadores);
        if(numero[0]<0){
            String[] imaginario ={Math.sqrt(numero[0]*(-1))+"i"};
            String b= (imaginario[0]);
            System.out.println(b);
        }
        if(numero[0]>=0){
            double a=Math.sqrt(numero[0]);
            resultado(a);
        }
    }

    public static void potencia() {
        String[] operadores = {"la base","el exponente: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double potenciaNumero = Math.pow(a,b);
        resultado(potenciaNumero);
    }

    public static void porcentaje() {
        String[] operadores = {"el 1er número","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        b /= 100;
        double porcentajeNumero = a*b;
        resultado(porcentajeNumero);
    }

    public static double[] ingresarNumeros(String[] operadores) {
        double[] numeros = new double[operadores.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese "+operadores[i]);
            numeros[i] = leer.nextDouble();
        }
        return numeros;
    }

    public static double[] ingresarCoeficientes(String[] parametros) {
        double[] coeficientes = new double[parametros.length];
        for (int i = 0; i < coeficientes.length; i++) {
            System.out.println("Valor de "+parametros[i]+"?:");
            coeficientes[i] = leer.nextDouble();
        }
        return coeficientes;
    }

    public static void factoriales() {
        System.out.println("ingrese dato: ");
        double a = leer.nextDouble();
        int fact = 1;
        for( int i = 0; i <= a; i++ ) {
            fact *= (i+1);
        }
        resultado(fact);
    }

    public static void divisores() {
        String[] operadores ={"numero"};
        double[] numeros=ingresarNumeros(operadores);
        Double a=numeros[0];
        LinkedList<Double>Divisores=new LinkedList<>();
        agregarDivisores(Divisores,a);
    }

    public static void logaritmoNatural(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.log(numeros[0]);
        resultado(a);
    }

    public static void logaritmo10(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.log10(numeros[0]);
        resultado(a);
    }

    public static void valorAbsoluto(){
        String[] operadores={"numero: "};
        double[] numero=ingresarNumeros(operadores);
        double a;
        if(numero[0]<0){
            a = numero[0] * -1;
        }else{
            a = numero[0];
        }
        resultado(a);

    }

    public static void agregarDivisores(LinkedList<Double> Divisores, Double numero) {
        for (int i=1;i<(numero+1);i++){
            if(numero%i==0) {
                Divisores.add((double) i);
            }
        }
        mostrarDivisores(Divisores);
    }

    private static void mostrarDivisores(LinkedList<Double> divisores) {
        System.out.println(divisores);
    }

    public static void sumatoria(){
        String[] operadores={"numero hasta donde quiera sumar: " };
        double[] numero=ingresarNumeros(operadores);
        double iNumero = numero[0];
        double iSumatorio = 0;
        double iContador = iNumero;
        while (iContador != 0) {
            iSumatorio = iSumatorio + iContador;
            iContador--;
        }
        resultado(iSumatorio);
    }

    public static void cbrt(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.cbrt(numeros[0]);
        resultado(a);
    }

    public static void resultado(double resultado){
        System.out.println("El resultado es = "+resultado);
    }
}