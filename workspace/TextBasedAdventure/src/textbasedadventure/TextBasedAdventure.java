package textbasedadventure;

import java.util.Random;
import java.util.Scanner;

public class TextBasedAdventure {
    static boolean playagain = true;
    static String Name;
    static int Q1;
    static int Q2;
    static String Q3;
    static String Q3new;
    static String Q4;
    static String Q5;
    static String Q5new;
    static boolean name = true;
    static Random random = new Random();
    public static int r;
    public static void main(String[] args) {
//        #while
//        #method1()
//        I used this method to run the while loop for the game. That's all. Yep. That's it, folks.
        while (playagain) {
            intro();
            intropt2();
        }
    }
    public static void intro() {
//        #method2()
//        This method is for running the SPOOOOOKY intro. There's also a method for another part of it.
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou suddenly wake up.");
//        #hero
//        This is where you are introduced. In my game, you aren't really considered much of a hero... at all... But hey! It was a requirement.
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You begin to regain your vision, and you slowly look around.");
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You notice that you are in a blank white room.");
        try {
            Thread.sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You can't remember anything. That is, except for your name.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        if (name) {
            System.out.println("What is your name?");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
            }
            name();
        }
    }
    public static void name() {
//        #method3()
//        This is where the user inputs his/her name. You'd be suprised how much spam people put in instead of their actual name, so I put in a 10 character limit.
        Scanner name = new Scanner(System.in);
        Name = name.nextLine();
        if (Name.length()>10) {
            System.out.println("Please, use no more than 10 characters.");
            name();
        } 
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void intropt2() {
//        #method4()
//        This method is for running the 2nd part of the SPOOOOOKY intro.
        name = false;
        System.out.println("Suddenly, you hear a voice.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Hello, " + Name + ".");
//        #enemyobject
//        This is where the protagonist is introduced. The protagonist hides his/her/it's identity from the "hero", but only for safety reasons, of course ;) . The protagonist really isn't that bad, unless you include the burning of humans alive, or the drowning, or the freezing... or the...
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Do not be alarmed that your memory is blank.");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("I removed your memory so you can perform the best you can in these tests.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Here are the rules.");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You have no time limit on these tests. Take all of the time you need.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("If you answer the question correctly, you will move on to the next question.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("If you answer the question incorrectly, well, just make sure that you get the right answer.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("The tests will now begin.");
        try {
            Thread.sleep(3500);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("This first question is easy. If you can't answer this question right, we were wrong about you. Definitely.");
        try {
            Thread.sleep(3500);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("╔════════════════════════╗");
        System.out.println("║          *Q1*          ║");
        System.out.println("║      What is 1+1?      ║");
        System.out.println("╚════════════════════════╝");
        Scanner q1 = new Scanner(System.in);
        Q1 = q1.nextInt();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
        }
        if (Q1 == 2) {
            System.out.println("I'm glad you answered THAT right. Now for question 2.");
            try {
                Thread.sleep(2500);
            }
            catch(InterruptedException ex) {
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("This next question requires a bit of problem solving. Let's hope that you can do work in your head.");
            try {
                Thread.sleep(3500);
            }
            catch(InterruptedException ex) {
            }
            System.out.println("╔════════════════════════╗");
            System.out.println("║          *Q2*          ║");
            System.out.println("║    How many minutes    ║");
            System.out.println("║      are in a day?     ║");
            System.out.println("╚════════════════════════╝");
            Scanner q2 = new Scanner(System.in);
            Q2 = q2.nextInt();
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
            }
            if (Q2 == 1440) {
                System.out.println("Great! You can do math!");
                try {
                    Thread.sleep(2000);
                }
                catch(InterruptedException ex) {
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("For this question, you're gonna need some literary skills.");
                try {
                    Thread.sleep(3500);
                }
                catch(InterruptedException ex) {
                }
                System.out.println("╔════════════════════════╗");
                System.out.println("║          *Q3*          ║");
                System.out.println("║   Type this sentence   ║");
                System.out.println("║       backwards:       ║");
                System.out.println("║    \"I live for the     ║");
                System.out.println("║         tests\"         ║");
                System.out.println("╚════════════════════════╝");
                Scanner q3 = new Scanner(System.in);
                Q3 = q3.nextLine();
                String Q3new = Q3.toLowerCase();
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex) {
                }
                if (Q3new.equals("stset eht rof evil i")) {
                    System.out.println("Wow! You're doing great! Just kidding! That was EASY.");
                    try {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex) {
                    }
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Hehehe... Try this one...");
                    try {
                        Thread.sleep(3500);
                    }
                    catch(InterruptedException ex) {
                    }
                    System.out.println("╔════════════════════════╗");
                    System.out.println("║          *Q4*          ║");
                    System.out.println("║    What is your name   ║");
                    System.out.println("║       in Spanish?      ║");
                    System.out.println("╚════════════════════════╝");
                    Scanner q4 = new Scanner(System.in);
                    Q4 = q4.nextLine();
                    try {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ex) {
                    }
                    if (Q4.equals(Name)) {
                        System.out.println("Hehe lol...");
                        try {
                            Thread.sleep(2000);
                        }
                        catch(InterruptedException ex) {
                        }
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Now for the final question! (I ran out of time)");
                        try {
                            Thread.sleep(2500);
                        }
                        catch(InterruptedException ex) {
                        }
                        System.out.println("╔════════════════════════╗");
                        System.out.println("║          *Q5*          ║");
                        System.out.println("║  Pete and Repeat were  ║");
                        System.out.println("║  in a boat. Pete fell  ║");
                        System.out.println("║   out. Who was left?   ║");
                        System.out.println("╚════════════════════════╝");
                        Scanner q5 = new Scanner(System.in);
                        Q5 = q5.nextLine();
                        String Q5new = Q5.toLowerCase();
                        try {
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException ex) {
                        }
                        if (Q5new.equals("repeat")) {
//                            #win
//                            This is the "win" that just loops the game around again. Shhh... don't tell anyone...
                            intro();
                            intropt2();
                        }
                        else {
                            System.out.println("What a shame. You were so close.");
                            try {
                                Thread.sleep(2000);
                            }
                            catch(InterruptedException ex) {
                            }
                            die();
                        }
                    }
                    else {
                        System.out.println("Your name is the same in Spanish! LOOOL! And you're gonna DIE cuz of it!");
                        try {
                            Thread.sleep(4000);
                        }
                        catch(InterruptedException ex) {
                        }
                        die();
                    }
                }
                else {
                    System.out.println("...deliaf uoy ekil skool");
                    try {
                        Thread.sleep(4000);
                    }
                    catch(InterruptedException ex) {
                    }
                    die();
                }
            }
            else {
                System.out.println("Hah! Maybe you weren't so smart after all.");
                try {
                Thread.sleep(2000);
                }
                catch(InterruptedException ex) {
                }
                die();
            }
        }
        else {
            System.out.println("What a shame. You just had to get this stupid question wrong.");
            try {
                Thread.sleep(2500);
            }
            catch(InterruptedException ex) {
            }
            die();
        }
        System.exit(0);
    }
    public static void die() {
//        #lose
//        #method5()
//        This is the method that is called upon when the user dies. It picks a random number out of 5 so that there's a different death every time! What fun! There are also 5 more methods for these deaths.
        r = random.nextInt(5);
        if (r == 0) {
            death1();
        }
        if (r == 1) {
            death2();
        }
        if (r == 2) {
            death3();
        }
        if (r == 3) {
            death4();
        }
        if (r == 4) {
            death5();
        }
    }
    public static void death1() {
//        #method6()
//        This is the first death message.
        System.out.println("You all of a sudden start to feel very cold.");
        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Your body starts to sting everywhere.");
        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You scream out in pain as you freeze to death.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        intro();
        intropt2();
    }
    public static void death2() {
//        #method7()
//        This is the second death message.
        System.out.println("Suddenly, the walls to your left and right jolt.");
        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("They start closing in on you.");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Your bones and intestines explode as the walls crush you.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        intro();
        intropt2();
    }
    public static void death3() {
//        #method8()
//        This is the third death message.
        System.out.println("A hole in the ceiling opens up, and water starts gushing into the room.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You struggle to stay above the water, but the water quickly reaches the ceiling.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You try to hold your breath, but you eventually drown.");
        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        intro();
        intropt2();
    }
    public static void death4() {
//        #method9()
//        This is the fourth death message.
        System.out.println("You suddenly start struggling to breathe.");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Your lungs stop, and you collapse on the floor.");
        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        intro();
        intropt2();
    }
    public static void death5() {
//        #method10()
//        This is the fifth death message.
        System.out.println("Suddenly, the floor opens up.");
        try {
            Thread.sleep(1500);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Out of the cracks in the floor fire begins gushing out.");
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("You burn in the flames while screaming in agony.");
        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        intro();
        intropt2();
    }
}
