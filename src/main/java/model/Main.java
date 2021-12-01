package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardServiceImpl cardService = new CardServiceImpl();
        Card currentCard = null;
        while (true) {
            System.out.println("Card ni id raqamini kiriting: ");
            String cardId = scanner.nextLine();
            for (Card card : cardService.getCards()) {

                if (card.getId().equals(cardId)) {
                    currentCard = card;
                }
            }
            if (currentCard != null) {
                if (cardService.checkPin(currentCard)){
                    if (currentCard.isState()){
                        System.out.println("0=>Cardni chiqarish,"+
                                "\n 1=> balance ni tekshirish, " +
                                "\n 2=> naqd pul olish, " +
                                 "\n 3=> Transfer");
                        scanner = new Scanner(System.in);
                        switch (scanner.nextInt())
                        {
                            case 0:
                                return;
                            case 1:
                                cardService.checkBalance(currentCard);
                                break;
                            case 2:
                                cardService.withdraw(currentCard,scanner.nextDouble());
                                break;
                            case 3:
                                scanner = new Scanner(System.in);
                                System.out.println("qabul qiluvchining card raqamini kiriting ");
                                Card receiver = cardService.getCardById(scanner.nextLine());
                                if (receiver!=null) {
                                    cardService.transfer(currentCard, receiver);
                                    if (!currentCard.getId().equals(receiver.getId())){
                                        cardService.transfer(currentCard,receiver);
                                    }else {
                                        System.out.println("junatuvchi bilan qabul qiluvchilarining card " +
                                                "raqamlari bir xil bulmasligi kerak ");
                                    }
                                }
                                else {
                                    System.out.println(" ");
                                }
                                break;
                        }
                    }
                }
            }
            else
                {
                System.out.println(" bunday card mavjut emas");
            }
        }
    }
}
