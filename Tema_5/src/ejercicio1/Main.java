package ejercicio1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		int tabla[] = new int[20];
		int casillaCaida[]= new int[20];
		int seleccionar;
		tabla = Buscaminas.ponMinas(tabla);
		System.out.println(Arrays.toString(tabla));
		System.out.println("¿Qué casilla quieres pisar?");
		seleccionar = all.nextInt();
		//casillaCaida=Buscaminas.casilla(tabla);
	}
}