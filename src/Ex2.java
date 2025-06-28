public class Ex2 {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    Aluno aluno2 = new Aluno();
    Aluno aluno3 = new Aluno();

    System.out.println("Total de alunos: " + Aluno.getNumeroDeAlunosCriados());
    }
}
class Aluno {
    private static int numeroDeAlunosCriados = 0;

    public Aluno() {
        numeroDeAlunosCriados++;
    }

    public static int getNumeroDeAlunosCriados() {
        return numeroDeAlunosCriados;
    }
}

