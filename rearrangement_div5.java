import java.util.Scanner;

public class rearrangement_div5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String n=sc.nextLine();
        char arr[]=new char[2];
        for(int i=0 ;i<n.length() ;++i){
            arr[i]=n.charAt(i);
    }
    if(5==arr[n.length()]-1){
      System.out.println("yes");
    for(int i=n.length()-1;i>0;i--){
        System.out.println(arr[i]);
    }
    }else  System.out.println("no");
    }
}
