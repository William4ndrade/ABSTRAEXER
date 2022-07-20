package Abstracao.Ex4;

import java.util.Date;

public class Familia extends Contato{

    private String parentesco;

    public Familia(String apelido, String nome, String email, Date aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }


    public String getParentesco() {
        return parentesco;
    }

    @Override
    public void ImprimirContato() {
        super.ImprimirBasico();
        System.out.println("Parentesco: " + parentesco);
    }
}
