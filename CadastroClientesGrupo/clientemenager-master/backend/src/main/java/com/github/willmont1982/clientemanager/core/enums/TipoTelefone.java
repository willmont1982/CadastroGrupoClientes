package com.github.willmont1982.clientemanager.core.enums;

import java.util.Objects;


public enum TipoTelefone {

	RESIDENCIAL(1), COMERCIAL(2), CELULAR(3);

	private Integer valor;

	TipoTelefone(Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}
	
	public static TipoTelefone fromValor(Integer valor) {
		if (Objects.nonNull(valor)) {
			for (TipoTelefone t : TipoTelefone.values()) {
				if (t.getValor().equals(valor)) {
					return t;
				}
			}
		}
		return null;
	}

}
