public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        String estadoAluno = nota >= 7 ? "Aprovado!" : "Reprovado!";

        System.out.println("O Aluno foi: ".concat(estadoAluno));

    }
}
