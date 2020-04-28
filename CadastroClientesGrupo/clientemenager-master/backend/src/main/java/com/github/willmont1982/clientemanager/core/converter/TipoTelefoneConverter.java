package com.github.willmont1982.clientemanager.core.converter;

import java.util.Objects;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.github.willmont1982.clientemanager.core.enums.TipoTelefone;


@Converter(autoApply = true)
public class TipoTelefoneConverter implements AttributeConverter<TipoTelefone, Integer> {

	@Override
	public Integer convertToDatabaseColumn(TipoTelefone attribute) {
		if (Objects.nonNull(attribute))
			return attribute.getValor();
		return null;
	}

	@Override
	public TipoTelefone convertToEntityAttribute(Integer attribute) {
		if (Objects.nonNull(attribute))
			return TipoTelefone.fromValor(attribute);
		return null;
	}

}
