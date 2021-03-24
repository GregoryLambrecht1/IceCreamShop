package icecreamshop.application;

import icecreamshop.eatables.Cone;
import icecreamshop.eatables.Magnum;
import icecreamshop.sellers.IceCreamSalon;
import icecreamshop.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {


        PriceList priceList = new PriceList(1.5, 2);

        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        Magnum magnum = new Magnum(Magnum.MagnumType.ALIPINENUTS);
        magnum.eat();


        iceCreamSalon.orderIceRocket();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        iceCreamSalon.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);

        Cone.Flavor [] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.MOKKA};
        iceCreamSalon.orderCone(flavors);


        System.out.println(iceCreamSalon.getProfit());

    }
}