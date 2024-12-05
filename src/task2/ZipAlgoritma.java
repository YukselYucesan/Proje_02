package task2;

public class ZipAlgoritma {
    public static void main(String[] args) {
        String input ="aaaabbbcccccdd";
        String input2="abbbbbbbccc";
        String input3="aaaaaaaaaa";
        String input4="aabbbccccccddd";
        compressText(input);
        compressText(input2);
        compressText(input3);
        compressText(input4);
    }
    public static void compressText(String input) {
        char a = input.toLowerCase().charAt(0);
        while (!input.isEmpty()) {
            int uzunluk1 = input.length();
            input = input.replaceAll(String.valueOf(input.charAt(0)), "");
            int uzunluk2 = input.length();
            if (a!=' '){System.out.print((uzunluk1 - uzunluk2) + "" + a);}
            if (!input.isEmpty()) {a = input.toLowerCase().charAt(0);}
        }
        System.out.println();

    }
}
