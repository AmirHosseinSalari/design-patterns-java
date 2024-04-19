package structural.decorator;

public class PlayerDecorator implements PlayerAction{

    private Player wrapper;

    public PlayerDecorator(Player wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void play() {
        this.wrapper.play();
    }

    @Override
    public void pause() {
        this.wrapper.pause();
    }
}
