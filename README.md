# Magical Arena

## Overview
This is a simple Java application that simulates a fight between two players in a magical arena. Each player has health, strength, and attack attributes. Players take turns attacking each other.
Player with lower health attacks first at the start of a match.
Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0.
Player with health greater than 0 is announced winner at the end of game.

## How to Run
### Prerequisites
- Java Development Kit (JDK) installed on your system.
- Command line access.

   
1. **Navigate to the Project Directory**:
   ```sh
   cd magical-arena

2. **Compile the code**:
   ```sh
   javac -d build/ src/main/java/magicalarena/*.java src/main/java/magicalarena/model/*.java src/main/java/magicalarena/service/*.java

3. **Run the application**:
   ```sh
   java -cp build magicalarena.MagicalArenaApplication
   
## How to Test
1. **Navigate to the Project Directory**:
   ```sh
   cd magical-arena
2. **Compile the Test classes**
   ```sh
   javac -d build/ src/main/java/magicalarena/*.java src/main/java/magicalarena/model/*.java src/main/java/magicalarena/service/*.java src/test/java/magicalarena/*.java src/test/java/magicalarena/service/*.java

3. **Run the Test classes**
   ```
   java -cp build magicalarena.MagicalArenaApplicationTest
   
## Additional Information
1. Author: Hareesh Kumar
2. Date: 30 june, 2024
