import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.next();
        String word4 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        long lo = Integer.MAX_VALUE; // (1)
        int i = (int)lo; // (2)
        char ch =(char) i; // (3)
        double d = ch; // (4)
        float f =(float) d;

    }
}