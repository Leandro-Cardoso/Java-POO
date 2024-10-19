public class Java03BlocoInicializacao {
    public static void main(String[] args) {
        /*
         * Blocos de inicializacao sempre vao iniciar no momento em que voce instancia um objeto.
         */

        TestBloco bloco = new TestBloco("Bloco");

        System.out.println();
        for (int num : bloco.nums) {
            System.out.print(" " + num);
        }
        System.out.println("\n");
    }
}

class TestBloco {
    String name;
    int[] nums = new int[10];

    {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
    }

    public TestBloco(String name) {
        this.name = name;
    }
}
