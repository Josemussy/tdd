import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AgendaContatosTest {

    @Test
    public void testAdicionarContato() {
        AgendaContatos agenda = new AgendaContatos();
        Contato contato = new Contato("José", "jose@email.com", "1234567890");
        agenda.adicionarContato(contato);

        assertEquals(1, agenda.getTotalContatos());
        Contato contatoObtido = agenda.getContatoPorNome("José");
        assertNotNull(contatoObtido);
        assertEquals("jose@email.com", contatoObtido.getEmail());
    }
}
