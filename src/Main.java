import com.workintech.model.Player;
import com.workintech.model.Point;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());


        System.out.println("********************************************");

        Player player1 = new Player("Player1", 120, Player.Weapon.SWORD);
        Player player2 = new Player("Player2", -10, Player.Weapon.BOW);
        Player player3 = new Player("Player3", 40, Player.Weapon.AXE);


        System.out.println(player1.healthRemaining());
        player1.loseHealth(30);
        System.out.println(player1.healthRemaining());
        player1.restoreHealth(20);
        System.out.println(player1.healthRemaining());

        System.out.println("********************************************");

        System.out.println(player2.healthRemaining());
        player2.loseHealth(20);
        System.out.println(player2.healthRemaining());
        player2.restoreHealth(40);
        System.out.println(player2.healthRemaining());

        System.out.println("********************************************");

        System.out.println(player3.healthRemaining());
        player3.loseHealth(10);
        System.out.println(player3.healthRemaining());
        player3.restoreHealth(90);
        System.out.println(player3.healthRemaining());


    }
}