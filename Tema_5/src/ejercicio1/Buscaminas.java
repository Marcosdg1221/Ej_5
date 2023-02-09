package ejercicio1;

import java.util.*; //Importamos el java.util que necesitamos

public class Buscaminas {
	public static int[] ponMinas(int[] tabla) {
		int pos[] = new int[6];
		for(int num=0;num<pos.length;num++) { //Spawnea las posiciones de las minas, de 1 a 20 sin repetir.
			pos[num]=(int)(Math.random() * 21); //entre cero y 20
			for (int n=0;n<pos.length;n++) { //Por si se repite, se vuelve a repetir la tabla y si se repite el nº generado, vuelve a generar otro.
				if (pos[num]==pos[n]) {
					pos[num]=(int)(Math.random() * 21); //
				}
			}
		}
		
		for(int n=0;n<pos.length;n++) {
			tabla[pos[n]]=-1; //-1 representa que hay una mina allí.
		}
		
		return tabla;
	}
}