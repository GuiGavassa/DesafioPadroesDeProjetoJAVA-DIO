package one.dio.gof.strategy;

public class Teste {

    public static void main(String[] args){

    Comportamento frente = new MoverParaFrente();
    Comportamento direita = new MoverParaDireita();
    Comportamento esquerda = new MoverParaEsquerda();
    Comportamento tras = new MoverParaTras();

    Robo robo = new Robo();
        robo.setmovimento(frente);
        robo.mover();
        robo.mover();

        robo.setmovimento(direita);
        robo.mover();

        robo.setmovimento(frente);
        robo.mover();
        robo.mover();

        robo.setmovimento(esquerda);
        robo.mover();
        robo.mover();

        robo.setmovimento(tras);
        robo.mover();

    }
}
