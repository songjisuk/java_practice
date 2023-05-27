package Overloading;

public class Meth {
    //int형 2개,3개,4개 받는 method를 만든 후 ->
    // 각각 매개변수를 다 더한 값을 retrun값을 반환 -> main문에서 println으로 출력
    public int num(int a,int b){
        return a+b;
    }
    public int num(int a,int b,int c){
        return a+b+c;
    }
    public String num(String... str){
        String result = "";
        for(String s : str){
            result += s;

        }
        return result;
    }
}
