package com.google.android.gms.internal;

public enum afb {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError");
    
    private final String aa;

    private afb(String str) {
        this.aa = str;
    }

    public static final afb a(String str) {
        afb com_google_android_gms_internal_afb = null;
        afb[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            afb com_google_android_gms_internal_afb2 = values[i];
            if (!com_google_android_gms_internal_afb2.aa.equals(str)) {
                com_google_android_gms_internal_afb2 = com_google_android_gms_internal_afb;
            }
            i++;
            com_google_android_gms_internal_afb = com_google_android_gms_internal_afb2;
        }
        return com_google_android_gms_internal_afb;
    }

    public static boolean a(afb com_google_android_gms_internal_afb) {
        return BAD_AUTHENTICATION.equals(com_google_android_gms_internal_afb) || CAPTCHA.equals(com_google_android_gms_internal_afb) || NEED_PERMISSION.equals(com_google_android_gms_internal_afb) || NEEDS_BROWSER.equals(com_google_android_gms_internal_afb) || USER_CANCEL.equals(com_google_android_gms_internal_afb) || DEVICE_MANAGEMENT_REQUIRED.equals(com_google_android_gms_internal_afb) || DM_INTERNAL_ERROR.equals(com_google_android_gms_internal_afb) || DM_SYNC_DISABLED.equals(com_google_android_gms_internal_afb) || DM_ADMIN_BLOCKED.equals(com_google_android_gms_internal_afb) || DM_ADMIN_PENDING_APPROVAL.equals(com_google_android_gms_internal_afb) || DM_STALE_SYNC_REQUIRED.equals(com_google_android_gms_internal_afb) || DM_DEACTIVATED.equals(com_google_android_gms_internal_afb) || DM_REQUIRED.equals(com_google_android_gms_internal_afb) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(com_google_android_gms_internal_afb);
    }

    public static boolean b(afb com_google_android_gms_internal_afb) {
        return NETWORK_ERROR.equals(com_google_android_gms_internal_afb) || SERVICE_UNAVAILABLE.equals(com_google_android_gms_internal_afb);
    }
}
