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
    public void testRemoverContato(){
        AgendaContatos agenda = new AgendaContatos();
        Contato c1 = new Contato("Carlos", "carlos@gmail.com", "394728379");
        Contato c2 = new Contato("Alice", "alice@gmail.com", "72837287");
        Contato c3 = new Contato("Silvio", "silvio@gmail.com" , "68263776");
        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);


        boolean removido = agenda.removerContato("Alice");
        assertNull(agenda.getContatoPorNome("Alice"));
    }
}
