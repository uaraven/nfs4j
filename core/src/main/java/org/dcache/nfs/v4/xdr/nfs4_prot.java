/*
 * Copyright (c) 2009 - 2019 Deutsches Elektronen-Synchroton,
 * Member of the Helmholtz Association, (DESY), HAMBURG, GERMANY
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Library General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this program (see the file COPYING.LIB for more
 * details); if not, write to the Free Software Foundation, Inc.,
 * 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.dcache.nfs.v4.xdr;

/**
 * A collection of constants used by the "nfs4_prot" ONC/RPC program.
 */
public interface nfs4_prot {

    public static final int ACCESS4_READ = 0x00000001;
    public static final int ACCESS4_LOOKUP = 0x00000002;
    public static final int ACCESS4_MODIFY = 0x00000004;
    public static final int ACCESS4_EXTEND = 0x00000008;
    public static final int ACCESS4_DELETE = 0x00000010;
    public static final int ACCESS4_EXECUTE = 0x00000020;
    public static final int ACCESS4_XAREAD = 0x00000040;
    public static final int ACCESS4_XAWRITE = 0x00000080;
    public static final int ACCESS4_XALIST = 0x00000100;

    public static final int ACE4_ACCESS_ALLOWED_ACE_TYPE = 0x00000000;
    public static final int ACE4_ACCESS_DENIED_ACE_TYPE = 0x00000001;
    public static final int ACE4_ADD_FILE = 0x00000002;
    public static final int ACE4_ADD_SUBDIRECTORY = 0x00000004;
    public static final int ACE4_APPEND_DATA = 0x00000004;
    public static final int ACE4_DELETE = 0x00010000;
    public static final int ACE4_DELETE_CHILD = 0x00000040;
    public static final int ACE4_DIRECTORY_INHERIT_ACE = 0x00000002;
    public static final int ACE4_EXECUTE = 0x00000020;
    public static final int ACE4_FAILED_ACCESS_ACE_FLAG = 0x00000020;
    public static final int ACE4_FILE_INHERIT_ACE = 0x00000001;
    public static final int ACE4_GENERIC_EXECUTE = 0x001200A0;
    public static final int ACE4_GENERIC_READ = 0x00120081;
    public static final int ACE4_GENERIC_WRITE = 0x00160106;
    public static final int ACE4_IDENTIFIER_GROUP = 0x00000040;
    public static final int ACE4_INHERITED_ACE = 0x00000080;
    public static final int ACE4_INHERIT_ONLY_ACE = 0x00000008;
    public static final int ACE4_LIST_DIRECTORY = 0x00000001;
    public static final int ACE4_NO_PROPAGATE_INHERIT_ACE = 0x00000004;
    public static final int ACE4_READ_ACL = 0x00020000;
    public static final int ACE4_READ_ATTRIBUTES = 0x00000080;
    public static final int ACE4_READ_DATA = 0x00000001;
    public static final int ACE4_READ_NAMED_ATTRS = 0x00000008;
    public static final int ACE4_SUCCESSFUL_ACCESS_ACE_FLAG = 0x00000010;
    public static final int ACE4_SYNCHRONIZE = 0x00100000;
    public static final int ACE4_SYSTEM_ALARM_ACE_TYPE = 0x00000003;
    public static final int ACE4_SYSTEM_AUDIT_ACE_TYPE = 0x00000002;
    public static final int ACE4_WRITE_ACL = 0x00040000;
    public static final int ACE4_WRITE_ATTRIBUTES = 0x00000100;
    public static final int ACE4_WRITE_DATA = 0x00000002;
    public static final int ACE4_WRITE_NAMED_ATTRS = 0x00000010;
    public static final int ACE4_WRITE_OWNER = 0x00080000;
    public static final int ACE4_WRITE_RETENTION = 0x00000200;
    public static final int ACE4_WRITE_RETENTION_HOLD = 0x00000400;

    public static final int ACL4_AUTO_INHERIT = 0x00000001;
    public static final int ACL4_DEFAULTED = 0x00000004;
    public static final int ACL4_PROTECTED = 0x00000002;
    public static final int ACL4_SUPPORT_ALARM_ACL = 0x00000008;
    public static final int ACL4_SUPPORT_ALLOW_ACL = 0x00000001;
    public static final int ACL4_SUPPORT_AUDIT_ACL = 0x00000004;
    public static final int ACL4_SUPPORT_DENY_ACL = 0x00000002;

    public static final int AUTH_NONE = 0;
    public static final int AUTH_SYS = 1;
    public static final int RPCSEC_GSS = 6;

    public static final int CB_COMPOUND_1 = 1;
    public static final int CB_NULL_1 = 0;

    public static final int CREATE_SESSION4_FLAG_CONN_BACK_CHAN = 0x00000002;
    public static final int CREATE_SESSION4_FLAG_CONN_RDMA = 0x00000004;
    public static final int CREATE_SESSION4_FLAG_PERSIST = 0x00000001;

    public static final int EXCHGID4_FLAG_BIND_PRINC_STATEID = 0x00000100;
    public static final int EXCHGID4_FLAG_CONFIRMED_R = 0x80000000;
    public static final int EXCHGID4_FLAG_MASK_PNFS = 0x00070000;
    public static final int EXCHGID4_FLAG_SUPP_MOVED_MIGR = 0x00000002;
    public static final int EXCHGID4_FLAG_SUPP_MOVED_REFER = 0x00000001;
    public static final int EXCHGID4_FLAG_UPD_CONFIRMED_REC_A = 0x40000000;
    public static final int EXCHGID4_FLAG_USE_NON_PNFS = 0x00010000;
    public static final int EXCHGID4_FLAG_USE_PNFS_DS = 0x00040000;
    public static final int EXCHGID4_FLAG_USE_PNFS_MDS = 0x00020000;

    public static final int FATTR4_SUPPORTED_ATTRS = 0;
    public static final int FATTR4_TYPE = 1;
    public static final int FATTR4_FH_EXPIRE_TYPE = 2;
    public static final int FATTR4_CHANGE = 3;
    public static final int FATTR4_SIZE = 4;
    public static final int FATTR4_LINK_SUPPORT = 5;
    public static final int FATTR4_SYMLINK_SUPPORT = 6;
    public static final int FATTR4_NAMED_ATTR = 7;
    public static final int FATTR4_FSID = 8;
    public static final int FATTR4_UNIQUE_HANDLES = 9;
    public static final int FATTR4_LEASE_TIME = 10;
    public static final int FATTR4_RDATTR_ERROR = 11;
    public static final int FATTR4_ACL = 12;
    public static final int FATTR4_ACLSUPPORT = 13;
    public static final int FATTR4_ARCHIVE = 14;
    public static final int FATTR4_CANSETTIME = 15;
    public static final int FATTR4_CASE_INSENSITIVE = 16;
    public static final int FATTR4_CASE_PRESERVING = 17;
    public static final int FATTR4_CHOWN_RESTRICTED = 18;
    public static final int FATTR4_FILEHANDLE = 19;
    public static final int FATTR4_FILEID = 20;
    public static final int FATTR4_FILES_AVAIL = 21;
    public static final int FATTR4_FILES_FREE = 22;
    public static final int FATTR4_FILES_TOTAL = 23;
    public static final int FATTR4_FS_LOCATIONS = 24;
    public static final int FATTR4_HIDDEN = 25;
    public static final int FATTR4_HOMOGENEOUS = 26;
    public static final int FATTR4_MAXFILESIZE = 27;
    public static final int FATTR4_MAXLINK = 28;
    public static final int FATTR4_MAXNAME = 29;
    public static final int FATTR4_MAXREAD = 30;
    public static final int FATTR4_MAXWRITE = 31;
    public static final int FATTR4_MIMETYPE = 32;
    public static final int FATTR4_MODE = 33;
    public static final int FATTR4_NO_TRUNC = 34;
    public static final int FATTR4_NUMLINKS = 35;
    public static final int FATTR4_OWNER = 36;
    public static final int FATTR4_OWNER_GROUP = 37;
    public static final int FATTR4_QUOTA_AVAIL_HARD = 38;
    public static final int FATTR4_QUOTA_AVAIL_SOFT = 39;
    public static final int FATTR4_QUOTA_USED = 40;
    public static final int FATTR4_RAWDEV = 41;
    public static final int FATTR4_SPACE_AVAIL = 42;
    public static final int FATTR4_SPACE_FREE = 43;
    public static final int FATTR4_SPACE_TOTAL = 44;
    public static final int FATTR4_SPACE_USED = 45;
    public static final int FATTR4_SYSTEM = 46;
    public static final int FATTR4_TIME_ACCESS = 47;
    public static final int FATTR4_TIME_ACCESS_SET = 48;
    public static final int FATTR4_TIME_BACKUP = 49;
    public static final int FATTR4_TIME_CREATE = 50;
    public static final int FATTR4_TIME_DELTA = 51;
    public static final int FATTR4_TIME_METADATA = 52;
    public static final int FATTR4_TIME_MODIFY = 53;
    public static final int FATTR4_TIME_MODIFY_SET = 54;
    public static final int FATTR4_MOUNTED_ON_FILEID = 55;
    public static final int FATTR4_DIR_NOTIF_DELAY = 56;
    public static final int FATTR4_DIRENT_NOTIF_DELAY = 57;
    public static final int FATTR4_DACL = 58;
    public static final int FATTR4_SACL = 59;
    public static final int FATTR4_CHANGE_POLICY = 60;
    public static final int FATTR4_FS_STATUS = 61;
    public static final int FATTR4_FS_LAYOUT_TYPES = 62;
    public static final int FATTR4_LAYOUT_HINT = 63;
    public static final int FATTR4_LAYOUT_TYPE = 64;
    public static final int FATTR4_LAYOUT_BLKSIZE = 65;
    public static final int FATTR4_LAYOUT_ALIGNMENT = 66;
    public static final int FATTR4_FS_LOCATIONS_INFO = 67;
    public static final int FATTR4_MDSTHRESHOLD = 68;
    public static final int FATTR4_RETENTION_GET = 69;
    public static final int FATTR4_RETENTION_SET = 70;
    public static final int FATTR4_RETENTEVT_GET = 71;
    public static final int FATTR4_RETENTEVT_SET = 72;
    public static final int FATTR4_RETENTION_HOLD = 73;
    public static final int FATTR4_MODE_SET_MASKED = 74;
    public static final int FATTR4_SUPPATTR_EXCLCREAT = 75;
    public static final int FATTR4_FS_CHARSET_CAP = 76;
    public static final int FATTR4_XATTR_SUPPORT = 82;

    public static final int FH4_PERSISTENT = 0x00000000;
    public static final int FH4_NOEXPIRE_WITH_OPEN = 0x00000001;
    public static final int FH4_VOLATILE_ANY = 0x00000002;
    public static final int FH4_VOL_MIGRATION = 0x00000004;
    public static final int FH4_VOL_RENAME = 0x00000008;

    public static final int FSCHARSET_CAP4_CONTAINS_NON_UTF8 = 0x1;
    public static final int FSCHARSET_CAP4_ALLOWS_ONLY_UTF8 = 0x2;

    public static final int FSLI4BX_GFLAGS = 0;
    public static final int FSLI4BX_TFLAGS = 1;
    public static final int FSLI4BX_CLSIMUL = 2;
    public static final int FSLI4BX_CLHANDLE = 3;
    public static final int FSLI4BX_CLFILEID = 4;
    public static final int FSLI4BX_CLWRITEVER = 5;
    public static final int FSLI4BX_CLCHANGE = 6;
    public static final int FSLI4BX_CLREADDIR = 7;
    public static final int FSLI4BX_READRANK = 8;
    public static final int FSLI4BX_WRITERANK = 9;
    public static final int FSLI4BX_READORDER = 10;
    public static final int FSLI4BX_WRITEORDER = 11;

    public static final int FSLI4GF_WRITABLE = 0x01;
    public static final int FSLI4GF_CUR_REQ = 0x02;
    public static final int FSLI4GF_ABSENT = 0x04;
    public static final int FSLI4GF_GOING = 0x08;
    public static final int FSLI4GF_SPLIT = 0x10;

    public static final int FSLI4TF_RDMA = 0x01;
    public static final int FSLI4IF_VAR_SUB = 0x00000001;

    public static final int LAYOUT4_RET_REC_FILE = 1;
    public static final int LAYOUT4_RET_REC_FSID = 2;
    public static final int LAYOUT4_RET_REC_ALL = 3;

    public static final int MODE4_XOTH = 0x001;
    public static final int MODE4_WOTH = 0x002;
    public static final int MODE4_ROTH = 0x004;
    public static final int MODE4_XGRP = 0x008;
    public static final int MODE4_WGRP = 0x010;
    public static final int MODE4_RGRP = 0x020;
    public static final int MODE4_XUSR = 0x040;
    public static final int MODE4_WUSR = 0x080;
    public static final int MODE4_RUSR = 0x100;
    public static final int MODE4_SVTX = 0x200;
    public static final int MODE4_SGID = 0x400;
    public static final int MODE4_SUID = 0x800;

    public static final int NFS_CB = 1;
    public static final int NFS_V4 = 4;
    public static final int NFS4_CALLBACK = 0x40000000;
    public static final int NFS4_PROGRAM = 100003;
    public static final int NFSPROC4_COMPOUND_4 = 1;
    public static final int NFSPROC4_NULL_4 = 0;

    public static final int NFL4_UFLG_DENSE = 0x00000001;
    public static final int NFL4_UFLG_COMMIT_THRU_MDS = 0x00000002;
    public static final int NFL4_UFLG_MASK = 0x0000003F;
    public static final int NFL4_UFLG_STRIPE_UNIT_SIZE_MASK = 0xFFFFFFC0;
    public static final int NFS4_DEVICEID4_SIZE = 16;
    public static final int NFS4_FHSIZE = 128;
    public static final int NFS4_INT32_MAX = 0x7fffffff;
    public static final int NFS4_INT64_MAX = 0x7fffffff;
    public static final int NFS4_MAXFILELEN = 0xffffffff;
    public static final int NFS4_MAXFILEOFF = 0xfffffffe;
    public static final int NFS4_OPAQUE_LIMIT = 1024;
    public static final int NFS4_SESSIONID_SIZE = 16;
    public static final int NFS4_UINT32_MAX = 0xffffffff;
    public static final int NFS4_UINT64_MAX = 0xffffffff;
    public static final int NFS4_VERIFIER_SIZE = 8;

    public static final int OPEN4_RESULT_CONFIRM = 0x00000002;
    public static final int OPEN4_RESULT_LOCKTYPE_POSIX = 0x00000004;
    public static final int OPEN4_RESULT_PRESERVE_UNLINKED = 0x00000008;
    public static final int OPEN4_RESULT_MAY_NOTIFY_LOCK = 0x00000020;

    public static final int OPEN4_SHARE_ACCESS_READ = 0x00000001;
    public static final int OPEN4_SHARE_ACCESS_BOTH = 0x00000003;

    public static final int OPEN4_SHARE_ACCESS_WANT_NO_PREFERENCE = 0x0000;
    public static final int OPEN4_SHARE_ACCESS_WANT_READ_DELEG = 0x0100;
    public static final int OPEN4_SHARE_ACCESS_WANT_WRITE_DELEG = 0x0200;
    public static final int OPEN4_SHARE_ACCESS_WANT_ANY_DELEG = 0x0300;
    public static final int OPEN4_SHARE_ACCESS_WANT_NO_DELEG = 0x0400;
    public static final int OPEN4_SHARE_ACCESS_WANT_CANCEL = 0x0500;
    public static final int OPEN4_SHARE_ACCESS_WANT_DELEG_MASK = 0xFF00;
    public static final int OPEN4_SHARE_ACCESS_WANT_SIGNAL_DELEG_WHEN_RESRC_AVAIL = 0x10000;
    public static final int OPEN4_SHARE_ACCESS_WANT_PUSH_DELEG_WHEN_UNCONTENDED = 0x20000;

    public static final int OPEN4_SHARE_DENY_NONE = 0x00000000;
    public static final int OPEN4_SHARE_DENY_READ = 0x00000001;
    public static final int OPEN4_SHARE_ACCESS_WRITE = 0x00000002;

    public static final int OPEN4_SHARE_DENY_WRITE = 0x00000002;
    public static final int OPEN4_SHARE_DENY_BOTH = 0x00000003;

    public static final int RCA4_TYPE_MASK_RDATA_DLG = 0;
    public static final int RCA4_TYPE_MASK_WDATA_DLG = 1;
    public static final int RCA4_TYPE_MASK_DIR_DLG = 2;
    public static final int RCA4_TYPE_MASK_FILE_LAYOUT = 3;
    public static final int RCA4_TYPE_MASK_BLK_LAYOUT = 4;
    public static final int RCA4_TYPE_MASK_OBJ_LAYOUT_MAX = 9;
    public static final int RCA4_TYPE_MASK_OBJ_LAYOUT_MIN = 8;
    public static final int RCA4_TYPE_MASK_OTHER_LAYOUT_MIN = 12;
    public static final int RCA4_TYPE_MASK_OTHER_LAYOUT_MAX = 15;
    public static final int RET4_DURATION_INFINITE = 0xffffffff;

    public static final int SEQ4_STATUS_ADMIN_STATE_REVOKED = 0x00000020;
    public static final int SEQ4_STATUS_BACKCHANNEL_FAULT = 0x00000400;
    public static final int SEQ4_STATUS_CB_GSS_CONTEXTS_EXPIRED = 0x00000004;
    public static final int SEQ4_STATUS_CB_GSS_CONTEXTS_EXPIRING = 0x00000002;
    public static final int SEQ4_STATUS_CB_PATH_DOWN = 0x00000001;
    public static final int SEQ4_STATUS_CB_PATH_DOWN_SESSION = 0x00000200;
    public static final int SEQ4_STATUS_DEVID_CHANGED = 0x00000800;
    public static final int SEQ4_STATUS_DEVID_DELETED = 0x00001000;
    public static final int SEQ4_STATUS_EXPIRED_ALL_STATE_REVOKED = 0x00000008;
    public static final int SEQ4_STATUS_EXPIRED_SOME_STATE_REVOKED = 0x00000010;
    public static final int SEQ4_STATUS_LEASE_MOVED = 0x00000080;
    public static final int SEQ4_STATUS_RECALLABLE_STATE_REVOKED = 0x00000040;
    public static final int SEQ4_STATUS_RESTART_RECLAIM_NEEDED = 0x00000100;

    public static final int TH4_READ_SIZE = 0;
    public static final int TH4_WRITE_SIZE = 1;
    public static final int TH4_READ_IOSIZE = 2;
    public static final int TH4_WRITE_IOSIZE = 3;

}
// End of nfs4_prot.java
