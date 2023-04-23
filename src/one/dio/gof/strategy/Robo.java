package one.dio.gof.strategy;

public class Robo {

    private Comportamento movimento;

    public void setmovimento(Comportamento movimento) {
        this.movimento = movimento;
    }

    public void mover(){
        movimento.mover();
    }
}
