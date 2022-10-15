package expbase;

public class Wallet {
    float money;

    Wallet(){
        this.money = 2000;
    }
    Wallet (float amount) {
        this.money = amount;
    }
    public void addMoney (float amount) {
        this.money += amount;
    }
    public void removeMoney (float amount) {
        this.money -= amount;
    }
    public void printMoney () {
        System.out.println("Ilość gotówki to: " + money);
    }
}
