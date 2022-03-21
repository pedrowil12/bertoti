package observer;

public class ApplicationObserver {

	public static void main(String[] args) {
		 Assunto assunto = new Assunto();
		 
	      new Binario(assunto);

	      System.out.println("Primeira mudan�a de estado: 15");	
	      assunto.setEstado(15);
	      System.out.println("\n=======================================================");	
	      System.out.println("\nSegunda mudan�a de estado: 10");	
	      assunto.setEstado(10);
	}

}
