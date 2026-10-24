import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertEquals(0.0, aulas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    @Test
    void testePersonal() {
        Personal personal = new Personal("Ana", "P001");
        double aulas = personal.addAulaAvulsa(1.0);
        double ultimoPagamento = personal.registrarPagamento();
        assertEquals(3687.45, ultimoPagamento,"o pagamento deveria dar R$3687.45");
    }

    @Test
    void testePersonal2() {
        Personal personal = new Personal("Ana", "P001");
        double aulasAvulsas = personal.addAulaAvulsa(999);
        assertEquals(0, aulasAvulsas,"o numero de aulas avulsas adcionadas ultrapassa o limite, o numero de aulas retornadas deve ser 0");
    }


    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
