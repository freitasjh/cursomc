package com.joao.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.joao.cursomc.domain.enuns.EstadoPagemento;


@Entity
public class PagamentoComBoleto extends Pagamento {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoComBoleto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagamentoComBoleto(Integer id, EstadoPagemento estado, Pedido pedido, Date dataVencimento,
			Date dataPagemento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagemento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
