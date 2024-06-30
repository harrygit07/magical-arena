package magicalarena;

import magicalarena.model.Player;
import magicalarena.service.GameServiceTest;

public class MagicalArenaApplicationTest {

    public static void main(String[] args) {
        GameServiceTest gameServiceTest = new GameServiceTest();
        Player attacker = new Player("A", 4, 3, 7);
        Player defender = new Player("B", 10, 1, 7);
        gameServiceTest.testFight(attacker, defender);
    }
}
