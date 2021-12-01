package model;

public class Card {
    private String id;
    private String owner;
    private double balance;
    private String pin;
    private boolean state;
    private String system;


    public Card() {
    }

    public Card(String id, String owner, double balance,
                String pin, boolean state, String system) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.state = state;
        this.system = system;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

}
