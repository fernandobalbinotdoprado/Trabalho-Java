import java.util.ArrayList;
import java.util.List;

// .
public class Ex4 {
    static class Aluno {

        private String nome;
        private int idade;

        Aluno(String nome, int idade) {
            this.idade = idade;
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Aluno: " + nome + "\nIdade: " + idade;
        }
    }

        public static void main(String[] args) {
            List<Aluno> alunos = new ArrayList<>();

            alunos.add(new Aluno("Adriana",19));
            alunos.add(new Aluno("André",20));
            alunos.add(new Aluno("Miguel",23));

            System.out.println("===for convencional===");
            for (int i=0; i < alunos.size(); i++) {
                System.out.println(alunos.get(i));
            }
            System.out.println("===for aprimorado===");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
            System.out.println("===forEach funcional===");
            alunos.forEach(aluno -> System.out.println(aluno));

        }
        }
