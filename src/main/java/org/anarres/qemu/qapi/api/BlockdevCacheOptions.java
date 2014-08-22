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
 * <p><pre>QApiTypeDescriptor{name=BlockdevCacheOptions, data={*writeback=bool, *direct=bool, *no-flush=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevCacheOptions, data={*writeback=bool, *direct=bool, *no-flush=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevCacheOptions extends QApiType {

	@JsonProperty("writeback")
	@CheckForNull
	public java.lang.Boolean writeback;
	@JsonProperty("direct")
	@CheckForNull
	public java.lang.Boolean direct;
	@JsonProperty("no-flush")
	@CheckForNull
	public java.lang.Boolean noFlush;

	@Nonnull
	public BlockdevCacheOptions withWriteback(java.lang.Boolean value) {
		this.writeback = value;
		return this;
	}

	@Nonnull
	public BlockdevCacheOptions withDirect(java.lang.Boolean value) {
		this.direct = value;
		return this;
	}

	@Nonnull
	public BlockdevCacheOptions withNoFlush(java.lang.Boolean value) {
		this.noFlush = value;
		return this;
	}

	public BlockdevCacheOptions() {
	}

	public BlockdevCacheOptions(java.lang.Boolean writeback, java.lang.Boolean direct, java.lang.Boolean noFlush) {
		this.writeback = writeback;
		this.direct = direct;
		this.noFlush = noFlush;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("writeback");
		names.add("direct");
		names.add("no-flush");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("writeback".equals(name))
			return writeback;
		if ("direct".equals(name))
			return direct;
		if ("no-flush".equals(name))
			return noFlush;
		return super.getFieldByName(name);
	}
}
