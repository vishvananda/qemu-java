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
 * <p><pre>QApiUnionDescriptor{name=SocketAddress, data={inet=InetSocketAddress, unix=UnixSocketAddress, fd=String}, innerTypes=null, fields=null, discriminatorField=null}</pre></p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SocketAddress extends QApiType implements QApiUnion {
	public static enum Discriminator {
		inet,
		unix,
		fd,
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
	@JsonProperty("inet")
	@JsonUnwrapped
	@CheckForNull
	public InetSocketAddress inet;
	@JsonProperty("unix")
	@JsonUnwrapped
	@CheckForNull
	public UnixSocketAddress unix;
	@JsonProperty("fd")
	@JsonUnwrapped
	@CheckForNull
	public String fd;
	// }

	@Nonnull
	public static SocketAddress inet(@Nonnull InetSocketAddress inet) {
		SocketAddress self = new SocketAddress();
		self.type = Discriminator.inet;
		self.inet = inet;
		return self;
	}

	@Nonnull
	public static SocketAddress unix(@Nonnull UnixSocketAddress unix) {
		SocketAddress self = new SocketAddress();
		self.type = Discriminator.unix;
		self.unix = unix;
		return self;
	}

	@Nonnull
	public static SocketAddress fd(@Nonnull String fd) {
		SocketAddress self = new SocketAddress();
		self.type = Discriminator.fd;
		self.fd = fd;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("inet");
		names.add("unix");
		names.add("fd");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("inet".equals(name))
			return inet;
		if ("unix".equals(name))
			return unix;
		if ("fd".equals(name))
			return fd;
		return super.getFieldByName(name);
	}

	@Override
	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (inet != null)
			count++;
		if (unix != null)
			count++;
		if (fd != null)
			count++;
		return (count == 1);
	}
}
