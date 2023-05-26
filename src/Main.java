/*import java.util.Scanner;

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
}*/
//백준 : 두수비교하기문제, 꼬마 정민문제 :총 2개 문제 풀기


/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long sum = a + b + c;
        System.out.println(sum);
        scanner.close();
    }
}
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if(a==b){
            System.out.println("==");
        }
    }
}*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
        scanner.close();
    }
}