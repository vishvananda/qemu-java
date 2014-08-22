package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiUnionDescriptor{name=TpmTypeOptions, data={passthrough=TPMPassthroughOptions}, innerTypes=null, fields=null, discriminatorField=null}</pre></p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TpmTypeOptions extends QApiType implements QApiUnion {
	public static enum Discriminator {
		passthrough,
		__NONE;
	}

	@Nonnull
	@JsonProperty("type")
	public Discriminator type;

	@Nonnull
	public final Discriminator getType() {
		return type;
	}

	// union {
	@JsonProperty("passthrough")
	@JsonUnwrapped
	@CheckForNull
	public TPMPassthroughOptions passthrough;
	// }

	@Nonnull
	public static TpmTypeOptions passthrough(@Nonnull TPMPassthroughOptions passthrough) {
		TpmTypeOptions self = new TpmTypeOptions();
		self.type = Discriminator.passthrough;
		self.passthrough = passthrough;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("passthrough");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("passthrough".equals(name))
			return passthrough;
		return super.getFieldByName(name);
	}

	@Override
	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (passthrough != null)
			count++;
		return (count == 1);
	}
}
