package structural.proxy;

public class InternetAccessProxy implements InternetAccessLib{

    private InternetAccessLib service;

    public InternetAccessProxy() {
        this.service = new InternetAccess();
    }

    @Override
    public void getTheAccessPoint() {
        System.out.println("get access point");
        checkAccess();
    }

    @Override
    public void getIp() {
        System.out.println("get ip");
        checkAccess();
    }

    @Override
    public void getDataTraffic() {
        System.out.println("get data traffic");
        checkAccess();
    }

    public void checkAccess(){
        System.out.println("has Access");
    }
}
