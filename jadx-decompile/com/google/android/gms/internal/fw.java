package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.g;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import com.google.firebase.auth.k;
import com.google.firebase.auth.l;
import com.google.firebase.auth.m;
import com.google.firebase.c;
import com.google.firebase.d;
import com.google.firebase.f;

public final class fw {
    private static final SparseArray<Pair<String, String>> a = new SparseArray();

    static {
        a.put(17000, new Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        a.put(17002, new Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        a.put(17004, new Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        a.put(17008, new Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        a.put(17009, new Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        a.put(17024, new Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        a.put(17014, new Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        a.put(17012, new Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        a.put(17007, new Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        a.put(17025, new Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        a.put(17005, new Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        a.put(17021, new Pair("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        a.put(17011, new Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        a.put(17017, new Pair("ERROR_INVALID_USER_TOKEN", "The user's credential is no longer valid. The user must sign in again."));
        a.put(17006, new Pair("ERROR_OPERATION_NOT_ALLOWED", "This operation is not allowed. You must enable this service in the console."));
        a.put(17026, new Pair("ERROR_WEAK_PASSWORD", "The given password is invalid."));
    }

    public static c a(Status status) {
        int i = status.i();
        switch (i) {
            case 17000:
            case 17002:
            case 17004:
            case 17008:
            case 17009:
            case 17024:
                return new h(a(i), b(i));
            case 17005:
            case 17011:
            case 17017:
            case 17021:
                return new i(a(i), b(i));
            case 17006:
                return new g(a(i), b(i));
            case 17007:
            case 17012:
            case 17025:
                return new l(a(i), b(i));
            case 17010:
                return new f(a("We have blocked all requests from this device due to unusual activity. Try again later.", status));
            case 17014:
                return new k(a(i), b(i));
            case 17015:
                return new c("User has already been linked to the given provider.");
            case 17016:
                return new c("User was not linked to an account with the given provider.");
            case 17020:
                return new d("A network error (such as timeout, interrupted connection or unreachable host) has occurred.");
            case 17026:
                return new m(a(i), a(b(i), status), status.c());
            case 17495:
                return new ms("Please sign in before trying to get a token.");
            case 17499:
                return new c(a("An internal error has occurred.", status));
            default:
                return new c("An internal error has occurred.");
        }
    }

    private static String a(int i) {
        Pair pair = (Pair) a.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    private static String a(String str, Status status) {
        if (TextUtils.isEmpty(status.c())) {
            return str;
        }
        return String.format(String.valueOf(str).concat(" [ %s ]"), new Object[]{status.c()});
    }

    private static String b(int i) {
        Pair pair = (Pair) a.get(i);
        return pair != null ? (String) pair.second : "An internal error happened";
    }
}
