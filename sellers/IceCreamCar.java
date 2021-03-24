package icecreamshop.sellers;

import icecreamshop.eatables.Cone;
import icecreamshop.eatables.IceRocket;
import icecreamshop.eatables.Magnum;
public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public Stock getStock() {
        return stock;
    }
// 1: 0 2: 1
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException,NullException {
        if (flavors == null) throw new NullException("flavors is null");
        if (stock.getCones() <= 0) throw new NoMoreIceCreamException("cones are out of stock");

        this.profit += (flavors.length > 0) ? (this.priceList.getBallPrice() * flavors.length) : (this.priceList.getBallPrice());

        return this.prepareCone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {

        stock.setCones(stock.getCones() - 1);

        for (int i = 0; i < flavors.length + 1; i++) {
            if (flavors[i] != null) {
                stock.setBalls(stock.getBalls() - 1);
            }
        }
        return new Cone(flavors);
    }


    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException{
        profit += priceList.getRocketPrice();
        ;
        return this.prepareRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType types) throws NoMoreIceCreamException,NullException {
        if (stock.getMagni() <= 0) throw new NoMoreIceCreamException("magnums are out of stock");
        if (types == null) throw new NullException("magnumtype is null");
        this.profit += types.getPrice();

        return this.prepareMagnum(types);
    }

    @Override
    public double getProfit() {
        return profit;
    }

    private Magnum prepareMagnum(Magnum.MagnumType types) throws NoMoreIceCreamException {
        stock.setMagni(stock.getMagni() -1);
        return new Magnum();
    }


    private IceRocket prepareRocket() throws NoMoreIceCreamException {
        stock.setIceRockets(stock.getIceRockets()-1);
        return new IceRocket();
    }
}
