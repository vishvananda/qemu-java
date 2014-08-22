/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

/**
 *
 * @author shevek
 */
public class QEmuMiscOptions {

    public static final QEmuOption ENABLE_KVM = new QEmuCustomOption("-enable-kvm");
    public static final QEmuOption NO_USER_CONFIG = new QEmuCustomOption("-no-user-config");
    public static final QEmuOption NO_DEFAULTS = new QEmuCustomOption("-no-defaults");
    public static final QEmuOption NO_SHUTDOWN = new QEmuCustomOption("-no-shutdown");
    public static final QEmuOption NO_ACPI = new QEmuCustomOption("-no-acpi");
}
