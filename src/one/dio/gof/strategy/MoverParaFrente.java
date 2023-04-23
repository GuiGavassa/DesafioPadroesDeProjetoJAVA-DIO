package one.dio.gof.strategy;

public class MoverParaFrente implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robo se move para frente!");
    }
}
