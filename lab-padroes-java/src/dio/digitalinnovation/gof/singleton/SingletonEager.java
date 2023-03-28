package dio.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author https://github.com/alexaniatoma
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
