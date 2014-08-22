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
 * <p><pre>QApiTypeDescriptor{name=AddfdInfo, data={fdset-id=int, fd=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=AddfdInfo, data={fdset-id=int, fd=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddfdInfo extends QApiType {

	@JsonProperty("fdset-id")
	@Nonnull
	public long fdsetId;
	@JsonProperty("fd")
	@Nonnull
	public long fd;

	@Nonnull
	public AddfdInfo withFdsetId(long value) {
		this.fdsetId = value;
		return this;
	}

	@Nonnull
	public AddfdInfo withFd(long value) {
		this.fd = value;
		return this;
	}

	public AddfdInfo() {
	}

	public AddfdInfo(long fdsetId, long fd) {
		this.fdsetId = fdsetId;
		this.fd = fd;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("fdset-id");
		names.add("fd");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("fdset-id".equals(name))
			return fdsetId;
		if ("fd".equals(name))
			return fd;
		return super.getFieldByName(name);
	}
}
