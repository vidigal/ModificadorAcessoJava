package pacote2;

import pacote1.Pessoa;

// Método na subclasse, mas em pacotes diferentes
public class Funcionario extends Pessoa {

    public void metodoNaSubclasse() {
        this.atributoProtected = 1;
        this.atributoPublico = 1;
//        this.atributoPadrao = 1;
//        this.atributoPrivado = 1;
    }

}
