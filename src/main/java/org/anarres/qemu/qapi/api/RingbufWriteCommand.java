package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=ringbuf-write, returns=null, data={device=str, data=str, *format=DataFormat}}
public class RingbufWriteCommand extends QApiCommand<RingbufWriteCommand.RingbufWriteArguments, Void> {
	public static class RingbufWriteArguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("data")
		@Nonnull public String data;
		@SerializedName("format")
		@CheckForNull public DataFormat format;
	}

	public RingbufWriteCommand(@Nonnull RingbufWriteCommand.RingbufWriteArguments argument) {
		super("ringbuf-write", new TypeToken<Void>() {}, argument);
	}
}