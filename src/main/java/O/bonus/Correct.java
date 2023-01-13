interface Bonus {
    public BigDecimal calcular(BigDecimal salario)
}

class Estagiario implements Bonus {

    public BigDecimal calcular(BigDecimal salario) {
        //impl
    }

}

class FuncionarioClt implements Bonus {

    public BigDecimal calcular(BigDecimal salario) {
        //impl
    }

}

class FuncionarioPj implements Bonus {

    public BigDecimal calcular(BigDecimal salario) {
        //impl
    }

}

class Pagamento {

    public BigDecimal calcularBonus(Bonus bonus, BigDecimal salario) {
        return bonus.calcular(salario)
    }

}
