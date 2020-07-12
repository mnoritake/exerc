package br.com.ecommerce.modelo;

public class Produto {

	private int codigo;
	private String descricao;
	private int qtde;
	private float valorVenda;
	private float valorCompra;
	
	// <modificador> <retorno> <nomeDoMetodo> (<tipoParametro> <nomedoParametro>...){}
	public void preencherCodigo(int pCodigo) {
		if (pCodigo >0) {
			codigo = pCodigo;
		}
	}
	public int retornarCodigo() {
		return codigo;
	}
	
	public void preencherDescricao(String pDescricao) {
		if (pDescricao.length() <=50) {
			descricao = pDescricao;
		}
	}
	public String retornarDescricao() {
		return descricao;
	}
	
	public void preencherQtde(int pQtde) {
		if (pQtde > 0) {
			qtde = pQtde;
		}
	}
	public int retornarQtde() {
		return qtde;
	}
	
	public void preencherValorVenda(float pValorVenda) {
		if (pValorVenda >= 0) {
			valorVenda = pValorVenda;
		}
	}
	public float retornarValorVenda() {
		return valorVenda;
	}
	public void preencherValorCompra(float pValorCompra) {
		if (pValorCompra >= 0) {
			valorCompra = pValorCompra;
		}
	}
	public float retornarValorCompra() {
		return valorCompra;
	}
	

	public float retornarTotalVenda() {
	return qtde * valorVenda;
	}


// Métodos para desenvolver:
//Crie o método retornarTotalCompra() => qtde * valorCompra
	public float retornarTotalCompra() {
	return qtde * valorCompra;
	}
	
//Crie o método retornarValorVista() =>
// deve retornar o valor de venda com 10% de desconto
	public float retornarValorVista() {
	return valorVenda * 0.9f;
	}	

//Crie o método retornarParcela() => irá receber a qtde de parcelas e
//irá retornar o valor de venda dividido pela quantidade de parcelas
	public float preencherQtdParcelas(int pQtdParcelas) {
		return valorVenda / pQtdParcelas;
		}
	
	
//> Crie o método atualizarValores() = irá receber uma porcentagem
// e irá aplicar, como aumento, a porcentagem no valorVenda e no valorCompra	
	public void atualizarValores(float pPorcentagem) {
		valorVenda=valorVenda + valorVenda * (pPorcentagem/100);
		valorCompra=valorCompra + valorCompra * (pPorcentagem/100);
	}		
// Crie o método retornarValorVista() => irá receber uma porcentagem e então
// irá retornar o valor de venda com o desconto da porcentagem recebida
		
		public float retornarValorVista(float pPorcentagem) {
			return valorVenda - valorVenda * (pPorcentagem/100);
	}




}
