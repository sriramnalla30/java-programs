import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegEx{
     public static void main(String args[]){
     Pattern pattern=Pattern.compile("@gmail.com",Pattern.CASE_INSENSITIVE);
     Matcher matcher =pattern.matcher("sriramnalla30@gmail.com");
     Boolean result=matcher.find();
     if(result){
        System.out.println("valid email address");
     }
     else{
        System.out.println("invalid email address");
     }
     
        }
        }