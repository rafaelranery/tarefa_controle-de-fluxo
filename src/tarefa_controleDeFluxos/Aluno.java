package tarefa_controleDeFluxos;

public class Aluno {
    public void validarMedia(Double media) {
        if (media < 0 || media > 10) {
            System.out.println("Ocorreu um erro na validação da média, tente novamente.");
            return;
        }

        System.out.println("\nMédia final: " + media + ".\n");
        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else if (media >= 5) {
            System.out.println("ALUNO EM RECUPERAÇÃO");
        } else {
            System.out.println("ALUNO REPROVADO");
        }

    }

    public void calcularMediaFinal() {
        Calculadora c = new Calculadora();

        Double[] notas = c.receberQuatroNotas();
        Double media = c.calcularMedia(notas);

        validarMedia(media);
    }
}
