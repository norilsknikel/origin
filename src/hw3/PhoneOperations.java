package hw3;

public class PhoneOperations {

    public static void main(String[] args) {

        Phone first = new Phone();
        Phone second = new Phone();
        Phone third = new Phone();

        System.out.println(first.number + "" + first.model + "" + first.weight);
        System.out.println(second.number + "" + second.model + "" + second.weight);
        System.out.println(third.number + "" + third.model + "" + third.weight);

        first.receiveCall("Иванов");
        second.receiveCall("Петров");
        third.receiveCall("Сидоров");

        first.getNumber();
        second.getNumber();
        third.getNumber();

        Phone fourth = new Phone("number ", "model ", "weight ");
        System.out.println(fourth.number + "" + fourth.model + "" + fourth.weight);

        first.receiveCall("Иван", "8956");
        first.sendMessage("7531", "876536", "45337", "45387", "46512");
    }
}
