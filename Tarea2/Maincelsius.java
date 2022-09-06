package Tarea2;

public class Maincelsius
{
    public static void main(String args[])
    {
    Celsius celcius = new Celsius();

    celcius.establecerCelcius(8);
    System.out.println(celcius.obtenerCelcius());

    //celcius.establecerCelcius(5);
    //System.out.println(calculadora3.obtenerNumero2());

    System.out.println("De Celsius a Farenheit es: "+celcius.Farenheit());
    System.out.println("De Celsius a Kelvin es: "+celcius.Kelvin());
    System.out.println("De Celsius a Rankine es: "+celcius.Rankine());
    }
}
