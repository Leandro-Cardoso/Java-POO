public class Java13Interface {
    public static void main(String[] args) {
        /*
         * Interfaces funcionam como contratos, modelos para construcao de classes, onde por padrao todos os elementos sao abstratos.
         * 
         * E possivel implementar mais de uma interface em uma unica classe.
         * 
         * E possivel tambem ja implementar codigo na interface usando o "default".
         * 
         * Por padrao todos os atributos da intercafe sao constantes publicas e estaticas. 
         */

        DBLoader loader = new DBLoader();

        loader.printDB();
        loader.description();
        loader.version();
    }
}

interface DB {
    int COUNT = 0;

    void printDB();
}

interface DBDescription {
    void description();

    default void version() {
        System.out.println("\n Versao 1.0. (padrao)\n");
    }
}

class DBLoader implements DB, DBDescription {
    @Override
    public void printDB() {
        System.out.println("\n Seus dados aqui...\n");
    }

    @Override
    public void description() {
        System.out.println("\n Uma breve descricao...\n");
    }
}