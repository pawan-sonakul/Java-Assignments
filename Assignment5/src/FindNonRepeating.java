public class FindNonRepeating {
    public static void main(String[] args) {
        String s = "swiss";
        char ch = ';';

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < s.length(); j++) {
                if(i != j && s.charAt(i) != s.charAt(j)) {
                    ch = s.charAt(j);
                    break;
                }
            }
        }

        System.out.println("Character: " + ch);
    }
}



