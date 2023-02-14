package ejercicio2; //Ctrl+7 Comentas todo lo seleccionado 

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

	public static double Sacarta(double cartasacáh) { // Saca una carta aleatoria
		// TODO Auto-generated method stub

		double cartaes = 0.5;

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
		}
		if (cartas > 7) {
			System.out.println("¡Sacaste una sota, caballo o rey!");
			return cartaes;
			
		} else {
			return cartas;
		}
	}
}