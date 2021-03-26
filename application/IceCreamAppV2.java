package icecreamshop.application;

import icecreamshop.eatables.Magnum;
import icecreamshop.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {
        try{
            PriceList priceList = new PriceList(1.5,2);
            Stock stock = new Stock(5,5,20,1);

            IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);

            Eatable order01 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALIPINENUTS);
            Eatable order02 = iceCreamCar.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);
            Eatable order03 = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
            
            Eatable[] orders = new Eatable[]{
                   order01, order02, order03
            };
            
            // TODO: eat() for each orders..


        } catch (NoMoreIceCreamException | NullException n){
            // TODO: choose one of these approaches..
            System.out.println(n.getMessage());
            n.printStackTrace();
        }
    }
}
