public class Java12Abstract {
    public static void main(String[] args) {
        /*
         * Uma classe abstrata não pode ter objetos instanciados, ela serve como modelo "template" para outras classes que herdarem essa classe abstrata.
         * Uma classe abstrata é uma super classe.
         * 
         * Metodos abstratas forçam a você sobrescreve-lo quando o metodo e herdado.
         */

        Human human = new Human("Leandro");

        System.out.println(human);
        
        human.speak();
    }
}

abstract class Creature {
    protected String specie;
    protected int life;

    public Creature(String specie) {
        this.specie = specie;
        this.life = 100;
    }

    public String getSpecie() {
        return this.specie;
    }

    public int getLife() {
        return this.life;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "\n Especie: " + this.specie + "\n Vida: " + this.life;
    }
}

class Human extends Creature {
    private String name;

    public Human(String name) {
        super("Humano");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void speak() {
        System.out.println("\n Oi !!! Boa tarde !!!\n");
    }

    @Override
    public String toString() {
        return super.toString() + "\n Nome: " + this.name + "\n";
    }
}
