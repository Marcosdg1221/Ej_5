package ejercicio2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		int cartas[] = new int[10]; //Sólo se puede sacar un máximo de un rango cartas
		int cartasacáh = 0;
		String respuesta = "si";
		int puntosJ1 = 0, puntosJ2 = 0;
		cartas = SieteYMedia.Valorcartas(cartas); //Establece los puntos de las cartas
		while (puntosJ1 < 8 & respuesta.equals("si")) { //Mientras J1 no se pase y siga diciendo sí, seguirá sacando cartas hasta pasarse o no decir si.
			System.out.println("Turno del jugador 1, sacó la siguiente carta:");
			cartasacáh = SieteYMedia.Sacarta(cartasacáh);
			puntosJ1 += cartasacáh;
			if (puntosJ1 < 8) {
				System.out.println("Puntos: " + puntosJ1);
				System.out.println("¿Quieres sacar más cartas?");
				respuesta = all.next();
			} else {
				System.out.println("¡Te pasaste, jugador uno!");
			}
		}
		do { //Lo mismo ocurre aquí, pero con J2.
			System.out.println("Turno del jugador 2, sacó la siguiente carta:");
			cartasacáh = SieteYMedia.Sacarta(cartasacáh);
			puntosJ2 += cartasacáh;
			if (puntosJ2 < 8) {
				System.out.println("Puntos: " + puntosJ2);
				System.out.println("¿Quieres sacar más cartas?");
				respuesta = all.next();
			} else {
				System.out.println("¡Te pasaste, jugador dos!");
			}
		}
			while (puntosJ2 < 8 & respuesta.equals("si"));

		
		if (puntosJ1>puntosJ2 & puntosJ1<8) {
			if (puntosJ1<8) {
			System.out.println("¡Ganó Jugador1!");	
		}
			else {
			System.out.println("¡Empate!");
				}
			}
		else if (puntosJ2<8) {
			if (puntosJ2>puntosJ1 | puntosJ1>7) {
				System.out.println("¡Ganó Jugador2!");	
			}
				else {
				System.out.println("¡Empate!");
					}
		}
	}
}