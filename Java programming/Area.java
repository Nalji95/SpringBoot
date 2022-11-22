import java.util.Scanner;

public class Area {
    public static void main(String[] arg){
        System.out.println("Triangle area");
        Scanner sc = new Scanner(System.in);
        boolean response;
        System.out.println("is the triangle regular? ");
        System.out.println("please enter 1 for (yes) or 0 for (no)");
        int res = sc.nextInt();
        response  = res == 1;
        float base,height,length;
        double area;
        System.out.println("enter the base: ");
        base = sc.nextFloat();
        System.out.println("enter the height: ");
        height = sc.nextFloat();

        if(response){
            area = regularArea(base,height);
        } else {
            System.out.println("enter the length: ");
            length = sc.nextFloat();
            area = area(base,height,length);
        }
        System.out.println("the area of your triangle is: " + area );
    }

    public static float regularArea (float base,float height){
        return (base*height)/2;
    }
    public static double area (float base,float height, float length){
        float s = (base+height+length)/2;
        return Math.sqrt(s*(s-base)*(s-height)*(s-length));
    }
}
