import java.util.Scanner;

public class PutSubString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите текст:"); //Пример: Один! Два, три??? Четыре! Пять!!! Шесть... Семь, восемь!
        String text = read.nextLine();
        System.out.print("Введите подстроку: ");
        String sub = read.nextLine();
        System.out.print("Введите символ: ");
        int k = read.nextInt();
        System.out.printf("Результат:%s%s", System.lineSeparator(),putSub(text, sub, k));
    }

    public static String putSub(String text, String sub, int k) {
        StringBuilder sb = new StringBuilder();
        if (text != null && sub != null && k > 0) {
            int count = 1;
            for (int i = 0; i < text.length(); i++) {
                sb.append(text.charAt(i));
                if (count == k) {
                    sb.append(sub);
                }
                if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                    count = 0;
                }
                count++;
            }
        }
        return sb.toString();
    }
}