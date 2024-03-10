package Proyecto_Parcial;
import java.util.*;
public class EjercicioDeAñoBisiesto_1 {
    public static void main(String args[]){

        int year = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        year = in.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + " Es un año bisiesto.");
        } else {
            System.out.println(year + " No es un año bisiesto.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("El año debe estar entre 1 y 9999.");
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
