package Overloading;

public class Baboo {
    //생성자 3개만듬, 속성은 string값 2개, 1개는 기본생성자, 1개는 매개변수 1개, 1개는 매개변수 2개
    //기본생성자는 매개변수2개인것 호출하여 문자열 a와 문자열 b를 속성에다가 저장.
    //1- 매개변수 2개인것을 호출하여 메인문에서 입력받은 문자열과 문자열 b를 저장하는 생성자를 만들어서
    //속성 2개를 합친 값을 return문에서 반환하여 main문에서 출력.

    private String a;
    private String b;
    public Baboo(){
        this("ba","boo");
    }
    public  Baboo(String a){
        this(a,"bb");
    }
    public  Baboo(String a, String b){
        this.a = a;
        this.b = b;
    }
    public String ddo(){
        String c = this.a + this.b;
        return c;
        //= return this.a + this.b;
    }
}
