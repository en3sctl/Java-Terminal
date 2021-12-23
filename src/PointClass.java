package UdemyPoint;

public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return this.distance(0,0);
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((double)(this.x - x), 2.0D)
                + Math.pow((double)(this.y - y), 2.0D));
    }
    public double distance(Point point){

        return this.distance(point.x, point.y);
    }
}
