package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi;
import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import java.util.Vector;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.e */
public final class C0638e {

    /* renamed from: a */
    public static final int f183a = 1810;

    /* renamed from: b */
    public static final int f184b = 1811;

    /* renamed from: c */
    public static final int f185c = 1812;

    /* renamed from: d */
    public static final int f186d = 1813;

    /* renamed from: e */
    public static final int f187e = 1814;

    /* renamed from: f */
    public static final int f188f = 1816;

    /* renamed from: g */
    public static String f189g = "&";

    /* renamed from: h */
    public static String f190h = ":";

    /* renamed from: a */
    public static int m130a(C0655v vVar, byte[] bArr, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, Vector<String> vector) {
        return m134b(vVar, bArr, str, stringBuffer, stringBuffer2, vector);
    }

    /* renamed from: a */
    private static String m131a(byte[] bArr, String str) throws Exception {
        return new String(m132a(new C0632a(bArr), str));
    }

    /* renamed from: a */
    private static byte[] m132a(C0632a aVar, String str) throws Exception {
        try {
            return C0634c.m115b(C0627a.m50c(aVar.mo9679b(str)).getBytes());
        } catch (Exception unused) {
            throw new Exception();
        }
    }

    /* renamed from: a */
    private static byte[] m133a(C0655v vVar, byte[] bArr, String str) throws Exception {
        String r = vVar.mo9782r();
        String h = vVar.mo9767h();
        String j = vVar.mo9771j();
        String str2 = new String(C1316c.m2561a(bArr));
        try {
            return m132a(new C0632a((j + h + r + str2).toLowerCase().substring(0, 32).getBytes()), str);
        } catch (Exception e) {
            e.printStackTrace();
            return m132a(new C0632a((j + h + r + str2).substring(0, 32).getBytes()), str);
        }
    }

    /* renamed from: b */
    private static int m134b(C0655v vVar, byte[] bArr, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, Vector<String> vector) {
        byte[] bArr2;
        try {
            Vector<String> a = C0637d.m129a(str, f190h);
            for (int i = 0; i < a.size(); i++) {
            }
            if (a.size() < 2) {
                return f183a;
            }
            try {
                bArr2 = m133a(vVar, bArr, a.get(0));
            } catch (Exception unused) {
                bArr2 = null;
            }
            if (bArr2 == null) {
                return 1811;
            }
            try {
                Vector<String> a2 = C0637d.m129a(new String(m132a(new C0632a(bArr2), a.get(1))), f189g);
                if (a2.size() <= 0) {
                    return f186d;
                }
                String trim = a2.get(0).trim();
                if (!trim.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_OTP) && !trim.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_SIGN) && !trim.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_CHALLENGE_RESPONSE)) {
                    if (!trim.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_AUTHORIZATION)) {
                        return 1811;
                    }
                }
                stringBuffer.setLength(0);
                stringBuffer.append(trim);
                a2.remove(0);
                stringBuffer2.append(a2.get(0));
                a2.remove(0);
                if (trim.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_AUTHORIZATION)) {
                    try {
                        a2.set(0, C0641h.m140a(a2.get(0)));
                        a2.set(1, C0641h.m140a(a2.get(1)));
                    } catch (Exception unused2) {
                        return f188f;
                    }
                }
                vector.addAll(a2);
                return 0;
            } catch (Exception unused3) {
                return f185c;
            }
        } catch (Exception unused4) {
            return f187e;
        }
    }
}
