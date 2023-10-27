import org.junit.Test;

import static org.junit.Assert.*;

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
    @Test
    public void testBuscarContatos() {
        AgendaContatos agenda = new AgendaContatos();
        Contato contato1 = new Contato("José", "jose@email.com", "1234567890");
        Contato contato2 = new Contato("Bell", "bell@email.com", "0987654321");
        Contato contato3 = new Contato("Diogo", "diogo@email.com", "5432167890");
        Contato contato4 = new Contato("Gabriel", "gabriel@email.com", "6789054321");
        Contato contato5 = new Contato("Maria", "maria@email.com", "1234509876");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        agenda.adicionarContato(contato4);
        agenda.adicionarContato(contato5);

        assertEquals(5, agenda.getTotalContatos());
        assertEquals(contato2, agenda.buscarContato("Bell"));
        assertNull(agenda.buscarContato("Matheus"));
    }
}
