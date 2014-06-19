package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockDeviceStats, data={rd_bytes=int, wr_bytes=int, rd_operations=int, wr_operations=int, flush_operations=int, flush_total_time_ns=int, wr_total_time_ns=int, rd_total_time_ns=int, wr_highest_offset=int}, innerTypes=null, fields=null}
public class BlockDeviceStats extends QApiObject {

	@SerializedName("rd_bytes")
	@Nonnull public long rdBytes;
	@SerializedName("wr_bytes")
	@Nonnull public long wrBytes;
	@SerializedName("rd_operations")
	@Nonnull public long rdOperations;
	@SerializedName("wr_operations")
	@Nonnull public long wrOperations;
	@SerializedName("flush_operations")
	@Nonnull public long flushOperations;
	@SerializedName("flush_total_time_ns")
	@Nonnull public long flushTotalTimeNs;
	@SerializedName("wr_total_time_ns")
	@Nonnull public long wrTotalTimeNs;
	@SerializedName("rd_total_time_ns")
	@Nonnull public long rdTotalTimeNs;
	@SerializedName("wr_highest_offset")
	@Nonnull public long wrHighestOffset;
}