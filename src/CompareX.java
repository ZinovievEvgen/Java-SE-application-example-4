import java.util.Comparator;

public class CompareX implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        if(Math.abs(o1.getX())> Math.abs(o2.getX()))
            return 1;
        else if(Math.abs(o1.getX()) < Math.abs(o2.getX()))
            return -1;
        else
            return 0;
    }
}
