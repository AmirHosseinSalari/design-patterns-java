package structural.decorator;

public class Main {
    public static void main(String[] args) {
        PlayerDecorator decorator = new Recorder(new Player());
    }
}
