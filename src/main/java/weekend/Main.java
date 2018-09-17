package weekend;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //first task
        String[] favArtists = {"KNOWER", "Superorganism", "The Front Bottoms"};
        for(int i = 0; i < 3; i++)
        {
            System.out.println(favArtists[i]);
        }

        System.out.println("\n************************\n");

        //second task
        String[] daysOfTheWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        switch ((int)(Math.random()*6))
        {
            case 0:
                System.out.println(daysOfTheWeek[0]);
                break;
            case 1:
                System.out.println(daysOfTheWeek[1]);
                break;
            case 2:
                System.out.println(daysOfTheWeek[2]);
                break;
            case 3:
                System.out.println(daysOfTheWeek[3]);
                break;
            case 4:
                System.out.println(daysOfTheWeek[4]);
                break;
            case 5:
                System.out.println(daysOfTheWeek[5]);
                break;
            case 6:
                System.out.println(daysOfTheWeek[6]);
                break;
            default: System.out.println("what tf");
        }

        System.out.println("\n************************\n");

        //third task
        int firstNums[] = {4, 2, 7, 9, 5, 4};
        int secNums[] = {7, 1, 4, 0, 7};
        System.out.println(firstNums[1] * secNums[2]); //2 * 4
        System.out.println("\n************************\n");
        //fourth task
        int grade = (int)(Math.random() * 100 + 1) ;
        if (grade >= 90) System.out.println("You got an A");
        else if (grade >= 80) System.out.println("You got a B");
        else if (grade >= 70) System.out.println("You got a C");
        else if (grade >= 60) System.out.println("You got a D");
        else System.out.println("You got an F");

        System.out.println("\n************************\n");

        //fifth task
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is thine age?");
        int age = scanner.nextInt();
        System.out.println("Hey " + name + " next year you will be " + (age+1) + " years old");
        System.out.println("\n************************\n");

        scanner.nextLine();

        //sixth task
        int tries = 1;
        System.out.println("Username: ");
        String user = scanner.nextLine();
        System.out.println("Password: ");
        String pass = scanner.nextLine();
        while (!pass.equals("TGIF") && tries<3)
        {
            System.out.println("WRONG");
            System.out.println("Username: ");
            user = scanner.nextLine();
            System.out.println("Password: ");
            pass = scanner.nextLine();
            tries++;
        }
        if (tries==4) System.out.println("You are locked out. Contact the system admin.");
        else System.out.println("Welcome, " + user);

        System.out.println("\n************************\n");

        //seventh task - mean
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int added = 0;
        for (int preSum: numbers)
        {
            added = added + preSum;
        }
        System.out.println(added / numbers.length);

        System.out.println("\n************************\n");

        //eighth task - sum
        int[] lottoNumbers = {11,21,23,14,5,65};
        int sum = 0;
        for (int newNum: lottoNumbers)
        {
            sum = sum + newNum ;
        }
        System.out.println(sum);

        System.out.println("\n************************\n");

        //ninth task - wu tang
        System.out.println("write a sentence");
        String[] sentence = (scanner.nextLine()).split(" ");
        for (int b = 0; b < sentence.length; b++)
        {
            if (((b+1)%2)==0) sentence[b] = "Wu";
            else if (((b+1)%3)==0) sentence[b] = "Tang";
            System.out.print(sentence[b] + " ");
        }

        System.out.println("\n************************\n");

        scanner.close();
    }
}
