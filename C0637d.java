package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a;
import java.util.Vector;

/* renamed from: com.datablink.mobile200.embeddedapi.a.d */
public final class C0637d {
    /* renamed from: a */
    public static String m128a() throws Exception {
        try {
            String str = String.valueOf(System.currentTimeMillis());
            while (str.length() < 6) {
                str = str.concat("0");
            }
            String a = C0627a.m48a(str);
            while (a.length() < 8) {
                a = a.concat("0");
            }
            return a.substring(2);
        } catch (Exception unused) {
            throw new Exception("ERRO BRTSMAU GSR");
        }
    }

    /* renamed from: a */
    public static Vector<String> m129a(String str, String str2) {
        int indexOf = str.indexOf(str2);
        Vector<String> vector = new Vector<>();
        while (indexOf == 0) {
            vector.addElement("");
            str = str.substring(indexOf + 1);
            indexOf = str.indexOf(str2);
        }
        while (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            while (true) {
                vector.addElement(substring);
                str = str.substring(indexOf + 1);
                indexOf = str.indexOf(str2);
                if (indexOf == 0) {
                    substring = "";
                }
            }
        }
        vector.addElement(str.substring(0));
        return vector;
    }
}
