package com.github.sejoung.codetest.general;

import java.util.*;

public class Card {
    private final Suit suit;
    private final Rank rank;

    // 버그를 찾아보자.
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    Card(Suit suit, Rank rank ) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return this.suit.toString()+" : "+this.rank.toString();
    }

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

/*        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                deck.add(new Card(i.next(), j.next()));
            }
        }*/

/*

        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            Suit suit = i.next();
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                deck.add(new Card(suit, j.next()));
            }
        }
*/


        // 코드 58-7 컬렉션이나 배열의 중첩 반복을 위한 권장 관용구 (349쪽)
        for (Suit suit : suits)
            for (Rank rank : ranks)
                deck.add(new Card(suit, rank));


        deck.forEach(System.out::println);

    }
}