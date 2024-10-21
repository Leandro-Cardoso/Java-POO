public class Java11Enum {
    public static void printDay(DayWeek day) {
        System.out.println("\n Dia da semana: " + day.getName() + " (" + day.getValue() + ")\n");
    }

    public static void main(String[] args) {
        /*
         * E enumeracao e ideal para quando voce tem diversas opcoes de constantes.
         * Voce pode tambem definir valores baseados na constante informada.
         */

        Java11Enum.printDay(DayWeek.DOMINGO);
    }
}

enum DayWeek {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "Segunda"),
    TERCA(3, "terca"),
    QUARTA(4, "quarta"),
    QUINTA(5, "quinta"),
    SEXTA(6, "sexta"),
    SABADO(7, "sabado");

    private int value;
    private String name;

    DayWeek(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}
