import java.util.Scanner;

import java.util.*;

public class takinginout {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello user please enter your name: ");
        String name=sc.nextLine();
        System.out.println("enter your lucky number");
        int lucky=sc.nextInt();
        System.out.println("Hello: "+name +", Your lucky number " +lucky +"
            shows you are really smart.Continue learning"
        );
    }
}
