package com.babylon.certificatetransparency.internal.serialization;
import kotlin.Metadata;
/* compiled from: CTConstants.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/babylon/certificatetransparency/internal/serialization/CTConstants;", "", "()V", "KEY_ID_LENGTH", "", "LOG_ENTRY_TYPE_LENGTH", "MAX_CERTIFICATE_LENGTH", "MAX_EXTENSIONS_LENGTH", "MAX_SIGNATURE_LENGTH", "POISON_EXTENSION_OID", "", "PRECERTIFICATE_SIGNING_OID", "SCT_CERTIFICATE_OID", "TIMESTAMP_LENGTH", "VERSION_LENGTH", "certificatetransparency"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class CTConstants {
    public static final CTConstants INSTANCE = new CTConstants();
    public static final int KEY_ID_LENGTH = 32;
    public static final int LOG_ENTRY_TYPE_LENGTH = 2;
    public static final int MAX_CERTIFICATE_LENGTH = 16777215;
    public static final int MAX_EXTENSIONS_LENGTH = 65535;
    public static final int MAX_SIGNATURE_LENGTH = 65535;
    public static final String POISON_EXTENSION_OID = "1.3.6.1.4.1.11129.2.4.3";
    public static final String PRECERTIFICATE_SIGNING_OID = "1.3.6.1.4.1.11129.2.4.4";
    public static final String SCT_CERTIFICATE_OID = "1.3.6.1.4.1.11129.2.4.2";
    public static final int TIMESTAMP_LENGTH = 8;
    public static final int VERSION_LENGTH = 1;
    private CTConstants() {
    }
}