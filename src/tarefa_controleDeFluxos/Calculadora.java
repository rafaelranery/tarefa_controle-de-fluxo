package tarefa_controleDeFluxos;

import java.util.Scanner;

public class Calculadora {

    /**
     * @deprecated
     */
    public Double calcularMedia(double n1, double n2, double n3, double n4) {
        Double media = ((n1 + n2 + n3 + n4) / 4);

        return media;
    }

    public Double calcularMedia(Double[] notas) {
        Double totalNotas = 0d;

        for(int i = 0; i < notas.length; i++) {
            totalNotas += notas[i];
        }

        Double media = totalNotas / notas.length;

        return media;
    }

    public Double[] receberQuatroNotas() {
        Double[] notas = new Double[4];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < notas.length; i++) {
            Double nota;

            do {
                System.out.println("\nInsira a " + (i + 1) + "° nota: ");
                nota = s.nextDouble();

                if(nota < 0 || nota > 10) {
                    System.out.println("Nota inválida.");
                }
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
        }

        return notas;
    }
}
