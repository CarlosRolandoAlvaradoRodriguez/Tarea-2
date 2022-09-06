package Tarea2;

public class Celsius
{
    public double celcius;

    public void establecerCelcius(double c)
    {
        celcius = c;
    }

    public double obtenerCelcius()
    {
        return celcius;
    }

    public double Farenheit()
    {
        double resultado1;
        resultado1 = ((9/5)*(celcius) + 32);
        return resultado1;

    }
    public double Kelvin()
    {
        double resultado2;
        resultado2 = celcius + 273;
        return resultado2;

    }
    public double Rankine()
    {
        double resultado3;
        resultado3 = ((9/5)*(celcius) + 492);
        return resultado3;

    }

}
