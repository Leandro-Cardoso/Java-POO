public class Java05PublicPrivate {
    /*
     * Metodos ou atributos publicos podem ser usados em qualquer classe, já os privados, apenas podem ser usados dentro da classe que eles pertencem.
     * Uma forma de acessar um atributo privado seria atravez da criacao e utilizacao de um metodo "get" e "set" para alterar (metodos getters e setters).
     */
    private int num;

    public Java05PublicPrivate(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Java05PublicPrivate obj = new Java05PublicPrivate(5);

        System.out.println("\n Numero: " + obj.getNum());

        obj.setNum(10);

        System.out.println("\n Numero: " + obj.getNum() + "\n");
    }
}
