package Abstracao.Ex2;

public abstract class ContaCorrente {

   private float saldo;
   private int estado;
   private int numconta;
   private int senha;

    public ContaCorrente(float saldo, int numconta, int senha) {
        this.saldo = saldo;
        this.estado = 1;
        this.numconta = numconta;
        this.senha = senha;
    }


    public boolean debitaValor(float val, int senha){
        if(senha != senha){
            return false;
        }
        if(estado != 1) return false;
        if(val<=0) return false;
        if(val > saldo) return false;
        saldo -= val;
        if(saldo == 0) estado = 2;
        return true;

    }


    public void debitaValor(float val){
        saldo -= val;
    }

    public float getSaldo(int senha ){
        if(senha == this.senha ) return saldo;
        else return -1;
    }

    public void creditaValor(int senha, float val){
        if(senha == this.senha) saldo += val;
    }

    protected int getEstado(int senha){
        if(senha == this.senha) return estado;
        else return -1;

    }

    protected void SetEstado(int senha, int e){
        if(senha == this.senha){
            estado = e;
        }
    }

    public void printEstado(){
        System.out.println(this.estado);
    }

    protected boolean isSenha(int senha){
        if(senha == this.senha){
            return true;
        }

        return false;
    }


}
