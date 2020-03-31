package br.com.band.AlimentacaoEstoque.dto;

public class UltimaExpDtoSaida {

	private String dataHoraUltExp;

	public String getDataHoraUltExp() {
		return dataHoraUltExp;
	}

	public void setDataHoraUltExp(String dataHoraUltExp) {
		this.dataHoraUltExp = dataHoraUltExp;
	}

	public UltimaExpDtoSaida() {

	}

	public UltimaExpDtoSaida(String dataHoraUltExp) {
		super();
		this.setDataHoraUltExp(dataHoraUltExp);
	}

}
