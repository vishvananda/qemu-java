package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=cpu-add, returns=null, data={id=int}}
public class CpuAddCommand extends QApiCommand<CpuAddCommand.CpuAddArguments, Void> {
	public static class CpuAddArguments {
		@SerializedName("id")
		@Nonnull public long id;
	}

	public CpuAddCommand(@Nonnull CpuAddCommand.CpuAddArguments argument) {
		super("cpu-add", new TypeToken<Void>() {}, argument);
	}
}