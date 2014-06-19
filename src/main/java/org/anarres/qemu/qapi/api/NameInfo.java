package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NameInfo, data={*name=str}, innerTypes=null, fields=null}
public class NameInfo extends QApiObject {

	@SerializedName("name")
	@CheckForNull public String name;
}