package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;

public final class f {
    public static final int A = 6000;
    public static final int B = 6001;
    public static final int C = 6002;
    public static final int D = 6003;
    public static final int E = 6004;
    public static final int F = 6500;
    public static final int G = 6501;
    public static final int H = 6502;
    public static final int I = 6503;
    public static final int J = 6504;
    public static final int K = 6505;
    public static final int L = 6506;
    public static final int M = 6507;
    public static final int N = 7000;
    public static final int O = 7001;
    public static final int P = 7002;
    public static final int Q = 7003;
    public static final int R = 7004;
    public static final int S = 7005;
    public static final int T = 7007;
    public static final int U = 8000;
    public static final int V = 8001;
    public static final int W = 8002;
    public static final int X = 8003;
    public static final int Y = 9000;
    public static final int Z = 9001;
    public static final int a = 0;
    public static final int aa = 9002;
    public static final int ab = 9003;
    public static final int ac = 9004;
    public static final int ad = 9006;
    public static final int ae = 9009;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 14;
    public static final int l = 15;
    public static final int m = 2000;
    public static final int n = 2001;
    public static final int o = 2002;
    public static final int p = 3000;
    public static final int q = 3001;
    public static final int r = 3002;
    public static final int s = 3003;
    public static final int t = 4000;
    public static final int u = 4001;
    public static final int v = 4002;
    public static final int w = 4003;
    public static final int x = 4004;
    public static final int y = 4005;
    public static final int z = 4006;

    private f() {
    }

    public static Status a(int i) {
        return new Status(i, b(i));
    }

    public static String b(int i) {
        switch (i) {
            case 0:
                return "STATUS_OK";
            case 1:
                return "STATUS_INTERNAL_ERROR";
            case 2:
                return "STATUS_CLIENT_RECONNECT_REQUIRED";
            case 3:
                return "STATUS_NETWORK_ERROR_STALE_DATA";
            case 4:
                return "STATUS_NETWORK_ERROR_NO_DATA";
            case 5:
                return "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";
            case 6:
                return "STATUS_NETWORK_ERROR_OPERATION_FAILED";
            case 7:
                return "STATUS_LICENSE_CHECK_FAILED";
            case 8:
                return "STATUS_APP_MISCONFIGURED";
            case 9:
                return "STATUS_GAME_NOT_FOUND";
            case 14:
                return "STATUS_INTERRUPTED";
            case 15:
                return "STATUS_TIMEOUT";
            case 500:
                return "STATUS_RESOLVE_STALE_OR_NO_DATA";
            case 1000:
                return "STATUS_AUTH_ERROR_HARD";
            case 1001:
                return "STATUS_AUTH_ERROR_USER_RECOVERABLE";
            case 1002:
                return "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";
            case 1003:
                return "STATUS_AUTH_ERROR_API_ACCESS_DENIED";
            case 1500:
                return "STATUS_PLAYER_OOB_REQUIRED";
            case 2000:
                return "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";
            case 2001:
                return "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";
            case 2002:
                return "STATUS_REQUEST_TOO_MANY_RECIPIENTS";
            case 3000:
                return "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";
            case 3001:
                return "STATUS_ACHIEVEMENT_UNKNOWN";
            case 3002:
                return "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";
            case 3003:
                return "STATUS_ACHIEVEMENT_UNLOCKED";
            case 4000:
                return "STATUS_SNAPSHOT_NOT_FOUND";
            case 4001:
                return "STATUS_SNAPSHOT_CREATION_FAILED";
            case 4002:
                return "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";
            case 4003:
                return "STATUS_SNAPSHOT_COMMIT_FAILED";
            case 4004:
                return "STATUS_SNAPSHOT_CONFLICT";
            case 4006:
                return "STATUS_SNAPSHOT_CONFLICT_MISSING";
            case A /*6000*/:
                return "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
            case B /*6001*/:
                return "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
            case C /*6002*/:
                return "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
            case D /*6003*/:
                return "STATUS_MULTIPLAYER_DISABLED";
            case F /*6500*/:
                return "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";
            case G /*6501*/:
                return "STATUS_MATCH_ERROR_INACTIVE_MATCH";
            case I /*6503*/:
                return "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";
            case J /*6504*/:
                return "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";
            case K /*6505*/:
                return "STATUS_MATCH_ERROR_ALREADY_REMATCHED";
            case L /*6506*/:
                return "STATUS_MATCH_NOT_FOUND";
            case M /*6507*/:
                return "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";
            case N /*7000*/:
                return "STATUS_REAL_TIME_CONNECTION_FAILED";
            case O /*7001*/:
                return "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";
            case P /*7002*/:
                return "STATUS_INVALID_REAL_TIME_ROOM_ID";
            case Q /*7003*/:
                return "STATUS_PARTICIPANT_NOT_CONNECTED";
            case R /*7004*/:
                return "STATUS_REAL_TIME_ROOM_NOT_JOINED";
            case S /*7005*/:
                return "STATUS_REAL_TIME_INACTIVE_ROOM";
            case 7006:
                return "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";
            case T /*7007*/:
                return "STATUS_OPERATION_IN_FLIGHT";
            case 8000:
                return "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";
            case 8001:
                return "STATUS_MILESTONE_CLAIM_FAILED";
            case 8002:
                return "STATUS_QUEST_NO_LONGER_AVAILABLE";
            case 8003:
                return "STATUS_QUEST_NOT_STARTED";
            case Y /*9000*/:
                return "STATUS_VIDEO_NOT_ACTIVE";
            case 9001:
                return "STATUS_VIDEO_UNSUPPORTED";
            case 9002:
                return "STATUS_VIDEO_PERMISSION_ERROR";
            case 9003:
                return "STATUS_VIDEO_STORAGE_ERROR";
            case 9004:
                return "STATUS_VIDEO_UNEXPECTED_CAPTURE_ERROR";
            case 9006:
                return "STATUS_VIDEO_ALREADY_CAPTURING";
            case ae /*9009*/:
                return "STATUS_VIDEO_OUT_OF_DISK_SPACE";
            case 9010:
                return "STATUS_VIDEO_NO_MIC";
            case 9011:
                return "STATUS_VIDEO_NO_CAMERA";
            case 9012:
                return "STATUS_VIDEO_SCREEN_OFF";
            case 9016:
                return "STATUS_VIDEO_RELEASE_TIMEOUT";
            case 9017:
                return "STATUS_VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
            case 9100:
                return "STATUS_VIDEO_NO_STREAMING_TARGET";
            case 9101:
                return "STATUS_YOUTUBE_LIVE_STREAM_NOT_ENABLED";
            case 9103:
                return "STATUS_YOUTUBE_LIVE_STREAM_GOOGLE_AUTH_ERROR";
            case 9200:
                return "STATUS_VIDEO_MISSING_OVERLAY_PERMISSION";
            case 9201:
                return "STATUS_VIDEO_MISSING_HEADLESS_PERMISSION";
            case 10000:
                return "STATUS_CLIENT_LOADING";
            case 10001:
                return "STATUS_CLIENT_EMPTY";
            case d.b /*10002*/:
                return "STATUS_CLIENT_HIDDEN";
            default:
                return String.format("Status code (%d) not found!", new Object[]{Integer.valueOf(i)});
        }
    }
}
