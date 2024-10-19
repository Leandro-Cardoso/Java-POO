public class Java07Static {
    /*
     * Metodos ou atibutos estaticos são gerais, funcionam na classe, já não estaticos funcionam apenas nos objetos instanciados.
     */
    private static int count;
    String name;
    String color;

    public Java07Static(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public String str() {
        return "\n Nome: " + name + "\n Cor: " + color;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("\n " + Java07Static.getCount());

        Java07Static class1 = new Java07Static("Miguel", "Azul");
        System.out.println(class1.str() + "\n " + Java07Static.getCount());

        Java07Static class2 = new Java07Static("Joana", "Amarelo");
        System.out.println(class2.str() + "\n " + Java07Static.getCount());

        Java07Static class3 = new Java07Static("Leandro", "Verde");
        System.out.println(class3.str() + "\n " + Java07Static.getCount() + "\n");
    }
}
