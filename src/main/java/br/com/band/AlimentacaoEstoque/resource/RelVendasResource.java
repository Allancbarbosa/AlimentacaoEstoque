package br.com.band.AlimentacaoEstoque.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.band.AlimentacaoEstoque.dto.VendasDtoSaida;
import br.com.band.AlimentacaoEstoque.service.VendasService;



@RestController
@RequestMapping("/relvendas")
public class RelVendasResource {
	
	@Autowired
	private VendasService vendasService;


	@GetMapping("/{data}/{unidade}")
	public VendasDtoSaida buscar(@PathVariable Long data,@PathVariable Long unidade) {	
		return vendasService.buscaVendas(data, unidade);


	}

}
