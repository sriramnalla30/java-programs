import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class check_regno{
    public static void main(String args[])
{
    Pattern pattern =Pattern.compile( "^(\\d{2}[A-Z]{3}\\d{4})$");
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the Registration number : ");
    String regnum=sc.nextLine();
    Matcher matcher=pattern.matcher(regnum);
    if(matcher.matches()){
        System.out.print("VALID registration no.");
    }
    else{
     System.out.println("Invalid registration no.");
    }
}
}