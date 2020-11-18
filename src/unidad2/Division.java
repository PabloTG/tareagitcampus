package unidad2;

import java.text.DecimalFormat;

public class Division {

	public static void main(String[] args) {
//declaro dividendo y divisor y los inicializo a los n�meros que me interesan
double dividendo = 1234, divisor = 532;
//realizo la divisi�n
double division = dividendo / divisor;
/*muestro el resultado de la divisi�n ocupando como m�nimo quince caracteres, 
 s�lo dos de ellos para la parte decimal, utilizando la clase DecimalFormat 
 (https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html).
 Se mostrar�n diecis�is caracteres incluyendo la coma: trece para la parte 
 num�rica, la coma, y dos para la parte decimal. */
DecimalFormat mostrar = new DecimalFormat("0000000000000.00");
System.out.println(mostrar.format(division));
	}

}
