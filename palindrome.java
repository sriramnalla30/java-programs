import java.util.Scanner;   
public class palindrome{

    static boolean ispalin(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right)
{
    if(str.charAt(left)!=str.charAt(right)){
          return false; 
    }
    left++;
    right--;
}   return true;
 }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to check its palindrome");
        String str=sc.nextLine();
        if(ispalin(str)){
            System.out.print("\n"+"palindromic");

        }
        else{
            System.out.print("\n"+"not palindromic");
        }
    }

}