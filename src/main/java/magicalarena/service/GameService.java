package magicalarena.service;
import magicalarena.model.Player;

import java.util.Random;

public class GameService {
    Random random = new Random();
    public Player getWinner(Player firstPlayer, Player secondPlayer) {
        boolean firstPlayerTurn = firstPlayer.getHealthValue() <= secondPlayer.getHealthValue();
        Player winner = null;
        while (firstPlayer.getHealthValue() > 0 && secondPlayer.getHealthValue() > 0) {
            if (firstPlayerTurn) {
                fight(firstPlayer, secondPlayer);
                firstPlayerTurn = false;
                if (secondPlayer.getHealthValue() <= 0) {
                    winner = firstPlayer;
                    break;
                }
            }
            else {
                fight(secondPlayer, firstPlayer);
                firstPlayerTurn = true;
                if (firstPlayer.getHealthValue() <= 0) {
                    winner = secondPlayer;
                    break;
                }
            }
        }
        return winner;
    }

    void fight(Player attacker, Player defender) {
        int attackDice = rollDie();
        int defenceDice = rollDie();
        System.out.println(attacker.getName() + " rolls die " + attackDice + "\n" + defender.getName() + " rolls die " + defenceDice);
        int damage  = attackDice * attacker.getAttackValue() - defenceDice * defender.getStrengthValue();
        if(damage > 0) {
            defender.setHealthValue(defender.getHealthValue() - damage);
        }
        System.out.println(attacker.toString() + "\n" + defender.toString() + "\n");
    }

    int rollDie() {
        return random.nextInt(6) + 1;
    }
}
