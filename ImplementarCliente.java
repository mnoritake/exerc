package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;

public class ImplementarCliente {

	public static void main(String[] args) {
		Cliente objeto = new Cliente();

		objeto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código")) , 
				JOptionPane.showInputDialog("Digite o nome").toUpperCase(), 
				JOptionPane.showInputDialog("Digite o email").toLowerCase(), 
				JOptionPane.showInputDialog("Digite o telefone"),
				JOptionPane.showInputDialog("Digite o cpf"),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o limite")));
		

		
		System.out.println(objeto.getAll());
	}

}
