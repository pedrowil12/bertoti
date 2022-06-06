package singleton;

public class SingletonDemo {

	public static void main(String args[]) {
	
		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		System.out.println("Hashcode de a � " + x.hashCode());
		System.out.println("Hashcode de b � " + y.hashCode());
		System.out.println("Hashcode de c � " + z.hashCode());

		if (x == y && y == z) {

			System.out.println("\nTr�s objetos apontam para o mesmo local");
		}

		else {
			System.out.println("\nOs tr�s objetos n�o apontam para o mesmo local");
		}
	}

}
