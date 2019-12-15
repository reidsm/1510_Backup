import java.util.Random;
public class CardGame {
    
    enum Rank {ace, two, three, four, five, six, seven, eiht, nine, ten, jack, queen, king}
    enum Suit {hearts, diamonds, clubs, spades}
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int whichRank = rand.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[whichRank];
        System.out.println(whichRank);
        System.out.println(randomRank);
        int whichSuit = rand.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[whichSuit];
        System.out.println(whichSuit);
        System.out.println(randomSuit);
    }
}
