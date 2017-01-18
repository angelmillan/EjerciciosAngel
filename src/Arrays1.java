
public class Arrays1 {
	public static void main(String[] args) {
		String[] coleccionCadenas = new String[2];
		coleccionCadenas[0] = "Hola ";
		coleccionCadenas[1] = "mundo\n";

		for (String cadena : coleccionCadenas) {
			System.out.print(cadena);
		}
	}
}
