package ejercicio2;

import java.util.*; //Importamos el java.util que necesitamos

public class SieteYMedia {

	public static int[] Valorcartas(int[] cartas) {
		// TODO Auto-generated method stub
		for (int n = 0, valor = 1; n < 7; n++, valor++) { // Pone cartas sus valores hasta el seis (siete).
			cartas[n] = valor;
		}
		for (int n = 8, valor = (int) 0.5; n < cartas.length; n += 1) { // Pone cartas sota, caballo y rey con valor a
																		// 0,5
			cartas[n] = valor;
		}
		return cartas;
	}

	public static int Sacarta(int cartasacáh) { // Saca una carta aleatoria
		// TODO Auto-generated method stub
		
		//double cartaes = (Math.random() * 3); Puedes hacer que devuelva double y que si saca sota caballo o rey sume 0,5, si no, sumas lo del int de abajo
		
		
		int cartas = (int) (Math.random() * 10); 
		switch (cartas) { // Avisa de qué carta ha sacado y la suma.
		case 0:
			cartas = 1;
			System.out.println("¡Sacaste un uno!");
			break;
		case 1:
			cartas = 2;
			System.out.println("¡Sacaste un dos!");
			break;
		case 2:
			cartas = 3;
			System.out.println("¡Sacaste un tres!");
			break;
		case 3:
			cartas = 4;
			System.out.println("¡Sacaste un cuatro!");
			break;
		case 4:
			cartas = 5;
			System.out.println("¡Sacaste un cinco!");
			break;
		case 5:
			cartas = 6;
			System.out.println("¡Sacaste un seis!");
			break;
		case 6:
			cartas = 7;
			System.out.println("¡Sacaste un siete!");
			break;

		case 7:
			cartas = (int) 0.5;
			System.out.println("¡Sacaste una sota!");
			break;
		case 8:
			cartas = (int) 0.5;
			System.out.println("¡Sacaste un caballo!");
			break;
		case 9:
			cartas = (int) 0.5;
			System.out.println("¡Sacaste un rey!");
		}
		return cartas;
	}

}