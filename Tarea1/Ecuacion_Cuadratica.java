package Tarea1;

import java.lang.reflect.Method;

public class Ecuacion_Cuadratica
{
    public double valora;
    public double valorb;
    public double valorc;

   // public double x1;
    //public double x2;

    public void establecerValora(double va)
    {
        valora = va;
    }
    public double obtenerValora()
    {
        return valora;
    }
//
    public void establecerValorb(double vb)
    {
        valorb = vb;
    }
    public double obtenerValorb()
    {
        return valorb;
    }
//
    public void establecerValorc(double vc)
    {
        valorc = vc;
    }
    public double obtenerValorc()
    {
        return valorc;
    }

    public double Rpositivo()
    {
        double resultado1;
        resultado1 = (-valorb + Method 'sqrt'(Method 'pow'(valorb,2) - (4 * valora * valorc))) / (2 * valora);
        return resultado1;
    }
    public double Rnegativo()
    {
        double resultado2;
        resultado2 = (-valorb - Method 'sqrt'(Method 'pow'(valorb,2) - (4 * valora * valorc))) / (2 * valora);
        return resultado2;
    }

}
