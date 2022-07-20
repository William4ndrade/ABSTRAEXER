package Abstracao.Ex4;

import java.util.Date;

public class Trabalho extends Contato {

    private String tipo;

    public Trabalho(String apelido, String nome, String email, Date aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void ImprimirContato() {
        super.ImprimirBasico();
        System.out.println("Tipo: " + tipo);
    }
}
