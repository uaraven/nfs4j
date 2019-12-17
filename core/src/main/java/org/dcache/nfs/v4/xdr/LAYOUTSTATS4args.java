/*
 * Automatically generated by jrpcgen 1.0.7+ on 4/18/19, 9:15 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.xdr;
import org.dcache.oncrpc4j.rpc.*;
import org.dcache.oncrpc4j.rpc.net.*;
import org.dcache.oncrpc4j.xdr.*;
import java.io.IOException;

public class LAYOUTSTATS4args implements XdrAble {
    public offset4 lsa_offset;
    public length4 lsa_length;
    public stateid4 lsa_stateid;
    public io_info4 lsa_read;
    public io_info4 lsa_write;
    public deviceid4 lsa_deviceid;
    public layoutupdate4 lsa_layoutupdate;

    public LAYOUTSTATS4args() {
    }

    public LAYOUTSTATS4args(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        lsa_offset.xdrEncode(xdr);
        lsa_length.xdrEncode(xdr);
        lsa_stateid.xdrEncode(xdr);
        lsa_read.xdrEncode(xdr);
        lsa_write.xdrEncode(xdr);
        lsa_deviceid.xdrEncode(xdr);
        lsa_layoutupdate.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        lsa_offset = new offset4(xdr);
        lsa_length = new length4(xdr);
        lsa_stateid = new stateid4(xdr);
        lsa_read = new io_info4(xdr);
        lsa_write = new io_info4(xdr);
        lsa_deviceid = new deviceid4(xdr);
        lsa_layoutupdate = new layoutupdate4(xdr);
    }

}
// End of LAYOUTSTATS4args.java