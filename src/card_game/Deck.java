package card_game;

public class Deck {
    final int CARD_NUM =52; //카드의 개수
    Card[] cardArr = new Card[CARD_NUM]; //Card 객체 배열 포함
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
    public static class Card{
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
}

