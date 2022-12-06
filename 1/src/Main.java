import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(solve(N));
    }
    public static String solve(int N){
        String[] month = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(N > 0 && N<month.length) return month[N];
        return "Month not found";
    }
}