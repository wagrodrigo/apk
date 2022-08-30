package com.datablink.mobile200.embeddedapi.p013a;

import com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi;
import com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception;
import com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Info;
import com.datablink.mobile200.embeddedapi.p013a.p015b.C0634c;
import com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.p064a.p065a.C1304e;
import org.bouncycastle.util.encoders.C1316c;

/* renamed from: com.datablink.mobile200.embeddedapi.a.p */
public final class C0649p implements C0642i, C0643j, C0644k, C0647n {

    /* renamed from: bo */
    private static final String f400bo = "70";

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m202A(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r4, java.lang.String r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0082
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r5 != 0) goto L_0x001c
            r3 = 1434(0x59a, float:2.01E-42)
            return r3
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            com.datablink.mobile200.embeddedapi.a.u r4 = new com.datablink.mobile200.embeddedapi.a.u     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r4.<init>()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            java.lang.String r2 = r3.mo9733a()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m345a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0654u) r4)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            if (r2 == 0) goto L_0x0039
            return r0
        L_0x0039:
            java.lang.String r0 = r4.mo9735a()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            boolean r5 = r5.equals(r0)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            if (r5 == 0) goto L_0x005b
            r5 = 0
            r4.mo9736a((int) r5)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r0.<init>()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m344a((com.datablink.mobile200.embeddedapi.p013a.C0654u) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r0)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            if (r4 == 0) goto L_0x0053
            return r4
        L_0x0053:
            java.lang.String r4 = r0.toString()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r3.mo9734a(r4)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            return r5
        L_0x005b:
            int r5 = r4.mo9738b()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            int r5 = r5 + 1
            r4.mo9736a((int) r5)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r5.<init>()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m344a((com.datablink.mobile200.embeddedapi.p013a.C0654u) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r5)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            if (r4 == 0) goto L_0x0070
            return r4
        L_0x0070:
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r3.mo9734a(r4)     // Catch:{ g -> 0x007f, Exception -> 0x007c, all -> 0x007a }
            r3 = 1436(0x59c, float:2.012E-42)
            return r3
        L_0x007a:
            r3 = move-exception
            throw r3
        L_0x007c:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x007f:
            r3 = 1316(0x524, float:1.844E-42)
            return r3
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m202A(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m203B(com.datablink.mobile200.embeddedapi.p013a.C0653t r6, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r7, java.lang.String r8) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r6 == 0) goto L_0x0087
            java.lang.String r1 = r6.mo9733a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r7 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r7.mo9677c()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            r1 = 1434(0x59a, float:2.01E-42)
            if (r8 != 0) goto L_0x001c
            return r1
        L_0x001c:
            int r2 = r8.length()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r2 != 0) goto L_0x0023
            return r1
        L_0x0023:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r2 = r7.mo9676b()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r7 = r7.mo9674a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r1.<init>(r2, r7)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            com.datablink.mobile200.embeddedapi.a.u r7 = new com.datablink.mobile200.embeddedapi.a.u     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r7.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r2 = r6.mo9733a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m345a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0654u) r7)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r2 == 0) goto L_0x0040
            return r0
        L_0x0040:
            char[] r0 = r8.toCharArray()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r2 = f354Q_     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r3 = new java.lang.String     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r3.<init>(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r2 = 0
            r4 = r2
        L_0x004d:
            int r5 = r0.length     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r4 >= r5) goto L_0x0062
            char r5 = r0[r4]     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            boolean r5 = r3.contains(r5)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r5 != 0) goto L_0x005f
            r6 = 1442(0x5a2, float:2.02E-42)
            return r6
        L_0x005f:
            int r4 = r4 + 1
            goto L_0x004d
        L_0x0062:
            r7.mo9739b((java.lang.String) r8)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r7.mo9736a((int) r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r7.mo9740c()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r8.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            int r7 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m344a((com.datablink.mobile200.embeddedapi.p013a.C0654u) r7, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r8)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r7 == 0) goto L_0x0077
            return r7
        L_0x0077:
            java.lang.String r7 = r8.toString()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.mo9734a(r7)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            return r2
        L_0x007f:
            r6 = move-exception
            throw r6
        L_0x0081:
            r6 = 1300(0x514, float:1.822E-42)
            return r6
        L_0x0084:
            r6 = 1316(0x524, float:1.844E-42)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m203B(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m204a(com.datablink.mobile200.embeddedapi.p013a.C0653t r5, com.datablink.mobile200.embeddedapi.p013a.C0631b r6) {
        /*
            if (r5 != 0) goto L_0x0005
            r5 = 1314(0x522, float:1.841E-42)
            return r5
        L_0x0005:
            java.lang.String r0 = r5.mo9733a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r1 = 1310(0x51e, float:1.836E-42)
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            r0 = 1315(0x523, float:1.843E-42)
            if (r6 != 0) goto L_0x0013
            return r0
        L_0x0013:
            boolean r2 = r6.mo9677c()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r2 != 0) goto L_0x001a
            return r0
        L_0x001a:
            com.datablink.mobile200.embeddedapi.a.c r0 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r2 = r6.mo9676b()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r3 = r6.mo9674a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r0.<init>(r2, r3)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r4 = new java.lang.String     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = r6.mo9674a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = org.bouncycastle.util.encoders.C1316c.m2561a((byte[]) r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r4.<init>(r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.append(r4)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.append(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r6 = r6.toString()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = r6.getBytes()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = com.datablink.mobile200.embeddedapi.p013a.p015b.C0635d.m118a(r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r2 = new java.lang.String     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r3 = 8
            r4 = 0
            r2.<init>(r6, r4, r3)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r6 = r0.mo9671c(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            com.datablink.mobile200.embeddedapi.a.v r2 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r2.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r6 = r6.substring(r4, r3)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r2.mo9754c((java.lang.String) r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            int r0 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r0, (java.lang.StringBuffer) r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r0 == 0) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.String r6 = r6.toString()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r5.mo9734a(r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            return r4
        L_0x007f:
            r5 = move-exception
            throw r5
        L_0x0081:
            r5 = 1300(0x514, float:1.822E-42)
            return r5
        L_0x0084:
            r5 = 1316(0x524, float:1.844E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m204a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m205a(com.datablink.mobile200.embeddedapi.p013a.C0653t r4, com.datablink.mobile200.embeddedapi.p013a.C0631b r5, com.datablink.mobile200.embeddedapi.p013a.C0652s r6) {
        /*
            if (r6 != 0) goto L_0x0005
            r4 = 1314(0x522, float:1.841E-42)
            return r4
        L_0x0005:
            r0 = 1310(0x51e, float:1.836E-42)
            if (r4 == 0) goto L_0x007d
            java.lang.String r1 = r4.mo9733a()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            if (r1 != 0) goto L_0x0010
            return r0
        L_0x0010:
            r1 = 1315(0x523, float:1.843E-42)
            if (r5 != 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r2 = r5.mo9677c()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            if (r2 != 0) goto L_0x001c
            return r1
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            byte[] r2 = r5.mo9676b()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            byte[] r3 = r5.mo9674a()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r1.<init>(r2, r3)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            com.datablink.mobile200.embeddedapi.a.v r2 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r2.<init>()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            java.lang.String r3 = r4.mo9733a()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            int r3 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r2)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            if (r3 == 0) goto L_0x0039
            return r0
        L_0x0039:
            java.lang.String r3 = com.datablink.mobile200.embeddedapi.p013a.C0637d.m128a()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r2.mo9757d((java.lang.String) r3)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            com.datablink.mobile200.embeddedapi.a.ac r3 = new com.datablink.mobile200.embeddedapi.a.ac     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            byte[] r5 = r5.mo9676b()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r3.<init>(r5)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r5.<init>()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            int r3 = com.datablink.mobile200.embeddedapi.p013a.C0658y.m525a(r2, r3, r5)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            if (r3 == 0) goto L_0x0059
            r4 = 0
            r6.mo9732a(r4)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            return r3
        L_0x0059:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r3.<init>()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            int r1 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r3)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            if (r1 == 0) goto L_0x0065
            return r0
        L_0x0065:
            java.lang.String r0 = r3.toString()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r4.mo9734a(r0)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r6.mo9732a(r4)     // Catch:{ g -> 0x007a, Exception -> 0x0077, all -> 0x0075 }
            r4 = 0
            return r4
        L_0x0075:
            r4 = move-exception
            throw r4
        L_0x0077:
            r4 = 1300(0x514, float:1.822E-42)
            return r4
        L_0x007a:
            r4 = 1316(0x524, float:1.844E-42)
            return r4
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m205a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, com.datablink.mobile200.embeddedapi.a.s):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m206a(com.datablink.mobile200.embeddedapi.p013a.C0653t r4, com.datablink.mobile200.embeddedapi.p013a.C0631b r5, com.datablink.mobile200.embeddedapi.p013a.C0656w r6) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r4 == 0) goto L_0x0047
            java.lang.String r1 = r4.mo9733a()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r5.mo9677c()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r6 != 0) goto L_0x001c
            r4 = 1314(0x522, float:1.841E-42)
            return r4
        L_0x001c:
            byte[] r1 = r5.mo9676b()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            com.datablink.mobile200.embeddedapi.a.c r2 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            byte[] r3 = r5.mo9676b()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            byte[] r5 = r5.mo9674a()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            r2.<init>(r3, r5)     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            com.datablink.mobile200.embeddedapi.a.v r5 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            r5.<init>()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            java.lang.String r4 = r4.mo9733a()     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r5)     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            if (r4 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r6.mo9792a(r5, r1)     // Catch:{ g -> 0x0047, Exception -> 0x0044, all -> 0x0042 }
            r4 = 0
            return r4
        L_0x0042:
            r4 = move-exception
            throw r4
        L_0x0044:
            r4 = 1300(0x514, float:1.822E-42)
            return r4
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m206a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, com.datablink.mobile200.embeddedapi.a.w):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m207a(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p013a.C0631b r4, com.datablink.mobile200.embeddedapi.p013a.C0657x r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0043
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r5 != 0) goto L_0x001c
            r3 = 1314(0x522, float:1.841E-42)
            return r3
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            com.datablink.mobile200.embeddedapi.a.u r4 = new com.datablink.mobile200.embeddedapi.a.u     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            r4.<init>()     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            java.lang.String r3 = r3.mo9733a()     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            int r3 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m345a((java.lang.String) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0654u) r4)     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            if (r3 == 0) goto L_0x0039
            return r0
        L_0x0039:
            r5.mo9813a((com.datablink.mobile200.embeddedapi.p013a.C0654u) r4)     // Catch:{ g -> 0x0043, Exception -> 0x0040, all -> 0x003e }
            r3 = 0
            return r3
        L_0x003e:
            r3 = move-exception
            throw r3
        L_0x0040:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m207a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, com.datablink.mobile200.embeddedapi.a.x):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0139, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f261W;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m208a(com.datablink.mobile200.embeddedapi.p013a.C0653t r11, com.datablink.mobile200.embeddedapi.p013a.C0631b r12, java.lang.String r13) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r11 == 0) goto L_0x013c
            java.lang.String r1 = r11.mo9733a()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r12 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r12.mo9677c()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            r1 = 1321(0x529, float:1.851E-42)
            if (r13 != 0) goto L_0x001c
            return r1
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r2 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            byte[] r3 = r12.mo9676b()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            byte[] r4 = r12.mo9674a()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r2.<init>(r3, r4)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            com.datablink.mobile200.embeddedapi.a.v r3 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r3.<init>()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            java.lang.String r4 = r11.mo9733a()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r3)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r4 == 0) goto L_0x0039
            return r0
        L_0x0039:
            com.datablink.mobile200.embeddedapi.a.ac r0 = new com.datablink.mobile200.embeddedapi.a.ac     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            byte[] r4 = r12.mo9676b()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r0.<init>(r4)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            com.datablink.mobile200.embeddedapi.a.z r4 = new com.datablink.mobile200.embeddedapi.a.z     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r4.<init>()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r13 = com.datablink.mobile200.embeddedapi.p013a.C0659z.m526a(r13, r0, r4)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 == 0) goto L_0x004e
            return r1
        L_0x004e:
            long r5 = r4.mo9822i()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            long r9 = r5 - r7
            int r13 = (int) r9     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r3.mo9747a((int) r13)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r13 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 == 0) goto L_0x0076
            java.lang.String r13 = r3.mo9782r()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            java.lang.String r1 = r4.mo9814a()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            boolean r13 = r13.equals(r1)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 != 0) goto L_0x0076
            r11 = 1322(0x52a, float:1.853E-42)
            return r11
        L_0x0076:
            java.lang.String r13 = r3.mo9767h()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            java.lang.String r1 = r4.mo9816c()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            boolean r13 = r13.equals(r1)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 != 0) goto L_0x0087
            r11 = 1323(0x52b, float:1.854E-42)
            return r11
        L_0x0087:
            java.lang.String r13 = r3.mo9769i()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            java.lang.String r1 = r4.mo9817d()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            boolean r13 = r13.equals(r1)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 != 0) goto L_0x0098
            r11 = 1324(0x52c, float:1.855E-42)
            return r11
        L_0x0098:
            java.lang.String r13 = ""
            r3.mo9757d((java.lang.String) r13)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r13 = r4.mo9819f()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 != 0) goto L_0x00cc
            int r13 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r0 = 0
            if (r13 != 0) goto L_0x00ab
            return r0
        L_0x00ab:
            int r13 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r13 == 0) goto L_0x0136
            com.datablink.mobile200.embeddedapi.a.t r13 = new com.datablink.mobile200.embeddedapi.a.t     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r13.<init>()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            java.lang.String r1 = r11.mo9733a()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r13.mo9734a(r1)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r12 = m221b((com.datablink.mobile200.embeddedapi.p013a.C0653t) r13, (com.datablink.mobile200.embeddedapi.p013a.C0631b) r12)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 == 0) goto L_0x00c4
            return r12
        L_0x00c4:
            java.lang.String r12 = r13.mo9733a()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r11.mo9734a(r12)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            return r0
        L_0x00cc:
            int r12 = r4.mo9819f()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r13 = 1325(0x52d, float:1.857E-42)
            r1 = 1
            r5 = 2
            if (r12 != r1) goto L_0x0106
            int r12 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 != r1) goto L_0x00e1
            int r11 = m212a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r11, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2, (com.datablink.mobile200.embeddedapi.p013a.C0659z) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r0)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            return r11
        L_0x00e1:
            int r12 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 != 0) goto L_0x00ec
            int r11 = m212a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r11, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2, (com.datablink.mobile200.embeddedapi.p013a.C0659z) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r0)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            return r11
        L_0x00ec:
            int r12 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 != r5) goto L_0x0105
            int r12 = r4.mo9819f()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r3.mo9763f((int) r12)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r12 = r4.mo9820g()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r3.mo9760e((int) r12)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r11 = m211a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r11, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            return r11
        L_0x0105:
            return r13
        L_0x0106:
            int r12 = r4.mo9819f()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 != r5) goto L_0x0133
            int r12 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 != r5) goto L_0x011e
            int r12 = r4.mo9820g()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r3.mo9760e((int) r12)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r11 = m211a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r11, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            return r11
        L_0x011e:
            int r12 = r3.mo9744C()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            if (r12 != r1) goto L_0x0133
            r3.mo9763f((int) r5)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r12 = r4.mo9820g()     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            r3.mo9760e((int) r12)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            int r11 = m211a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r11, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2)     // Catch:{ g -> 0x0139, Exception -> 0x0136, all -> 0x0134 }
            return r11
        L_0x0133:
            return r13
        L_0x0134:
            r11 = move-exception
            throw r11
        L_0x0136:
            r11 = 1326(0x52e, float:1.858E-42)
            return r11
        L_0x0139:
            r11 = 1316(0x524, float:1.844E-42)
            return r11
        L_0x013c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m208a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0178, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m209a(com.datablink.mobile200.embeddedapi.p013a.C0653t r10, com.datablink.mobile200.embeddedapi.p013a.C0631b r11, java.lang.String r12, java.lang.String r13, java.lang.StringBuffer r14) {
        /*
            if (r14 != 0) goto L_0x0005
            r10 = 1314(0x522, float:1.841E-42)
            return r10
        L_0x0005:
            r0 = 1310(0x51e, float:1.836E-42)
            if (r10 == 0) goto L_0x017b
            java.lang.String r1 = r10.mo9733a()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r1 != 0) goto L_0x0010
            return r0
        L_0x0010:
            r1 = 1315(0x523, float:1.843E-42)
            if (r11 != 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r2 = r11.mo9677c()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r2 != 0) goto L_0x001c
            return r1
        L_0x001c:
            int r1 = r14.length()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r2 = 0
            if (r1 <= 0) goto L_0x0026
            r14.setLength(r2)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
        L_0x0026:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            byte[] r3 = r11.mo9676b()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            byte[] r11 = r11.mo9674a()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r1.<init>(r3, r11)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            com.datablink.mobile200.embeddedapi.a.v r11 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11.<init>()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r10 = r10.mo9733a()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r10 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r10, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r11)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r10 == 0) goto L_0x0043
            return r0
        L_0x0043:
            int r10 = r11.mo9744C()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r0 = 1
            if (r10 == r0) goto L_0x0058
            r11 = 2
            if (r10 != r11) goto L_0x0050
            r10 = 1312(0x520, float:1.839E-42)
            return r10
        L_0x0050:
            if (r10 != 0) goto L_0x0055
            r10 = 1311(0x51f, float:1.837E-42)
            return r10
        L_0x0055:
            r10 = 1313(0x521, float:1.84E-42)
            return r10
        L_0x0058:
            boolean r10 = r11.mo9749a()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r10 != 0) goto L_0x0061
            r10 = 1320(0x528, float:1.85E-42)
            return r10
        L_0x0061:
            int r10 = r11.mo9765g()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r1 = r11.mo9788x()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r3 = r11.mo9787w()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r11 = r11.mo9745D()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            org.bouncycastle.a.d.a r4 = new org.bouncycastle.a.d.a     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            byte[] r11 = m219a((java.lang.String) r11)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4.<init>(r11)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            long r10 = (long) r10     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            long r7 = r5 + r10
            int r10 = (int) r7     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            org.bouncycastle.a.c.a r11 = new org.bouncycastle.a.c.a     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            org.bouncycastle.a.a.c r5 = new org.bouncycastle.a.a.c     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r5.<init>()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11.<init>(r5)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11.mo13320a((org.bouncycastle.p064a.C1305b) r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r4 = "ASCII"
            byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r12 == 0) goto L_0x00c0
            byte[] r12 = org.bouncycastle.util.encoders.C1316c.m2560a((java.lang.String) r12)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r4 = r12.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r5 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r4 = r4 + r5
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r5 = r2
        L_0x00a4:
            int r6 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r5 >= r6) goto L_0x00ae
            byte r6 = r13[r5]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00ae:
            r5 = r2
        L_0x00af:
            int r6 = r12.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r5 >= r6) goto L_0x00bb
            int r6 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r6 = r6 + r5
            byte r7 = r12[r5]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4[r6] = r7     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r5 = r5 + 1
            goto L_0x00af
        L_0x00bb:
            byte[] r12 = m220a((byte[]) r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            goto L_0x00c4
        L_0x00c0:
            byte[] r12 = m220a((byte[]) r13)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
        L_0x00c4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13.<init>()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r4 = m232b(r1)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13.append(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4 = 64
            java.lang.String r4 = m217a((int) r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13.append(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13.append(r3)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r4 = "S"
            r13.append(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            java.lang.String r4 = "US-ASCII"
            byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r4 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r4 = r4 + r0
            int r4 = r4 + 128
            r5 = 8
            int r4 = r4 + r5
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r6 = r2
            r7 = r6
        L_0x00f6:
            int r8 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r6 >= r8) goto L_0x0103
            int r8 = r7 + 1
            byte r9 = r13[r6]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4[r7] = r9     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r6 = r6 + 1
            r7 = r8
            goto L_0x00f6
        L_0x0103:
            int r6 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r6 = r6 + r0
            r7 = r6
            r6 = r2
        L_0x0107:
            int r8 = r12.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            if (r6 >= r8) goto L_0x0114
            int r8 = r7 + 1
            byte r9 = r12[r6]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4[r7] = r9     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r6 = r6 + 1
            r7 = r8
            goto L_0x0107
        L_0x0114:
            int r12 = r13.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r12 = r12 + r0
            int r12 = r12 + 128
            int r10 = r10 / r3
            long r6 = (long) r10     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            byte[] r10 = m218a((long) r6)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13 = r12
            r12 = r2
        L_0x0120:
            if (r12 >= r5) goto L_0x012c
            int r3 = r13 + 1
            byte r6 = r10[r12]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r4[r13] = r6     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r12 = r12 + 1
            r13 = r3
            goto L_0x0120
        L_0x012c:
            int r10 = r4.length     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11.mo13321a(r4, r10)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r10 = 20
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11.mo13317a((byte[]) r10)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11 = 19
            byte r11 = r10[r11]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11 = r11 & 15
            byte r12 = r10[r11]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r12 = r12 & 127(0x7f, float:1.78E-43)
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            int r13 = r11 + 1
            byte r13 = r10[r13]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r12 = r12 | r13
            int r13 = r11 + 2
            byte r13 = r10[r13]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r5
            r12 = r12 | r13
            int r11 = r11 + 3
            byte r10 = r10[r11]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r12
            char[] r11 = new char[r1]     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r12 = r10
            r10 = r2
        L_0x0161:
            if (r10 >= r1) goto L_0x0172
            int r13 = r1 - r10
            int r13 = r13 - r0
            int r3 = r12 % 10
            int r3 = r3 + 48
            char r3 = (char) r3     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            r11[r13] = r3     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            int r12 = r12 / 10
            int r10 = r10 + 1
            goto L_0x0161
        L_0x0172:
            r14.append(r11)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            return r2
        L_0x0176:
            r10 = move-exception
            throw r10
        L_0x0178:
            r10 = 1300(0x514, float:1.822E-42)
            return r10
        L_0x017b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m209a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String, java.lang.String, java.lang.StringBuffer):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m210a(com.datablink.mobile200.embeddedapi.p013a.C0653t r12, com.datablink.mobile200.embeddedapi.p013a.C0631b r13, java.lang.String r14, java.lang.StringBuffer r15) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r12 == 0) goto L_0x0152
            r1 = 1300(0x514, float:1.822E-42)
            java.lang.String r2 = r12.mo9733a()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            if (r2 != 0) goto L_0x000d
            return r0
        L_0x000d:
            r2 = 1315(0x523, float:1.843E-42)
            if (r13 != 0) goto L_0x0012
            return r2
        L_0x0012:
            boolean r3 = r13.mo9677c()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            if (r3 != 0) goto L_0x0019
            return r2
        L_0x0019:
            if (r15 != 0) goto L_0x001e
            r12 = 1314(0x522, float:1.841E-42)
            return r12
        L_0x001e:
            int r2 = r15.length()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            r3 = 0
            if (r2 <= 0) goto L_0x0028
            r15.setLength(r3)     // Catch:{ Exception -> 0x0151, all -> 0x014f }
        L_0x0028:
            com.datablink.mobile200.embeddedapi.a.c r2 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            byte[] r4 = r13.mo9676b()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            byte[] r13 = r13.mo9674a()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            r2.<init>(r4, r13)     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            com.datablink.mobile200.embeddedapi.a.v r13 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            r13.<init>()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            java.lang.String r12 = r12.mo9733a()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            int r12 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r12, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r2, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r13)     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            if (r12 == 0) goto L_0x0045
            return r0
        L_0x0045:
            int r12 = r13.mo9744C()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            r0 = 1
            if (r12 == r0) goto L_0x005a
            r13 = 2
            if (r12 != r13) goto L_0x0052
            r12 = 1312(0x520, float:1.839E-42)
            return r12
        L_0x0052:
            if (r12 != 0) goto L_0x0057
            r12 = 1311(0x51f, float:1.837E-42)
            return r12
        L_0x0057:
            r12 = 1313(0x521, float:1.84E-42)
            return r12
        L_0x005a:
            int r12 = r13.mo9765g()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            int r2 = r13.mo9785u()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            int r4 = r13.mo9786v()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            java.lang.String r13 = r13.mo9745D()     // Catch:{ Exception -> 0x0151, all -> 0x014f }
            org.bouncycastle.a.d.a r5 = new org.bouncycastle.a.d.a     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            byte[] r13 = m219a((java.lang.String) r13)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r5.<init>(r13)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            long r12 = (long) r12     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            long r8 = r6 + r12
            int r12 = (int) r8     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            org.bouncycastle.a.c.a r13 = new org.bouncycastle.a.c.a     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            org.bouncycastle.a.a.c r6 = new org.bouncycastle.a.a.c     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r6.<init>()     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13.<init>(r6)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13.mo13320a((org.bouncycastle.p064a.C1305b) r5)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r5 = 8
            if (r14 != 0) goto L_0x009a
            int r12 = r12 / r4
            long r6 = (long) r12     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            byte[] r12 = m218a((long) r6)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13.mo13321a(r12, r5)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            goto L_0x0108
        L_0x009a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r6.<init>()     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            java.lang.String r7 = m232b(r2)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r6.append(r7)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r7 = 21
            java.lang.String r7 = m217a((int) r7)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r6.append(r7)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r6.append(r4)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            java.lang.String r7 = "S"
            r6.append(r7)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            java.lang.String r7 = "US-ASCII"
            byte[] r6 = r6.getBytes(r7)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r7 = r6.length     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r7 = r7 + r0
            int r7 = r7 + 128
            int r7 = r7 + r5
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r8 = r3
            r9 = r8
        L_0x00ca:
            int r10 = r6.length     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            if (r8 >= r10) goto L_0x00d7
            int r10 = r9 + 1
            byte r11 = r6[r8]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r7[r9] = r11     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r8 = r8 + 1
            r9 = r10
            goto L_0x00ca
        L_0x00d7:
            int r8 = r6.length     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r8 = r8 + r0
            byte[] r14 = org.bouncycastle.util.encoders.C1316c.m2560a((java.lang.String) r14)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r9 = r8
            r8 = r3
        L_0x00df:
            int r10 = r14.length     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            if (r8 >= r10) goto L_0x00ec
            int r10 = r9 + 1
            byte r11 = r14[r8]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r7[r9] = r11     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r8 = r8 + 1
            r9 = r10
            goto L_0x00df
        L_0x00ec:
            int r14 = r6.length     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r14 = r14 + r0
            int r14 = r14 + 128
            int r12 = r12 / r4
            long r8 = (long) r12     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            byte[] r12 = m218a((long) r8)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r4 = r14
            r14 = r3
        L_0x00f8:
            if (r14 >= r5) goto L_0x0104
            int r6 = r4 + 1
            byte r8 = r12[r14]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r7[r4] = r8     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r14 = r14 + 1
            r4 = r6
            goto L_0x00f8
        L_0x0104:
            int r12 = r7.length     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13.mo13321a(r7, r12)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
        L_0x0108:
            r12 = 20
            byte[] r12 = new byte[r12]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13.mo13317a((byte[]) r12)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13 = 19
            byte r13 = r12[r13]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13 = r13 & 15
            byte r14 = r12[r13]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r14 = r14 & 127(0x7f, float:1.78E-43)
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 24
            int r4 = r13 + 1
            byte r4 = r12[r4]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r14 = r14 | r4
            int r4 = r13 + 2
            byte r4 = r12[r4]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r5
            r14 = r14 | r4
            int r13 = r13 + 3
            byte r12 = r12[r13]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            char[] r13 = new char[r2]     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r14 = r12
            r12 = r3
        L_0x0139:
            if (r12 >= r2) goto L_0x014a
            int r4 = r2 - r12
            int r4 = r4 - r0
            int r5 = r14 % 10
            int r5 = r5 + 48
            char r5 = (char) r5     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            r13[r4] = r5     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            int r14 = r14 / 10
            int r12 = r12 + 1
            goto L_0x0139
        L_0x014a:
            r15.append(r13)     // Catch:{ Exception -> 0x014e, all -> 0x014f }
            return r3
        L_0x014e:
            return r1
        L_0x014f:
            r12 = move-exception
            throw r12
        L_0x0151:
            return r1
        L_0x0152:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m210a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String, java.lang.StringBuffer):int");
    }

    /* renamed from: a */
    private static int m211a(C0653t tVar, C0655v vVar, C0629ab abVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (C0655v.m422a(vVar, (C0629ab) (C0636c) abVar, stringBuffer) != 0) {
            return C0643j.f239G;
        }
        tVar.mo9734a(stringBuffer.toString());
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0123, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m212a(com.datablink.mobile200.embeddedapi.p013a.C0653t r10, com.datablink.mobile200.embeddedapi.p013a.C0655v r11, com.datablink.mobile200.embeddedapi.p013a.C0629ab r12, com.datablink.mobile200.embeddedapi.p013a.C0659z r13, com.datablink.mobile200.embeddedapi.p013a.C0629ab r14) {
        /*
            java.lang.String r0 = "#"
            java.lang.String r1 = r13.mo9821h()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 1321(0x529, float:1.851E-42)
            if (r1 <= 0) goto L_0x006a
            java.lang.String r1 = r13.mo9821h()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r1 = r14.mo9672d(r1)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r1 == 0) goto L_0x006a
            java.util.Vector r0 = com.datablink.mobile200.embeddedapi.p013a.C0637d.m129a(r1, r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r1 = r0.size()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r6 = r1 % 2
            if (r6 != r4) goto L_0x0028
            return r5
        L_0x0028:
            r6 = r2
            r7 = r6
            r2 = r3
        L_0x002b:
            if (r2 >= r1) goto L_0x0068
            java.lang.Object r8 = r0.elementAt(r2)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r9 = "CMD_AT"
            boolean r9 = r8.equals(r9)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r9 == 0) goto L_0x004c
            int r7 = r2 + 1
            java.lang.Object r7 = r0.elementAt(r7)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r8 = ""
            boolean r8 = r7.equals(r8)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r8 == 0) goto L_0x0065
            return r5
        L_0x004c:
            java.lang.String r9 = "CMD_UP"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r8 == 0) goto L_0x0065
            int r6 = r2 + 1
            java.lang.Object r6 = r0.elementAt(r6)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r8 = ""
            boolean r8 = r6.equals(r8)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r8 == 0) goto L_0x0065
            return r5
        L_0x0065:
            int r2 = r2 + 2
            goto L_0x002b
        L_0x0068:
            r2 = r6
            goto L_0x006b
        L_0x006a:
            r7 = r2
        L_0x006b:
            int r0 = r13.mo9819f()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r0 != 0) goto L_0x009a
            com.datablink.mobile200.embeddedapi.a.v r14 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r14.<init>()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r0 = r11.mo9782r()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r14.mo9766g((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r0 = r11.mo9767h()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r14.mo9754c((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r0 = r13.mo9818e()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r14.mo9761e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r14.mo9763f((int) r3)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r13 = r13.mo9820g()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r14.mo9760e((int) r13)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r10 = m211a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r10, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r11, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r12)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            return r10
        L_0x009a:
            int r0 = r13.mo9819f()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r0 != r4) goto L_0x0120
            int r0 = r11.mo9744C()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = r13.mo9814a()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9766g((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r0 = r13.mo9816c()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9754c((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r0 = r13.mo9818e()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9761e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9763f((int) r4)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r0 = r13.mo9820g()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9760e((int) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r13 = r13.mo9815b()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9751b((java.lang.String) r13)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r7 == 0) goto L_0x00e9
            java.lang.String r13 = r14.mo9672d(r7)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r0 = 40
            java.lang.String r0 = r13.substring(r3, r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r1 = 41
            java.lang.String r13 = r13.substring(r1)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9774k((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r13 = r14.mo9671c(r13)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9776l((java.lang.String) r13)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            goto L_0x011b
        L_0x00e9:
            return r5
        L_0x00ea:
            int r0 = r11.mo9744C()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r0 != r4) goto L_0x0120
            java.lang.String r0 = r11.mo9762f()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r1 = r13.mo9815b()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = r13.mo9815b()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9751b((java.lang.String) r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r2 == 0) goto L_0x0113
            java.lang.String r0 = r14.mo9672d(r2)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r14 = r14.mo9671c(r0)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9776l((java.lang.String) r14)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            goto L_0x0114
        L_0x0113:
            return r5
        L_0x0114:
            int r13 = r13.mo9820g()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r11.mo9760e((int) r13)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
        L_0x011b:
            int r10 = m211a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r10, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r11, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r12)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            return r10
        L_0x0120:
            return r5
        L_0x0121:
            r10 = move-exception
            throw r10
        L_0x0123:
            r10 = 1300(0x514, float:1.822E-42)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m212a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.v, com.datablink.mobile200.embeddedapi.a.ab, com.datablink.mobile200.embeddedapi.a.z, com.datablink.mobile200.embeddedapi.a.ab):int");
    }

    /* renamed from: a */
    private static int m213a(C0653t tVar, C0669b bVar, C0652s sVar) {
        return m205a(tVar, (C0631b) bVar, sVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m214a(com.datablink.mobile200.embeddedapi.p013a.C0653t r9, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r10, java.lang.StringBuffer r11, int r12) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r9 == 0) goto L_0x008c
            java.lang.String r1 = r9.mo9733a()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r10 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r10.mo9677c()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r11 != 0) goto L_0x001c
            r9 = 1314(0x522, float:1.841E-42)
            return r9
        L_0x001c:
            int r1 = r11.length()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            r2 = 0
            if (r1 <= 0) goto L_0x0026
            r11.setLength(r2)     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
        L_0x0026:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            byte[] r3 = r10.mo9676b()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            byte[] r10 = r10.mo9674a()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            r1.<init>(r3, r10)     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            com.datablink.mobile200.embeddedapi.a.v r10 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            r10.<init>()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r9 = r9.mo9733a()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            int r9 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r9, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r10)     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            if (r9 == 0) goto L_0x0043
            return r0
        L_0x0043:
            int r9 = r10.mo9744C()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            r0 = 1
            if (r9 == r0) goto L_0x004d
            r9 = 1404(0x57c, float:1.967E-42)
            return r9
        L_0x004d:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r9 = r10.mo9765g()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            long r5 = (long) r9     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            long r7 = r3 + r5
            if (r12 != r0) goto L_0x0062
            int r0 = r10.mo9786v()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            goto L_0x0071
        L_0x0062:
            r9 = 2
            if (r12 != r9) goto L_0x006a
            int r0 = r10.mo9787w()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            goto L_0x0071
        L_0x006a:
            r9 = 3
            if (r12 != r9) goto L_0x0071
            int r0 = r10.mo9789y()     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
        L_0x0071:
            long r9 = (long) r0     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            long r7 = r7 % r9
            float r9 = (float) r7     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            r10 = 0
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r10 != 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            float r9 = r9 * r12
            float r10 = (float) r0     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            float r12 = r9 / r10
        L_0x0080:
            r11.append(r12)     // Catch:{ g -> 0x0089, Exception -> 0x0086, all -> 0x0084 }
            return r2
        L_0x0084:
            r9 = move-exception
            throw r9
        L_0x0086:
            r9 = 1300(0x514, float:1.822E-42)
            return r9
        L_0x0089:
            r9 = 1316(0x524, float:1.844E-42)
            return r9
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m214a(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.StringBuffer, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f285aU;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m215a(com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r1, java.lang.String r2, java.lang.StringBuffer r3) {
        /*
            com.datablink.mobile200.embeddedapi.a.q r0 = new com.datablink.mobile200.embeddedapi.a.q     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            byte[] r1 = r1.mo9676b()     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.lang.String r0 = "50&"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r1.append(r2)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r2 = 0
            java.lang.String r1 = com.datablink.mobile200.embeddedapi.p013a.C0650q.m314a((java.lang.String) r1, (com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Info) r2)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r3.append(r1)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r1 = 0
            return r1
        L_0x0021:
            r1 = move-exception
            throw r1
        L_0x0023:
            r1 = 1451(0x5ab, float:2.033E-42)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m215a(com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String, java.lang.StringBuffer):int");
    }

    /* renamed from: a */
    private static String m216a() {
        return "S";
    }

    /* renamed from: a */
    private static String m217a(int i) {
        return ":QH" + i + "-T";
    }

    /* renamed from: a */
    private static byte[] m218a(long j) {
        return new byte[]{(byte) ((int) ((j >>> 56) & 255)), (byte) ((int) ((j >>> 48) & 255)), (byte) ((int) ((j >>> 40) & 255)), (byte) ((int) ((j >>> 32) & 255)), (byte) ((int) ((j >>> 24) & 255)), (byte) ((int) ((j >>> 16) & 255)), (byte) ((int) ((j >>> 8) & 255)), (byte) ((int) (j & 255))};
    }

    /* renamed from: a */
    private static byte[] m219a(String str) throws Exception {
        try {
            byte[] a = C1316c.m2560a(str);
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = 0;
            }
            for (int length2 = length - a.length; length2 < a.length; length2++) {
                bArr[length2] = a[length2];
            }
            return bArr;
        } catch (Exception unused) {
            throw new Exception("Chave invalida.");
        }
    }

    /* renamed from: a */
    private static byte[] m220a(byte[] bArr) {
        C1304e eVar = new C1304e();
        eVar.mo13309a(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[eVar.mo13316f()];
        eVar.mo13314a(bArr2);
        return bArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m221b(com.datablink.mobile200.embeddedapi.p013a.C0653t r6, com.datablink.mobile200.embeddedapi.p013a.C0631b r7) {
        /*
            r0 = 1315(0x523, float:1.843E-42)
            if (r7 != 0) goto L_0x0005
            return r0
        L_0x0005:
            boolean r1 = r7.mo9677c()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            com.datablink.mobile200.embeddedapi.a.c r0 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            byte[] r1 = r7.mo9676b()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            byte[] r2 = r7.mo9674a()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r0.<init>(r1, r2)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            com.datablink.mobile200.embeddedapi.a.v r1 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r1.<init>()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r2 = r6.mo9733a()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r0, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r1)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r3 = 1310(0x51e, float:1.836E-42)
            if (r2 == 0) goto L_0x002b
            return r3
        L_0x002b:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r2 = new java.lang.String     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            byte[] r7 = r7.mo9674a()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            byte[] r7 = org.bouncycastle.util.encoders.C1316c.m2561a((byte[]) r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r2.<init>(r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r7.<init>()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r7.append(r2)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r7.append(r2)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r7.toString()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            byte[] r7 = r7.getBytes()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            byte[] r7 = com.datablink.mobile200.embeddedapi.p013a.p015b.C0635d.m118a(r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r2 = new java.lang.String     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r4 = 8
            r5 = 0
            r2.<init>(r7, r5, r4)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r0.mo9671c(r2)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            com.datablink.mobile200.embeddedapi.a.v r2 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r2.<init>()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r7.substring(r5, r4)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r2.mo9754c((java.lang.String) r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r1.mo9782r()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r2.mo9766g((java.lang.String) r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r1.mo9742A()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r2.mo9768h((java.lang.String) r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r1.mo9759e()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r2.mo9748a((java.lang.String) r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r7.<init>()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            int r0 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r0, (java.lang.StringBuffer) r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            return r3
        L_0x0090:
            java.lang.String r7 = r7.toString()     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            r6.mo9734a(r7)     // Catch:{ g -> 0x009d, Exception -> 0x009a, all -> 0x0098 }
            return r5
        L_0x0098:
            r6 = move-exception
            throw r6
        L_0x009a:
            r6 = 1300(0x514, float:1.822E-42)
            return r6
        L_0x009d:
            r6 = 1316(0x524, float:1.844E-42)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m221b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m222b(com.datablink.mobile200.embeddedapi.p013a.C0653t r7, com.datablink.mobile200.embeddedapi.p013a.C0631b r8, java.lang.String r9) {
        /*
            if (r7 == 0) goto L_0x0084
            r0 = 1300(0x514, float:1.822E-42)
            java.lang.String r1 = r7.mo9733a()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            if (r1 != 0) goto L_0x000c
            goto L_0x0084
        L_0x000c:
            r1 = 1315(0x523, float:1.843E-42)
            if (r8 != 0) goto L_0x0011
            return r1
        L_0x0011:
            boolean r2 = r8.mo9677c()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            if (r2 != 0) goto L_0x0018
            return r1
        L_0x0018:
            com.datablink.mobile200.embeddedapi.a.ac r1 = new com.datablink.mobile200.embeddedapi.a.ac     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            byte[] r2 = r8.mo9676b()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            r1.<init>(r2)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            java.lang.String r9 = r1.mo9670b(r9)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            java.lang.String r1 = "#"
            java.util.Vector r9 = com.datablink.mobile200.embeddedapi.p013a.C0637d.m129a(r9, r1)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            r1 = 0
            java.lang.Object r1 = r9.get(r1)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            java.lang.String r2 = "CMD_SC"
            boolean r1 = r1.equals(r2)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            if (r1 != 0) goto L_0x003b
            return r0
        L_0x003b:
            r1 = 1
            java.lang.Object r9 = r9.get(r1)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            long r1 = java.lang.Long.parseLong(r9)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            com.datablink.mobile200.embeddedapi.a.c r9 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            byte[] r3 = r8.mo9676b()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            byte[] r8 = r8.mo9674a()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            r9.<init>(r3, r8)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            com.datablink.mobile200.embeddedapi.a.v r8 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            r8.<init>()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            java.lang.String r3 = r7.mo9733a()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            int r3 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r3, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r9, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r8)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            if (r3 == 0) goto L_0x0063
            return r3
        L_0x0063:
            int r3 = r8.mo9744C()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            if (r3 != 0) goto L_0x006c
            r7 = 1311(0x51f, float:1.837E-42)
            return r7
        L_0x006c:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            long r5 = r1 - r3
            int r1 = (int) r5     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            r8.mo9747a((int) r1)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            int r7 = m211a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r7, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r8, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r9)     // Catch:{ g -> 0x0081, Exception -> 0x0080, all -> 0x007e }
            return r7
        L_0x007e:
            r7 = move-exception
            throw r7
        L_0x0080:
            return r0
        L_0x0081:
            r7 = 1316(0x524, float:1.844E-42)
            return r7
        L_0x0084:
            r7 = 1310(0x51e, float:1.836E-42)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m222b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0171, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m223b(com.datablink.mobile200.embeddedapi.p013a.C0653t r10, com.datablink.mobile200.embeddedapi.p013a.C0631b r11, java.lang.String r12, java.lang.String r13, java.lang.StringBuffer r14) {
        /*
            if (r14 != 0) goto L_0x0005
            r10 = 1314(0x522, float:1.841E-42)
            return r10
        L_0x0005:
            r0 = 1310(0x51e, float:1.836E-42)
            if (r10 == 0) goto L_0x0174
            java.lang.String r1 = r10.mo9733a()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r1 != 0) goto L_0x0010
            return r0
        L_0x0010:
            r1 = 1315(0x523, float:1.843E-42)
            if (r11 != 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r2 = r11.mo9677c()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r2 != 0) goto L_0x001c
            return r1
        L_0x001c:
            int r1 = r14.length()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r2 = 0
            if (r1 <= 0) goto L_0x0026
            r14.setLength(r2)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
        L_0x0026:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            byte[] r3 = r11.mo9676b()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            byte[] r11 = r11.mo9674a()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r1.<init>(r3, r11)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            com.datablink.mobile200.embeddedapi.a.v r11 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11.<init>()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r10 = r10.mo9733a()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r10 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r10, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r11)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r10 == 0) goto L_0x0043
            return r0
        L_0x0043:
            int r10 = r11.mo9744C()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r0 = 1
            if (r10 == r0) goto L_0x0058
            r11 = 2
            if (r10 != r11) goto L_0x0050
            r10 = 1312(0x520, float:1.839E-42)
            return r10
        L_0x0050:
            if (r10 != 0) goto L_0x0055
            r10 = 1311(0x51f, float:1.837E-42)
            return r10
        L_0x0055:
            r10 = 1313(0x521, float:1.84E-42)
            return r10
        L_0x0058:
            boolean r10 = r11.mo9752b()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r10 != 0) goto L_0x0061
            r10 = 1320(0x528, float:1.85E-42)
            return r10
        L_0x0061:
            int r10 = r11.mo9765g()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r1 = r11.mo9790z()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r3 = r11.mo9789y()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r11 = r11.mo9745D()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            org.bouncycastle.a.d.a r4 = new org.bouncycastle.a.d.a     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            byte[] r11 = m219a((java.lang.String) r11)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4.<init>(r11)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            long r10 = (long) r10     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            long r7 = r5 + r10
            int r10 = (int) r7     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            org.bouncycastle.a.c.a r11 = new org.bouncycastle.a.c.a     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            org.bouncycastle.a.a.c r5 = new org.bouncycastle.a.a.c     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r5.<init>()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11.<init>(r5)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11.mo13320a((org.bouncycastle.p064a.C1305b) r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r4 = "ASCII"
            byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            byte[] r12 = org.bouncycastle.util.encoders.C1316c.m2560a((java.lang.String) r12)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r4 = r12.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r5 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r4 = r4 + r5
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r5 = r2
        L_0x00a2:
            int r6 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r5 >= r6) goto L_0x00ac
            byte r6 = r13[r5]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4[r5] = r6     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r5 = r5 + 1
            goto L_0x00a2
        L_0x00ac:
            r5 = r2
        L_0x00ad:
            int r6 = r12.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r5 >= r6) goto L_0x00b9
            int r6 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r6 = r6 + r5
            byte r7 = r12[r5]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4[r6] = r7     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00b9:
            byte[] r12 = m220a((byte[]) r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13.<init>()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r4 = m232b(r1)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13.append(r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4 = 64
            java.lang.String r4 = m217a((int) r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13.append(r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13.append(r3)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r4 = "S"
            r13.append(r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            java.lang.String r4 = "US-ASCII"
            byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r4 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r4 = r4 + r0
            int r4 = r4 + 128
            r5 = 8
            int r4 = r4 + r5
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r6 = r2
            r7 = r6
        L_0x00ef:
            int r8 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r6 >= r8) goto L_0x00fc
            int r8 = r7 + 1
            byte r9 = r13[r6]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4[r7] = r9     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r6 = r6 + 1
            r7 = r8
            goto L_0x00ef
        L_0x00fc:
            int r6 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r6 = r6 + r0
            r7 = r6
            r6 = r2
        L_0x0100:
            int r8 = r12.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            if (r6 >= r8) goto L_0x010d
            int r8 = r7 + 1
            byte r9 = r12[r6]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4[r7] = r9     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r6 = r6 + 1
            r7 = r8
            goto L_0x0100
        L_0x010d:
            int r12 = r13.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r12 = r12 + r0
            int r12 = r12 + 128
            int r10 = r10 / r3
            long r6 = (long) r10     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            byte[] r10 = m218a((long) r6)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13 = r12
            r12 = r2
        L_0x0119:
            if (r12 >= r5) goto L_0x0125
            int r3 = r13 + 1
            byte r6 = r10[r12]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r4[r13] = r6     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r12 = r12 + 1
            r13 = r3
            goto L_0x0119
        L_0x0125:
            int r10 = r4.length     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11.mo13321a(r4, r10)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r10 = 20
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11.mo13317a((byte[]) r10)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11 = 19
            byte r11 = r10[r11]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11 = r11 & 15
            byte r12 = r10[r11]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r12 = r12 & 127(0x7f, float:1.78E-43)
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            int r13 = r11 + 1
            byte r13 = r10[r13]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r12 = r12 | r13
            int r13 = r11 + 2
            byte r13 = r10[r13]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r5
            r12 = r12 | r13
            int r11 = r11 + 3
            byte r10 = r10[r11]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r12
            char[] r11 = new char[r1]     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r12 = r10
            r10 = r2
        L_0x015a:
            if (r10 >= r1) goto L_0x016b
            int r13 = r1 - r10
            int r13 = r13 - r0
            int r3 = r12 % 10
            int r3 = r3 + 48
            char r3 = (char) r3     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            r11[r13] = r3     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            int r12 = r12 / 10
            int r10 = r10 + 1
            goto L_0x015a
        L_0x016b:
            r14.append(r11)     // Catch:{ Exception -> 0x0171, all -> 0x016f }
            return r2
        L_0x016f:
            r10 = move-exception
            throw r10
        L_0x0171:
            r10 = 1300(0x514, float:1.822E-42)
            return r10
        L_0x0174:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m223b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String, java.lang.String, java.lang.StringBuffer):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[Catch:{ Exception -> 0x009a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[Catch:{ Exception -> 0x009a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m224b(com.datablink.mobile200.embeddedapi.p013a.C0653t r5, com.datablink.mobile200.embeddedapi.p013a.C0631b r6, java.lang.String r7, java.lang.StringBuffer r8) {
        /*
            if (r8 != 0) goto L_0x0005
            r5 = 1314(0x522, float:1.841E-42)
            return r5
        L_0x0005:
            if (r5 == 0) goto L_0x009b
            r0 = 1300(0x514, float:1.822E-42)
            java.lang.String r1 = r5.mo9733a()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r1 != 0) goto L_0x0011
            goto L_0x009b
        L_0x0011:
            r1 = 1315(0x523, float:1.843E-42)
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            boolean r2 = r6.mo9677c()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r2 != 0) goto L_0x001d
            return r1
        L_0x001d:
            int r1 = r8.length()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2 = 0
            if (r1 <= 0) goto L_0x0027
            r8.setLength(r2)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
        L_0x0027:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r1.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.util.Vector r3 = new java.util.Vector     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r3.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r7 = m225b((com.datablink.mobile200.embeddedapi.p013a.C0653t) r5, (com.datablink.mobile200.embeddedapi.p013a.C0631b) r6, (java.lang.String) r7, (java.lang.StringBuffer) r1, (java.util.Vector<java.lang.String>) r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r7 == 0) goto L_0x0038
            return r7
        L_0x0038:
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r1 = "4"
            boolean r1 = r7.equals(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = "2"
            boolean r1 = r7.equals(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r1 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r1 = r2
            goto L_0x0050
        L_0x004f:
            r1 = 1
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            return r0
        L_0x0053:
            java.lang.String r1 = "4"
            boolean r7 = r7.equals(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r7 == 0) goto L_0x0061
            r3.remove(r2)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r3.remove(r2)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
        L_0x0061:
            java.lang.String r7 = ""
            java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
        L_0x0067:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r3 == 0) goto L_0x0083
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r4.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r4.append(r7)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r4.append(r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            goto L_0x0067
        L_0x0083:
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            byte[] r3 = r6.mo9674a()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            byte[] r3 = org.bouncycastle.util.encoders.C1316c.m2561a((byte[]) r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r5 = m209a((com.datablink.mobile200.embeddedapi.p013a.C0653t) r5, (com.datablink.mobile200.embeddedapi.p013a.C0631b) r6, (java.lang.String) r1, (java.lang.String) r7, (java.lang.StringBuffer) r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r5 == 0) goto L_0x0097
            return r5
        L_0x0097:
            return r2
        L_0x0098:
            r5 = move-exception
            throw r5
        L_0x009a:
            return r0
        L_0x009b:
            r5 = 1310(0x51e, float:1.836E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m224b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String, java.lang.StringBuffer):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m225b(com.datablink.mobile200.embeddedapi.p013a.C0653t r4, com.datablink.mobile200.embeddedapi.p013a.C0631b r5, java.lang.String r6, java.lang.StringBuffer r7, java.util.Vector<java.lang.String> r8) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r4 == 0) goto L_0x0065
            java.lang.String r1 = r4.mo9733a()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r5.mo9677c()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r8 != 0) goto L_0x001c
            r4 = 1314(0x522, float:1.841E-42)
            return r4
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            byte[] r2 = r5.mo9676b()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            byte[] r3 = r5.mo9674a()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            com.datablink.mobile200.embeddedapi.a.v r2 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            r2.<init>()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            java.lang.String r4 = r4.mo9733a()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r2)     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            if (r4 == 0) goto L_0x0039
            return r0
        L_0x0039:
            int r4 = r2.mo9744C()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            r0 = 1
            if (r4 == r0) goto L_0x004e
            r5 = 2
            if (r4 != r5) goto L_0x0046
            r4 = 1312(0x520, float:1.839E-42)
            return r4
        L_0x0046:
            if (r4 != 0) goto L_0x004b
            r4 = 1311(0x51f, float:1.837E-42)
            return r4
        L_0x004b:
            r4 = 1313(0x521, float:1.84E-42)
            return r4
        L_0x004e:
            boolean r4 = r2.mo9755c()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            if (r4 != 0) goto L_0x0057
            r4 = 1320(0x528, float:1.85E-42)
            return r4
        L_0x0057:
            byte[] r4 = r5.mo9676b()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0639f.m135a(r2, r4, r6, r7, r8)     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            return r4
        L_0x0060:
            r4 = move-exception
            throw r4
        L_0x0062:
            r4 = 1300(0x514, float:1.822E-42)
            return r4
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m225b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String, java.lang.StringBuffer, java.util.Vector):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m226b(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r4, int r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0054
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            com.datablink.mobile200.embeddedapi.a.v r4 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            r4.<init>()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            java.lang.String r2 = r3.mo9733a()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r4)     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            if (r2 == 0) goto L_0x0034
            return r0
        L_0x0034:
            r4.mo9756d((int) r5)     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            r5.<init>()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r5)     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            if (r4 == 0) goto L_0x0043
            return r0
        L_0x0043:
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            r3.mo9734a(r4)     // Catch:{ g -> 0x0051, Exception -> 0x004e, all -> 0x004c }
            r3 = 0
            return r3
        L_0x004c:
            r3 = move-exception
            throw r3
        L_0x004e:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x0051:
            r3 = 1316(0x524, float:1.844E-42)
            return r3
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m226b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, int):int");
    }

    /* renamed from: b */
    private static int m227b(C0653t tVar, C0669b bVar, String str, String str2, String str3, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            Vector vector = new Vector();
            vector.add(str2);
            vector.add(str);
            vector.add(str3);
            Iterator it = vector.iterator();
            while (true) {
                int i = 0;
                if (it.hasNext()) {
                    String str4 = (String) it.next();
                    if (str4 == null) {
                        return C0643j.f283aS;
                    }
                    char[] charArray = str4.toCharArray();
                    String str5 = new String(f355R_);
                    while (true) {
                        if (i < charArray.length) {
                            if (str5.contains(String.valueOf(charArray[i]))) {
                                return C0643j.f283aS;
                            }
                            i++;
                        }
                    }
                } else if (stringBuffer == null) {
                    return C0643j.f246K;
                } else {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.setLength(0);
                    }
                    C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
                    C0655v vVar = new C0655v();
                    if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                        return C0643j.f239G;
                    }
                    if (vVar.mo9783s() != 2) {
                        return C0643j.f244J;
                    }
                    String str6 = vVar.mo9782r() + "&" + str2 + "&" + str + "&" + str3;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int a = m215a(bVar, str6, stringBuffer2);
                    if (a != 0) {
                        return a;
                    }
                    stringBuffer.append(stringBuffer2.toString());
                    return 0;
                }
            }
        } catch (Exception unused) {
            return C0643j.f328bl;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m228b(com.datablink.mobile200.embeddedapi.p013a.C0653t r10, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r11, java.lang.String r12, java.lang.StringBuffer r13, java.lang.StringBuffer r14, java.util.Vector<java.lang.String> r15) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r10 == 0) goto L_0x0069
            java.lang.String r1 = r10.mo9733a()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r11 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r11.mo9677c()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r15 != 0) goto L_0x001c
            r10 = 1314(0x522, float:1.841E-42)
            return r10
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            byte[] r2 = r11.mo9676b()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            byte[] r3 = r11.mo9674a()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            com.datablink.mobile200.embeddedapi.a.v r4 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r4.<init>()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            java.lang.String r10 = r10.mo9733a()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            int r10 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r10, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r4)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            if (r10 == 0) goto L_0x0039
            return r0
        L_0x0039:
            int r10 = r4.mo9744C()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r0 = 1
            if (r10 == r0) goto L_0x004e
            r11 = 2
            if (r10 != r11) goto L_0x0046
            r10 = 1312(0x520, float:1.839E-42)
            return r10
        L_0x0046:
            if (r10 != 0) goto L_0x004b
            r10 = 1311(0x51f, float:1.837E-42)
            return r10
        L_0x004b:
            r10 = 1313(0x521, float:1.84E-42)
            return r10
        L_0x004e:
            boolean r10 = r4.mo9758d()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            if (r10 != 0) goto L_0x0057
            r10 = 1320(0x528, float:1.85E-42)
            return r10
        L_0x0057:
            byte[] r5 = r11.mo9676b()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            int r10 = com.datablink.mobile200.embeddedapi.p013a.C0638e.m130a(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            return r10
        L_0x0064:
            r10 = move-exception
            throw r10
        L_0x0066:
            r10 = 1300(0x514, float:1.822E-42)
            return r10
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m228b(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String, java.lang.StringBuffer, java.lang.StringBuffer, java.util.Vector):int");
    }

    /* renamed from: b */
    private int m229b(C0653t tVar, C0669b bVar, String str, Vector<String> vector, StringBuffer stringBuffer) throws DatablinkMobile200EmbeddedApi_Exception {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            int i = 0;
            while (true) {
                boolean z = true;
                if (i < vector.size()) {
                    String str2 = vector.get(i);
                    if (str2 == null) {
                        return C0643j.f283aS;
                    }
                    char[] charArray = str2.toCharArray();
                    String str3 = new String(f355R_);
                    for (char valueOf : charArray) {
                        if (str3.contains(String.valueOf(valueOf))) {
                            return C0643j.f283aS;
                        }
                    }
                    i++;
                } else if (stringBuffer == null) {
                    return C0643j.f246K;
                } else {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.setLength(0);
                    }
                    Vector vector2 = new Vector();
                    if (m240g(bVar, str, (Vector<String>) vector2) != 0) {
                        return C0643j.f312av;
                    }
                    if (m208a(tVar, (C0631b) bVar, (String) vector2.elementAt(0)) != 0) {
                        return C0643j.f268aD;
                    }
                    C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
                    C0655v vVar = new C0655v();
                    if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                        return C0643j.f239G;
                    }
                    if ((vVar.mo9784t() != 3 && vVar.mo9784t() != 5) || vVar.mo9744C() != 1) {
                        z = false;
                    }
                    if (!z) {
                        return C0643j.f307aq;
                    }
                    C0653t tVar2 = new C0653t();
                    tVar2.mo9734a(tVar.mo9733a());
                    String str4 = new String(C1316c.m2561a(bVar.mo9674a()));
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int c = mo9707c(tVar2, bVar, str4, stringBuffer2);
                    if (c != 0) {
                        return c;
                    }
                    String str5 = vVar.mo9782r() + "&" + str4 + "&" + stringBuffer2.toString();
                    for (int i2 = 0; i2 < vector.size(); i2++) {
                        str5 = str5 + "&" + vector.get(i2);
                    }
                    StringBuffer stringBuffer3 = new StringBuffer();
                    int a = m215a(bVar, str5, stringBuffer3);
                    if (a != 0) {
                        return a;
                    }
                    stringBuffer.append(stringBuffer3.toString());
                    return 0;
                }
            }
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f290aZ;
        }
    }

    /* renamed from: b */
    private static int m230b(C0653t tVar, C0669b bVar, boolean z, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        String str2;
        StringBuffer stringBuffer3;
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (str == null) {
                return C0643j.f283aS;
            }
            if (stringBuffer2 == null) {
                return C0643j.f246K;
            }
            if (stringBuffer2.length() > 0) {
                stringBuffer2.setLength(0);
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() != 2) {
                return C0643j.f244J;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            Vector vector = new Vector();
            int b = m228b(tVar, bVar, str, stringBuffer, stringBuffer4, (Vector<String>) vector);
            if (b != 0) {
                return b;
            }
            String str3 = "";
            String stringBuffer5 = stringBuffer.toString();
            if (stringBuffer5.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_AUTHORIZATION)) {
                vector.remove(0);
                vector.remove(0);
                stringBuffer5 = DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_SIGN;
            }
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                str3 = str3 + ((String) it.next());
            }
            String str4 = new String(C1316c.m2561a(bVar.mo9674a()));
            String str5 = "";
            if (stringBuffer5.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_OTP)) {
                StringBuffer stringBuffer6 = new StringBuffer();
                int a = m210a(tVar, (C0631b) bVar, str4, stringBuffer6);
                if (a != 0) {
                    return a;
                }
                str5 = stringBuffer6.toString();
            } else {
                if (stringBuffer5.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_CHALLENGE_RESPONSE)) {
                    stringBuffer3 = new StringBuffer();
                    int b2 = m223b(tVar, (C0631b) bVar, str4, str3, stringBuffer3);
                    if (b2 != 0) {
                        return b2;
                    }
                } else if (stringBuffer5.equals(DatablinkMobile200EmbeddedApi.DATABLINK_TYPE_COMMAND_SIGN)) {
                    stringBuffer3 = new StringBuffer();
                    int a2 = m209a(tVar, (C0631b) bVar, str4, str3, stringBuffer3);
                    if (a2 != 0) {
                        return a2;
                    }
                }
                str5 = stringBuffer3.toString();
            }
            String str6 = vVar.mo9782r() + "&" + stringBuffer4;
            if (z) {
                str2 = str6 + "&1";
            } else {
                String str7 = (str6 + "&0") + "&" + str5.toString();
                for (int i = 0; i < vector.size(); i++) {
                    str7 = str7 + "&" + ((String) vector.get(i));
                }
                str2 = str7;
            }
            StringBuffer stringBuffer7 = new StringBuffer();
            int a3 = m215a(bVar, str2, stringBuffer7);
            if (a3 != 0) {
                return a3;
            }
            stringBuffer2.append(stringBuffer7.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f328bl;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f285aU;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m231b(com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r1, java.lang.String r2, java.lang.StringBuffer r3) {
        /*
            com.datablink.mobile200.embeddedapi.a.m r0 = new com.datablink.mobile200.embeddedapi.a.m     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            byte[] r1 = r1.mo9676b()     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            java.lang.String r0 = "70&"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r1.append(r2)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = com.datablink.mobile200.embeddedapi.p013a.C0646m.m144a((java.lang.String) r1)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r3.append(r1)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r1 = 0
            return r1
        L_0x0020:
            r1 = move-exception
            throw r1
        L_0x0022:
            r1 = 1451(0x5ab, float:2.033E-42)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m231b(com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String, java.lang.StringBuffer):int");
    }

    /* renamed from: b */
    private static String m232b(int i) {
        return "OCRA-1:HOTP-SHA1-" + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m233c(com.datablink.mobile200.embeddedapi.p013a.C0653t r5, com.datablink.mobile200.embeddedapi.p013a.C0631b r6, java.lang.String r7, java.lang.StringBuffer r8) {
        /*
            if (r8 != 0) goto L_0x0005
            r5 = 1314(0x522, float:1.841E-42)
            return r5
        L_0x0005:
            if (r5 == 0) goto L_0x007e
            r0 = 1300(0x514, float:1.822E-42)
            java.lang.String r1 = r5.mo9733a()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            if (r1 != 0) goto L_0x0010
            goto L_0x007e
        L_0x0010:
            r1 = 1315(0x523, float:1.843E-42)
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r2 = r6.mo9677c()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            if (r2 != 0) goto L_0x001c
            return r1
        L_0x001c:
            int r1 = r8.length()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r2 = 0
            if (r1 <= 0) goto L_0x0026
            r8.setLength(r2)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
        L_0x0026:
            java.util.Vector r1 = new java.util.Vector     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r1.<init>()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r3.<init>()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            int r7 = m225b((com.datablink.mobile200.embeddedapi.p013a.C0653t) r5, (com.datablink.mobile200.embeddedapi.p013a.C0631b) r6, (java.lang.String) r7, (java.lang.StringBuffer) r3, (java.util.Vector<java.lang.String>) r1)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            if (r7 == 0) goto L_0x0037
            return r7
        L_0x0037:
            java.lang.String r7 = r3.toString()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            java.lang.String r3 = "3"
            boolean r7 = r7.equals(r3)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            if (r7 != 0) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.String r7 = ""
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
        L_0x004a:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r4.<init>()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r4.append(r7)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r4.append(r3)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            goto L_0x004a
        L_0x0066:
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            byte[] r3 = r6.mo9674a()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            byte[] r3 = org.bouncycastle.util.encoders.C1316c.m2561a((byte[]) r3)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r1.<init>(r3)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            int r5 = m223b((com.datablink.mobile200.embeddedapi.p013a.C0653t) r5, (com.datablink.mobile200.embeddedapi.p013a.C0631b) r6, (java.lang.String) r1, (java.lang.String) r7, (java.lang.StringBuffer) r8)     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            if (r5 == 0) goto L_0x007a
            return r5
        L_0x007a:
            return r2
        L_0x007b:
            r5 = move-exception
            throw r5
        L_0x007d:
            return r0
        L_0x007e:
            r5 = 1310(0x51e, float:1.836E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m233c(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.a.b, java.lang.String, java.lang.StringBuffer):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m234d(com.datablink.mobile200.embeddedapi.p013a.C0653t r4, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r4 == 0) goto L_0x0076
            java.lang.String r1 = r4.mo9733a()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r5.mo9677c()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            byte[] r2 = r5.mo9676b()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            byte[] r5 = r5.mo9674a()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r1.<init>(r2, r5)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            com.datablink.mobile200.embeddedapi.a.v r5 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r5.<init>()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            java.lang.String r2 = r4.mo9733a()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r5)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            if (r2 == 0) goto L_0x0034
            return r0
        L_0x0034:
            int r0 = r5.mo9744C()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            if (r0 != 0) goto L_0x003d
            r4 = 1404(0x57c, float:1.967E-42)
            return r4
        L_0x003d:
            int r0 = r5.mo9775l()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r2 = 1439(0x59f, float:2.016E-42)
            if (r0 != 0) goto L_0x0046
            return r2
        L_0x0046:
            int r0 = r5.mo9779o()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r3 = 2
            if (r0 != r3) goto L_0x004e
            return r2
        L_0x004e:
            java.lang.String r0 = ""
            r5.mo9764f((java.lang.String) r0)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r0 = 0
            r5.mo9750b((int) r0)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r5.mo9753c((int) r3)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r2.<init>()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            int r5 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r5, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r2)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            if (r5 == 0) goto L_0x0066
            return r5
        L_0x0066:
            java.lang.String r5 = r2.toString()     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            r4.mo9734a(r5)     // Catch:{ g -> 0x0073, Exception -> 0x0070, all -> 0x006e }
            return r0
        L_0x006e:
            r4 = move-exception
            throw r4
        L_0x0070:
            r4 = 1300(0x514, float:1.822E-42)
            return r4
        L_0x0073:
            r4 = 1316(0x524, float:1.844E-42)
            return r4
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m234d(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b):int");
    }

    /* renamed from: d */
    private static int m235d(C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return C0643j.f246K;
        }
        try {
            new C0650q(bVar.mo9676b());
            String str = "99";
            for (int i = 0; i < vector.size(); i++) {
                str = str + "&" + C0634c.m114a(vector.get(i).getBytes());
            }
            String a = C0650q.m314a(str, new DatablinkMobile200EmbeddedApi_Info());
            if (a == null) {
                return C0643j.f285aU;
            }
            stringBuffer.append(a);
            return 0;
        } catch (Exception unused) {
            return C0643j.f285aU;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m236e(com.datablink.mobile200.embeddedapi.p013a.C0653t r5, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r6) {
        /*
            if (r5 != 0) goto L_0x0005
            r5 = 1314(0x522, float:1.841E-42)
            return r5
        L_0x0005:
            java.lang.String r0 = r5.mo9733a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r1 = 1310(0x51e, float:1.836E-42)
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            r0 = 1315(0x523, float:1.843E-42)
            if (r6 != 0) goto L_0x0013
            return r0
        L_0x0013:
            boolean r2 = r6.mo9677c()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r2 != 0) goto L_0x001a
            return r0
        L_0x001a:
            com.datablink.mobile200.embeddedapi.a.c r0 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r2 = r6.mo9676b()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r3 = r6.mo9674a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r0.<init>(r2, r3)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r4 = new java.lang.String     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = r6.mo9674a()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = org.bouncycastle.util.encoders.C1316c.m2561a((byte[]) r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r4.<init>(r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.append(r4)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.append(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r6 = r6.toString()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = r6.getBytes()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            byte[] r6 = com.datablink.mobile200.embeddedapi.p013a.p015b.C0635d.m118a(r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r2 = new java.lang.String     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r3 = 8
            r4 = 0
            r2.<init>(r6, r4, r3)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r6 = r0.mo9671c(r2)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            com.datablink.mobile200.embeddedapi.a.u r2 = new com.datablink.mobile200.embeddedapi.a.u     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r2.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.String r6 = r6.substring(r4, r3)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r2.mo9737a((java.lang.String) r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r6.<init>()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            int r0 = com.datablink.mobile200.embeddedapi.p013a.C0654u.m344a((com.datablink.mobile200.embeddedapi.p013a.C0654u) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r0, (java.lang.StringBuffer) r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            if (r0 == 0) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.String r6 = r6.toString()     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            r5.mo9734a(r6)     // Catch:{ g -> 0x0084, Exception -> 0x0081, all -> 0x007f }
            return r4
        L_0x007f:
            r5 = move-exception
            throw r5
        L_0x0081:
            r5 = 1300(0x514, float:1.822E-42)
            return r5
        L_0x0084:
            r5 = 1316(0x524, float:1.844E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m236e(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b):int");
    }

    /* renamed from: e */
    private static int m237e(C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (bVar == null) {
            return C0643j.f248L;
        }
        try {
            if (!bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null || vector.size() == 0) {
                return C0643j.f283aS;
            }
            int i = 0;
            while (true) {
                if (i < vector.size()) {
                    String str = vector.get(i);
                    if (str == null) {
                        return C0643j.f283aS;
                    }
                    char[] charArray = str.toCharArray();
                    String str2 = new String(f355R_);
                    for (char valueOf : charArray) {
                        if (str2.contains(String.valueOf(valueOf))) {
                            return C0643j.f283aS;
                        }
                    }
                    i++;
                } else if (stringBuffer == null) {
                    return C0643j.f246K;
                } else {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.setLength(0);
                    }
                    String str3 = vector.get(0);
                    for (int i2 = 1; i2 < vector.size(); i2++) {
                        str3 = str3 + "&" + vector.get(i2);
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int a = m215a(bVar, str3, stringBuffer2);
                    if (a != 0) {
                        return a;
                    }
                    stringBuffer.append(stringBuffer2.toString());
                    return 0;
                }
            }
        } catch (Exception unused) {
            return C0643j.f329bm;
        }
    }

    /* renamed from: f */
    private static int m238f(C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (bVar == null) {
            return C0643j.f248L;
        }
        try {
            if (!bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null || vector.size() == 0) {
                return C0643j.f283aS;
            }
            int i = 0;
            while (true) {
                if (i < vector.size()) {
                    String str = vector.get(i);
                    if (str == null) {
                        return C0643j.f283aS;
                    }
                    char[] charArray = str.toCharArray();
                    String str2 = new String(f355R_);
                    for (char valueOf : charArray) {
                        if (str2.contains(String.valueOf(valueOf))) {
                            return C0643j.f283aS;
                        }
                    }
                    i++;
                } else if (stringBuffer == null) {
                    return C0643j.f246K;
                } else {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.setLength(0);
                    }
                    String str3 = vector.get(0);
                    for (int i2 = 1; i2 < vector.size(); i2++) {
                        str3 = str3 + "&" + vector.get(i2);
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int b = m231b(bVar, str3, stringBuffer2);
                    if (b != 0) {
                        return b;
                    }
                    stringBuffer.append(stringBuffer2.toString());
                    return 0;
                }
            }
        } catch (Exception unused) {
            return C0643j.f329bm;
        }
    }

    /* renamed from: g */
    private static int m239g(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            for (int i = 0; i < vector.size(); i++) {
                String str = vector.get(i);
                if (str == null) {
                    return C0643j.f283aS;
                }
                char[] charArray = str.toCharArray();
                String str2 = new String(f355R_);
                for (char valueOf : charArray) {
                    if (str2.contains(String.valueOf(valueOf))) {
                        return C0643j.f283aS;
                    }
                }
            }
            if (stringBuffer == null) {
                return C0643j.f246K;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(0);
            }
            C0652s sVar = new C0652s();
            int a = m205a(tVar, (C0631b) bVar, sVar);
            if (a != 0) {
                return a;
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            String str3 = sVar.mo9731a() + "&" + vVar.mo9782r();
            for (int i2 = 0; i2 < vector.size(); i2++) {
                str3 = str3 + "&" + vector.get(i2);
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            int a2 = m215a(bVar, str3, stringBuffer2);
            if (a2 != 0) {
                return a2;
            }
            stringBuffer.append(stringBuffer2.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f317ba;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f314ax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f314ax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f315ay;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f315ay;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f316az;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f316az;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r0.size() > 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        if (r0.size() > 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b1, code lost:
        if (r0.size() > 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b9, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x010e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0114, code lost:
        if (r0.size() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0116, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0119, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:22:0x0046, B:31:0x0066, B:35:0x006b, B:47:0x008f, B:62:0x00bf] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m240g(com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r2, java.lang.String r3, java.util.Vector<java.lang.String> r4) throws com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception {
        /*
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            com.datablink.mobile200.embeddedapi.a.q r1 = new com.datablink.mobile200.embeddedapi.a.q     // Catch:{ Exception -> 0x0126 }
            byte[] r2 = r2.mo9676b()     // Catch:{ Exception -> 0x0126 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0126 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0650q.m311a((java.lang.String) r3, (java.util.Vector<java.lang.String>) r0)     // Catch:{ Exception -> 0x0126 }
            if (r2 == 0) goto L_0x0015
            return r2
        L_0x0015:
            r3 = 0
            if (r2 != 0) goto L_0x002f
            java.lang.Object r2 = r0.get(r3)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0023 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x002c
            r0.clear()
        L_0x002c:
            r2 = 1429(0x595, float:2.002E-42)
            return r2
        L_0x002f:
            r2 = -1
        L_0x0030:
            r1 = 10
            if (r2 != r1) goto L_0x0041
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0040
            r0.remove(r3)
            r4.addAll(r0)
        L_0x0040:
            return r3
        L_0x0041:
            r4 = 60
            r1 = 1
            if (r2 != r4) goto L_0x0067
            java.lang.Object r2 = r0.get(r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0065, Exception -> 0x0059 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0065, Exception -> 0x0059 }
            java.lang.String r2 = com.datablink.mobile200.embeddedapi.p013a.C0641h.m140a(r2)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0065, Exception -> 0x0059 }
            com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception r1 = new com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0065, Exception -> 0x0059 }
            r1.<init>(r4, r3, r2)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0065, Exception -> 0x0059 }
            throw r1     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0065, Exception -> 0x0059 }
        L_0x0056:
            r2 = move-exception
            goto L_0x0110
        L_0x0059:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0062
            r0.clear()
        L_0x0062:
            r2 = 1425(0x591, float:1.997E-42)
            return r2
        L_0x0065:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0056 }
        L_0x0067:
            r4 = 40
            if (r2 != r4) goto L_0x008b
            java.lang.Object r2 = r0.get(r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0089, Exception -> 0x007d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0089, Exception -> 0x007d }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0089, Exception -> 0x007d }
            com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception r3 = new com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0089, Exception -> 0x007d }
            java.lang.String r1 = ""
            r3.<init>(r4, r2, r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0089, Exception -> 0x007d }
            throw r3     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x0089, Exception -> 0x007d }
        L_0x007d:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0086
            r0.clear()
        L_0x0086:
            r2 = 1426(0x592, float:1.998E-42)
            return r2
        L_0x0089:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0056 }
        L_0x008b:
            r4 = 20
            if (r2 != r4) goto L_0x00bb
            java.lang.Object r2 = r0.get(r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
            r1 = 58
            int r1 = r2.indexOf(r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
            if (r1 <= 0) goto L_0x00a1
            java.lang.String r2 = r2.substring(r3, r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
        L_0x00a1:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
            com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception r3 = new com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
            java.lang.String r1 = ""
            r3.<init>(r4, r2, r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
            throw r3     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x00b9, Exception -> 0x00ad }
        L_0x00ad:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x00b6
            r0.clear()
        L_0x00b6:
            r2 = 1427(0x593, float:2.0E-42)
            return r2
        L_0x00b9:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0056 }
        L_0x00bb:
            r3 = 30
            if (r2 != r3) goto L_0x011a
            int r2 = r0.size()     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
            r4 = 3
            if (r2 != r4) goto L_0x0102
            java.lang.Object r2 = r0.get(r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
            r4 = 1007(0x3ef, float:1.411E-42)
            if (r2 != r4) goto L_0x00de
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x00dd
            r0.clear()
        L_0x00dd:
            return r4
        L_0x00de:
            r4 = 1003(0x3eb, float:1.406E-42)
            if (r2 != r4) goto L_0x00ec
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x00eb
            r0.clear()
        L_0x00eb:
            return r4
        L_0x00ec:
            r4 = 1004(0x3ec, float:1.407E-42)
            if (r2 != r4) goto L_0x00fa
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x00f9
            r0.clear()
        L_0x00f9:
            return r4
        L_0x00fa:
            com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception r4 = new com.datablink.mobile200.embeddedapi.DatablinkMobile200EmbeddedApi_Exception     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
            java.lang.String r1 = ""
            r4.<init>(r3, r2, r1)     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
            throw r4     // Catch:{ DatablinkMobile200EmbeddedApi_Exception -> 0x010e, Exception -> 0x0102 }
        L_0x0102:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x010b
            r0.clear()
        L_0x010b:
            r2 = 1428(0x594, float:2.001E-42)
            return r2
        L_0x010e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0056 }
        L_0x0110:
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0119
            r0.clear()
        L_0x0119:
            throw r2
        L_0x011a:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0123
            r0.clear()
        L_0x0123:
            r2 = 1430(0x596, float:2.004E-42)
            return r2
        L_0x0126:
            r2 = 1421(0x58d, float:1.991E-42)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m240g(com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String, java.util.Vector):int");
    }

    /* renamed from: h */
    private static int m241h(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            for (int i = 0; i < vector.size(); i++) {
                String str = vector.get(i);
                if (str == null) {
                    return C0643j.f283aS;
                }
                char[] charArray = str.toCharArray();
                String str2 = new String(f355R_);
                for (char valueOf : charArray) {
                    if (str2.contains(String.valueOf(valueOf))) {
                        return C0643j.f283aS;
                    }
                }
            }
            if (stringBuffer == null) {
                return C0643j.f246K;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(0);
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            String r = vVar.mo9782r();
            for (int i2 = 0; i2 < vector.size(); i2++) {
                r = r + "&" + vector.get(i2);
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            int a = m215a(bVar, r, stringBuffer2);
            if (a != 0) {
                return a;
            }
            stringBuffer.append(stringBuffer2.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f317ba;
        }
    }

    /* renamed from: h */
    private static int m242h(C0669b bVar, String str, Vector<String> vector) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            int j = m246j(bVar, str, vector);
            if (j != 0) {
                return j;
            }
            return 0;
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f237E;
        }
    }

    /* renamed from: i */
    private static int m243i(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            for (int i = 0; i < vector.size(); i++) {
                String str = vector.get(i);
                if (str == null) {
                    return C0643j.f283aS;
                }
                char[] charArray = str.toCharArray();
                String str2 = new String(f355R_);
                for (char valueOf : charArray) {
                    if (str2.contains(String.valueOf(valueOf))) {
                        return C0643j.f283aS;
                    }
                }
            }
            if (stringBuffer == null) {
                return C0643j.f246K;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(0);
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() != 0 && vVar.mo9783s() != 5) {
                return C0643j.f244J;
            }
            C0652s sVar = new C0652s();
            int a = m205a(tVar, (C0631b) bVar, sVar);
            if (a != 0) {
                return a;
            }
            String str3 = sVar.mo9731a() + "&" + new String(C1316c.m2561a(bVar.mo9674a()));
            for (int i2 = 0; i2 < vector.size(); i2++) {
                str3 = str3 + "&" + vector.get(i2);
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            int a2 = m215a(bVar, str3, stringBuffer2);
            if (a2 != 0) {
                return a2;
            }
            stringBuffer.append(stringBuffer2.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f289aY;
        }
    }

    /* renamed from: i */
    private static int m244i(C0669b bVar, String str, Vector<String> vector) {
        if (str == null) {
            return C0643j.f283aS;
        }
        if (vector == null) {
            return C0643j.f246K;
        }
        try {
            if (m246j(bVar, str, vector) != 0) {
                return C0643j.f312av;
            }
            return 0;
        } catch (Exception unused) {
            return C0643j.f237E;
        }
    }

    /* renamed from: j */
    private int m245j(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            for (int i = 0; i < vector.size(); i++) {
                String str = vector.get(i);
                if (str == null) {
                    return C0643j.f283aS;
                }
                char[] charArray = str.toCharArray();
                String str2 = new String(f355R_);
                for (char valueOf : charArray) {
                    if (str2.contains(String.valueOf(valueOf))) {
                        return C0643j.f283aS;
                    }
                }
            }
            if (stringBuffer == null) {
                return C0643j.f246K;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(0);
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() != 2) {
                return C0643j.f244J;
            }
            C0652s sVar = new C0652s();
            int a = m205a(tVar, (C0631b) bVar, sVar);
            if (a != 0) {
                return a;
            }
            String str3 = new String(C1316c.m2561a(bVar.mo9674a()));
            StringBuffer stringBuffer2 = new StringBuffer();
            int c = mo9707c(tVar, bVar, str3, stringBuffer2);
            if (c != 0) {
                return c;
            }
            C0655v vVar2 = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar2) != 0) {
                return C0643j.f239G;
            }
            String str4 = sVar.mo9731a() + "&" + vVar2.mo9782r() + "&" + stringBuffer2.toString();
            for (int i2 = 0; i2 < vector.size(); i2++) {
                str4 = str4 + "&" + vector.get(i2);
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            int a2 = m215a(bVar, str4, stringBuffer3);
            if (a2 != 0) {
                return a2;
            }
            stringBuffer.append(stringBuffer3.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f318bb;
        }
    }

    /* renamed from: j */
    private static int m246j(C0669b bVar, String str, Vector<String> vector) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            new C0650q(bVar.mo9676b());
            int a = C0650q.m311a(str, vector);
            if (a != 0) {
                return a;
            }
            if (a == 0) {
                a = C0643j.f266aB;
                try {
                    if (vector.size() != 2 || !vector.get(0).equals("40")) {
                        if (vector.size() > 0) {
                            vector.clear();
                        }
                        return C0643j.f266aB;
                    }
                    vector.remove(0);
                    return 0;
                } catch (Exception unused) {
                    if (vector != null && vector.size() > 0) {
                        vector.clear();
                    }
                }
            }
            return a;
        } catch (Exception unused2) {
            return C0643j.f311au;
        }
    }

    /* renamed from: k */
    private static int m247k(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            for (int i = 0; i < vector.size(); i++) {
                String str = vector.get(i);
                if (str == null) {
                    return C0643j.f283aS;
                }
                char[] charArray = str.toCharArray();
                String str2 = new String(f355R_);
                for (char valueOf : charArray) {
                    if (str2.contains(String.valueOf(valueOf))) {
                        return C0643j.f283aS;
                    }
                }
            }
            if (stringBuffer == null) {
                return C0643j.f246K;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(0);
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() != 6 && vVar.mo9783s() != 2) {
                return C0643j.f244J;
            }
            C0652s sVar = new C0652s();
            int a = m205a(tVar, (C0631b) bVar, sVar);
            if (a != 0) {
                return a;
            }
            C0655v vVar2 = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar2) != 0) {
                return C0643j.f239G;
            }
            String str3 = sVar.mo9731a() + "&" + vVar2.mo9782r();
            for (int i2 = 0; i2 < vector.size(); i2++) {
                str3 = str3 + "&" + vector.get(i2);
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            int a2 = m215a(bVar, str3, stringBuffer2);
            if (a2 != 0) {
                return a2;
            }
            stringBuffer.append(stringBuffer2.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f320bd;
        }
    }

    /* renamed from: k */
    private static int m248k(C0669b bVar, String str, Vector<String> vector) {
        if (vector == null) {
            return C0643j.f246K;
        }
        Vector vector2 = new Vector();
        try {
            new C0650q(bVar.mo9910d());
            int a = C0650q.m311a(str, (Vector<String>) vector2);
            if (a != 0) {
                return a;
            }
            if (a == 0) {
                a = C0643j.f266aB;
                try {
                    if (vector2.size() <= 1 || !((String) vector2.get(0)).equals("99")) {
                        if (vector2.size() > 0) {
                            vector2.clear();
                        }
                        return C0643j.f266aB;
                    }
                    vector2.remove(0);
                    for (int i = 0; i < vector2.size(); i++) {
                        vector.add(C0634c.m116c(((String) vector2.get(i)).getBytes()));
                    }
                    return 0;
                } catch (Exception unused) {
                    if (vector != null && vector.size() > 0) {
                        vector.clear();
                    }
                }
            }
            return a;
        } catch (Exception unused2) {
            return C0643j.f311au;
        }
    }

    /* renamed from: l */
    private int m249l(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        if (tVar == null) {
            return C0643j.f239G;
        }
        try {
            if (tVar.mo9733a() == null) {
                return C0643j.f239G;
            }
            if (bVar == null || !bVar.mo9677c()) {
                return C0643j.f248L;
            }
            if (vector == null) {
                return C0643j.f283aS;
            }
            for (int i = 0; i < vector.size(); i++) {
                String str = vector.get(i);
                if (str == null) {
                    return C0643j.f283aS;
                }
                char[] charArray = str.toCharArray();
                String str2 = new String(f355R_);
                for (char valueOf : charArray) {
                    if (str2.contains(String.valueOf(valueOf))) {
                        return C0643j.f283aS;
                    }
                }
            }
            if (stringBuffer == null) {
                return C0643j.f246K;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(0);
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() != 4 && vVar.mo9783s() != 3) {
                return C0643j.f244J;
            }
            C0652s sVar = new C0652s();
            int a = m205a(tVar, (C0631b) bVar, sVar);
            if (a != 0) {
                return a;
            }
            C0655v vVar2 = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar2) != 0) {
                return C0643j.f239G;
            }
            String str3 = new String(C1316c.m2561a(bVar.mo9674a()));
            StringBuffer stringBuffer2 = new StringBuffer();
            int c = mo9707c(tVar, bVar, str3, stringBuffer2);
            if (c != 0) {
                return c;
            }
            String str4 = sVar.mo9731a() + "&" + vVar2.mo9782r() + "&" + stringBuffer2.toString();
            if (vector != null) {
                String str5 = str4;
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    str5 = str5 + "&" + vector.get(i2);
                }
                str4 = str5;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            int a2 = m215a(bVar, str4, stringBuffer3);
            if (a2 != 0) {
                return a2;
            }
            stringBuffer.append(stringBuffer3.toString());
            return 0;
        } catch (Exception unused) {
            return C0643j.f321be;
        }
    }

    /* renamed from: l */
    private static int m250l(C0669b bVar, String str, Vector<String> vector) throws DatablinkMobile200EmbeddedApi_Exception {
        if (vector == null) {
            return C0643j.f246K;
        }
        try {
            if (m240g(bVar, str, vector) != 0) {
                return C0643j.f312av;
            }
            return 0;
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f330bn;
        }
    }

    /* renamed from: o */
    private static int m251o(C0653t tVar, C0669b bVar, String str) {
        return m208a(tVar, (C0631b) bVar, str);
    }

    /* renamed from: p */
    private static int m252p(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() == 0) {
                return C0643j.f295ae;
            }
            Vector vector = new Vector();
            int g = m240g(bVar, str, (Vector<String>) vector);
            if (g != 0) {
                if (g != 1007) {
                    return C0643j.f312av;
                }
                int b = m226b(tVar, bVar, 0);
                if (b != 0) {
                    return b;
                }
                return 1445;
            } else if (vector.size() <= 0) {
                return C0643j.f302al;
            } else {
                if (m208a(tVar, (C0631b) bVar, (String) vector.elementAt(0)) != 0) {
                    return C0643j.f305ao;
                }
                C0655v vVar2 = new C0655v();
                if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar2) != 0) {
                    return C0643j.f239G;
                }
                if (vVar2.mo9744C() != 1 || vVar2.mo9784t() != 2) {
                    return 0;
                }
                int b2 = m226b(tVar, bVar, 3);
                if (b2 != 0) {
                    return b2;
                }
                return 1444;
            }
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f305ao;
        }
    }

    /* renamed from: q */
    private int m253q(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            Vector vector = new Vector();
            if (m240g(bVar, str, (Vector<String>) vector) != 0) {
                return C0643j.f312av;
            }
            if (vector.size() < 3) {
                return C0643j.f302al;
            }
            String str2 = (String) vector.elementAt(0);
            boolean z = true;
            String str3 = (String) vector.elementAt(1);
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9783s() != 0 && vVar.mo9783s() != 5) {
                return C0643j.f244J;
            }
            if (!vVar.mo9767h().equals(str2)) {
                return C0643j.f303am;
            }
            if (!vVar.mo9771j().equals(str3)) {
                return C0643j.f304an;
            }
            if ((vVar.mo9784t() != 3 && vVar.mo9784t() != 5) || vVar.mo9744C() != 1) {
                z = false;
            }
            if (!z) {
                return C0643j.f307aq;
            }
            int a = mo9685a(tVar, bVar, 2);
            if (a != 0) {
                return a;
            }
            return 0;
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f313aw;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m254r(com.datablink.mobile200.embeddedapi.p013a.C0653t r4, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r5, java.lang.String r6) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r4 == 0) goto L_0x00d0
            java.lang.String r1 = r4.mo9733a()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r5.mo9677c()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r6 != 0) goto L_0x001c
            r4 = 1434(0x59a, float:2.01E-42)
            return r4
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            byte[] r2 = r5.mo9676b()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            byte[] r5 = r5.mo9674a()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r1.<init>(r2, r5)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            com.datablink.mobile200.embeddedapi.a.v r5 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r5.<init>()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r2 = r4.mo9733a()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r5)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r2 == 0) goto L_0x0039
            return r0
        L_0x0039:
            int r0 = r5.mo9744C()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r2 = 1
            if (r0 == r2) goto L_0x0043
            r4 = 1404(0x57c, float:1.967E-42)
            return r4
        L_0x0043:
            int r0 = r5.mo9775l()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r0 != 0) goto L_0x004c
            r4 = 1439(0x59f, float:2.016E-42)
            return r4
        L_0x004c:
            java.lang.String r0 = r5.mo9773k()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r0 = r0.length()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r0 != 0) goto L_0x0059
            r4 = 1443(0x5a3, float:2.022E-42)
            return r4
        L_0x0059:
            java.lang.String r0 = r5.mo9773k()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            boolean r6 = r6.equals(r0)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r6 == 0) goto L_0x007b
            r6 = 0
            r5.mo9750b((int) r6)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r0.<init>()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r5 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r5, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r0)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r5 == 0) goto L_0x0073
            return r5
        L_0x0073:
            java.lang.String r5 = r0.toString()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r4.mo9734a(r5)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            return r6
        L_0x007b:
            int r6 = r5.mo9778n()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r0 = 1436(0x59c, float:2.012E-42)
            if (r6 <= 0) goto L_0x00c7
            int r6 = r5.mo9777m()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r6 = r6 + r2
            r5.mo9750b((int) r6)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r6 = r5.mo9777m()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r3 = r5.mo9778n()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r6 < r3) goto L_0x0099
            r6 = 6
            r5.mo9756d((int) r6)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
        L_0x0099:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r6.<init>()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r1 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r5, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r6)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r1 == 0) goto L_0x00a5
            return r1
        L_0x00a5:
            java.lang.String r6 = r6.toString()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            r4.mo9734a(r6)     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r4 = r5.mo9777m()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r6 = r5.mo9778n()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            if (r4 < r6) goto L_0x00b9
            r4 = 1437(0x59d, float:2.014E-42)
            return r4
        L_0x00b9:
            int r4 = r5.mo9777m()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r5 = r5.mo9778n()     // Catch:{ g -> 0x00cd, Exception -> 0x00ca, all -> 0x00c8 }
            int r5 = r5 - r2
            if (r4 != r5) goto L_0x00c7
            r4 = 1438(0x59e, float:2.015E-42)
            return r4
        L_0x00c7:
            return r0
        L_0x00c8:
            r4 = move-exception
            throw r4
        L_0x00ca:
            r4 = 1300(0x514, float:1.822E-42)
            return r4
        L_0x00cd:
            r4 = 1316(0x524, float:1.844E-42)
            return r4
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m254r(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c5, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m255s(com.datablink.mobile200.embeddedapi.p013a.C0653t r7, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r8, java.lang.String r9) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r7 == 0) goto L_0x00c8
            java.lang.String r1 = r7.mo9733a()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r8 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r8.mo9677c()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            r1 = 1434(0x59a, float:2.01E-42)
            if (r9 != 0) goto L_0x001c
            return r1
        L_0x001c:
            int r2 = r9.length()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r2 != 0) goto L_0x0023
            return r1
        L_0x0023:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            byte[] r2 = r8.mo9676b()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            byte[] r8 = r8.mo9674a()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r1.<init>(r2, r8)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            com.datablink.mobile200.embeddedapi.a.v r8 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r8.<init>()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r2 = r7.mo9733a()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r8)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r2 == 0) goto L_0x0040
            return r0
        L_0x0040:
            int r0 = r8.mo9744C()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r2 = 1
            if (r0 == r2) goto L_0x004a
            r7 = 1404(0x57c, float:1.967E-42)
            return r7
        L_0x004a:
            int r0 = r8.mo9775l()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r0 != 0) goto L_0x0053
            r7 = 1439(0x59f, float:2.016E-42)
            return r7
        L_0x0053:
            int r0 = r9.length()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            int r3 = r8.mo9775l()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r4 = 1435(0x59b, float:2.011E-42)
            if (r0 >= r3) goto L_0x0060
            return r4
        L_0x0060:
            int r0 = r9.length()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r3 = 10
            if (r0 <= r3) goto L_0x0069
            return r4
        L_0x0069:
            int r0 = r8.mo9781q()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r3 = 0
            if (r0 == 0) goto L_0x00a3
            char[] r0 = r9.toCharArray()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            byte[] r4 = new byte[r3]     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            int r5 = r8.mo9781q()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r5 != r2) goto L_0x007f
            byte[] r4 = f353P_     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            goto L_0x0088
        L_0x007f:
            int r5 = r8.mo9781q()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r6 = 2
            if (r5 != r6) goto L_0x0088
            byte[] r4 = f354Q_     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
        L_0x0088:
            java.lang.String r5 = new java.lang.String     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r5.<init>(r4)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r4 = r3
        L_0x008e:
            int r6 = r0.length     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r4 >= r6) goto L_0x00a3
            char r6 = r0[r4]     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            boolean r6 = r5.contains(r6)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r6 != 0) goto L_0x00a0
            r7 = 1442(0x5a2, float:2.02E-42)
            return r7
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x008e
        L_0x00a3:
            r8.mo9764f((java.lang.String) r9)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r8.mo9750b((int) r3)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r8.mo9753c((int) r2)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r9.<init>()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            int r8 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r8, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r9)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            if (r8 == 0) goto L_0x00b8
            return r8
        L_0x00b8:
            java.lang.String r8 = r9.toString()     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            r7.mo9734a(r8)     // Catch:{ g -> 0x00c5, Exception -> 0x00c2, all -> 0x00c0 }
            return r3
        L_0x00c0:
            r7 = move-exception
            throw r7
        L_0x00c2:
            r7 = 1300(0x514, float:1.822E-42)
            return r7
        L_0x00c5:
            r7 = 1316(0x524, float:1.844E-42)
            return r7
        L_0x00c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m255s(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m256t(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r4, java.lang.String r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r5 != 0) goto L_0x001c
            r3 = 1440(0x5a0, float:2.018E-42)
            return r3
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            com.datablink.mobile200.embeddedapi.a.v r4 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r4.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.String r2 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 == 0) goto L_0x0039
            return r0
        L_0x0039:
            r4.mo9748a((java.lang.String) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r5.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3.mo9734a(r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3 = 0
            return r3
        L_0x0051:
            r3 = move-exception
            throw r3
        L_0x0053:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x0056:
            r3 = 1316(0x524, float:1.844E-42)
            return r3
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m256t(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m257u(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r4, java.lang.String r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r5 != 0) goto L_0x001c
            r3 = 1452(0x5ac, float:2.035E-42)
            return r3
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            com.datablink.mobile200.embeddedapi.a.v r4 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r4.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.String r2 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 == 0) goto L_0x0039
            return r0
        L_0x0039:
            r4.mo9768h((java.lang.String) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r5.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3.mo9734a(r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3 = 0
            return r3
        L_0x0051:
            r3 = move-exception
            throw r3
        L_0x0053:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x0056:
            r3 = 1316(0x524, float:1.844E-42)
            return r3
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m257u(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m258v(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r4, java.lang.String r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r5 != 0) goto L_0x001c
            r3 = 1720(0x6b8, float:2.41E-42)
            return r3
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            com.datablink.mobile200.embeddedapi.a.v r4 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r4.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.String r2 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 == 0) goto L_0x0039
            return r0
        L_0x0039:
            r4.mo9770i((java.lang.String) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r5.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3.mo9734a(r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3 = 0
            return r3
        L_0x0051:
            r3 = move-exception
            throw r3
        L_0x0053:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x0056:
            r3 = 1316(0x524, float:1.844E-42)
            return r3
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m258v(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* renamed from: w */
    private int m259w(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            Vector vector = new Vector();
            if (m240g(bVar, str, (Vector<String>) vector) != 0) {
                return C0643j.f312av;
            }
            if (vector.size() < 2) {
                return C0643j.f302al;
            }
            int a = m208a(tVar, (C0631b) bVar, (String) vector.elementAt(0));
            if (a != 0) {
                return a;
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (!(vVar.mo9784t() == 0 && vVar.mo9744C() == 0)) {
                return C0643j.f307aq;
            }
            int a2 = mo9685a(tVar, bVar, 5);
            if (a2 != 0) {
                return a2;
            }
            return 0;
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f310at;
        }
    }

    /* renamed from: x */
    private int m260x(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            if (vVar.mo9784t() == 0) {
                return C0643j.f295ae;
            }
            Vector vector = new Vector();
            if (m240g(bVar, str, (Vector<String>) vector) != 0) {
                return C0643j.f312av;
            }
            if (vector.size() <= 0) {
                return C0643j.f302al;
            }
            if (m208a(tVar, (C0631b) bVar, (String) vector.elementAt(0)) != 0) {
                return C0643j.f308ar;
            }
            C0655v vVar2 = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar2) != 0) {
                return C0643j.f239G;
            }
            boolean z = true;
            if (vVar2.mo9784t() != 4 || vVar2.mo9744C() != 1) {
                z = false;
            }
            if (!z) {
                return C0643j.f307aq;
            }
            int a = mo9685a(tVar, bVar, 4);
            if (a != 0) {
                return a;
            }
            return 0;
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f308ar;
        }
    }

    /* renamed from: y */
    private static int m261y(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        try {
            Vector vector = new Vector();
            if (m240g(bVar, str, (Vector<String>) vector) != 0) {
                return C0643j.f312av;
            }
            if (vector.size() < 2) {
                return C0643j.f302al;
            }
            int a = m208a(tVar, (C0631b) bVar, (String) vector.elementAt(0));
            if (a != 0) {
                return a;
            }
            C0636c cVar = new C0636c(bVar.mo9676b(), bVar.mo9674a());
            C0655v vVar = new C0655v();
            if (C0655v.m423a(tVar.mo9733a(), (C0629ab) cVar, vVar) != 0) {
                return C0643j.f239G;
            }
            boolean z = true;
            if (vVar.mo9784t() != 1 || vVar.mo9744C() != 1) {
                z = false;
            }
            if (!z) {
                return C0643j.f307aq;
            }
            vVar.mo9750b(0);
            vVar.mo9756d(2);
            StringBuffer stringBuffer = new StringBuffer();
            if (C0655v.m422a(vVar, (C0629ab) cVar, stringBuffer) != 0) {
                return C0643j.f239G;
            }
            tVar.mo9734a(stringBuffer.toString());
            return 0;
        } catch (DatablinkMobile200EmbeddedApi_Exception e) {
            throw e;
        } catch (Exception unused) {
            return C0643j.f309as;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f237E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return com.datablink.mobile200.embeddedapi.p013a.C0643j.f250M;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m262z(com.datablink.mobile200.embeddedapi.p013a.C0653t r3, com.datablink.mobile200.embeddedapi.p018d.p019a.C0669b r4, java.lang.String r5) {
        /*
            r0 = 1310(0x51e, float:1.836E-42)
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1315(0x523, float:1.843E-42)
            if (r4 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r2 = r4.mo9677c()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r5 != 0) goto L_0x001c
            r3 = 1440(0x5a0, float:2.018E-42)
            return r3
        L_0x001c:
            com.datablink.mobile200.embeddedapi.a.c r1 = new com.datablink.mobile200.embeddedapi.a.c     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r2 = r4.mo9676b()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            byte[] r4 = r4.mo9674a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r1.<init>(r2, r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            com.datablink.mobile200.embeddedapi.a.v r4 = new com.datablink.mobile200.embeddedapi.a.v     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r4.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.String r2 = r3.mo9733a()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r2 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m423a((java.lang.String) r2, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (com.datablink.mobile200.embeddedapi.p013a.C0655v) r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r2 == 0) goto L_0x0039
            return r0
        L_0x0039:
            r4.mo9772j((java.lang.String) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r5.<init>()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            int r4 = com.datablink.mobile200.embeddedapi.p013a.C0655v.m422a((com.datablink.mobile200.embeddedapi.p013a.C0655v) r4, (com.datablink.mobile200.embeddedapi.p013a.C0629ab) r1, (java.lang.StringBuffer) r5)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.String r4 = r5.toString()     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3.mo9734a(r4)     // Catch:{ g -> 0x0056, Exception -> 0x0053, all -> 0x0051 }
            r3 = 0
            return r3
        L_0x0051:
            r3 = move-exception
            throw r3
        L_0x0053:
            r3 = 1300(0x514, float:1.822E-42)
            return r3
        L_0x0056:
            r3 = 1316(0x524, float:1.844E-42)
            return r3
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datablink.mobile200.embeddedapi.p013a.C0649p.m262z(com.datablink.mobile200.embeddedapi.a.t, com.datablink.mobile200.embeddedapi.d.a.b, java.lang.String):int");
    }

    /* renamed from: a */
    public final int mo9683a(C0653t tVar, C0631b bVar, String str, StringBuffer stringBuffer, Vector<String> vector) {
        return m225b(tVar, bVar, str, stringBuffer, vector);
    }

    /* renamed from: a */
    public final int mo9684a(C0653t tVar, C0669b bVar) {
        return m204a(tVar, (C0631b) bVar);
    }

    /* renamed from: a */
    public final int mo9685a(C0653t tVar, C0669b bVar, int i) {
        return m226b(tVar, bVar, i);
    }

    /* renamed from: a */
    public final int mo9686a(C0653t tVar, C0669b bVar, C0656w wVar) {
        return m206a(tVar, (C0631b) bVar, wVar);
    }

    /* renamed from: a */
    public final int mo9687a(C0653t tVar, C0669b bVar, C0657x xVar) {
        return m207a(tVar, (C0631b) bVar, xVar);
    }

    /* renamed from: a */
    public final int mo9688a(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        return m222b(tVar, (C0631b) bVar, str);
    }

    /* renamed from: a */
    public final int mo9689a(C0653t tVar, C0669b bVar, String str, String str2, String str3, StringBuffer stringBuffer) {
        return m227b(tVar, bVar, str, str2, str3, stringBuffer);
    }

    /* renamed from: a */
    public final int mo9690a(C0653t tVar, C0669b bVar, String str, StringBuffer stringBuffer) {
        return m209a(tVar, (C0631b) bVar, (String) null, str, stringBuffer);
    }

    /* renamed from: a */
    public final int mo9691a(C0653t tVar, C0669b bVar, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, Vector<String> vector) {
        return m228b(tVar, bVar, str, stringBuffer, stringBuffer2, vector);
    }

    /* renamed from: a */
    public final int mo9692a(C0653t tVar, C0669b bVar, String str, Vector<String> vector, StringBuffer stringBuffer) throws DatablinkMobile200EmbeddedApi_Exception {
        return m229b(tVar, bVar, str, vector, stringBuffer);
    }

    /* renamed from: a */
    public final int mo9693a(C0653t tVar, C0669b bVar, StringBuffer stringBuffer) {
        return m210a(tVar, (C0631b) bVar, (String) null, stringBuffer);
    }

    /* renamed from: a */
    public final int mo9694a(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m243i(tVar, bVar, vector, stringBuffer);
    }

    /* renamed from: a */
    public final int mo9695a(C0653t tVar, C0669b bVar, boolean z, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        return m230b(tVar, bVar, z, str, stringBuffer, stringBuffer2);
    }

    /* renamed from: a */
    public final int mo9696a(C0669b bVar, String str, Vector<String> vector) throws DatablinkMobile200EmbeddedApi_Exception {
        return m244i(bVar, str, vector);
    }

    /* renamed from: a */
    public final int mo9697a(C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m235d(bVar, vector, stringBuffer);
    }

    /* renamed from: b */
    public final int mo9698b(C0653t tVar, C0669b bVar) {
        return m234d(tVar, bVar);
    }

    /* renamed from: b */
    public final int mo9699b(C0653t tVar, C0669b bVar, String str) {
        return m256t(tVar, bVar, str);
    }

    /* renamed from: b */
    public final int mo9700b(C0653t tVar, C0669b bVar, String str, StringBuffer stringBuffer) {
        return m224b(tVar, (C0631b) bVar, str, stringBuffer);
    }

    /* renamed from: b */
    public final int mo9701b(C0653t tVar, C0669b bVar, StringBuffer stringBuffer) {
        return m214a(tVar, bVar, stringBuffer, 2);
    }

    /* renamed from: b */
    public final int mo9702b(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m239g(tVar, bVar, vector, stringBuffer);
    }

    /* renamed from: b */
    public final int mo9703b(C0669b bVar, String str, Vector<String> vector) throws DatablinkMobile200EmbeddedApi_Exception {
        return m242h(bVar, str, vector);
    }

    /* renamed from: b */
    public final int mo9704b(C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m237e(bVar, vector, stringBuffer);
    }

    /* renamed from: c */
    public final int mo9705c(C0653t tVar, C0669b bVar) {
        return m236e(tVar, bVar);
    }

    /* renamed from: c */
    public final int mo9706c(C0653t tVar, C0669b bVar, String str) {
        return m255s(tVar, bVar, str);
    }

    /* renamed from: c */
    public final int mo9707c(C0653t tVar, C0669b bVar, String str, StringBuffer stringBuffer) {
        return m210a(tVar, (C0631b) bVar, str, stringBuffer);
    }

    /* renamed from: c */
    public final int mo9708c(C0653t tVar, C0669b bVar, StringBuffer stringBuffer) {
        return m214a(tVar, bVar, stringBuffer, 1);
    }

    /* renamed from: c */
    public final int mo9709c(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m241h(tVar, bVar, vector, stringBuffer);
    }

    /* renamed from: c */
    public final int mo9710c(C0669b bVar, String str, Vector<String> vector) {
        return m248k(bVar, str, vector);
    }

    /* renamed from: c */
    public final int mo9711c(C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m238f(bVar, vector, stringBuffer);
    }

    /* renamed from: d */
    public final int mo9712d(C0653t tVar, C0669b bVar, String str) {
        return m254r(tVar, bVar, str);
    }

    /* renamed from: d */
    public final int mo9713d(C0653t tVar, C0669b bVar, String str, StringBuffer stringBuffer) {
        return m233c(tVar, (C0631b) bVar, str, stringBuffer);
    }

    /* renamed from: d */
    public final int mo9714d(C0653t tVar, C0669b bVar, StringBuffer stringBuffer) {
        return m214a(tVar, bVar, stringBuffer, 3);
    }

    /* renamed from: d */
    public final int mo9715d(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m245j(tVar, bVar, vector, stringBuffer);
    }

    /* renamed from: d */
    public final int mo9716d(C0669b bVar, String str, Vector<String> vector) {
        if (vector == null) {
            return C0643j.f246K;
        }
        Vector vector2 = new Vector();
        try {
            new C0650q(bVar.mo9676b());
            int a = C0650q.m311a(str, (Vector<String>) vector2);
            if (a != 0) {
                return a;
            }
            if (a == 0) {
                a = C0643j.f266aB;
                try {
                    if (vector2.size() <= 1 || !((String) vector2.get(0)).equals("10")) {
                        if (vector2.size() > 0) {
                            vector2.clear();
                        }
                        return C0643j.f266aB;
                    }
                    vector2.remove(0);
                    for (int i = 0; i < vector2.size(); i++) {
                        vector.add(vector2.get(i));
                    }
                    return 0;
                } catch (Exception e) {
                    e.printStackTrace();
                    if (vector != null && vector.size() > 0) {
                        vector.clear();
                    }
                }
            }
            return a;
        } catch (Exception unused) {
            return C0643j.f311au;
        }
    }

    /* renamed from: e */
    public final int mo9717e(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        return m253q(tVar, bVar, str);
    }

    /* renamed from: e */
    public final int mo9718e(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m247k(tVar, bVar, vector, stringBuffer);
    }

    /* renamed from: e */
    public final int mo9719e(C0669b bVar, String str, Vector<String> vector) throws DatablinkMobile200EmbeddedApi_Exception {
        return m250l(bVar, str, vector);
    }

    /* renamed from: f */
    public final int mo9720f(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        return m252p(tVar, bVar, str);
    }

    /* renamed from: f */
    public final int mo9721f(C0653t tVar, C0669b bVar, Vector<String> vector, StringBuffer stringBuffer) {
        return m249l(tVar, bVar, vector, stringBuffer);
    }

    /* renamed from: f */
    public final int mo9722f(C0669b bVar, String str, Vector<String> vector) {
        if (vector == null) {
            return C0643j.f246K;
        }
        try {
            Vector vector2 = new Vector();
            try {
                new C0646m(bVar.mo9676b());
                int a = C0646m.m142a(str, (Vector<String>) vector2);
                if (a != 0) {
                    return a;
                }
                if (vector2.size() != 2) {
                    return C0643j.f312av;
                }
                try {
                    String[] split = C0634c.m116c(((String) vector2.get(1)).getBytes()).split("&");
                    vector.add(split[0]);
                    if (split.length == 2) {
                        vector.add(split[1]);
                    }
                    return 0;
                } catch (Exception unused) {
                    return C0643j.f312av;
                }
            } catch (Exception unused2) {
                return C0643j.f311au;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return C0643j.f330bn;
        }
    }

    /* renamed from: g */
    public final int mo9723g(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        return m259w(tVar, bVar, str);
    }

    /* renamed from: h */
    public final int mo9724h(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        return m260x(tVar, bVar, str);
    }

    /* renamed from: i */
    public final int mo9725i(C0653t tVar, C0669b bVar, String str) throws DatablinkMobile200EmbeddedApi_Exception {
        return m261y(tVar, bVar, str);
    }

    /* renamed from: j */
    public final int mo9726j(C0653t tVar, C0669b bVar, String str) {
        return m262z(tVar, bVar, str);
    }

    /* renamed from: k */
    public final int mo9727k(C0653t tVar, C0669b bVar, String str) {
        return m202A(tVar, bVar, str);
    }

    /* renamed from: l */
    public final int mo9728l(C0653t tVar, C0669b bVar, String str) {
        return m203B(tVar, bVar, str);
    }

    /* renamed from: m */
    public final int mo9729m(C0653t tVar, C0669b bVar, String str) {
        return m257u(tVar, bVar, str);
    }

    /* renamed from: n */
    public final int mo9730n(C0653t tVar, C0669b bVar, String str) {
        return m258v(tVar, bVar, str);
    }
}
