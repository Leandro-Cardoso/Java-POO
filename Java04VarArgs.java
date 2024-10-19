public class Java04VarArgs {
    public static int sumNums(int... nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        /*
         * E possivel tambem passar varios agumentos como parametro de um metodo, sem necessariamente passar uma lista.
         */

        int sum = Java04VarArgs.sumNums(5, 10, 20, 15);

        System.out.println("\n Soma: " + sum + "\n");
    }
}
