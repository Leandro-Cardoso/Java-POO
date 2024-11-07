public class Java15Instanceof {
    public static void main(String[] args) {
        /*
         * Polimorfismo utilizando instanceof e cast de tipo de objeto.
         */

        Human human = new Human(35, "Leandro");

        System.out.println("\n" + human.info(human));
    }
}

abstract class Creature {
    protected int age;

    public Creature(int age) {
        this.age = age;
    }
}

class Human extends Creature {
    private String name;

    public Human(int age, String name) {
        super(age);
        this.name = name;
    }

    public String info(Creature creature) {
        String str = "";

        if (creature instanceof Human) {
            Human human = (Human) creature;
            str += " Nome: " + human.name + "\n";
        }
        else {
            str += " Nome: Sem nome\n";
        }

        str += " Idade: " + creature.age + "\n";

        return str;
    }
}
