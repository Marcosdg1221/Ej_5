package ejercicio1;

import java.util.*; //Importamos el java.util que necesitamos

public class Buscaminas {
	static int[] tabla2 = new int[20];

	public static int[] ponMinasPistas(int[] tabla) {
		int pos[] = new int[6];
		for (int num = 0; num < pos.length; num++) { // Spawnea las posiciones de las minas, de 1 a 20 sin repetir.
			pos[num] = (int) (Math.random() * 20); // entre cero y 19 (recordemos que la tabla empieza por cero, por lo
													// que son hasta 19.
			for (int n = 0; n < pos.length; n++) { // Por si se repite, se vuelve a repetir la tabla y si se repite el
													// nº generado, vuelve a generar otro.
				if (pos[num] == pos[n]) {
					
					pos[num] = (int) (Math.random() * 21); //
				}
			}
		}
		for (int n = 0; n < pos.length - 1; n++) {
			tabla[pos[n]] = -1; // -1 representa que hay una mina allí.
		}
		for (int n = 1; n < tabla.length; n++) {
			if (tabla[n] == -1 & tabla[n - 1] != -1) { // -1 representa que hay una mina allí.
				tabla[n - 1] += 1;
			}
			if (n < 19) {
				if (tabla[n] == -1 & tabla[n + 1] != -1 & n < 19) { // -1 representa que hay una mina allí.
					tabla[n + 1] += 1;
				}
			}
		}
		return tabla;
	}

	public static int casilla(int seleccionar, int[] tabla) {
		// TODO Auto-generated method stub
		if (tabla[seleccionar] == -1) {
			System.out.println("¡Has pisado una mina! Has perdido.");
			return -1; // -1 significa que ha perdido
		} else {
			// Ahora sólo debes copiar la casilla seleccionada de la tabla a la tabla 2

			tabla2[seleccionar] = tabla[seleccionar];
			System.out.println(Arrays.toString(tabla2));
			return 0; // 0 significa que no ha pisado una mina
		}
	}
}