package Abstracao.Ex2;

public class ContaEspecial extends ContaCorrente {

    private float limite;


    public ContaEspecial(float saldo, int numconta, int senha, float limite) {
        super(saldo, numconta, senha);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor(float val, int senha){
        if(isSenha(senha)){
            return false;
        }
        if(this.getEstado(senha) != 1) return false;
        if(val<=0) return false;
        if(val > this.getSaldo(senha)) return false;
        debitaValor(val);
        return true;

    }



}

