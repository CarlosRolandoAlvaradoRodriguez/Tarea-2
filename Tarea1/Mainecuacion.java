package Tarea1;

public class Mainecuacion
{
    public static void main(String args[])
    {
        Ecuacion_Cuadratica ecuacion_cuadratica = new Ecuacion_Cuadratica();

        ecuacion_cuadratica.establecerValora(8);
        System.out.println(ecuacion_cuadratica.obtenerValora());

        ecuacion_cuadratica.establecerValorb(2);
        System.out.println(ecuacion_cuadratica.obtenerValorb());

        ecuacion_cuadratica.establecerValorc(3);
        System.out.println(ecuacion_cuadratica.obtenerValorc());


        System.out.println("De Celsius a Farenheit es: "+ecuacion_cuadratica.Rpositivo());
        System.out.println("De Celsius a Farenheit es: "+ecuacion_cuadratica.Rnegativo());

    }
}
