public class Ex1 {
    public static void main(String[] args) {
        Carro carro = new Carro(1930, 2);

        System.out.println("Modelo: " + Carro.MODELO);
        System.out.println("Cor: " + Carro.COR);
        System.out.println("Ano de fabricação: " + carro.getAnoDeFabricacao());
        System.out.println("Número de portas: " + carro.getNumeroDePortas());
    }
}

class Carro {
    public static final String MODELO = "Modelo T";
    public static final String COR = "preto";

    private int anoDeFabricacao;
    private int numeroDePortas;

    public Carro(int anoDeFabricacao, int numeroDePortas) {
        this.anoDeFabricacao = anoDeFabricacao;
        this.numeroDePortas = numeroDePortas;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
}