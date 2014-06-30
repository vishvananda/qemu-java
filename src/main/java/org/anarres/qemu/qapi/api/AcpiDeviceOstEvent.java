package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=ACPI_DEVICE_OST, data={info=ACPIOSTInfo}}
public class AcpiDeviceOstEvent extends QApiEvent {
	@SerializedName("info")
	@Nonnull public ACPIOSTInfo info;
}