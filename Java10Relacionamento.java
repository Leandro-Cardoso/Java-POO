public class Java10Relacionamento {
    public static void main(String[] args) {
        /*
         * Exemplo pratico:
         */

        Creature player = new Player("Leandro");
        Creature monster = new Monster();

        // BATALHA:
        while (monster.isAlive()) {
            System.out.println(player);
            System.out.println(monster);

            monster.atack(player);
            for (int i = 0; i < 3; i++) {
                player.atack(monster);
            }
        }

        System.out.println(player);
        System.out.println(monster);
        System.out.println("\n Voce venceu !!!\n");
    }
}

class Creature {
    private String name;
    private int life;

    public Creature (String name) {
        this.name = name;
        this.life = 100;
    }

    @Override
    public String toString() {
        return "\n Nome: " + this.name + "\n Vida: " + this.life + "\n";
    }

    public void damage(int value) {
        this.life -= value;
        if (this.life < 0) {
            this.life = 0;
        } 
    }

    public void atack(Creature creature) {
        creature.damage(30);
        System.out.println("\n O(A) " + this.name + " atacou o " + creature.name);
    }

    public boolean isAlive() {
        return (this.life > 0) ? true : false;
    }
}

class Player extends Creature {
    public Player (String name) {
        super(name);
    }
}

class Monster extends Creature {
    public Monster () {
        super("Monster");
    }
}
