import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompareX compX = new CompareX();
        CompareY compY = new CompareY();

        List<Point> osX = new ArrayList<>();
        List<Point> osY = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int X;
        int Y;

        for (int i = 0; i < n; i++) {
            X = scan.nextInt();
            Y = scan.nextInt();
            if (X != 0 && Y != 0) {
                continue;
            } else if (X == 0) {
                osY.add(new Point(X, Y));
            } else if (Y == 0) {
                osX.add(new Point(X, Y));
            } else System.out.println("Ошибка при вводе данных");
        }
        if (osX.size() != 0 && osY.size() != 0) {
            Triangle tr1 = new Triangle(Collections.max(osX, compX).getX(), Collections.max(osY, compY).getY());
            System.out.println(tr1.calc());
        } else System.out.println("Треугольник не существует");
    }
}