package pl.roka.it.lesson8.task_8_7;

import java.util.Random;
import java.util.Scanner;

/**
 * Создать класс компьютер.
 * Поля:
 * - процессор
 * - оперативка
 * - жесткий диск
 * - ресурс полных циклов работы (включений/выключений)
 * Методы:
 * - метод описание(вывод всех полей)
 * - метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1),
 * вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает. Если комп сгорел,
 * при попытке включить нужно выдать сообщение, что ему конец.
 * - выключить (аналогично включению)
 * - при превышении лимита ресурса комп сгорает
 */
public class Computer {
    private String processor;
    private String ram;
    private String hardDisk;
    private int totalResource;
    private int currentResource;


    public Computer(String processor, String ram, String hardDisk, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.totalResource = resource;

    }

    public void switchOn(int number) {

        if (currentResource >= totalResource) {
            System.out.println("The Computer Burned Down He Is Finished");
            return;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("Enter A Number 0 Or 1 To Turn On The Computer");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == randomNumber) {
            System.out.println("The Computer Is TurnedOn");
        } else {
            System.out.println("The Computer Burned Down He Is Finished");
            return;
        }

        currentResource++;
    }

    public void switchOff(int number) {

        if (currentResource >= totalResource) {
            System.out.println("The Computer Burned Down He Is Finished");
            return;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("Enter ANumber 0 Or 1 To Turn Off The Computer");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == randomNumber) {
            System.out.println("The Computer Is Turned Off");
        } else {
            System.out.println("The Computer Burned Down He Is Finished");
            return;
        }

        currentResource++;

    }

    public String showInfo() {
        return "Computer{" +
                "processor= '" + processor + '\'' +
                ", ram= '" + ram + '\'' +
                ", hardDisk= '" + hardDisk + '\'' +
                ", resource= '" + totalResource + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Computer comp = new Computer("M1", "16", "ssd", 22);
        System.out.println(comp.showInfo());
        comp.switchOn(1);
        comp.switchOff(1);
    }


}
