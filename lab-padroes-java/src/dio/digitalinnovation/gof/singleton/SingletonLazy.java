package dio.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author https://github.com/alexaniatoma
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
