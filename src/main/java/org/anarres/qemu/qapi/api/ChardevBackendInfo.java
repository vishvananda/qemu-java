package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=ChardevBackendInfo, data={name=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevBackendInfo, data={name=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevBackendInfo extends QApiType {

	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;

	@Nonnull
	public ChardevBackendInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	public ChardevBackendInfo() {
	}

	public ChardevBackendInfo(java.lang.String name) {
		this.name = name;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("name");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("name".equals(name))
			return name;
		return super.getFieldByName(name);
	}
}
