package icecreamshop.sellers;


import icecreamshop.eatables.Magnum.MagnumType;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {

    }

    public PriceList(double ballPrice, double rocketPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
    }

    public double getBallPrice() {

        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {

        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {

        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(MagnumType type) {
        return (type == null) ? magnumStandardPrice : type.getPrice();
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
