import java.util.Scanner;

public class rightshift {
    public static void leftshift(int arr[]){
        int i = arr.length-1;
        int j =i-1;
        while (i>0) {
            int a = arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            i--;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        leftshift(arr);
    }
}