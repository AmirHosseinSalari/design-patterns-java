package creational.singleton;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){

    }

    public static SingletonObject getInstance() {
        if (instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }

    public void print(){
        System.out.println("Test singleton");
    }
}
