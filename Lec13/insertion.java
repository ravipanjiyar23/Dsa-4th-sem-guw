import java.util.*;


class insertion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
        
    }

    static void sort(int[] arr, int n){

        for(int i =1;i<arr.length;i++){
            int j=i-1;
            int item = arr[i];

            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                arr[j] = item;
                j--;
            }
        
        }
    }
}
