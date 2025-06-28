public class Ex5 {
    enum Semaforo {
        AMARELO1, VERMELHO, AMARELO2, VERDE
    }

    public static void main(String[] args) {
        Semaforo sem = Semaforo.VERMELHO;
        switch (sem) {
            case AMARELO1:
                System.out.println("Sinal amarelo! ATENÇÃO!");

            case VERMELHO:
                if (sem == Semaforo.VERMELHO) {
                    System.out.println("Sinal vermelho! PARE!");
                    break;
                }
            case AMARELO2:
                if (sem == Semaforo.AMARELO2) {
                    System.out.println("Sinal amarelo! ATENÇÃO!");
                }
                break;

            case VERDE:
                    System.out.println("Sinal verde! SIGA!");
                    break;
        }
    }
}
