public class CountVowelsConsonants {
    public static void countVowels(String s) {
        int countVowel = 0;
        int countConsonant = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                countVowel++;
            } else {
                countConsonant++;
            }
        }

        System.out.println("Vowels: " + countVowel);
        System.out.println("Consonant: " + countConsonant);

    }

    public static void main(String[] args) {
        countVowels("Java is Awesome");
    }
}
