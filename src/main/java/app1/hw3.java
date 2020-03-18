package app1;

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
        int flag=0;

        while (true){
            System.out.print("Please, input the day of the week: ");
            day=sc.nextLine();
            day=day.toLowerCase().trim();
            switch (day){
                case "sunday":
                    System.out.println("Your tasks for Sunday: "+sch[0][1]);break;

                case "monday":
                    System.out.println("Your tasks for Monday: "+sch[1][1]);break;
                case "tuesday":
                    System.out.println("Your tasks for Tuesday: "+sch[2][1]);break;
                case "wednesday":
                    System.out.println("Your tasks for Wednesday: "+sch[3][1]);break;
                case "thursday":
                    System.out.println("Your tasks for Thursday: "+sch[4][1]);break;

                case "friday":
                    System.out.println("Your tasks for Friday: "+sch[5][1]); break;
                case "saturday":
                    System.out.println("Your tasks for Saturday: "+sch[6][1]);break;
                case "exit":
                    flag=1;break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
            if(flag==1){
                break;
            }


        }

            }

    }

