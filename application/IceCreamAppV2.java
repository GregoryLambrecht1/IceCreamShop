package icecreamshop.application;

import icecreamshop.eatables.Magnum;
import icecreamshop.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {
        try{
            PriceList priceList = new PriceList(1.5,2);
            Stock stock = new Stock(5,5,20,1);

            IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);

            iceCreamCar.orderMagnum(Magnum.MagnumType.ALIPINENUTS);
            iceCreamCar.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);
            iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);


        } catch (NoMoreIceCreamException | NullException n){
            System.out.println(n.getMessage());
            n.printStackTrace();
        }
    }
}
