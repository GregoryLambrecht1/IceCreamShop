package icecreamshop.eatables;


public class Cone implements Eatable {

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE
    }

    private Flavor[] balls  = new Flavor[8];

    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        //printing all the balls in the array , but making sure when its printing its not printing nulls if the array is not full
        System.out.println("my cone got : ");
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] != null) {
                System.out.print(balls[i] + " , ");
            }
        }
    }
}