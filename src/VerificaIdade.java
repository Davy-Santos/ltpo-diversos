public class VerificaIdade {

    private int idade;
    private String resultado;

    public VerificaIdade(int idade){
        this.idade = idade;
    }

    public String verificarIdade(){
        if(idade >= 18) {
            resultado = "Maior de idade!";
        } else {
            resultado = "Menor de idade!";
        }

        return resultado;

    }
}
