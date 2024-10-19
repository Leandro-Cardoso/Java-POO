public class Java01Sobrecarga {
    public void createDice(int sides) {
        if (sides < 4) {
            System.out.println("\n Nao existe dado com menos de 4 lados !!!\n");
        }
        else {
            System.out.println("\n Esse dado tem " + sides + " lados...\n");
        }
    }
    
    public void createDice() {
        this.createDice(6);
    }

    public static void main(String[] args) {
        /*
         * Voce pode criar tambem 2 metodos com o mesmo nome porem com quantidade de parametros diferentes caso necessario.
         */

        Java01Sobrecarga test = new Java01Sobrecarga();

        test.createDice();
        test.createDice(20);
    }
}
