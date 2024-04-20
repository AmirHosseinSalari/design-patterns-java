package structural.proxy;

public class Main {
    public static void main(String[] args) {
        InternetAccessProxy proxy = new InternetAccessProxy();
        InternetManager manager = new InternetManager(proxy);
        System.out.println(manager.giveInternetAccessToUser());
    }
}
