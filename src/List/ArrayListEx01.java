package List;

import java.util.ArrayList;

public class ArrayListEx01 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        //ArrayList 생성
        list.add("사과");
        list.add("포도");
        list.add("딸기");
        list.add("복숭아");
        list.add("배");

        System.out.println(list.get(0));
        //List 0 출력

        list.set(1,"수박");
        System.out.println(list);
        //list 수정
        list.remove(2);
        System.out.println(list);
        //list 삭제

        System.out.println(list.size());
        //list 길이

        for (String fruit : list){
            System.out.println(fruit);
        }
        //list에 속하는 과일만 출력
    }
}
