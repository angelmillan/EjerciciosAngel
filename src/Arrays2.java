public class Arrays2 {
	public static void main(String[] args) {
		final int TAM_FIL = 3;
		final int TAM_COL = 3;
		int[][] coleccionBidimensionalEnteros = new int[TAM_FIL][TAM_COL];

		coleccionBidimensionalEnteros[0][0] = 0;
		coleccionBidimensionalEnteros[0][1] = 1;
		coleccionBidimensionalEnteros[0][2] = 2;
		coleccionBidimensionalEnteros[1][0] = 3;
		coleccionBidimensionalEnteros[1][1] = 4;
		coleccionBidimensionalEnteros[1][2] = 5;
		coleccionBidimensionalEnteros[2][0] = 6;
		coleccionBidimensionalEnteros[2][1] = 7;
		coleccionBidimensionalEnteros[2][2] = 8;

		for (int i = 0; i < coleccionBidimensionalEnteros.length; i++) {
			for (int j = 0; j < coleccionBidimensionalEnteros[i].length; j++) {
				System.out.println(coleccionBidimensionalEnteros[i][j]);
			}
		}
		// Ahora la versión para humanos

		for (int[] is : coleccionBidimensionalEnteros) {
			for (int i : is) {
				System.out.println(i);
			}
		}

		// ahora creamos la colecc tridimensional y la inicializamos
		int[][][] coleccionTridimensionalEnteros = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } },
				{ { 9, 10 }, { 11, 12 } } };

		System.out.println("_______________________________________________");

		// recorrer
		for (int[][] is : coleccionTridimensionalEnteros) {
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.println(i);
				}
			}
		}
	}
}
