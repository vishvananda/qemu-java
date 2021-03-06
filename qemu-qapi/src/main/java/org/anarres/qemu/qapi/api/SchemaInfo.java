package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiUnionDescriptor{name=SchemaInfo, discriminator=meta-type, data={builtin=SchemaInfoBuiltin, enum=SchemaInfoEnum, array=SchemaInfoArray, object=SchemaInfoObject, alternate=SchemaInfoAlternate, command=SchemaInfoCommand, event=SchemaInfoEvent}, innerTypes=null, fields=null, discriminatorField=null}</pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SchemaInfo extends SchemaInfoBase implements QApiUnion {

	// union {
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("builtin")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoBuiltin builtin;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("enum")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoEnum _enum;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("array")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoArray array;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("object")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoObject object;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("alternate")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoAlternate alternate;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("command")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoCommand command;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("event")
	@JsonUnwrapped
	@CheckForNull
	public SchemaInfoEvent event;
	// }

	@Nonnull
	public static SchemaInfo builtin(@Nonnull SchemaInfoBuiltin builtin) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType.builtin;
		self.builtin = builtin;
		return self;
	}

	@Nonnull
	public static SchemaInfo _enum(@Nonnull SchemaInfoEnum _enum) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType._enum;
		self._enum = _enum;
		return self;
	}

	@Nonnull
	public static SchemaInfo array(@Nonnull SchemaInfoArray array) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType.array;
		self.array = array;
		return self;
	}

	@Nonnull
	public static SchemaInfo object(@Nonnull SchemaInfoObject object) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType.object;
		self.object = object;
		return self;
	}

	@Nonnull
	public static SchemaInfo alternate(@Nonnull SchemaInfoAlternate alternate) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType.alternate;
		self.alternate = alternate;
		return self;
	}

	@Nonnull
	public static SchemaInfo command(@Nonnull SchemaInfoCommand command) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType.command;
		self.command = command;
		return self;
	}

	@Nonnull
	public static SchemaInfo event(@Nonnull SchemaInfoEvent event) {
		SchemaInfo self = new SchemaInfo();
		self.metaType = SchemaMetaType.event;
		self.event = event;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("builtin");
		names.add("enum");
		names.add("array");
		names.add("object");
		names.add("alternate");
		names.add("command");
		names.add("event");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("builtin".equals(name))
			return builtin;
		if ("enum".equals(name))
			return _enum;
		if ("array".equals(name))
			return array;
		if ("object".equals(name))
			return object;
		if ("alternate".equals(name))
			return alternate;
		if ("command".equals(name))
			return command;
		if ("event".equals(name))
			return event;
		return super.getFieldByName(name);
	}

	@Override
	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (builtin != null)
			count++;
		if (_enum != null)
			count++;
		if (array != null)
			count++;
		if (object != null)
			count++;
		if (alternate != null)
			count++;
		if (command != null)
			count++;
		if (event != null)
			count++;
		return (count == 1);
	}
}
