
package com.github.willmont1982.clientemanager.core.model;

import java.io.Serializable;

public interface IEntidade<T> extends Serializable {

	abstract T getId();
}
