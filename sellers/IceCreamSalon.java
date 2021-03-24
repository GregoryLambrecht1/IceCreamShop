package icecreamshop.sellers;

import icecreamshop.eatables.Cone;
import icecreamshop.eatables.IceRocket;
import icecreamshop.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    public double getProfit() {
        return totalProfit;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        totalProfit = totalProfit + (flavors.length -1 * priceList.getBallPrice());
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType types) {
        totalProfit = totalProfit + types.getPrice();
        return new Magnum(types);
    }
}
