package nelson_7_guessgame;

import java.util.Scanner;
import java.util.Random;
        
public class Nelson_7_GuessGame  {
    static String username;
    static String r;
    static int yourguess;
    static int magicnumber;
    static Random random;
    static boolean playagain;
    static boolean game = true;
    static int tries = 3;
    static int wins = 0;
    static boolean troll = true;
    public static void main(String[] args) {
        name();
        while (game) {
            game();
        }
    }
    public static void name() {
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        username = name.nextLine();
        if (username.isEmpty()) {
            System.out.println("Please, type a username.");
            name();
        }
        if (username.length()>10) {
            System.out.println("Please, use no more than 10 characters.");
            name();
        }
        if (username.contains("John Cena")||username.contains("JOHN CENA")||username.contains("john cena")) {
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException ex) {
            }
            System.out.println("OK! OK! YOU WIN!");
            System.exit(0);
        }
    }
    public static void game() {
        tries = 3;
        playagain = true;
        random = new Random();
        if (troll) {
            magicnumber = random.nextInt(11);
        }
        else {
            magicnumber = (random.nextInt(10)+1);
        }
        System.out.println("Hello " + username + "! Please pick a number between 1 and 10!");
        while (playagain) {
            playthegame();
        }
    }
    public static void playthegame() {
        Scanner guess = new Scanner(System.in);
        yourguess = guess.nextInt();
        if (tries != 0) {
            tries = tries - 1;
            if (yourguess > 10) {
                System.out.println("Please, pick a number between 1 and 10.");
                tries += 1;
                playthegame();
            }
            else if (magicnumber == 0) {
                troll = false;
                System.out.println("LOL THAT WASN'T MY NUMBER! My number was 0.");
                try {
                    Thread.sleep(1500);
                }
                catch(InterruptedException ex) {
                }
                for (int i=0; i<1000; i++) {
                    System.out.println("TROLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOL");
                }
                System.out.println("Would you like to play again? [Y/N]");
                Scanner restart = new Scanner(System.in);
                r = restart.nextLine();
                if (r.equals("n")||r.equals("N")) {
                    System.exit(0);
                }
                if (r.equals("y")||r.equals("Y")) {
                    try {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException ex) {
                    }
                    game();
                }
            }
            else if (yourguess == magicnumber) {
                wins = wins + 1;
                System.out.println("You guessed it! My number was " + magicnumber + "!");
                if (wins > 1) {
                    System.out.println("You have won " + wins + " times in a row!");
                }
                System.out.println("Would you like to play again? [Y/N]");
                Scanner restart = new Scanner(System.in);
                r = restart.nextLine();
                if (r.equals("n")||r.equals("N")) {
                    System.exit(0);
                }
                if (r.equals("y")||r.equals("Y")) {
                    try {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException ex) {
                    }
                    game();
                }
            }
            else if (yourguess < magicnumber) {
                if (tries != 0) {
                    System.out.println("Sorry, that wasn't my number. You guessed too low. You have " + tries + " tries left.");
                }
            }
            else if ((yourguess > magicnumber)&&(yourguess < 11)) {
                if (tries != 0) {
                    System.out.println("Sorry, that wasn't my number. You guessed too high. You have " + tries + " tries left.");
                }
            }
        }
        if (tries == 0) {
            System.out.println("Sorry, you've guessed too many times. My number was " + magicnumber + ".");
            if (wins > 1) {
                    System.out.println("You have ended your winning streak of " + wins + " wins in a row.");
                }
            wins = 0;
            System.out.println("Would you like to play again? [Y/N]");
            Scanner restart = new Scanner(System.in);
            r = restart.nextLine();
            if (r.equals("n")||r.equals("N")) {
                System.exit(0);
            }
            if (r.equals("y")||r.equals("Y")) {
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException ex) {
                }
                game();
            }
        }
    }
}