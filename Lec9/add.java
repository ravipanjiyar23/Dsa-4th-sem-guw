import java.util.*;

class add{


    // public static int add(int a,int b){
    //     int c= a+b;
    // return c;
    //     // System.out.print(c);
    // }

    // public static void add(int a,int b){
    //     int c = a+b;

    //     System.out.print(c);
    // }

    public static int add(int a,int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt(); 

        int b = sc.nextInt();


        int x =add(a,b);

        System.out.print(x);

    }
}