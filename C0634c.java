package com.datablink.mobile200.embeddedapi.p013a.p015b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.C1314a;

/* renamed from: com.datablink.mobile200.embeddedapi.a.b.c */
public final class C0634c {
    /* renamed from: a */
    public static String m114a(byte[] bArr) throws Exception {
        try {
            return new String(m117d(bArr));
        } catch (Exception unused) {
            throw new Exception();
        }
    }

    /* renamed from: b */
    public static byte[] m115b(byte[] bArr) throws Exception {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C1314a().mo13327a(bArr, bArr.length, (OutputStream) new DataOutputStream(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            throw new Exception();
        }
    }

    /* renamed from: c */
    public static String m116c(byte[] bArr) throws Exception {
        try {
            return new String(m115b(bArr));
        } catch (Exception unused) {
            throw new Exception();
        }
    }

    /* renamed from: d */
    private static byte[] m117d(byte[] bArr) throws Exception {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C1314a().mo13326a(bArr, 0, bArr.length, new DataOutputStream(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            throw new Exception();
        }
    }
}
