package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto objeto = new Produto();
		objeto.preencherCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
		objeto.preencherDescricao(JOptionPane.showInputDialog("Informe a Descrição"));
		objeto.preencherQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")));
		objeto.preencherValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da venda")));
		objeto.preencherValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de compra")));
		
		JOptionPane.showMessageDialog(null,
		"Codigo.......: " + objeto.retornarCodigo()      + "\n" +		
		"Descrição....: " + objeto.retornarDescricao()   + "\n" +
		"Qtde.........: " + objeto.retornarQtde()        + "\n" +
		"ValorVenda...: " + objeto.retornarValorVenda()  + "\n" +
		"ValorCompra..: " + objeto.retornarValorCompra()  );
		
		System.out.println("ValorTotalCompra..: " + objeto.retornarTotalCompra());
		System.out.println("ValorTotalVenda..: " + objeto.retornarTotalVenda());
		System.out.printf("Valor a Vista..: %.2f \n" , objeto.retornarValorVista());
		System.out.println("Valor da Parcela..: " + objeto.preencherQtdParcelas(3));
		objeto.atualizarValores(10);
		System.out.println("Novo valor Venda: " + objeto.retornarValorVenda());
		System.out.println("Nova valor Compra:" + objeto.retornarValorCompra());
		System.out.println("Valor a vista Minha porcentagem: " + objeto.retornarValorVista(20));
		
		
		
		
	}

	
}
