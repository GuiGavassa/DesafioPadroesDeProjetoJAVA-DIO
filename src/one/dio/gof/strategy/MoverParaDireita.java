package one.dio.gof.strategy;

public class MoverParaDireita implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robo se move para direita!");
    }
}
