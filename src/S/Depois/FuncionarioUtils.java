package S.Depois;

public class FuncionarioUtils {

    public int CalcularDescontosImpostoDeRenda(int salario){
        if(salario <= 1100){
            return salario -= salario * 7.5;
        }

        if(salario <= 2.203){
            return salario -= salario * 9;
        }

        if(salario <= 3.305){
            return salario -= salario * 12;
        }

        return salario -= salario * 14;
    }
}
