package model;

import java.util.Scanner;

public class CardServiceImpl implements CardService{

    private Card[] cards;
    public CardServiceImpl() {
        cards = new Card[4];
        cards[0] = new Card("1", "A", 1000000, "111", true, "UzCard");
        cards[1] = new Card("2", "B", 2000000, "222", true, "Humo");
        cards[2] = new Card("3", "C", 3000000, "333", true, "Visa");
        cards[3] = new Card("4", "D", 4000000, "444", true, "UnionPay");
        cards[4] = new Card("5", "E", 5000000, "554", true, "UzCard");

    }



    @Override
    public void checkBalance(Card card) {

    }

    @Override
    public void withdraw(Card card, double summ) {

    }

    @Override
    public void changePassword(Card card) {

    }

    @Override
    public void transfer(Card sender, Card receiver) {

    }

    @Override
    public boolean checkPin(Card card) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        while (attempt < 3) {
            System.out.println("pincod kiritin");
            if (card.getPin().equals(scanner.nextLine())) {
                return true;
            } else {
                System.out.println("pin kod notug'ri");
                if (attempt==1){
                    System.out.println("oxirgi urinishingiz qoldi."+
                            "\n Pin notug'ri kiritilsa Card bloklanadi ");
                }
                attempt++;
            }
        }
        card.setState(false);
        return false;

    }

    @Override
    public Card getCardById(String id) {
        for (Card card : cards) {
            if(card.getId().equals(id));
            {
                return card;
            }
        }
        return null;
    }


    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}

