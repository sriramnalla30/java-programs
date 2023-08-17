import java.util.Scanner;

public class vowel_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        int f;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {  
            char[] arr2 = new char[arr[i].length()];
            f = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a' || arr[i].charAt(j) == 'e' || arr[i].charAt(j) == 'i' || arr[i].charAt(j) == 'o' || arr[i].charAt(j) == 'u') {
                    f++;
                }
            }
            if (f == 3) {
                System.out.println("happy");
                break;
            } else {
                System.out.println("sad");
            }
        }
        sc.close();
    }
}
