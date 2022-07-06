package Abstracao.Ex2;

public class ContaComum  extends ContaCorrente{

    private float limite;

    public ContaComum(float saldo, int numconta, int senha) {
        super(saldo, numconta, senha);
        limite = 0;
    }
}
