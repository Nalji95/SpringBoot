import java.util.Scanner;

public class CubeVolume {
    record MyResult(double area, double volume) {
    }

    public static void main(String[] arg){
        CubeVolume.MyResult response = calculation();
        System.out.println("area is: "+response.area() +" volume is: " + response.volume());
    }

    public static MyResult calculation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("is your height, breadth and length: " );
        double height,breadth,length;
        height = sc.nextDouble();
        breadth = sc.nextDouble();
        length = sc.nextDouble();
        double area = 2*(height*length + breadth*height +breadth*length);
        double volume = height*breadth*length;
        return new CubeVolume.MyResult(area,volume);
    }
}
