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

        // TODO:   private Flavor[] balls  = new Flavor[1];

    
    private Flavor[] balls  = new Flavor[8];

    public Cone() {

    }
   

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
    
    public addFlavor(Flavor ball){
        // TODO: add flavor to the array.. 
    }
    
    public removeFlavor(Flavor ball){
        // TODO: remove flavor to the array.. 
    }

    @Override
    public void eat() {
        //printing all the balls in the array , but making sure when its printing its not printing nulls if the array is not full
        System.out.println("my cone got : ");
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] != null) {
                System.out.print(balls[i] + " , ");
                // MessageFormatter.format();
            }
        }
        
        // TODO: String.join();
    }
}
