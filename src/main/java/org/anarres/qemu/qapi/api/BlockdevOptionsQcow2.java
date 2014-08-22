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
 * <p><pre>QApiTypeDescriptor{name=BlockdevOptionsQcow2, data={*lazy-refcounts=bool, *pass-discard-request=bool, *pass-discard-snapshot=bool, *pass-discard-other=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevOptionsQcow2, data={*lazy-refcounts=bool, *pass-discard-request=bool, *pass-discard-snapshot=bool, *pass-discard-other=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsQcow2 extends BlockdevOptionsGenericCOWFormat {

	@JsonProperty("lazy-refcounts")
	@CheckForNull
	public java.lang.Boolean lazyRefcounts;
	@JsonProperty("pass-discard-request")
	@CheckForNull
	public java.lang.Boolean passDiscardRequest;
	@JsonProperty("pass-discard-snapshot")
	@CheckForNull
	public java.lang.Boolean passDiscardSnapshot;
	@JsonProperty("pass-discard-other")
	@CheckForNull
	public java.lang.Boolean passDiscardOther;

	@Nonnull
	public BlockdevOptionsQcow2 withLazyRefcounts(java.lang.Boolean value) {
		this.lazyRefcounts = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withPassDiscardRequest(java.lang.Boolean value) {
		this.passDiscardRequest = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withPassDiscardSnapshot(java.lang.Boolean value) {
		this.passDiscardSnapshot = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withPassDiscardOther(java.lang.Boolean value) {
		this.passDiscardOther = value;
		return this;
	}

	public BlockdevOptionsQcow2() {
	}

	public BlockdevOptionsQcow2(java.lang.Boolean lazyRefcounts, java.lang.Boolean passDiscardRequest, java.lang.Boolean passDiscardSnapshot, java.lang.Boolean passDiscardOther) {
		this.lazyRefcounts = lazyRefcounts;
		this.passDiscardRequest = passDiscardRequest;
		this.passDiscardSnapshot = passDiscardSnapshot;
		this.passDiscardOther = passDiscardOther;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("lazy-refcounts");
		names.add("pass-discard-request");
		names.add("pass-discard-snapshot");
		names.add("pass-discard-other");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("lazy-refcounts".equals(name))
			return lazyRefcounts;
		if ("pass-discard-request".equals(name))
			return passDiscardRequest;
		if ("pass-discard-snapshot".equals(name))
			return passDiscardSnapshot;
		if ("pass-discard-other".equals(name))
			return passDiscardOther;
		return super.getFieldByName(name);
	}
}
