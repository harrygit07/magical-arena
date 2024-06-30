package service;

import magicalarena.model.Player;
import magicalarena.service.GameService;

public class GameServiceTest {

    GameService gameService = new GameService();
    public void testFight(Player attacker, Player defender) {
        int defenderInitialHealth = defender.getHealthValue();
        gameService.getWinner(attacker, defender);

        if (defenderInitialHealth > defender.getHealthValue()) {
            System.out.println("Test passed because After fight health value of defender is decreased.");
        }
        else System.out.println("Test failed because after fight health value of defender is same.");

    }
}
