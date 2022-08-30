package com.datablink.mobile200.embeddedapi.p013a.p015b;

import org.bouncycastle.p064a.p068d.C1310a;

/* renamed from: com.datablink.mobile200.embeddedapi.a.b.a */
public final class C0632a {

    /* renamed from: a */
    private C1310a f180a = null;

    public C0632a(byte[] bArr) {
        this.f180a = new C1310a(bArr);
    }

    /* renamed from: a */
    public final String mo9678a(String str) throws Exception {
        return C0634c.m114a(new C0633b(this.f180a.mo13324a()).mo9680a(str));
    }

    /* renamed from: b */
    public final String mo9679b(String str) throws Exception {
        return new C0633b(this.f180a.mo13324a()).mo9682b(C0634c.m115b(str.getBytes()));
    }
}
