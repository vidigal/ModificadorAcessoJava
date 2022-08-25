package pacote1;

// Modificadores de acesso públicos e privados
public class Pessoa {

    public int atributoPublico;
    private int atributoPrivado;
    protected int atributoProtected;
    int atributoPadrao;

//    public int calcularAnosParaAposentadoria() {
//        return 110 - this.idade;
//    }

    public void metodoNaPropriaClasse() {
        this.atributoPublico = 1;
        this.atributoPrivado = 1;
        this.atributoProtected = 1;
        this.atributoPadrao = 1;
    }

}
