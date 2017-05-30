package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;

public final class MediaSessionStatus {
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_QUEUE_PAUSED = "queuePaused";
    private static final String KEY_SESSION_STATE = "sessionState";
    private static final String KEY_TIMESTAMP = "timestamp";
    public static final int SESSION_STATE_ACTIVE = 0;
    public static final int SESSION_STATE_ENDED = 1;
    public static final int SESSION_STATE_INVALIDATED = 2;
    private final Bundle mBundle;

    public static final class Builder {
        private final Bundle mBundle;

        public Builder(int i) {
            this.mBundle = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setSessionState(i);
        }

        public Builder(MediaSessionStatus mediaSessionStatus) {
            if (mediaSessionStatus == null) {
                throw new IllegalArgumentException("status must not be null");
            }
            this.mBundle = new Bundle(mediaSessionStatus.mBundle);
        }

        public MediaSessionStatus build() {
            return new MediaSessionStatus(this.mBundle);
        }

        public Builder setExtras(Bundle bundle) {
            this.mBundle.putBundle(MediaSessionStatus.KEY_EXTRAS, bundle);
            return this;
        }

        public Builder setQueuePaused(boolean z) {
            this.mBundle.putBoolean(MediaSessionStatus.KEY_QUEUE_PAUSED, z);
            return this;
        }

        public Builder setSessionState(int i) {
            this.mBundle.putInt(MediaSessionStatus.KEY_SESSION_STATE, i);
            return this;
        }

        public Builder setTimestamp(long j) {
            this.mBundle.putLong(MediaSessionStatus.KEY_TIMESTAMP, j);
            return this;
        }
    }

    private MediaSessionStatus(Bundle bundle) {
        this.mBundle = bundle;
    }

    public static MediaSessionStatus fromBundle(Bundle bundle) {
        return bundle != null ? new MediaSessionStatus(bundle) : null;
    }

    private static String sessionStateToString(int i) {
        switch (i) {
            case 0:
                return "active";
            case 1:
                return "ended";
            case 2:
                return "invalidated";
            default:
                return Integer.toString(i);
        }
    }

    public Bundle asBundle() {
        return this.mBundle;
    }

    public Bundle getExtras() {
        return this.mBundle.getBundle(KEY_EXTRAS);
    }

    public int getSessionState() {
        return this.mBundle.getInt(KEY_SESSION_STATE, 2);
    }

    public long getTimestamp() {
        return this.mBundle.getLong(KEY_TIMESTAMP);
    }

    public boolean isQueuePaused() {
        return this.mBundle.getBoolean(KEY_QUEUE_PAUSED);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaSessionStatus{ ");
        stringBuilder.append("timestamp=");
        TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), stringBuilder);
        stringBuilder.append(" ms ago");
        stringBuilder.append(", sessionState=").append(sessionStateToString(getSessionState()));
        stringBuilder.append(", queuePaused=").append(isQueuePaused());
        stringBuilder.append(", extras=").append(getExtras());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
