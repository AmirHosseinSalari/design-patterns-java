package structural.proxy;

public class InternetManager {
    private InternetAccessLib api;

    public InternetManager(InternetAccessLib api) {
        this.api = api;
    }

    public String giveInternetAccessToUser(){
        api.getTheAccessPoint();
        api.getIp();
        api.getDataTraffic();
        return "Connection established";
    }
}
