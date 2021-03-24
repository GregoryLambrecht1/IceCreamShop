package icecreamshop.eatables;

public class Magnum implements Eatable {
    public enum MagnumType{
        //making enum
        MILKCHOCOLATE(1.00),
        WHITECHOCOLATE(1.00),
        BLACKCHOCOLATE(1.00),
        ALIPINENUTS(1.50),
        ROMANTICSTRAWBERRY(2.00);

        private final double price;

        MagnumType(double price){
            this.price = price;
        }
        public double getPrice(){
            return price;
        }
    }
    private MagnumType type;

    public Magnum() {

    }

    public Magnum(MagnumType type) {
        this.type = type;
    }
    @Override
    public void eat() {
        System.out.println("im eating " + getType() + " , mhhhhh");
    }

    public MagnumType getType() {
        return type;
    }
}
