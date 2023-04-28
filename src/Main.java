import java.util.Scanner;
class FlowEx6{
    public static void main(String[] args){
        System.out.print("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 3: case 4: case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;

            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;

            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;

            default:
            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
                break;
        }
    }
}
class DeckTest {
    public static void main(String args[]) {
        Deck d = new Deck();
        Card c = d.pick();
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}
class Deck{
        final int CARD_NUM =52; //카드의 개수
        Card cardArr[]= new Card[CARD_NUM]; //Card 객체 배열 포함
        Deck () {
            int i =0;
            for(int k=Card.KIND_MAX; k>0; k--)
                for(int n=0; n< Card.NUM_MAX; n++)
                    cardArr[i++]= new Card(k,n+1);
        }
        Card pick(int index){
            return cardArr[index];
        }
        Card pick(){
            int index = (int)(Math.random() * CARD_NUM);
            return pick(index);
        }
        void shuffle(){
            for(int i=0; i < cardArr.length; i++){
                int r = (int)(Math.random() * CARD_NUM);
                Card temp = cardArr[i];
                cardArr[i] = cardArr[r];
                cardArr[r] = temp;
            }
        }
    }
    class Card{
    static final int KIND_MAX =4;
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card(){
        this(SPADE,1);
    }
    Card(int kind, int number){
            this.kind = kind;
            this.number = number;
        }

        @Override
        public String toString() {
            String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
            String numbers = "0123456789XJQK";
            return "Kind : "+ kinds[this.kind]
                    + ", number : " + numbers.charAt(this.number);
    }
    }

