package app;

import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] sch = new String[7][2];
            sch[0][0] = "Sunday";
            sch[0][1] = "do home work";
            sch[1][0] = "Monday";
        sch[1][1] = "go to courses; watch a film";
        sch[2][0] = "Tuesday";
        sch[2][1] = "go to courses; watch a film";
        sch[3][0] = "Wednesday";
        sch[3][1] = "go to courses; watch a film";
        sch[4][0] = "Thursday";
        sch[4][1] = "go to courses; watch a film";
        sch[5][0] = "Friday";
        sch[5][1] = "go to courses; watch a film";
        sch[6][0] = "Saturday";
        sch[6][1] = "go to courses; watch a film";

        String day;

        while (true){
            System.out.print("Please, input the day of the week: ");
            day=sc.nextLine();
            switch (day){
                case "Sunday":
                    System.out.println("Your tasks for Sunday: "+sch[0][1]);break;

                case "Monday":
                    System.out.println("Your tasks for Monday: "+sch[1][1]);break;
                case "Tuesday":
                    System.out.println("Your tasks for Tuesday: "+sch[2][1]);break;
                case "Wednesday":
                    System.out.println("Your tasks for Wednesday: "+sch[3][1]);break;
                case "Thursday":
                    System.out.println("Your tasks for Thursday: "+sch[4][1]);break;

                case "Friday":
                    System.out.println("Your tasks for Friday: "+sch[5][1]); break;
                case "Saturday":
                    System.out.println("Your tasks for Saturday: "+sch[6][1]);break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }

            if(day.equals("exit")){
                break;
            }
        }

            }

    }

