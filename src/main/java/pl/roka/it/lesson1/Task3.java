package pl.roka.it.lesson1;
/*
Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
*/

public class Task3 {
    public static void main(String[] args) {
        int s = 604800;
        int sek = s % 60;
        int m = (s - sek) / 60;
        int min = (m % 60);
        System.out.println("min:" + m + "," + " sek:" + sek+ ".");
        int h = (m - min) / 60;
        int hour = h % 24;
        System.out.println("hour:" + h + "," + " min:" + min + "," + " sek:" + sek+ ".");
        int d = (h - hour) / 24;
        int day = d % 7;
        System.out.println("day:" + d + "," + " hour:" + hour + "," + " min:" + min + "," + " sek:" + sek+ ".");
        int w = (d - day) / 7;
        System.out.println("week:" + w + "," + " day:" + day + "," + " hour:" + hour + "," + " min:" + min + "," + " sek:" + sek+ ".");


    }

}
