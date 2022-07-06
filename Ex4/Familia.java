package Abstracao.Ex4;

import java.util.Date;

public class Familia extends Contato{

    private String parentesco;

    public Familia(String apelido, String nome, String email, Date aniversario) {
        super(apelido, nome, email, aniversario);
    }

    @Override
    public void ImprimirContato() {
        super.ImprimirBasico();
        System.out.println("Parentesco: " + parentesco);
    }
}
