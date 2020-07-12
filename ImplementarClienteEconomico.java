package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.tela.Magica;

public class ImplementarClienteEconomico {
	
	
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente(
				Magica.i(JOptionPane.showInputDialog("Código")),
				Magica.t("Nome").toUpperCase(),
				Magica.t("Email").toLowerCase(),
				Magica.t("Fone"),
				Magica.t("CPF"),
				Magica.f(JOptionPane.showInputDialog("Limite"))
				);
/*System.out.println(cliente.getAll());*/
/*		Integer.parseInt(JOptionPane.showInputDialog("Código")),
		JOptionPane.showInputDialog("Nome").toUpperCase(),
		JOptionPane.showInputDialog("Email").toLowerCase(),
		JOptionPane.showInputDialog("Fone"),
		JOptionPane.showInputDialog("CPF"),
		Float.parseFloat(JOptionPane.showInputDialog("Limite"))
		).getAll());*/				
				
	}}
