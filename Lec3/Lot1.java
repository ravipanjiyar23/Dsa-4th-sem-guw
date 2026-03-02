import java.util.*;

class Lot1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n =sc.nextInt();

        if(n>=300 && n<=460){
            System.out.println("MAcbook won");
        }
        else if(n>=200 && n<=280){
            System.out.println("Kurkure won");
        }
        else if(n>1100 && n<1500){
            System.out.println("Cycle won");
        }
        else if(n>50 && n<=80){
            System.out.println("Bike won");
        }
        else{
            System.out.println("Better Luck Next time ");
        }


        
    }
}