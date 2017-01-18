
public class Palabra {
	// atributos
	private String contenido;

	// constructor
	public Palabra(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Palabra: " + contenido;
	}

	// un metodo que devuelva la palabra en mayuscula
	public String convertirContenidoMayuscula() {
		return this.contenido.toUpperCase();
	}

	// un metodo que devuelva la palabra en minus
	public String convertirContenidoMinuscula() {
		return this.contenido.toLowerCase();
	}

	// devuelve numero de letras
	public int contarLetras() {
		return contenido.length();
	}

	// reemplazar letras
	public String reemplazarLetrasDeContenido(char oldChar, char newChar) {
		return contenido.replace(oldChar, newChar);
	}

	// devolver primera letracontenido en minuscula
	public char obtenerPrimeraLetraDeContenido() {
		return contenido.toLowerCase().charAt(0);
	}

	// devolver primera letracontenido en minuscula
	public char obtenerUltimaLetraDeContenido() {
		return contenido.toUpperCase().charAt(contenido.length() - 1);
	}

	// crear main para comprobar
	public static void main(String[] args) {
		Palabra p1 = new Palabra("Prueba");
		System.out.println(p1);
	}

}
