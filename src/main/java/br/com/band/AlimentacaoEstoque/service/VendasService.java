package br.com.band.AlimentacaoEstoque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.band.AlimentacaoEstoque.dto.VendasDtoSaida;
import br.com.band.AlimentacaoEstoque.repository.Vendas;

@Service
public class VendasService {

	public VendasDtoSaida buscaVendas(Long data, Long unidade) {
		List<VendasDtoSaida> vendasDtoSaida = null;
		Vendas vendas = new Vendas();
		vendasDtoSaida = vendas.buscaVendas(data,unidade);			
		return (VendasDtoSaida) vendasDtoSaida;
	}
	

}
