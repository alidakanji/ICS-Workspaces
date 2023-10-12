package DaySix;

import java.util.Scanner;

public class PoolProblem {
    public static void main(String [] args){
        System.out.println("What is the length of the pool?");
        Scanner l = new Scanner(System.in);
        int length = l.nextInt();
        System.out.println("What is the width of the pool?");
        Scanner w = new Scanner(System.in);
        int width = w.nextInt();
        System.out.println("What is the depth of the shallow end of the pool?");
        Scanner input = new Scanner(System.in);
        int shallowHeight = input.nextInt();
        System.out.println("What is the depth of the deep end of the pool?");
        Scanner x = new Scanner(System.in);
        int deepHeight = x.nextInt();
        System.out.println("What is the length of the transition between the shallow and deep ends of the pool?");
        Scanner y = new Scanner(System.in);
        int transition = y.nextInt();
        System.out.println("What is the length of the shallow end of the pool?");
        Scanner z = new Scanner(System.in);
        int shallowLength = z.nextInt();
        System.out.println("What is the price per m^2 of the tile?"); 
        Scanner a = new Scanner(System.in);
        int linerCost = a.nextInt();

        double fullVolume = deepHeight*length*width;
        double rectangleVolume=(deepHeight-shallowHeight)*shallowLength*width;
        double triangleSide=Math.sqrt((transition*transition)-((deepHeight-shallowHeight)*(deepHeight-shallowHeight)));
        double triangleVolume= (triangleSide*width*(deepHeight-shallowHeight))/2;
        double volume=(fullVolume-(rectangleVolume+triangleVolume))*0.9;
        System.out.println("The amount of water needed to keep your pool at 90% capacity is "+volume);

        double bottomLiner= (shallowHeight*width)+(shallowLength*width)+(transition*width)+(deepHeight*width)+((length-(triangleSide+shallowLength))*width);
        double sideLiner= 2*((length*width)-(((deepHeight-shallowHeight)*shallowLength)+(((deepHeight-shallowHeight)*triangleSide)/2)));
        double totalLiner= bottomLiner+sideLiner;
        System.out.print("The total amount of liner needed is "+totalLiner);
        System.out.println(" m^2");
        double totalLinerCost=linerCost*totalLiner;
        System.out.print("The cost of the liner will be $"+totalLinerCost);
    }
}
