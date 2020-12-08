package solid.to.refactor.sip.corrigido;

public class Desenvolvedor extends Funcionario{
    @override
    double calcularSalario(){
        return super.getSalarioBase()*1.1;
    }
}