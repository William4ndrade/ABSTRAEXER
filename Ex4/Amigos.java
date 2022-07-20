package Abstracao.Ex4;

import java.util.Date;

public class Amigos extends  Contato{

    private int grau;

    public Amigos(String apelido, String nome, String email, Date aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    @Override
    public void ImprimirContato() {
        super.ImprimirBasico();
        System.out.println("Grau: " + grau);
    }
}
