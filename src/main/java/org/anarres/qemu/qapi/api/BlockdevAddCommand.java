package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=blockdev-add, returns=null, data={options=BlockdevOptions}}</pre></p>
 */
// QApiCommandDescriptor{name=blockdev-add, returns=null, data={options=BlockdevOptions}}
public class BlockdevAddCommand extends QApiCommand<BlockdevAddCommand.Arguments, BlockdevAddCommand.Response> {
	/** Compound arguments to a BlockdevAddCommand. */
	public static class Arguments {

		@SerializedName("options")
		@Nonnull
		public BlockdevOptions options;

		public Arguments() {
		}

		public Arguments(BlockdevOptions options) {
			this.options = options;
		}
	}

	/** Response to a BlockdevAddCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockdevAddCommand. */
	public BlockdevAddCommand(@Nonnull BlockdevAddCommand.Arguments argument) {
		super("blockdev-add", Response.class, argument);
	}

	/** Constructs a new BlockdevAddCommand. */
	public BlockdevAddCommand(BlockdevOptions options) {
		this(new Arguments(options));
	}
}