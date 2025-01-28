import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
    }
    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "PEDRO", "CAWAN", "LAURA", "RODRIGO",
                "VANIA" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}