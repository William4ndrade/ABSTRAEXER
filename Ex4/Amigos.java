package Abstracao.Ex4;

import java.util.Date;

public class Amigos extends  Contato{

    private int grau;

    public Amigos(String apelido, String nome, String email, Date aniversario) {
        super(apelido, nome, email, aniversario);
    }

    @Override
    public void ImprimirContato() {
        super.ImprimirBasico();
        System.out.println("Grau: " + grau);
    }
}
