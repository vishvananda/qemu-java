package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=X86CPUFeatureWordInfo, data={cpuid-input-eax=int, *cpuid-input-ecx=int, cpuid-register=X86CPURegister32, features=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=X86CPUFeatureWordInfo, data={cpuid-input-eax=int, *cpuid-input-ecx=int, cpuid-register=X86CPURegister32, features=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class X86CPUFeatureWordInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cpuid-input-eax")
	@Nonnull
	public long cpuidInputEax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cpuid-input-ecx")
	@CheckForNull
	public java.lang.Long cpuidInputEcx;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cpuid-register")
	@Nonnull
	public X86CPURegister32 cpuidRegister;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("features")
	@Nonnull
	public long features;

	@Nonnull
	public X86CPUFeatureWordInfo withCpuidInputEax(long value) {
		this.cpuidInputEax = value;
		return this;
	}

	@Nonnull
	public X86CPUFeatureWordInfo withCpuidInputEcx(java.lang.Long value) {
		this.cpuidInputEcx = value;
		return this;
	}

	@Nonnull
	public X86CPUFeatureWordInfo withCpuidRegister(X86CPURegister32 value) {
		this.cpuidRegister = value;
		return this;
	}

	@Nonnull
	public X86CPUFeatureWordInfo withFeatures(long value) {
		this.features = value;
		return this;
	}

	public X86CPUFeatureWordInfo() {
	}

	public X86CPUFeatureWordInfo(long cpuidInputEax, java.lang.Long cpuidInputEcx, X86CPURegister32 cpuidRegister, long features) {
		this.cpuidInputEax = cpuidInputEax;
		this.cpuidInputEcx = cpuidInputEcx;
		this.cpuidRegister = cpuidRegister;
		this.features = features;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("cpuid-input-eax");
		names.add("cpuid-input-ecx");
		names.add("cpuid-register");
		names.add("features");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("cpuid-input-eax".equals(name))
			return cpuidInputEax;
		if ("cpuid-input-ecx".equals(name))
			return cpuidInputEcx;
		if ("cpuid-register".equals(name))
			return cpuidRegister;
		if ("features".equals(name))
			return features;
		return super.getFieldByName(name);
	}
}
