package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block_passwd, returns=null, data={*device=str, *node-name=str, password=str}}
public class BlockPasswdCommand extends QApiCommand<BlockPasswdCommand.BlockPasswdArguments, Void> {
	public static class BlockPasswdArguments {
		@SerializedName("device")
		@CheckForNull public String device;
		@SerializedName("node-name")
		@CheckForNull public String nodeName;
		@SerializedName("password")
		@Nonnull public String password;
	}

	public BlockPasswdCommand(@Nonnull BlockPasswdCommand.BlockPasswdArguments argument) {
		super("block_passwd", new TypeToken<Void>() {}, argument);
	}
}