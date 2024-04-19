package structural.decorator;

public class Player implements PlayerAction{
    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void pause() {
        System.out.println("Pause music");
    }
}
