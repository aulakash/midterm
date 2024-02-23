/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Days {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7):");
        int dayNumber = in.nextInt();

        if(dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
            return;
        }

        Day day = Day.values()[dayNumber - 1]; 

        Weekdays t = new Weekdays();
        t.nameOfDay(day);
    }
}