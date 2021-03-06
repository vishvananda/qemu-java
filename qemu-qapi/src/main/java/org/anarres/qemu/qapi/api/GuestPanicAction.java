package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=GuestPanicAction, data=[pause], fields=null}</pre>
 */
// QApiEnumDescriptor{name=GuestPanicAction, data=[pause], fields=null}
public enum GuestPanicAction {
	pause("pause"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ GuestPanicAction(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
