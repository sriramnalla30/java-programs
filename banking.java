import java.util.Scanner;
public class banking {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the balance ");
        double bal=input.nextDouble();
        System.out.print("Enter the amount of money you want to withdraw: ");
        double withdraw=input.nextDouble();
        if(bal<=withdraw){
            System.out.printf("\nYou have insufficient funds");
        }
        else{
            bal-=withdraw;
            System.out.printf("%s", "Your current balance is "+bal+"\n");
            }
            

        }

  
    
}


