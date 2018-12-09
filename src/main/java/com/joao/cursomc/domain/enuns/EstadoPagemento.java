package com.joao.cursomc.domain.enuns;

public enum EstadoPagemento {
	
	PENDENTE(1,"Pendente"),QUITADO(2,"Quitado"),CANCELADO(3,"Cancelado");
	
	private int cod;
	private String descricao;

	private EstadoPagemento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagemento toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (EstadoPagemento x : EstadoPagemento.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}
	
}
