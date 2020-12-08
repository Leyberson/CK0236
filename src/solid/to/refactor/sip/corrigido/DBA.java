package solid.to.refactor.sip.corrigido;

public class DBA extends Funcionario{
    @override
    double calcularSalario(){
        return super.getSalarioBase()*1.2;
    }
}