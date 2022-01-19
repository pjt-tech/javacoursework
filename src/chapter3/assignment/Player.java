package chapter3.assignment;

public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.level = playerLevel;
    }

    public void play(int count) {
        getLevel().showLevelMessage();
        level.go(count);
    }
}
