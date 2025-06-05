package entities;

public class Gerente extends Funcionario {
    
    private Double bonus;
    
    public Gerente() {}
    
    public Gerente(String nome, Double salario, Double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + getBonus();
    }
}
