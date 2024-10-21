public class Java06Protected {
    /*
     * Metodos e atributos "protected" só podem ser usados dentro do mesmo pacote, ou atravez de uma classe filha em qualquer pacote.
     */
    protected String test;

    public Java06Protected() {
        this.test = "Passou";
    }
}
