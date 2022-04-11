package cn.cy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(i));
        }

//        for (Card card : cards){
//            System.out.print(card);
//            System.out.print(",");
//        }
        //洗牌
        Collections.shuffle(cards);
        List<Card> player1 = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            player1.add(cards.get(i));
        }
        for (Card card : player1){
            System.out.println(card + ", ");
        }
    }
}

class Card {
    private int face;
    private int id;

    public Card(int value){
        this.face = value / 13;
        this.id = value % 13;
    }

    @Override
    public String toString() {
        String[] faces = new String[] {"heitao","hongtao","meihua","fangkuai"};
        String[] ids = "A,2,3,4,5,6,7,8,9,10,J,Q,K".split(",");
        return faces[this.face] + ids[this.id];
    }
}
