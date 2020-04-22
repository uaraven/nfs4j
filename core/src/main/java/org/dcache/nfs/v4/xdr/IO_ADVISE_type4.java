/*
 * Automatically generated by jrpcgen 1.0.7+ on 4/3/20, 4:01 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.xdr;
/**
 * Enumeration (collection of constants).
 */
public interface IO_ADVISE_type4 {

    public static final int IO_ADVISE4_NORMAL = 0;
    public static final int IO_ADVISE4_SEQUENTIAL = 1;
    public static final int IO_ADVISE4_SEQUENTIAL_BACKWARDS = 2;
    public static final int IO_ADVISE4_RANDOM = 3;
    public static final int IO_ADVISE4_WILLNEED = 4;
    public static final int IO_ADVISE4_WILLNEED_OPPORTUNISTIC = 5;
    public static final int IO_ADVISE4_DONTNEED = 6;
    public static final int IO_ADVISE4_NOREUSE = 7;
    public static final int IO_ADVISE4_READ = 8;
    public static final int IO_ADVISE4_WRITE = 9;
    public static final int IO_ADVISE4_INIT_PROXIMITY = 10;

}
// End of IO_ADVISE_type4.java