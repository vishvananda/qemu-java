package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=ObjectPropertyInfo, data={name=str, type=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=ObjectPropertyInfo, data={name=str, type=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ObjectPropertyInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;

	@Nonnull
	public ObjectPropertyInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public ObjectPropertyInfo withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	public ObjectPropertyInfo() {
	}

	public ObjectPropertyInfo(java.lang.String name, java.lang.String type) {
		this.name = name;
		this.type = type;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("name");
		names.add("type");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("name".equals(name))
			return name;
		if ("type".equals(name))
			return type;
		return super.getFieldByName(name);
	}
}
