import java.util.*;

class primeno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int prime = 1;

        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=0;
                break ;
            }
        }

        if(prime==1){
            System.out.println("Prime no");
        }
        else{
            System.out.println("Not a Prime no");
        }
    }
}