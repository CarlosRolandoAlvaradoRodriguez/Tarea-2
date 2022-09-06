package Tarea3;

public class Maindecimal
{
       public static void main(String[] args)
       {
            Decimal decimal = new Decimal();
            decimal.establecerN(100);
            decimal.establecerBase(5);
            System.out.println("\nCONVERTIR NÚMERO DECIMAL A UNA BASE MENOR QUE 10");
            System.out.println("Número en base 10 a convertir: " + convertBase.obternerN());
            System.out.println("Base: " + decimal.obternerBase());
            System.out.println(decimal.resolver());
        }
}
