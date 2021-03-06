package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BlockdevDriver, data=[archipelago, blkdebug, blkverify, bochs, cloop, dmg, file, ftp, ftps, host_cdrom, host_device, http, https, null-aio, null-co, parallels, qcow, qcow2, qed, quorum, raw, tftp, vdi, vhdx, vmdk, vpc, vvfat], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BlockdevDriver, data=[archipelago, blkdebug, blkverify, bochs, cloop, dmg, file, ftp, ftps, host_cdrom, host_device, http, https, null-aio, null-co, parallels, qcow, qcow2, qed, quorum, raw, tftp, vdi, vhdx, vmdk, vpc, vvfat], fields=null}
public enum BlockdevDriver {
	archipelago("archipelago"),
	blkdebug("blkdebug"),
	blkverify("blkverify"),
	bochs("bochs"),
	cloop("cloop"),
	dmg("dmg"),
	file("file"),
	ftp("ftp"),
	ftps("ftps"),
	host_cdrom("host_cdrom"),
	host_device("host_device"),
	http("http"),
	https("https"),
	null_aio("null-aio"),
	null_co("null-co"),
	parallels("parallels"),
	qcow("qcow"),
	qcow2("qcow2"),
	qed("qed"),
	quorum("quorum"),
	raw("raw"),
	tftp("tftp"),
	vdi("vdi"),
	vhdx("vhdx"),
	vmdk("vmdk"),
	vpc("vpc"),
	vvfat("vvfat"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockdevDriver(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
