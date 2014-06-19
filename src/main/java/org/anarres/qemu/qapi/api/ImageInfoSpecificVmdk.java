package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ImageInfoSpecificVmdk, data={create-type=str, cid=int, parent-cid=int, extents=[ImageInfo]}, innerTypes=null, fields=null}
public class ImageInfoSpecificVmdk extends QApiObject {

	@SerializedName("create-type")
	@Nonnull public String createType;
	@SerializedName("cid")
	@Nonnull public long cid;
	@SerializedName("parent-cid")
	@Nonnull public long parentCid;
	@SerializedName("extents")
	@Nonnull public List<ImageInfo> extents;
}