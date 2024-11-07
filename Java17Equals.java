public class Java17Equals {
    public static void main(String[] args) {
        /*
         * Metodo equals() e usado para comparar se duas classes sao iguais.
         */

        Fruta fruta1 = new Fruta("Morango");
        Fruta fruta2 = new Fruta("Morango");
        Fruta fruta3 = new Fruta("Cereja");

        System.out.print("\n \"" + fruta1.getName() + "\" e igual a \"" + fruta2.getName() + "\" - ");
        System.out.println(fruta1.equals(fruta2));

        System.out.print("\n \"" + fruta1.getName() + "\" e igual a \"" + fruta3.getName() + "\" - ");
        System.out.println(fruta1.equals(fruta3) + "\n");
    }
}

class Fruta {
    private String name;

    public Fruta(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fruta) {
            Fruta fruta = (Fruta) obj;
            return this.name == fruta.name ? true : false;
        }
        else {
            return super.equals(obj);
        }
    }
}
