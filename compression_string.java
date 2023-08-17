public class compression_string {
    public static void main(String args[]) {
        String s = "abcccccdddaaa";
        int count = 1;
        String compressed = "";
         System.out.println(s.length()); 
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed += s.charAt(i) + String.valueOf(count);  
                count = 1;  
            }
        }

        compressed += s.charAt(s.length() - 1) + String.valueOf(count);

        System.out.println(compressed);
    }
}
