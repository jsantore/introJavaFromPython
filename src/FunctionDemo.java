import java.awt.Point;//java actually has a 2d point
import java.lang.Math;
public class FunctionDemo {
    public static void main(String[] args){
        var p1 = new Point(1,1);
        var p2 = new Point(4,5);
        var demo = new FunctionDemo();
        var distance = demo.calcDistance(p1,p2);
        System.out.println("The distance between the points is "+distance);
    }

    public double calcDistance(Point first, Point second){
        //ahh its your old friend Pythagoras
        var ydiff = first.y - second.y;
        var xdiff = first.x - second.x;
        var result = Math.sqrt(Math.pow(ydiff, 2)+Math.pow(xdiff,2));
        return result;
    }
}
