/*
        Создать класс автомобиль.
        У него есть скорость, вместимость бензобака.
        Он может заводится и останавливаться.
 */

public class Task_slide_10 {
    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.speed = 120;
        auto.fuel = 50;

        System.out.println("Скорость авто: " + auto.speed + "\nВместимость бензобака: " + auto.fuel);

        auto.start();
        auto.stop();
    }
}
