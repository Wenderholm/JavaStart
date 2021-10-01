package polimorf.zad2Symulacja_gry;

public class Team {
    private String name;
    private GameCharacter[] character = new GameCharacter[3];

    public Team(String name, GameCharacter character2, GameCharacter character3, GameCharacter character1) {
        this.name = name;
        this.character[0] = character1;
        this.character[1] = character2;
        this.character[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter[] getCharacter() {
        return character;
    }

    public void setCharacter(GameCharacter[] character) {
        this.character = character;
    }

    double attack(){
        double attack = 0;
        for (GameCharacter gameCharacter : character) {
            attack +=gameCharacter.getAttack();
        }
        return attack;
    }

    double defense(){
        double defense = 0;
        for (GameCharacter gameCharacter : character) {
            defense +=gameCharacter.getDefense();
        }
        return defense;
    }
    double energy(){
        double energy = 0;
        for (GameCharacter gameCharacter : character) {
            energy +=gameCharacter.getEnergy();
        }
        return energy;
    }
}
