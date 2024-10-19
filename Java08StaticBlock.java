public class Java08StaticBlock {
    static {
        System.out.println("\n Bloco estatico iniciado !!!\n");
    }

    {
        System.out.println("\n Bloco não estatico iniciado ...\n");
    }

    public static void main(String[] args) {
        /*
         * O bloco de inicializacao tambem pode ser inicializado de forma estatico.
         * Ele sera executado uma vez so, enquanto o nao estatico inicializa a cada criacao de instancia.
         */

        Java08StaticBlock test = new Java08StaticBlock();
        Java08StaticBlock test2 = new Java08StaticBlock();
        Java08StaticBlock test3 = new Java08StaticBlock();
        Java08StaticBlock test4 = new Java08StaticBlock();
        Java08StaticBlock test5 = new Java08StaticBlock();
    }
}
