package S.Antes;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataDeNascimento;
    private double salário;

    public void CalcularDescontosImpostoDeRenda(){
        if(this.salário <= 1100){
            this.salário -= this.salário * 7.5;
            return;
        }

        if(this.salário <= 2.203){
            this.salário -= this.salário * 9;
            return;
        }

        if(this.salário <= 3.305){
            this.salário -= this.salário * 12;
            return;
        }

        if(this.salário <= 6.433){
            this.salário -= this.salário * 14;
            return;
        }
    }


}
