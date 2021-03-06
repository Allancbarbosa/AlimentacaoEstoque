package br.com.band.AlimentacaoEstoque.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.band.AlimentacaoEstoque.dto.VendasDtoSaida;

@Repository
public class Vendas {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<VendasDtoSaida> buscaVendas(Long data, Long unidade) {

		List<VendasDtoSaida> list = jdbcTemplate.query(" SELECT I.CDPROD AS PRODUTO,SUM(I.QTDNEG)  AS QTDE "
				+ " FROM TAFCAB C,TAFITE I,DW_TAFCLI K " + " WHERE  C.NUPED = I.NUPED " + " AND C.IDIAE <> 'E' "
				+ " AND C.IDENIM = 0 " + " AND K.CDCL = C.CDCL " + " AND TO_CHAR(C.DTFATU,'YYYYMMDD') = " + data
				+ " AND C.CDCFO IN (SELECT DISTINCT DCD.DCD_QTD_DIAS AS OP_FISCAL FROM DW_CONF_DIAS DCD WHERE DCD.DCD_DESC = 'OP. FISCAL CORTE') "
				+ " AND K.REBICMARLOC IN (SELECT U.CD_REBICMARLOC FROM SFCOKE_2.CDUNID_ESTOQUE U WHERE U.CD_CDUNOR ="
				+ unidade + ")"
				+ " AND c.nuped_band  NOT IN (SELECT DISTINCT SPD.spd_nr_pedido FROM  saib_pedido_db2_log SPD  "
				+ "                           WHERE  SPD.spd_cdunpr_exportacao IN (SELECT S.cd_rebicmarloc "
				+ "     				                                  FROM   SFCOKE_2.CDUNID_ESTOQUE S "
				+ "     				                                  WHERE  S.cd_cdunor =" + unidade + ")"
				+ " AND to_char(spd.spd_dta_exportacao,'YYYYMMDD') = " + data + ") " + " GROUP BY I.CDPROD ",
				(rs, rowNum) -> new VendasDtoSaida(rs.getLong("CDPROD"), rs.getLong("QTDE")));
		return list;
	}

}
