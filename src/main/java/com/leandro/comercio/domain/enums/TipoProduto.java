package com.leandro.comercio.domain.enums;

public enum TipoProduto {
	HIGIENICO(0,"ROLE_HIGIENICO"), ALIMENTICIO(1, "ROLE_ALIMENTICIO"), VESTUARIO(3, "ROLE_VESTUARIO");
	private Integer codigo;
	private String descricao;
	private TipoProduto(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public static TipoProduto toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(TipoProduto x: TipoProduto.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("TipoProduto inválido");
	}
}
