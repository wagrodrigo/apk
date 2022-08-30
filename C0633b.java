package com.datablink.mobile200.embeddedapi.p013a.p015b;

import org.bouncycastle.p064a.C1305b;
import org.bouncycastle.p064a.p066b.C1306a;
import org.bouncycastle.p064a.p068d.C1310a;

/* renamed from: com.datablink.mobile200.embeddedapi.a.b.b */
public final class C0633b {

    /* renamed from: a */
    private C1310a f181a = null;

    public C0633b(byte[] bArr) {
        this.f181a = new C1310a(bArr);
    }

    /* renamed from: a */
    private void m110a(byte[] bArr, byte[] bArr2, boolean z) {
        C1306a aVar = new C1306a();
        try {
            aVar.mo13302a(z, (C1305b) this.f181a);
        } catch (IllegalArgumentException unused) {
        }
        aVar.mo13300a(bArr, bArr2);
    }

    /* renamed from: a */
    public final byte[] mo9680a(String str) {
        if (str.length() == 16) {
            byte[] bArr = new byte[16];
            m110a(str.getBytes(), bArr, true);
            return bArr;
        }
        while (str.length() % 16 != 0) {
            str = str + "*";
        }
        int length = str.length() / 16;
        byte[] bArr2 = new byte[(length * 16)];
        byte[] bArr3 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i * 16;
            i++;
            m110a(str.substring(i3, i * 16).getBytes(), bArr3, true);
            int i4 = i2;
            for (int i5 = 0; i5 < 16; i5++) {
                bArr2[i4] = bArr3[i5];
                i4++;
            }
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo9681a(byte[] bArr) throws Exception {
        if (bArr == null) {
            throw new Exception();
        } else if (bArr.length % 16 != 0) {
            throw new Exception();
        } else {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            int length = bArr.length / 16;
            byte[] bArr4 = new byte[(length * 16)];
            for (int i = 0; i < length; i++) {
                int i2 = i * 16;
                for (int i3 = 0; i3 < 16; i3++) {
                    bArr3[i3] = bArr[i2 + i3];
                }
                m110a(bArr3, bArr2, true);
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr4[i2 + i4] = bArr2[i4];
                }
            }
            return bArr4;
        }
    }

    /* renamed from: b */
    public final String mo9682b(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length % 16 != 0) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        if (length == 16) {
            bArr2 = new byte[16];
            m110a(bArr, bArr2, false);
        } else {
            int length2 = bArr.length / 16;
            byte[] bArr5 = new byte[(length2 * 16)];
            for (int i = 0; i < length2; i++) {
                int i2 = i * 16;
                for (int i3 = 0; i3 < 16; i3++) {
                    bArr4[i3] = bArr[i2 + i3];
                }
                m110a(bArr4, bArr3, false);
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr5[i2 + i4] = bArr3[i4];
                }
            }
            bArr2 = bArr5;
        }
        return new String(bArr2).replace('*', ' ').trim();
    }
}
