package Abstracao.Ex3;

import Abstracao.Ex2.ContaComum;
import Abstracao.Ex2.ContaCorrente;
import Abstracao.Ex2.ContaEspecial;

public class UsaBanco {


    public static void main(String[] args) {
        ContaCorrente c = new ContaComum(2000, 300, 123);
        ContaCorrente c1 = new ContaEspecial(2000, 300, 123, 123312);

        c1.debitaValor(2000, 123);
        c1.printEstado();

        c.debitaValor(2000, 123);
        c.printEstado();

    }
}
