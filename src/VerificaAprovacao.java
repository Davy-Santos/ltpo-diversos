public class VerificaAprovacao {

    private int nota;
    private String resultado;

    public VerificaAprovacao(int nota) {
        this.nota = nota;
    }

        public String verificarNota() {

            if (nota >= 6) {
                resultado = "Aporovado!";
            } else if (nota >= 5){
                resultado = "Recuperação!";
            } else if (nota < 5){
            resultado = "Reprovado!";
        }
            return resultado;

        }
    }
    