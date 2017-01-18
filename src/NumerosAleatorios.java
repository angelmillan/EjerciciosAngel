
public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generamos 10 números aleatorios
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		for (int i = 0; i < 10; i++) {
			int numero = (int) (Math.random() * 101);
			System.out.println(numero);
		}
	}

}
