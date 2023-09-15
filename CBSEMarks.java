
import java.util.Scanner;

class CBSEMarks {
    public static void main(String[] args) {
        float a, b, c, d, e, f, g, h, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English Marks");
        a = sc.nextFloat();
        System.out.println("Enter Kannada Marks");
        b = sc.nextFloat();
        System.out.println("Enter Sanscrit Marks");
        c = sc.nextFloat();
        System.out.println("Enter Social Marks");
        d = sc.nextFloat();
        System.out.println("Enter Science Marks");
        e = sc.nextFloat();
        System.out.println("Enter Maths Marks");
        f = sc.nextFloat();
        if (a <= 100) {
            g = a + b + c + d + e + f;
            h = g * 100;
            i = h / 600;
            System.out.println(i);
        } else if (a > 100) {
            System.out.println("Marks English Entered above 100");
        } else if (b <= 100) {
            g = a + b + c + d + e + f;
            h = g * 100;
            i = h / 600;
            System.out.println(i);
        } else if (b > 100) {
            System.out.println("Marks Kannada Entered above 100");
        } else if (c <= 100) {
            g = a + b + c + d + e + f;
            h = g * 100;
            i = h / 600;
            System.out.println(i);
        } else if (c > 100) {
            System.out.println("Marks Sanscrit Entered above 100");
        } else if (d <= 100) {
            g = a + b + c + d + e + f;
            h = g * 100;
            i = h / 600;
            System.out.println(i);
        } else if (d > 100) {
            System.out.println("Marks Social Entered above 100");
        } else if (e <= 100) {
            g = a + b + c + d + e + f;
            h = g * 100;
            i = h / 600;
            System.out.println(i);

        } else if (e > 100) {
            System.out.println("Marks Science Entered above 100");
        } else if (f <= 100) {
            g = a + b + c + d + e + f;
            h = g * 100;
            i = h / 600;
            System.out.println(i);

        } else if (f > 100) {
            System.out.println("Marks Maths Entered above 100");
        }
    }
}