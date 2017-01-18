
public class TestPalabra {

	public static void main(String[] args) {
		String palabraPrueba = "prueba";
		if (palabraPrueba.trim().length() == 0) {
			System.out.println("Palabra sin contenido");
			System.exit(1);
		}
		Palabra palabra = new Palabra(palabraPrueba.trim());
		System.out.printf("Contenido de la palabra: %s%n", palabra);
		System.out.printf("Palabra en mayúscula: %s%n", palabra.convertirContenidoMayuscula());
		System.out.printf("Palabra en minúscula: %s%n", palabra.convertirContenidoMinuscula());
		System.out.printf("Longitud: %s%d", palabra.contarLetras());
		System.out.printf("Primera letra: %s%c", palabra.obtenerPrimeraLetraDeContenido());
		System.out.printf("Ultima letra: %c%n", palabra.obtenerUltimaLetraDeContenido());
		System.out.printf("Reemplazar: %s%n", palabra.reemplazarLetrasDeContenido('u', 'Z'));

	}

}
