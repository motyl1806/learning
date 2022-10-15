package expbase;

public class Main {

    public static void main(String[] args) {

	/*Student student = new Student();
    student.printStatusInfo();
    Student student1 = new Student("Marcin","Motyl","Reda",29);
    student1.printStatusInfo();*/

        /*Wallet newWallet = new Wallet(3000);
        for (int i = 0; i < 6; i++){
            newWallet.addMoney(5000);
            newWallet.removeMoney(2000);
            newWallet.removeMoney(1000);
            newWallet.printMoney();
        }
        System.out.println("Koncowy rezultat");
        newWallet.printMoney();*/

    Car car = new Car("Fiat","Seicento","white");
        System.out.println("Color is: " + car.getColor());

        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();
    }
}
