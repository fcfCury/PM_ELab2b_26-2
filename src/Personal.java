/**
 * Personal trainer (regime CLT): salário base + aulas avulsas.
 */
public class Personal extends Profissional {
    private static final double SALARIO_PERSONAL = 3627.0;
    private static final double FRACAO_AULA = 1.0 / 60.0;
    private static final int MAX_AULAS_AVULSAS = 30;

    private double aulasAvulsas;

    public Personal(String nome, String registro) {
        super(nome, registro);
        this.aulasAvulsas = 0.0;
    }

    /**
     * Valor devido pelas aulas avulsas: aulasAvulsas × SALARIO_PERSONAL × FRACAO_AULA.
     */
    private double valorAulasAvulsas() {
        return aulasAvulsas * SALARIO_PERSONAL * FRACAO_AULA;
    }

    /**
     * Acrescenta aulas avulsas, respeitando o máximo mensal.
     * @return a quantidade efetiva de aulas avulsas após a operação
     */
    public double addAulaAvulsa(double quantidade) {
        
        if (aulasAvulsas + quantidade <= MAX_AULAS_AVULSAS && quantidade > 0) {
            aulasAvulsas += quantidade;    
        }
        return aulasAvulsas;
    }

    /**
     * Pagamento = salário base + valor das aulas avulsas.
     * Após o pagamento, as aulas avulsas devem ser zeradas.
     * O valor total deve ser guardado em ultimoPagamento.
     */
    @Override
    public double registrarPagamento() {
        
        ultimoPagamento = SALARIO_PERSONAL + (FRACAO_AULA*SALARIO_PERSONAL)*aulasAvulsas;
        aulasAvulsas = 0;
        return ultimoPagamento;
    }

    @Override
    public String toString() {
        return "Personal " + super.toString() + " | aulasAvulsas=" + aulasAvulsas;
    }
}
