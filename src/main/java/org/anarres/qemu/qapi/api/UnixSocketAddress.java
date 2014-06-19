package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=UnixSocketAddress, data={path=str}, innerTypes=null, fields=null}
public class UnixSocketAddress extends QApiObject {

	@SerializedName("path")
	@Nonnull public String path;
}