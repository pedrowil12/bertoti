package observer;

public class Binario extends Observer{
	public Binario(Assunto assunto){
	      this.assunto = assunto;
	      this.assunto.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Houve uma conversão de estado para binário: " + Integer.toBinaryString( assunto.getEstado() ) ); 
	   }
}
