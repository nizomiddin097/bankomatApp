package model;

public interface CardService {
    void checkBalance(Card card);
    void withdraw(Card card, double summ);
    void changePassword(Card card);
    void transfer(Card sender , Card receiver);
    boolean checkPin(Card card);
    Card getCardById(String id);
}
