import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int sixDie = rand.nextInt(6) + 1;
        int eightDie = rand.nextInt(8) + 1;
        int tenDie = rand.nextInt(10) + 1;
        int twelveDie = rand.nextInt(12) + 1;
        int twentyDie = rand.nextInt(20) + 1;
        int sum = sixDie + eightDie + tenDie + twelveDie + twentyDie;
        
        System.out.println("The six die rolled a " + sixDie);
        System.out.println("The eight die rolled a " + eightDie);
        System.out.println("The ten die rolled a " + tenDie);
        System.out.println("The twelve die rolled a " + twelveDie);
        System.out.println("The twenty die rolled a " + twentyDie);
        
        System.out.println("Your fireball hits the dragon for " + sum);
    }
}
