import java.util.Scanner;

public class least_num_in_array {
    
    static void smaller(int arr[],int n){
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest number in the array is "+smallest);
    }
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array lenght");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       smaller(arr,n);
    }
    
}
