package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Info;
import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0633b;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0635d;
import java.util.Vector;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.m */
public final class C0646m {

    /* renamed from: a */
    public static final String f382a = ":";

    /* renamed from: b */
    public static final String f383b = "&";

    /* renamed from: c */
    public static final int f384c = 1200;

    /* renamed from: d */
    public static final int f385d = 1201;

    /* renamed from: e */
    public static final int f386e = 1202;

    /* renamed from: f */
    public static final int f387f = 1203;

    /* renamed from: g */
    public static final int f388g = 1204;

    /* renamed from: h */
    public static final int f389h = 1205;

    /* renamed from: i */
    public static final int f390i = 1206;

    /* renamed from: j */
    public static final int f391j = 1207;

    /* renamed from: k */
    private static final String f392k = "               ";

    /* renamed from: l */
    private static final boolean f393l = false;

    /* renamed from: m */
    private static final byte[] f394m = {78, 122, 99, 122, 77, 84, 90, 68, 78, 106, 107, 50, 77, 84, 90, 69, 78, 68, 65, 122, 79, 84, 77, 52, 77, 106, 77, 50, 82, 68, 77, 122, 78, 106, 81, 122, 77, 122, 89, 122, 77, 122, 65, 50, 82, 84, 89, 50, 77, 122, 69, 50, 78, 122, 73, 120, 78, 106, 99, 50, 77, 84, 90, 69, 78, 106, 73, 50, 79, 84, 89, 48, 77, 122, 65, 50, 81, 106, 99, 119, 78, 122, 81, 122, 78, 65, 61, 61};

    /* renamed from: n */
    private static final int f395n = 32;

    /* renamed from: o */
    private static String f396o;

    /* renamed from: p */
    private static byte[] f397p;

    /* renamed from: q */
    private static C0632a f398q;

    /* renamed from: r */
    private static C0633b f399r;

    public C0646m(byte[] bArr) throws C0651r {
        if (bArr == null || bArr.length == 0 || bArr.length < 32) {
            throw m151d("ERRO COM: 1202.");
        }
        try {
            byte[] b = C1316c.m2563b(C0634c.m115b(f394m));
            f396o = C0634c.m116c(C0644k.f352O_);
            f397p = b;
            byte[] a = m146a(b);
            f398q = new C0632a(a);
            f399r = new C0633b(a);
        } catch (Exception unused) {
            throw m151d("");
        }
    }

    /* renamed from: a */
    public static int m142a(String str, Vector<String> vector) throws C0651r {
        try {
            vector.addAll(C0637d.m129a(str, ":"));
            if (vector.size() != 2) {
                vector.clear();
                return 1200;
            }
            String b = m149b(vector.elementAt(1), m150c(vector.elementAt(0)));
            vector.clear();
            vector.addAll(C0637d.m129a(b, "&"));
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            vector.clear();
            return 1200;
        }
    }

    /* renamed from: a */
    private static String m143a(DatablinkMobile200EmbeddedApi_Info datablinkMobile200EmbeddedApi_Info) throws C0651r {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            if (datablinkMobile200EmbeddedApi_Info.DatablinkGetSerialNumber().length() > 4) {
                sb2 = sb2 + datablinkMobile200EmbeddedApi_Info.DatablinkGetSerialNumber().substring(4);
            }
            int length = sb2.length();
            if (length > 15) {
                sb2 = sb2.substring(length - 15);
            } else if (length < 15) {
                sb2 = sb2.concat(f392k.substring(length));
            }
            return sb2 + m152e(sb2);
        } catch (Exception e) {
            throw m151d("ERRO COM: 1204 - " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static String m144a(String str) throws C0651r {
        try {
            String a = m143a(new DatablinkMobile200EmbeddedApi_Info());
            String a2 = f398q.mo9678a(a);
            return a2 + ":" + m145a(str, a);
        } catch (Exception e) {
            throw m151d("ERRO COM: 1201 - " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static String m145a(String str, String str2) throws C0651r {
        try {
            try {
                return new C0632a(m147a(f397p, str2)).mo9678a(C0627a.m49b(str));
            } catch (Exception e) {
                throw m151d("ERRO COM: 1202 - " + e.getMessage());
            }
        } catch (Exception unused) {
            throw m151d("");
        }
    }

    /* renamed from: a */
    private static byte[] m146a(byte[] bArr) throws C0651r {
        int i;
        try {
            byte[] b = C1316c.m2563b(f396o.getBytes());
            C0633b bVar = new C0633b(b);
            byte[] a = C0635d.m118a(bArr);
            byte[] bArr2 = new byte[32];
            int i2 = 0;
            while (true) {
                if (i2 >= 20) {
                    break;
                }
                bArr2[i2] = a[i2];
                i2++;
            }
            int i3 = 5;
            for (i = 20; i < 32; i++) {
                bArr2[i] = b[i3];
                i3 += 2;
            }
            return new C0633b(bVar.mo9681a(bArr2)).mo9681a(bArr);
        } catch (Exception e) {
            throw m151d("ERRO COM: 1205 - " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static byte[] m147a(byte[] bArr, String str) throws Exception {
        byte[] bArr2 = new byte[32];
        byte[] a = new C0633b(f399r.mo9681a(C1316c.m2563b(f396o.getBytes()))).mo9680a(str);
        for (int i = 0; i < 32; i++) {
            bArr2[i] = (byte) (a[i % 16] ^ bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: b */
    private static String m148b(String str) throws Exception {
        return f398q.mo9678a(str);
    }

    /* renamed from: b */
    private static String m149b(String str, String str2) throws C0651r {
        try {
            return C0627a.m50c(new C0632a(m147a(f397p, str2)).mo9679b(str));
        } catch (Exception e) {
            throw m151d("ERRO COM: 1203 - " + e.getMessage());
        }
    }

    /* renamed from: c */
    private static String m150c(String str) throws Exception {
        String b = f398q.mo9679b(str);
        if (b.length() != 16) {
            throw m151d("ERRO COM: 1200");
        }
        try {
            if (m152e(b.substring(0, 15)) == Integer.parseInt(String.valueOf(b.charAt(15)))) {
                return b;
            }
            throw m151d("ERRO COM: 1200");
        } catch (Exception unused) {
            throw m151d("ERRO COM: 1200");
        }
    }

    /* renamed from: d */
    private static C0651r m151d(String str) {
        C0651r rVar = new C0651r();
        rVar.initCause(new Throwable(str));
        return rVar;
    }

    /* renamed from: e */
    private static int m152e(String str) throws C0651r {
        if (str == null) {
            return -1;
        }
        try {
            String trim = str.trim();
            int i = 0;
            int i2 = 2;
            for (int length = trim.length() - 1; length >= 0; length--) {
                try {
                    int parseInt = Integer.parseInt(String.valueOf(trim.charAt(length))) * i2;
                    if (parseInt > 10) {
                        parseInt = (parseInt % 10) + 1;
                    }
                    i += parseInt;
                    i2 = i2 == 2 ? 1 : 2;
                } catch (Exception unused) {
                }
            }
            if (i % 10 == 0) {
                return 0;
            }
            return 10 - (i % 10);
        } catch (Exception e) {
            throw m151d("ERRO COM: 1207 - " + e.getMessage());
        }
    }
}
