package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=SnapshotInfo, data={id=str, name=str, vm-state-size=int, date-sec=int, date-nsec=int, vm-clock-sec=int, vm-clock-nsec=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=SnapshotInfo, data={id=str, name=str, vm-state-size=int, date-sec=int, date-nsec=int, vm-clock-sec=int, vm-clock-nsec=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SnapshotInfo extends QApiType {

	@JsonProperty("id")
	@Nonnull
	public java.lang.String id;
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@JsonProperty("vm-state-size")
	@Nonnull
	public long vmStateSize;
	@JsonProperty("date-sec")
	@Nonnull
	public long dateSec;
	@JsonProperty("date-nsec")
	@Nonnull
	public long dateNsec;
	@JsonProperty("vm-clock-sec")
	@Nonnull
	public long vmClockSec;
	@JsonProperty("vm-clock-nsec")
	@Nonnull
	public long vmClockNsec;

	@Nonnull
	public SnapshotInfo withId(java.lang.String value) {
		this.id = value;
		return this;
	}

	@Nonnull
	public SnapshotInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public SnapshotInfo withVmStateSize(long value) {
		this.vmStateSize = value;
		return this;
	}

	@Nonnull
	public SnapshotInfo withDateSec(long value) {
		this.dateSec = value;
		return this;
	}

	@Nonnull
	public SnapshotInfo withDateNsec(long value) {
		this.dateNsec = value;
		return this;
	}

	@Nonnull
	public SnapshotInfo withVmClockSec(long value) {
		this.vmClockSec = value;
		return this;
	}

	@Nonnull
	public SnapshotInfo withVmClockNsec(long value) {
		this.vmClockNsec = value;
		return this;
	}

	public SnapshotInfo() {
	}

	public SnapshotInfo(java.lang.String id, java.lang.String name, long vmStateSize, long dateSec, long dateNsec, long vmClockSec, long vmClockNsec) {
		this.id = id;
		this.name = name;
		this.vmStateSize = vmStateSize;
		this.dateSec = dateSec;
		this.dateNsec = dateNsec;
		this.vmClockSec = vmClockSec;
		this.vmClockNsec = vmClockNsec;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("id");
		names.add("name");
		names.add("vm-state-size");
		names.add("date-sec");
		names.add("date-nsec");
		names.add("vm-clock-sec");
		names.add("vm-clock-nsec");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("id".equals(name))
			return id;
		if ("name".equals(name))
			return name;
		if ("vm-state-size".equals(name))
			return vmStateSize;
		if ("date-sec".equals(name))
			return dateSec;
		if ("date-nsec".equals(name))
			return dateNsec;
		if ("vm-clock-sec".equals(name))
			return vmClockSec;
		if ("vm-clock-nsec".equals(name))
			return vmClockNsec;
		return super.getFieldByName(name);
	}
}
