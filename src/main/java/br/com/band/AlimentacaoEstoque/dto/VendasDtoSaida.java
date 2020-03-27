package br.com.band.AlimentacaoEstoque.dto;

public class VendasDtoSaida {

	private long codProd;
	private long qtde;

	public long getCodProd() {
		return codProd;
	}

	public void setCodProd(long codProd) {
		this.codProd = codProd;
	}

	public long getQtde() {
		return qtde;
	}

	public void setQtde(long qtde) {
		this.qtde = qtde;
	}

	public VendasDtoSaida() {

	}

	public VendasDtoSaida(Long codprod, long qtde) {
		super();
		this.setCodProd(codprod);
		this.setQtde(qtde);

	}

}
