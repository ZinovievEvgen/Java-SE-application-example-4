import java.util.Comparator;

public class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        if(Math.abs(o1.getY())> Math.abs(o2.getY()))
            return 1;
        else if(Math.abs(o1.getY()) < Math.abs(o2.getY()))
            return -1;
        else
            return 0;
    }
}
