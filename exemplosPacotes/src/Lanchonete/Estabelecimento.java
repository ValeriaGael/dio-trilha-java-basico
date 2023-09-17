package Lanchonete;

import Lanchonete.areaCliente.Cliente;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
				
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
				
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
				
	}
}
