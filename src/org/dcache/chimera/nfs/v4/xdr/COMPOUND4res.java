/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.chimera.nfs.v4.*;
import org.dcache.xdr.*;
import java.io.IOException;

public class COMPOUND4res implements XdrAble {
    public int status;
    public utf8str_cs tag;
    public nfs_resop4 [] resarray;

    public COMPOUND4res() {
    }

    public COMPOUND4res(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(status);
        tag.xdrEncode(xdr);
        { int $size = resarray.length; xdr.xdrEncodeInt($size); for ( int $idx = 0; $idx < $size; ++$idx ) { resarray[$idx].xdrEncode(xdr); } }
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        status = xdr.xdrDecodeInt();
        tag = new utf8str_cs(xdr);
        { int $size = xdr.xdrDecodeInt(); resarray = new nfs_resop4[$size]; for ( int $idx = 0; $idx < $size; ++$idx ) { resarray[$idx] = new nfs_resop4(xdr); } }
    }

}
// End of COMPOUND4res.java