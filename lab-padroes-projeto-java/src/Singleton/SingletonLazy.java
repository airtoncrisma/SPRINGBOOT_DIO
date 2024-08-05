
/**Singleton preguissoso
 * 
 * @author Airton Loureiro
 */

public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
            
        }
        return instancia;
    }

}
