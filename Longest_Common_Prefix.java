public class Longest_Common_Prefix {
    public static void main(String args[]) {
        String s[] = {"flower", "flour", "flight"};
        int count = 0, k;
        String str = "";
        int n = s.length;
        
        for (int i = 0; i < n; i++) {
            String temp = s[0];
            if (i < n - 1 && s[i].compareTo(s[i + 1]) > 0) {
                temp = s[i + 1];
                s[i + 1] = s[i];
                s[i] = temp;
            }
        }
        
        int min = s[0].length();
        
        for (int i = 0; i < min; i++) {
            int f = 0;
            for (int j = 0; j < n - 1; j++) { 
                if (s[j].charAt(i) == s[j + 1].charAt(i)) {
                    f++;
                }
            }
            if (f == n - 1) {
                count++;
            } else {
                break;  
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.print(s[0].charAt(i));
        }
    }
}


