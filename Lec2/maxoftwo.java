import java.util.*;

class maxoftwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        // int y = sc.nextInt();


        // if(x>y){
        //     System.out.println("x is greater");
        // }
        // else{
        //     System.out.println("y is greater");
        // }


        if(x>0){
            System.out.println("Positive no");
        }
        else if(x<0){
            System.out.println("Neg no");
        }
        else {
            System.out.println("xno is zero ");
        }
        
    }
}