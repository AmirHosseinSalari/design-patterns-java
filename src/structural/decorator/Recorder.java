package structural.decorator;

public class Recorder extends PlayerDecorator{

    public Recorder(Player wrapper) {
        super(wrapper);
        record();
    }

    private void record(){
        play();
        pause();
        System.out.println("Recording from mic");
    }
}
