import java.util.Scanner;
public class str_sorting_array {
    static void sorting_array(String arr[],int n){
     for(int i=0;i<n-1;i++){
        String temp;
        for (int j=0;j<n-i-1;j++){
         if(arr[i].compareTo(arr[i+1])>0)
         {
           temp=arr[i+1];
           arr[i+1]=arr[i];
           arr[i]=temp;
         }
        }
 }
      for(int i=0;i<n;i++){
       System.out.println(arr[i]); 
      }
     
    }
    public static void main(String args[]){
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        } 
        sorting_array(arr,n);
    }
    
}
