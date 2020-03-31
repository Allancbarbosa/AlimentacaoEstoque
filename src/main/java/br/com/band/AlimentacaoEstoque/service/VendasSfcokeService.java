package br.com.band.AlimentacaoEstoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.band.AlimentacaoEstoque.dto.UltimaExpDtoSaida;
import br.com.band.AlimentacaoEstoque.dto.VendasDtoSaida;
import br.com.band.AlimentacaoEstoque.dto.VendasGeralDtoSaida;
import br.com.band.AlimentacaoEstoque.repository.VendasSfcokeDao;

@Service
public class VendasSfcokeService {
	
	@Autowired
	private VendasSfcokeDao vendas;

	public List<VendasDtoSaida> buscaVendasSfcokeService(Long data, Long unidade) {				
		return vendas.buscaVendasSfcokeDao(data,unidade);	
	}

	public List<UltimaExpDtoSaida> buscaUltimaExpService(Long data, Long unidade) {		
		return vendas.buscaUltExpDao(data,unidade);	
	}

	public List<VendasGeralDtoSaida> buscarVendasGeralService(Long data) {
		return vendas.buscarVendasGeralDao(data);	
	}
	

}
