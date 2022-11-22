import java.util.Scanner;

import static java.lang.Double.NaN;

public class QuadraticEquation {

    record MyResult(double first, double second) {
    }

    public static void main(String[] arg){
        System.out.println("please enter 1 for (yes) or 0 for (no)");
        System.out.println("is your equation in the form ax^2 + bx + c = 0? " );
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        if(res == 1){
            MyResult response = roots();
            System.out.println("rOne is: "+response.first() +" rTwo is: " + response.second());

        } else {
            System.out.println("sorry i can't help you");
        }
    }

    public static MyResult roots(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a, b and c" );
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        double delta = Math.sqrt((b*b)-(4*a*c));
        if (delta<0){
            return new MyResult(NaN,NaN);
        }
        double rOne = (-b + delta)/2*a;
        double rTwo = (-b - delta)/2*a;
        return new MyResult(rOne,rTwo);
    }
}
