package ejercicio1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		int tabla[] = new int[20];
		int seleccionar;
		int caída;
		int partidas=14;
		tabla = Buscaminas.ponMinasPistas(tabla);
		System.out.println(Arrays.toString(tabla));
		System.out.println("Hay un buscaminas unidimensional de 20 casillas, del uno al 20, ¿Qué casilla quieres pisar?");
		seleccionar = all.nextInt();
		caída=Buscaminas.casilla(seleccionar, tabla);
	}
}