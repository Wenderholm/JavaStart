package polimorf.zad2Symulacja_gry;

public class BattleSimulation {
    public static void main(String[] args) {
        AttackCharacter character1 = new AttackCharacter("Joe", 200, 100, 100, 0.2);
        AttackCharacter character2 = new AttackCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character3 = new DefenseCharacter("Kris", 100, 100, 100, 0.2);
        AttackCharacter character4 = new AttackCharacter("Matt", 100, 100, 100, 0.2);
        DefenseCharacter character5 = new DefenseCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character6 = new DefenseCharacter("Belly", 100, 100, 100, 0.2);

        Team team1 = new Team("TeamOne", character2, character3, character1);
        Team team2 = new Team("TeamTwo", character5, character6, character4);
        BattleSimulation.fight(team1, team2);

// t1 att340 def320
// t2 att320 def340

    }
    static void fight (Team team1, Team team2){
        double team2Energy = attack(team1, team2);
        double team1Energy = attack(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Wygrywa drużyna " + team1.getName() + " z przewagą " + energyDiff + " energii");
        } else if (energyDiff < 0) {
            System.out.println("Wygrywa drużyna " + team2.getName() + " z przewagą " + (-energyDiff) + " energii");
        } else {
            System.out.println("Remis, obie drużyny zachowały " + team1Energy + " energii");
        }
    }
    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0) {
            return energy - attackPower;
        } else {
            return energy;
        }
    }
}
