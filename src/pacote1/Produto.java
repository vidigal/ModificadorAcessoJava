package pacote1;

// Classe no mesmo pacote (mas não é subclasse)
public class Produto {

    public void metodoNoMesmoPacote() {
        Pessoa p = new Pessoa();
        p.atributoProtected = 1;
        p.atributoPublico = 1;
        p.atributoPadrao = 1;
        //p.atributoPrivado = 1;
    }

}
