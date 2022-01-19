package chapter3.assignment;

public class PlayerTest {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvancedLevel());
        player.play(3);

        player.upgradeLevel(new SuperLevel());
        player.play(3);
    }
}
