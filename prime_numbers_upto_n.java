import java.util.Scanner;

public class prime_numbers_upto_n {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=3;i<n;i++){
            int f=0;
            for(int j=2;j<i;j++){
              if(i%j==0){
                f++;
              }

            }
            if(f==0){
                System.out.println(i+"is prime");
            }
        }
}



}






// public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = 3; i < n; i++) {
//             int f = 0; 
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     f++;
                    
//                 }
//             }
//              if (f == 0) {
//                 System.out.println(i + " is a prime");
//             }
//         }
//     }