import java.util.ArrayList;
import java.util.List;
public class AgendaContatos {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public int getTotalContatos() {
        return contatos.size();
    }

    public Contato getContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }



    public boolean removerContato(String nome){
        Contato busca = getContatoPorNome(nome);
        if (busca == null){
            return true;
        }
        else{
            contatos.remove(busca);
            return true;
        }
    }

}