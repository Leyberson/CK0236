package solid.to.refactor.sip.corrigido;

public class Gerente extends Funcionario{
    @override
    double calcularSalario(){
        return super.getSalarioBase()*1.3;
    }
}