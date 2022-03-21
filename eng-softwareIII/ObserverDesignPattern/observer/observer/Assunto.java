package observer;
import java.util.ArrayList;
import java.util.List;


public class Assunto {

	   private List<Observer> observers = new ArrayList<Observer>();
	   private int estado;

	   public int getEstado() {
	      return estado;
	   }

	   public void setEstado(int estado) {
	      this.estado = estado;
	      notificaTodosObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notificaTodosObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 	
}
