package pr4.interfaces.model;

public class iPhone implements SellableAndPluggable{
    private String iPhoneModel;

    public iPhone(String iPhoneModel){
        this.iPhoneModel = iPhoneModel;
    }

    public String getiPhoneModel() {
        return iPhoneModel;
    }

    @Override
    public void sell() {
        System.out.println("Selling " + getiPhoneModel() + "...");
    }

    @Override
    public void plug() {
        System.out.println("Plugging in " + getiPhoneModel() + "...");
    }
}
