package br.com.band.AlimentacaoEstoque.dto;

public class VendasGeralDtoSaida {

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public long getQtde() {
		return qtde;
	}

	public void setQtde(long qtde) {
		this.qtde = qtde;
	}

	public long getCdprod() {
		return cdprod;
	}

	public void setCdprod(long cdprod) {
		this.cdprod = cdprod;
	}

	private String centro;
	private long qtde;
	private long cdprod;

	public VendasGeralDtoSaida() {

	}

	public VendasGeralDtoSaida(String centro, long cdprod, long qtde) {
		super();
		this.setCdprod(cdprod);
		this.setCentro(centro);
		this.setQtde(qtde);
	}

}
