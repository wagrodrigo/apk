package com.datablink.mobile200.embeddedapi.p013a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.bouncycastle.util.encoders.C1314a;
import p060io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: com.datablink.mobile200.embeddedapi.a.h */
public final class C0641h {
    /* renamed from: a */
    public static String m140a(String str) throws Exception {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            C1314a aVar = new C1314a();
            byte[] bytes = str.getBytes();
            aVar.mo13327a(bytes, bytes.length, (OutputStream) dataOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), Charset.forName(HttpRequest.CHARSET_UTF8));
        } catch (Exception unused) {
            throw new Exception("ERR-MSG-01");
        }
    }

    /* renamed from: b */
    private static String m141b(String str) throws Exception {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            C1314a aVar = new C1314a();
            byte[] bytes = str.getBytes(HttpRequest.CHARSET_UTF8);
            aVar.mo13326a(bytes, 0, bytes.length, dataOutputStream);
            return new String(byteArrayOutputStream.toByteArray());
        } catch (Exception unused) {
            throw new Exception("Erro ao codificar mensagem.");
        }
    }
}
