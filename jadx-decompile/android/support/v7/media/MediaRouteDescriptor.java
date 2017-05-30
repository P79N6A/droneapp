package android.support.v7.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class MediaRouteDescriptor {
    private static final String KEY_CAN_DISCONNECT = "canDisconnect";
    private static final String KEY_CONNECTING = "connecting";
    private static final String KEY_CONNECTION_STATE = "connectionState";
    private static final String KEY_CONTROL_FILTERS = "controlFilters";
    private static final String KEY_DESCRIPTION = "status";
    private static final String KEY_DEVICE_TYPE = "deviceType";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_GROUP_MEMBER_IDS = "groupMemberIds";
    private static final String KEY_ICON_URI = "iconUri";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PLAYBACK_STREAM = "playbackStream";
    private static final String KEY_PLAYBACK_TYPE = "playbackType";
    private static final String KEY_PRESENTATION_DISPLAY_ID = "presentationDisplayId";
    private static final String KEY_SETTINGS_INTENT = "settingsIntent";
    private static final String KEY_VOLUME = "volume";
    private static final String KEY_VOLUME_HANDLING = "volumeHandling";
    private static final String KEY_VOLUME_MAX = "volumeMax";
    private final Bundle mBundle;
    private List<IntentFilter> mControlFilters;

    public static final class Builder {
        private final Bundle mBundle;
        private ArrayList<IntentFilter> mControlFilters;
        private ArrayList<String> mGroupMemberIds;

        public Builder(MediaRouteDescriptor mediaRouteDescriptor) {
            if (mediaRouteDescriptor == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.mBundle = new Bundle(mediaRouteDescriptor.mBundle);
            mediaRouteDescriptor.ensureControlFilters();
            if (!mediaRouteDescriptor.mControlFilters.isEmpty()) {
                this.mControlFilters = new ArrayList(mediaRouteDescriptor.mControlFilters);
            }
        }

        public Builder(String str, String str2) {
            this.mBundle = new Bundle();
            setId(str);
            setName(str2);
        }

        public Builder addControlFilter(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.mControlFilters == null) {
                this.mControlFilters = new ArrayList();
            }
            if (!this.mControlFilters.contains(intentFilter)) {
                this.mControlFilters.add(intentFilter);
            }
            return this;
        }

        public Builder addControlFilters(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                for (IntentFilter addControlFilter : collection) {
                    addControlFilter(addControlFilter);
                }
            }
            return this;
        }

        public Builder addGroupMemberId(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (this.mGroupMemberIds == null) {
                this.mGroupMemberIds = new ArrayList();
            }
            if (!this.mGroupMemberIds.contains(str)) {
                this.mGroupMemberIds.add(str);
            }
            return this;
        }

        public Builder addGroupMemberIds(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!collection.isEmpty()) {
                for (String addGroupMemberId : collection) {
                    addGroupMemberId(addGroupMemberId);
                }
            }
            return this;
        }

        public MediaRouteDescriptor build() {
            if (this.mControlFilters != null) {
                this.mBundle.putParcelableArrayList(MediaRouteDescriptor.KEY_CONTROL_FILTERS, this.mControlFilters);
            }
            if (this.mGroupMemberIds != null) {
                this.mBundle.putStringArrayList(MediaRouteDescriptor.KEY_GROUP_MEMBER_IDS, this.mGroupMemberIds);
            }
            return new MediaRouteDescriptor(this.mBundle, this.mControlFilters);
        }

        public Builder setCanDisconnect(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.KEY_CAN_DISCONNECT, z);
            return this;
        }

        @Deprecated
        public Builder setConnecting(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.KEY_CONNECTING, z);
            return this;
        }

        public Builder setConnectionState(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_CONNECTION_STATE, i);
            return this;
        }

        public Builder setDescription(String str) {
            this.mBundle.putString("status", str);
            return this;
        }

        public Builder setDeviceType(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_DEVICE_TYPE, i);
            return this;
        }

        public Builder setEnabled(boolean z) {
            this.mBundle.putBoolean(MediaRouteDescriptor.KEY_ENABLED, z);
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mBundle.putBundle(MediaRouteDescriptor.KEY_EXTRAS, bundle);
            return this;
        }

        public Builder setIconUri(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("iconUri must not be null");
            }
            this.mBundle.putString(MediaRouteDescriptor.KEY_ICON_URI, uri.toString());
            return this;
        }

        public Builder setId(String str) {
            this.mBundle.putString("id", str);
            return this;
        }

        public Builder setName(String str) {
            this.mBundle.putString("name", str);
            return this;
        }

        public Builder setPlaybackStream(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_PLAYBACK_STREAM, i);
            return this;
        }

        public Builder setPlaybackType(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_PLAYBACK_TYPE, i);
            return this;
        }

        public Builder setPresentationDisplayId(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_PRESENTATION_DISPLAY_ID, i);
            return this;
        }

        public Builder setSettingsActivity(IntentSender intentSender) {
            this.mBundle.putParcelable(MediaRouteDescriptor.KEY_SETTINGS_INTENT, intentSender);
            return this;
        }

        public Builder setVolume(int i) {
            this.mBundle.putInt("volume", i);
            return this;
        }

        public Builder setVolumeHandling(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_VOLUME_HANDLING, i);
            return this;
        }

        public Builder setVolumeMax(int i) {
            this.mBundle.putInt(MediaRouteDescriptor.KEY_VOLUME_MAX, i);
            return this;
        }
    }

    private MediaRouteDescriptor(Bundle bundle, List<IntentFilter> list) {
        this.mBundle = bundle;
        this.mControlFilters = list;
    }

    private void ensureControlFilters() {
        if (this.mControlFilters == null) {
            this.mControlFilters = this.mBundle.getParcelableArrayList(KEY_CONTROL_FILTERS);
            if (this.mControlFilters == null) {
                this.mControlFilters = Collections.emptyList();
            }
        }
    }

    public static MediaRouteDescriptor fromBundle(Bundle bundle) {
        return bundle != null ? new MediaRouteDescriptor(bundle, null) : null;
    }

    public Bundle asBundle() {
        return this.mBundle;
    }

    public boolean canDisconnectAndKeepPlaying() {
        return this.mBundle.getBoolean(KEY_CAN_DISCONNECT, false);
    }

    public int getConnectionState() {
        return this.mBundle.getInt(KEY_CONNECTION_STATE, 0);
    }

    public List<IntentFilter> getControlFilters() {
        ensureControlFilters();
        return this.mControlFilters;
    }

    public String getDescription() {
        return this.mBundle.getString("status");
    }

    public int getDeviceType() {
        return this.mBundle.getInt(KEY_DEVICE_TYPE);
    }

    public Bundle getExtras() {
        return this.mBundle.getBundle(KEY_EXTRAS);
    }

    public List<String> getGroupMemberIds() {
        return this.mBundle.getStringArrayList(KEY_GROUP_MEMBER_IDS);
    }

    public Uri getIconUri() {
        String string = this.mBundle.getString(KEY_ICON_URI);
        return string == null ? null : Uri.parse(string);
    }

    public String getId() {
        return this.mBundle.getString("id");
    }

    public String getName() {
        return this.mBundle.getString("name");
    }

    public int getPlaybackStream() {
        return this.mBundle.getInt(KEY_PLAYBACK_STREAM, -1);
    }

    public int getPlaybackType() {
        return this.mBundle.getInt(KEY_PLAYBACK_TYPE, 1);
    }

    public int getPresentationDisplayId() {
        return this.mBundle.getInt(KEY_PRESENTATION_DISPLAY_ID, -1);
    }

    public IntentSender getSettingsActivity() {
        return (IntentSender) this.mBundle.getParcelable(KEY_SETTINGS_INTENT);
    }

    public int getVolume() {
        return this.mBundle.getInt("volume");
    }

    public int getVolumeHandling() {
        return this.mBundle.getInt(KEY_VOLUME_HANDLING, 0);
    }

    public int getVolumeMax() {
        return this.mBundle.getInt(KEY_VOLUME_MAX);
    }

    @Deprecated
    public boolean isConnecting() {
        return this.mBundle.getBoolean(KEY_CONNECTING, false);
    }

    public boolean isEnabled() {
        return this.mBundle.getBoolean(KEY_ENABLED, true);
    }

    public boolean isValid() {
        ensureControlFilters();
        return (TextUtils.isEmpty(getId()) || TextUtils.isEmpty(getName()) || this.mControlFilters.contains(null)) ? false : true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteDescriptor{ ");
        stringBuilder.append("id=").append(getId());
        stringBuilder.append(", groupMemberIds=").append(getGroupMemberIds());
        stringBuilder.append(", name=").append(getName());
        stringBuilder.append(", description=").append(getDescription());
        stringBuilder.append(", iconUri=").append(getIconUri());
        stringBuilder.append(", isEnabled=").append(isEnabled());
        stringBuilder.append(", isConnecting=").append(isConnecting());
        stringBuilder.append(", connectionState=").append(getConnectionState());
        stringBuilder.append(", controlFilters=").append(Arrays.toString(getControlFilters().toArray()));
        stringBuilder.append(", playbackType=").append(getPlaybackType());
        stringBuilder.append(", playbackStream=").append(getPlaybackStream());
        stringBuilder.append(", deviceType=").append(getDeviceType());
        stringBuilder.append(", volume=").append(getVolume());
        stringBuilder.append(", volumeMax=").append(getVolumeMax());
        stringBuilder.append(", volumeHandling=").append(getVolumeHandling());
        stringBuilder.append(", presentationDisplayId=").append(getPresentationDisplayId());
        stringBuilder.append(", extras=").append(getExtras());
        stringBuilder.append(", isValid=").append(isValid());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
