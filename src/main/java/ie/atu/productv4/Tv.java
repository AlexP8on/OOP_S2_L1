package ie.atu.productv4;
public class Tv extends Product {

    private String screenSize;
    private String Manufactrure;

    public Tv() {
        super();
        screenSize = "";
        Manufactrure = "";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getManufactrure() {
        return Manufactrure;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setManufactrure(String manufactrure) {
        Manufactrure = manufactrure;
    }

    @Override
    public String toString() {
        return super.toString() + " inch: " + screenSize + "\n Manufactured by: " + Manufactrure;
    }
}