public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;

        String estadoAluno = nota >= 7 ? "Aprovado!" : nota >= 5 ? "Recuperação!" : "Reprovado";

        System.out.println("O Aluno foi: ".concat(estadoAluno));

    }
}
