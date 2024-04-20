package structural.proxy;

public class InternetAccess implements InternetAccessLib{
    @Override
    public void getTheAccessPoint() {
        System.out.println("get access point");
    }

    @Override
    public void getIp() {
        System.out.println("get ip");
    }

    @Override
    public void getDataTraffic() {
        System.out.println("get data traffic");
    }
}
