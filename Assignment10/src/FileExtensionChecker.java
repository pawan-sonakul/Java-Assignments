public class FileExtensionChecker {
    public static void checker(String fileName) {
        String ext = null;

        for (int i = 0; i < fileName.length(); i++) {
            if (fileName.charAt(i) == '.') {
                ext = (fileName.substring(i + 1));
                break;
            }
        }

        if (!("txt".equals(ext))) {
            throw new IllegalArgumentException(" File must have .txt extension");
        }
    }

    public static void main(String[] args) {
        checker("abc.txt");
    }
}
