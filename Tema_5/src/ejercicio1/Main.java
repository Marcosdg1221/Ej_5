package ejercicio1;

import java.util.*;

public class Main {
//Arrays.fill te podría rellenar con guiones, o lo que quieras
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		char tabla[] = new char[20]; // La tabla completa con las minas y pistas
		int seleccionar; // será la casilla a seleccionar
		int caída; // Indica el efecto sobre la casilla en el que se eligió
		int partidas = 14; // Como hay 6 minas y la tabla hay diez casillas, si el jugador pasa 14 partidas
							// sin caer en una mina, ha ganado.
		tabla = Buscaminas.ponMinasPistas(tabla); // Hará poner minas y pistas en la tabla

		System.out.println("Hay un buscaminas unidimensional de 20 casillas. Del uno al 19, ¿Qué casilla quieres pisar? los -9 son las casillas que no has pisado todavía");
		// Pedirá al jugador la casilla
		seleccionar = all.nextInt();
		while (seleccionar<0 | seleccionar>19) {
		System.out.println("Sólo valen números del cero al 19, introduce otro número.");
			
		}
		caída = Buscaminas.casilla(seleccionar, tabla); // Hará el efecto de la casilla seleccionada
		partidas--;
		while (partidas > 0 & caída != -1) { // Hará continuar la partida hasta que caiga en una mina o finalicen las
												// partidas.
			System.out.println("¿Qué casilla quieres pisar ahora?");
			seleccionar = all.nextInt();
			caída = Buscaminas.casilla(seleccionar, tabla);
			partidas--;
		}
		if (caída != -1) {
			System.out.println("¡Ganaste!");
		}
	}
}