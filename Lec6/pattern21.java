import java.util.*;


class pattern21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =1;
        int space =n-1;

       

        while(row<=n){

            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int i=1;
            int cnt=1;
            while(i<=star){
                System.out.print(cnt+" ");
                cnt++;
                i++;
            }

            space--;
            star+=2;
            System.out.println();
            row++;
            
        }

    }
}
