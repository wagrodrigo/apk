package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import java.util.Vector;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.f */
public final class C0639f {

    /* renamed from: a */
    public static final int f191a = 1710;

    /* renamed from: b */
    public static final int f192b = 1711;

    /* renamed from: c */
    public static final int f193c = 1712;

    /* renamed from: d */
    public static final int f194d = 1713;

    /* renamed from: e */
    public static final int f195e = 1714;

    /* renamed from: f */
    public static final int f196f = 1716;

    /* renamed from: g */
    public static String f197g = "&";

    /* renamed from: h */
    public static String f198h = ":";

    /* renamed from: a */
    public static int m135a(C0655v vVar, byte[] bArr, String str, StringBuffer stringBuffer, Vector<String> vector) {
        return m139b(vVar, bArr, str, stringBuffer, vector);
    }

    /* renamed from: a */
    private static String m136a(byte[] bArr, String str) throws Exception {
        return new String(m137a(new C0632a(bArr), str));
    }

    /* renamed from: a */
    private static byte[] m137a(C0632a aVar, String str) throws Exception {
        try {
            return C0634c.m115b(C0627a.m50c(aVar.mo9679b(str)).getBytes());
        } catch (Exception unused) {
            throw new Exception();
        }
    }

    /* renamed from: a */
    private static byte[] m138a(C0655v vVar, byte[] bArr, String str) throws Exception {
        String r = vVar.mo9782r();
        String h = vVar.mo9767h();
        String j = vVar.mo9771j();
        String str2 = new String(C1316c.m2561a(bArr));
        try {
            return m137a(new C0632a((j + h + r + str2).toLowerCase().substring(0, 32).getBytes()), str);
        } catch (Exception unused) {
            return m137a(new C0632a((j + h + r + str2).substring(0, 32).getBytes()), str);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m139b(com.datablink.mobile200.embeddedapi.p013a.C0655v r7, byte[] r8, java.lang.String r9, java.lang.StringBuffer r10, java.util.Vector<java.lang.String> r11) {
        /*
            java.lang.String r0 = f198h     // Catch:{ Exception -> 0x00b5 }
            java.util.Vector r9 = com.datablink.mobile200.embeddedapi.p013a.C0637d.m129a(r9, r0)     // Catch:{ Exception -> 0x00b5 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x00b5 }
            r1 = 3
            if (r0 >= r1) goto L_0x0010
            r7 = 1710(0x6ae, float:2.396E-42)
            return r7
        L_0x0010:
            r0 = 0
            java.lang.Object r1 = r9.get(r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b5 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x00b5 }
            r2 = 1711(0x6af, float:2.398E-42)
            if (r1 > 0) goto L_0x0020
            return r2
        L_0x0020:
            r3 = 0
            r4 = r3
            r3 = r0
        L_0x0023:
            r5 = 1
            if (r3 >= r1) goto L_0x0039
            int r6 = r3 + 1
            java.lang.Object r6 = r9.get(r6)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0037 }
            byte[] r6 = m138a(r7, r8, r6)     // Catch:{ Exception -> 0x0037 }
            if (r6 == 0) goto L_0x0036
            int r3 = r1 + 99
        L_0x0036:
            r4 = r6
        L_0x0037:
            int r3 = r3 + r5
            goto L_0x0023
        L_0x0039:
            if (r4 != 0) goto L_0x003c
            return r2
        L_0x003c:
            java.lang.Object r7 = r9.lastElement()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00b5 }
            com.datablink.mobile200.embeddedapi.a.b.a r8 = new com.datablink.mobile200.embeddedapi.a.b.a     // Catch:{ Exception -> 0x00b2 }
            r8.<init>(r4)     // Catch:{ Exception -> 0x00b2 }
            byte[] r7 = m137a((com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a) r8, (java.lang.String) r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x00b2 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = f197g     // Catch:{ Exception -> 0x00b5 }
            java.util.Vector r7 = com.datablink.mobile200.embeddedapi.p013a.C0637d.m129a(r8, r7)     // Catch:{ Exception -> 0x00b5 }
            int r8 = r7.size()     // Catch:{ Exception -> 0x00b5 }
            if (r8 > 0) goto L_0x005f
            r7 = 1713(0x6b1, float:2.4E-42)
            return r7
        L_0x005f:
            java.lang.Object r8 = r7.get(r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = "2"
            boolean r9 = r8.equals(r9)     // Catch:{ Exception -> 0x00b5 }
            if (r9 != 0) goto L_0x007f
            java.lang.String r9 = "3"
            boolean r9 = r8.equals(r9)     // Catch:{ Exception -> 0x00b5 }
            if (r9 != 0) goto L_0x007f
            java.lang.String r9 = "4"
            boolean r9 = r8.equals(r9)     // Catch:{ Exception -> 0x00b5 }
            if (r9 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            return r2
        L_0x007f:
            r10.setLength(r0)     // Catch:{ Exception -> 0x00b5 }
            r10.append(r8)     // Catch:{ Exception -> 0x00b5 }
            r7.remove(r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = "4"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x00b5 }
            if (r8 == 0) goto L_0x00ae
            r8 = 1716(0x6b4, float:2.405E-42)
            java.lang.Object r9 = r7.get(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = com.datablink.mobile200.embeddedapi.p013a.C0641h.m140a(r9)     // Catch:{ Exception -> 0x00ad }
            r7.set(r0, r9)     // Catch:{ Exception -> 0x00ad }
            java.lang.Object r9 = r7.get(r5)     // Catch:{  }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{  }
            java.lang.String r9 = com.datablink.mobile200.embeddedapi.p013a.C0641h.m140a(r9)     // Catch:{  }
            r7.set(r5, r9)     // Catch:{  }
            goto L_0x00ae
        L_0x00ad:
            return r8
        L_0x00ae:
            r11.addAll(r7)     // Catch:{ Exception -> 0x00b5 }
            return r0
        L_0x00b2:
            r7 = 1712(0x6b0, float:2.399E-42)
            return r7
        L_0x00b5:
            r7 = 1714(0x6b2, float:2.402E-42)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0639f.m139b(com.datablink.mobile200.embeddedapi.a.v, byte[], java.lang.String, java.lang.StringBuffer, java.util.Vector):int");
    }
}
