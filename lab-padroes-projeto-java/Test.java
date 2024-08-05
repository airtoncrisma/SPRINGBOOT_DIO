

public class Test {
    public static void main(String[] args) {
        // Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        // ComportamentoNormal normal = new ComportamentoNormal();
        // ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        // ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        // Robo robo = new Robo();
        // robo.setComportamento(normal);
        // robo.mover();
        // robo.mover();
        // robo.setComportamento(defensivo);
        // robo.mover();
        // robo.setComportamento(agressivo);
        // robo.mover();
        // robo.mover();
        // robo.mover();
        
    }
}
