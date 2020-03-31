package br.com.band.AlimentacaoEstoque.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.band.AlimentacaoEstoque.dto.UltimaExpDtoSaida;
import br.com.band.AlimentacaoEstoque.dto.VendasDtoSaida;
import br.com.band.AlimentacaoEstoque.dto.VendasGeralDtoSaida;
import br.com.band.AlimentacaoEstoque.service.VendasSfcokeService;

import java.util.List;



@RestController
@RequestMapping("/dadosVendaSfcoke")
public class DadosVendasSfcokeResource {
	
	@Autowired
	private VendasSfcokeService vendasService;

	@GetMapping("/vendasSfcoke/{data}/{unidade}")
	public List<VendasDtoSaida> buscar(@PathVariable Long data,@PathVariable Long unidade) {	
		return vendasService.buscaVendasSfcokeService(data, unidade);
	}

	@GetMapping("/exportacaoWorkFlow/{data}/{unidade}")
	public List<UltimaExpDtoSaida> buscarUltimaExportacao(@PathVariable Long data,@PathVariable Long unidade) {	
		return vendasService.buscaUltimaExpService(data, unidade);
	}	
	
	@GetMapping("/vendasSfcokeGeral/{data}")
	public List<VendasGeralDtoSaida> buscarVendasGeral(@PathVariable Long data) {	
		return vendasService.buscarVendasGeralService(data);
	}
}
