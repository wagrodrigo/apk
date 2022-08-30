package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0633b;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0635d;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.c */
final class C0636c implements C0629ab {

    /* renamed from: a */
    private C0632a f182a = null;

    public C0636c(byte[] bArr, byte[] bArr2) throws C0640g {
        try {
            byte[] a = new C0633b(C1316c.m2563b(C0634c.m116c(C0626a.f163b).getBytes())).mo9681a(bArr);
            C0633b bVar = new C0633b(a);
            byte[] bArr3 = new byte[32];
            byte[] a2 = C0635d.m118a(bArr2);
            int i = 0;
            while (i < 6) {
                bArr3[i] = a[i];
                i++;
            }
            for (int i2 = 0; i2 < 20; i2++) {
                bArr3[i] = a2[i2];
                i++;
            }
            while (i < 32) {
                bArr3[i] = a[i];
                i++;
            }
            this.f182a = new C0632a(bVar.mo9681a(bArr3));
        } catch (Exception unused) {
            throw new C0640g();
        }
    }

    /* renamed from: a */
    public final String mo9669a(String str) throws C0640g {
        try {
            return this.f182a.mo9678a(C0627a.m49b(str));
        } catch (Exception unused) {
            throw new C0640g();
        }
    }

    /* renamed from: b */
    public final String mo9670b(String str) throws C0640g {
        try {
            return C0627a.m50c(this.f182a.mo9679b(str));
        } catch (Exception unused) {
            throw new C0640g();
        }
    }

    /* renamed from: c */
    public final String mo9671c(String str) throws C0640g {
        if (str.length() <= 0) {
            return "";
        }
        try {
            return C0634c.m114a(str.getBytes());
        } catch (Exception unused) {
            throw new C0640g();
        }
    }

    /* renamed from: d */
    public final String mo9672d(String str) throws C0640g {
        if (str.length() <= 0) {
            return "";
        }
        try {
            return C0634c.m116c(str.getBytes());
        } catch (Exception unused) {
            throw new C0640g();
        }
    }
}
