class Incorrect {

    private BigDecimal bonus;

    public void calcular(Contrato contrato, salario BigDecimal) BigDecimal {
        if(contrato instanceof Contrato.ESTAGIO) {
            return Estagiario().calcular(salario)
        } else if(contrato instanceof Contrato.PJ) {
            return FuncionarioPj().calcular(salario)
        } else if(contrato instanceof Contrato.CLT) {
            return FuncionarioClt().calcular(salario)
        }
    }
}

class Estagiario {
    public BigDecimal calcular(BigDecimal salario) {
        //impl
    }
}

class FuncionarioClt {
    public BigDecimal calcular(BigDecimal salario) {
        //impl
    }
}

class FuncionarioPj {
    public BigDecimal calcular(BigDecimal salario) {
        //impl
    }
}