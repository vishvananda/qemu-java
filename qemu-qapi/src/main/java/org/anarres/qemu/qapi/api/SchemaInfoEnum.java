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
 * <pre>QApiTypeDescriptor{name=SchemaInfoEnum, data={values=[str]}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=SchemaInfoEnum, data={values=[str]}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SchemaInfoEnum extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("values")
	@Nonnull
	public java.util.List<java.lang.String> values;

	@Nonnull
	public SchemaInfoEnum withValues(java.util.List<java.lang.String> value) {
		this.values = value;
		return this;
	}

	public SchemaInfoEnum() {
	}

	public SchemaInfoEnum(java.util.List<java.lang.String> values) {
		this.values = values;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("values");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("values".equals(name))
			return values;
		return super.getFieldByName(name);
	}
}
