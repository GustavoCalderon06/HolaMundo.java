/*
*agregar
-integrales
-derivadas
-ecuaciones de tercer grado
-decimales a fraccion
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

    public static void ecuacionCuadratica() {
        String[] parametrosCuadratica = {"a","b","c"};
        double[] coeficientes = ingresarCoeficientes(parametrosCuadratica);
        double[] solucionesCuadratica = calcularEcuacionCuadratica(coeficientes);
        mostrarEcuacionCuadratica(solucionesCuadratica);
    }

    public static void sistemaEcuaciones() {
        String[] parametrosSistemaEcuaciones = {"a1","b1","c1","a2","b2","c2"};
        double[] coeficientes = ingresarCoeficientes(parametrosSistemaEcuaciones);
        double[] solucionesSistema = calcularSistemaEcuaciones(coeficientes);
        mostrarSistemaEcuaciones(solucionesSistema);
    }

    public static void ecuacionRecta() {
        String[] parametrosRecta = {"x1","y1","x2","y2"};
        double[] coeficientes = ingresarCoeficientes(parametrosRecta);
        double[] solucionRecta = calcularEcuacionRecta(coeficientes);
        mostrarEcuacionRecta(solucionRecta);
    }

    public static double[] ingresarCoeficientes(String[] parametros) {
        double[] coeficientes = new double[parametros.length];
        for (int i = 0; i < coeficientes.length; i++) {
            System.out.println("Valor de "+parametros[i]+"?:");
            coeficientes[i] = leer.nextDouble();
        }
        return coeficientes;
    }

    public static double[] calcularEcuacionCuadratica(double[] coeficientes) {
        double[] solucionesCuadratica = new double[2];
        double a = coeficientes[0];
        double b = coeficientes[1];
        double c = coeficientes[2];
        double discriminante = (Math.pow(b,2)-(4*a*c));
        if(discriminante<0){
            System.out.println("Solución no real");
        }else{
            double raizDiscriminante = Math.sqrt(discriminante);
            double x1 = (-b+raizDiscriminante)/(2*a);
            double x2 = (-b-raizDiscriminante)/(2*a);
            solucionesCuadratica[0] = x1;
            solucionesCuadratica[1] = x2;
        }
        return solucionesCuadratica;
    }

    public static double[] calcularSistemaEcuaciones(double[] coeficientes) {
        double[] solucionesSistema = new double[2];
        double a1 = coeficientes[0];
        double b1 = coeficientes[1];
        double c1 = coeficientes[2];
        double a2 = coeficientes[3];
        double b2 = coeficientes[4];
        double c2 = coeficientes[5];
        double x,y;
        y = ((c2 * a1) - (a2 * c1)) / ((b2 * a1) - (a2 * b1));
        x = (c1 - (b1 * y)) / a1;
        solucionesSistema[0] = x;
        solucionesSistema[1] = y;
        return solucionesSistema;
    }

    public static double[] calcularEcuacionRecta(double[] coeficientes) {
        double[] solucionRecta = new double[2];
        double x1 = coeficientes[0];
        double y1 = coeficientes[1];
        double x2 = coeficientes[2];
        double y2 = coeficientes[3];
        double pendiente = (y2 - y1) / (x2 - x1);
        double b = ((-x1)*pendiente)+y1;
        solucionRecta[0] = pendiente;
        solucionRecta[1] = b;
        return solucionRecta;
    }

    public static void mostrarEcuacionCuadratica(double[] solucionesCuadratica) {
        System.out.println("Las soluciones de la ecuación son: ");
        System.out.println("x1 = "+solucionesCuadratica[0]);
        System.out.println("x2 = "+solucionesCuadratica[1]);
    }

    public static void mostrarSistemaEcuaciones(double[] solucionesSistema) {
        System.out.println("Las soluciones del sistema son: ");
        System.out.println("x = "+solucionesSistema[0]);
        System.out.println("y = "+solucionesSistema[1]);
    }

    public static void mostrarEcuacionRecta(double[] solucionRecta) {
        System.out.println("La ecuación de la recta es: "+"y = "+solucionRecta[0]+"x + "+solucionRecta[1]);
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

    public static void seno(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double grado=Math.sin(numeros[0]);
        resultado(grado);
    }

    public static void coseno(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double grado=Math.cos(numeros[0]);
        resultado(grado);
    }

    public static void tangente(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.tan(numeros[0]);
        resultado(a);
    }

    public static void logaritmo10(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.log10(numeros[0]);
        resultado(a);
    }

    public static void senoHiperbolico(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.sinh(numeros[0]);
        resultado(a);
    }

    public static void cosenoHiperbolico(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.cosh(numeros[0]);
        resultado(a);
    }

    public static void tangenteHiperbolica(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.tanh(numeros[0]);
        resultado(a);
    }

    public static void aSeno(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.asin(numeros[0]);
        resultado(a);
    }

    public static void aCoseno(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.acos(numeros[0]);
        resultado(a);
    }

    public static void aTangente(){
        String[] operadores={"numero: "};
        double[] numero=ingresarNumeros(operadores);
        double a=Math.atan(numero[0]);
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