package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0632a;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0633b;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.ac */
final class C0630ac implements C0629ab {

    /* renamed from: a */
    private C0632a f179a = null;

    public C0630ac(byte[] bArr) throws C0640g {
        try {
            byte[] b = C1316c.m2563b(C0634c.m116c(C0626a.f162a).getBytes());
            C0633b bVar = new C0633b(new C0633b(b).mo9681a(bArr));
            this.f179a = new C0632a(bVar.mo9681a(bVar.mo9681a(b)));
        } catch (Exception unused) {
            throw new C0640g();
        }
    }

    /* renamed from: a */
    public final String mo9669a(String str) throws C0640g {
        try {
            return this.f179a.mo9678a(C0627a.m49b(str));
        } catch (Exception unused) {
            throw new C0640g();
        }
    }

    /* renamed from: b */
    public final String mo9670b(String str) throws C0640g {
        try {
            return C0627a.m50c(this.f179a.mo9679b(str));
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
