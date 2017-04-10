package AgendaEletronica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class agendaEletronica {

	private List<Contatos> contatos;
	
	public agendaEletronica(List<Contatos> contatos){
		this.contatos = contatos;
	}
	
	public void addContato(Contatos c){
		contatos.add(c);
	}
	
	public boolean removeContato(Contatos c){
		return contatos.remove(c);
	}
	
	public void removerContato(String id){
		Iterator<Contatos> i = contatos.iterator();
		while(i.hasNext()){
			Contatos n = i.next();
			if (n.getNome().contains(id)){
				contatos.remove(n);
			}
		}
	}
	
	public List<Contatos> listarContatos(String id){
		List<Contatos> temp = new ArrayList<Contatos>();
		for (int i = 0; i < contatos.size(); i++){
			if (contatos.get(i).getNome().contains(id)){
				temp.add(contatos.get(i));
			}
		}
		return temp;
	}
}