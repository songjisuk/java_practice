import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //입력받은 num1값
        int i = Integer.parseInt(scanner.nextLine());
        //385
        String num2 = scanner.nextLine();

        //385의 첫째자리수
        int i1 = Integer.parseInt(String.valueOf(num2.charAt(0)));
        //385의 둘째자릿수
        int i2 = Integer.parseInt(String.valueOf(num2.charAt(1)));
        //385의 셋째자릿수
        int i3 = Integer.parseInt(String.valueOf(num2.charAt(2)));

        System.out.println(i*i3);
        System.out.println(i*i2);
        System.out.println(i*i1);
        System.out.println(i*(Integer.parseInt(num2)));
    }
}
//백준 : 두수비교하기문제, 꼬마 정민문제 :총 2개 문제 풀기
