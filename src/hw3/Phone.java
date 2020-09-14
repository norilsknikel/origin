package hw3;

public class Phone {

    public String number;
    public String model;
    public String weight;

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " номер " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, String weight) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;

    }

    public Phone() {

    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Отправка сообщения на номер: " + number);
        }
    }
}
