public class Java03PublicPrivate {
    /*
     * Metodos ou atributos publicos podem ser usados em qualquer classe, já os privados, apenas podem ser usados dentro da classe que eles pertencem.
     * Uma forma de acessar um atributo privado seria atravez da criacao e utilizacao de um metodo "get" e "set" para alterar (metodos getters e setters).
     */
    private int num;
    private String name;

    public Java03PublicPrivate(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Java03PublicPrivate obj = new Java03PublicPrivate(5, "ABC");

        System.out.println("\n Numero: " + obj.getNum());

        obj.setNum(10);

        System.out.println("\n Numero: " + obj.getNum() + "\n");
    }
}
