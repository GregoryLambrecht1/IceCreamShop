package icecreamshop.sellers;

import icecreamshop.eatables.Cone;
import icecreamshop.eatables.IceRocket;
import icecreamshop.eatables.Magnum;

public interface IceCreamSeller extends Profitable{
     Cone orderCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException, NullException;

     IceRocket orderIceRocket() throws NoMoreIceCreamException;

     Magnum orderMagnum(Magnum.MagnumType types ) throws NoMoreIceCreamException, NullException;



}
