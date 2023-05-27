package Overloading;

public class Main {
    public static void main(String[] args) {
        Meth meth = new Meth();
        int num1 = meth.num(1,2);
        int num2 = meth.num(1,2,3);
        String num3 = meth.num("a","b","c");

        Baboo baboo = new Baboo();//"ba""boo"//기본 생성자 baboo 호출
        Baboo baboo1 = new Baboo("a");//"a""boo"
        String ddo = baboo.ddo();//"baboo"
        String ddo1 = baboo1.ddo();//"aboo"

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(ddo);
        System.out.println(ddo1);
    }
}
