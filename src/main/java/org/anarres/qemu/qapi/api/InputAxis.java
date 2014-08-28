package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=InputAxis, data=[X, Y], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=InputAxis, data=[X, Y], fields=null}
public enum InputAxis {
	// @JsonProperty("X")
	X("X"),
	// @JsonProperty("Y")
	Y("Y"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ InputAxis(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}