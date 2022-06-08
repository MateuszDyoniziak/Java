import java.time.Year;
import java.util.Scanner;

public class PracaDomowa {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Hello welcome in Mateusz High quality software please enter your name");
        String name = scenner.nextLine();
        System.out.println("Hello " + name+ " Younger Tank member!");
        System.out.println("Now to confirm that you are not a robot please give me two numbers. First number:");
        int firstNumber = scenner.nextInt();
        System.out.println("Great, now enter second number");
        int secondNumber = scenner.nextInt();
        System.out.println("Because this software is dedicated for intelligent users we will carry out the multiplication of these numbers");
        int result = firstNumber * secondNumber;
        System.out.println("Result is: " + firstNumber * secondNumber);
        /*Scanner YN = new Scanner(System.in);
        System.out.println("If result is correct please enter 'Y'/ If result is wrong please chose 'N'");*/
        Scanner sc = new Scanner(System.in);
        boolean yn;
        System.out.println("\"If result is correct please enter 'Y'/ If result is wrong please chose 'N'\"");
        String answer;

        OUTER:
        while (true) {
            answer = sc.next().trim().toLowerCase();
            switch (answer) {
                case "y":
                    yn = true;
                    System.out.println("Welcome in the exclusive software!");
                    break OUTER;
                case "n":
                    yn = false;
                    System.out.println("go away and train some math !!!! ");
                    break OUTER;
                default:
                    System.out.println("Sorry, I didn't get that. Please enter y/n");
                    break;
            }
        }

    }




        /*String yn = YN.next();
        if (yn.equals(y);
            System.out.println("Welcome in exclusive club!!!");

        }

        if (YN.equals('N')) {
            System.out.println("Go away and train some math!");
        }*/


























    }





