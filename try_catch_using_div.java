import java.util.*;
import java.io.*;

class try_catch_using_div{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("enter only num's");
        }
    }
}