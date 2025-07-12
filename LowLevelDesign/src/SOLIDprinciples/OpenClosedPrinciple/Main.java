package SOLIDprinciples.OpenClosedPrinciple;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5.5);
        Shape rectangle  = new Rectangle(5,5);

        CalculateArea area = new CalculateArea();
        System.out.println(area.AreaCalculate(circle));
        System.out.println(area.AreaCalculate(rectangle));
    }


}
