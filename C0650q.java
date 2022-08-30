package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Info;
import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0633b;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0635d;
import java.util.Vector;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.q */
public final class C0650q {

    /* renamed from: a */
    public static final String f401a = ":";

    /* renamed from: b */
    public static final String f402b = "&";

    /* renamed from: c */
    public static final int f403c = 1200;

    /* renamed from: d */
    public static final int f404d = 1201;

    /* renamed from: e */
    public static final int f405e = 1202;

    /* renamed from: f */
    public static final int f406f = 1203;

    /* renamed from: g */
    public static final int f407g = 1204;

    /* renamed from: h */
    public static final int f408h = 1205;

    /* renamed from: i */
    public static final int f409i = 1206;

    /* renamed from: j */
    public static final int f410j = 1207;

    /* renamed from: k */
    private static final String f411k = "               ";

    /* renamed from: l */
    private static final int f412l = 32;

    /* renamed from: m */
    private static String f413m;

    /* renamed from: n */
    private static byte[] f414n;

    /* renamed from: o */
    private static C0632a f415o;

    /* renamed from: p */
    private static C0633b f416p;

    public C0650q(byte[] bArr) throws C0651r {
        if (bArr == null || bArr.length == 0 || bArr.length < 32) {
            throw m321c("ERRO COM: 1202.");
        }
        try {
            f413m = C0634c.m116c(C0644k.f352O_);
            f414n = bArr;
            byte[] a = m317a(bArr);
            f415o = new C0632a(a);
            f416p = new C0633b(a);
        } catch (Exception unused) {
            throw m321c("");
        }
    }

    /* renamed from: a */
    public static int m311a(String str, Vector<String> vector) throws C0651r {
        try {
            vector.addAll(C0637d.m129a(str, ":"));
            if (vector.size() != 2) {
                vector.clear();
                return 1200;
            }
            String b = m320b(vector.elementAt(1), m319b(vector.elementAt(0)));
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
    private static String m312a(DatablinkMobile200EmbeddedApi_Info datablinkMobile200EmbeddedApi_Info) throws C0651r {
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
                sb2 = sb2.concat(f411k.substring(length));
            }
            return sb2 + m322d(sb2);
        } catch (Exception e) {
            throw m321c("ERRO COM: 1204 - " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static String m313a(String str) throws Exception {
        return f415o.mo9678a(str);
    }

    /* renamed from: a */
    public static String m314a(String str, DatablinkMobile200EmbeddedApi_Info datablinkMobile200EmbeddedApi_Info) throws C0651r {
        if (datablinkMobile200EmbeddedApi_Info == null) {
            try {
                datablinkMobile200EmbeddedApi_Info = new DatablinkMobile200EmbeddedApi_Info();
            } catch (Exception e) {
                throw m321c("ERRO COM: 1201 - " + e.getMessage());
            }
        }
        String a = m312a(datablinkMobile200EmbeddedApi_Info);
        String a2 = f415o.mo9678a(a);
        return a2 + ":" + m315a(str, a);
    }

    /* renamed from: a */
    private static String m315a(String str, String str2) throws C0651r {
        try {
            try {
                return new C0632a(m318a(f414n, str2)).mo9678a(C0627a.m49b(str));
            } catch (Exception e) {
                throw m321c("ERRO COM: 1202 - " + e.getMessage());
            }
        } catch (Exception unused) {
            throw m321c("");
        }
    }

    /* renamed from: a */
    private static void m316a() {
        try {
            new C0650q(C1316c.m2560a("E831FB039F958F1BC6EB57E038A29945368F67824097E6075010CD576EDCE0AC"));
            Vector vector = new Vector();
            m311a("kR1XGNlsCoAoINCwqaty5g==:uyBOyk0XGiC3/bcR1E0PQmfgS2zUPLwJHca6W3l7kPswGghCNuFpVdHbSxLnEkzmw8mYPnVrTz1YOGeBGmuCVuTE78LYAb3sNQSOLsAS3Y0=", (Vector<String>) vector);
            for (int i = 0; i < vector.size(); i++) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            new C0650q(C1316c.m2560a("E831FB039F958F1BC6EB57E038A29945368F67824097E6075010CD576EDCE0AC"));
            Vector vector2 = new Vector();
            m314a("50&4100000383|1404576&0F88EDD0-7535-4C42-A4C7-975E28B589E4|iOS|2.0.43", new DatablinkMobile200EmbeddedApi_Info());
            for (int i2 = 0; i2 < vector2.size(); i2++) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static byte[] m317a(byte[] bArr) throws C0651r {
        int i;
        try {
            C0633b bVar = new C0633b(C1316c.m2563b(f413m.getBytes()));
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
            for (i = 20; i < 32; i++) {
                bArr2[i] = 42;
            }
            return new C0633b(bVar.mo9681a(bArr2)).mo9681a(bArr);
        } catch (Exception e) {
            throw m321c("ERRO COM: 1205 - " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static byte[] m318a(byte[] bArr, String str) throws Exception {
        byte[] bArr2 = new byte[32];
        byte[] a = new C0633b(f416p.mo9681a(C1316c.m2563b(f413m.getBytes()))).mo9680a(str);
        for (int i = 0; i < 32; i++) {
            bArr2[i] = (byte) (a[i % 16] ^ bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: b */
    private static String m319b(String str) throws Exception {
        String b = f415o.mo9679b(str);
        if (b.length() != 16) {
            throw m321c("ERRO COM: 1200");
        }
        try {
            if (m322d(b.substring(0, 15)) == Integer.parseInt(String.valueOf(b.charAt(15)))) {
                return b;
            }
            throw m321c("ERRO COM: 1200");
        } catch (Exception unused) {
            throw m321c("ERRO COM: 1200");
        }
    }

    /* renamed from: b */
    private static String m320b(String str, String str2) throws C0651r {
        try {
            return C0627a.m50c(new C0632a(m318a(f414n, str2)).mo9679b(str));
        } catch (Exception e) {
            throw m321c("ERRO COM: 1203 - " + e.getMessage());
        }
    }

    /* renamed from: c */
    private static C0651r m321c(String str) {
        C0651r rVar = new C0651r();
        rVar.initCause(new Throwable(str));
        return rVar;
    }

    /* renamed from: d */
    private static int m322d(String str) throws C0651r {
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
            throw m321c("ERRO COM: 1207 - " + e.getMessage());
        }
    }
}
