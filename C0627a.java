package com.datablink.mobile200.embeddedapi.p013a.p014a;

/* renamed from: com.datablink.mobile200.embeddedapi.a.a.a */
public final class C0627a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m47a(byte[] r7, int r8) {
        /*
            r0 = 0
            r1 = -1
            r2 = r0
            r3 = r1
        L_0x0004:
            if (r2 >= r8) goto L_0x0027
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r5 = r7[r2]
            r4 = r4 ^ r5
            r5 = r4
            r4 = r0
        L_0x000d:
            r6 = 8
            if (r4 >= r6) goto L_0x0021
            r6 = r5 & 1
            if (r6 <= 0) goto L_0x001c
            int r5 = r5 >>> 1
            r6 = -306674912(0xffffffffedb88320, float:-7.13797E27)
            r5 = r5 ^ r6
            goto L_0x001e
        L_0x001c:
            int r5 = r5 >>> 1
        L_0x001e:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0021:
            int r3 = r3 >>> 8
            r3 = r3 ^ r5
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0027:
            r7 = r3 ^ -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a.m47a(byte[], int):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m48a(java.lang.String r9) {
        /*
            byte[] r9 = r9.getBytes()
            r0 = 0
            r1 = -1
            int r2 = r9.length
            r3 = r0
            r4 = r1
        L_0x0009:
            r5 = 8
            if (r3 >= r2) goto L_0x002c
            r6 = r4 & 255(0xff, float:3.57E-43)
            byte r7 = r9[r3]
            r6 = r6 ^ r7
            r7 = r6
            r6 = r0
        L_0x0014:
            if (r6 >= r5) goto L_0x0026
            r8 = r7 & 1
            if (r8 <= 0) goto L_0x0021
            int r7 = r7 >>> 1
            r8 = -306674912(0xffffffffedb88320, float:-7.13797E27)
            r7 = r7 ^ r8
            goto L_0x0023
        L_0x0021:
            int r7 = r7 >>> 1
        L_0x0023:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0026:
            int r4 = r4 >>> 8
            r4 = r4 ^ r7
            int r3 = r3 + 1
            goto L_0x0009
        L_0x002c:
            r9 = r4 ^ -1
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            java.lang.String r9 = r9.toUpperCase()
        L_0x0036:
            int r0 = r9.length()
            if (r0 >= r5) goto L_0x0043
            java.lang.String r0 = "0"
            java.lang.String r9 = r0.concat(r9)
            goto L_0x0036
        L_0x0043:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.p014a.C0627a.m48a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static String m49b(String str) throws Exception {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.concat(m48a(str));
                }
            } catch (Exception unused) {
            }
        }
        throw new Exception("Invalid data.");
    }

    /* renamed from: c */
    public static String m50c(String str) throws Exception {
        if (str != null) {
            try {
                int length = str.length();
                if (length > 8) {
                    int i = length - 8;
                    String substring = str.substring(0, i);
                    String substring2 = str.substring(i);
                    if (substring2.toUpperCase().equals(m48a(substring))) {
                        return substring;
                    }
                }
            } catch (Exception unused) {
            }
        }
        throw new Exception("Invalid data.");
    }
}
