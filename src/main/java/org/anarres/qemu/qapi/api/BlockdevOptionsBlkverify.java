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
 * <p><pre>QApiTypeDescriptor{name=BlockdevOptionsBlkverify, data={test=BlockdevRef, raw=BlockdevRef}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevOptionsBlkverify, data={test=BlockdevRef, raw=BlockdevRef}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsBlkverify extends QApiType {

	@JsonProperty("test")
	@Nonnull
	public BlockdevRef test;
	@JsonProperty("raw")
	@Nonnull
	public BlockdevRef raw;

	@Nonnull
	public BlockdevOptionsBlkverify withTest(BlockdevRef value) {
		this.test = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBlkverify withRaw(BlockdevRef value) {
		this.raw = value;
		return this;
	}

	public BlockdevOptionsBlkverify() {
	}

	public BlockdevOptionsBlkverify(BlockdevRef test, BlockdevRef raw) {
		this.test = test;
		this.raw = raw;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("test");
		names.add("raw");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("test".equals(name))
			return test;
		if ("raw".equals(name))
			return raw;
		return super.getFieldByName(name);
	}
}
