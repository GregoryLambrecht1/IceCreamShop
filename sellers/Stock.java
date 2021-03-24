package icecreamshop.sellers;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    public int getIceRockets() throws NoMoreIceCreamException {
        if (iceRockets < 0) throw new NoMoreIceCreamException("no more ice rockets");
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() throws NoMoreIceCreamException {
        if (cones < 0) throw new NoMoreIceCreamException("no more cones");
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() throws NoMoreIceCreamException {
        if (balls < 0) throw new NoMoreIceCreamException("no more flavours");
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() throws NoMoreIceCreamException {
        if (magni < 0) throw new NoMoreIceCreamException("no more magnums");
        return magni;
    }
    public void setMagni(int magni) {
        this.magni = magni;
    }
}
