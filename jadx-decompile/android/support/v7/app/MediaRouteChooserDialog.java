package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteGroup;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MediaRouteChooserDialog extends Dialog {
    private static final String TAG = "MediaRouteChooserDialog";
    private RouteAdapter mAdapter;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ListView mListView;
    private AsyncTask<Void, Void, Void> mOnItemClickTask;
    private AsyncTask<Void, Void, Void> mRefreshRoutesTask;
    private final MediaRouter mRouter;
    private ArrayList<RouteInfo> mRoutes;
    private MediaRouteSelector mSelector;

    private final class MediaRouterCallback extends Callback {
        private MediaRouterCallback() {
        }

        public void onRouteAdded(MediaRouter mediaRouter, RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        public void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        public void onRouteRemoved(MediaRouter mediaRouter, RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        public void onRouteSelected(MediaRouter mediaRouter, RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.dismiss();
        }
    }

    private final class RouteAdapter extends ArrayAdapter<RouteInfo> implements OnItemClickListener {
        private final Drawable mDefaultIcon;
        private final LayoutInflater mInflater;
        private final Drawable mSpeakerGroupIcon;
        private final Drawable mSpeakerIcon;
        private final Drawable mTvIcon;

        public RouteAdapter(Context context, List<RouteInfo> list) {
            super(context, 0, list);
            this.mInflater = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.mDefaultIcon = obtainStyledAttributes.getDrawable(0);
            this.mTvIcon = obtainStyledAttributes.getDrawable(1);
            this.mSpeakerIcon = obtainStyledAttributes.getDrawable(2);
            this.mSpeakerGroupIcon = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        private Drawable getDefaultIconDrawable(RouteInfo routeInfo) {
            switch (routeInfo.getDeviceType()) {
                case 1:
                    return this.mTvIcon;
                case 2:
                    return this.mSpeakerIcon;
                default:
                    return routeInfo instanceof RouteGroup ? this.mSpeakerGroupIcon : this.mDefaultIcon;
            }
        }

        private Drawable getIconDrawable(RouteInfo routeInfo) {
            Uri iconUri = routeInfo.getIconUri();
            if (iconUri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(iconUri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (Throwable e) {
                    Log.w(MediaRouteChooserDialog.TAG, "Failed to load " + iconUri, e);
                }
            }
            return getDefaultIconDrawable(routeInfo);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            boolean z = true;
            if (view == null) {
                view = this.mInflater.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
            }
            RouteInfo routeInfo = (RouteInfo) getItem(i);
            TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
            textView.setText(routeInfo.getName());
            CharSequence description = routeInfo.getDescription();
            if (!(routeInfo.getConnectionState() == 2 || routeInfo.getConnectionState() == 1)) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(description)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(description);
            }
            view.setEnabled(routeInfo.isEnabled());
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(getIconDrawable(routeInfo));
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return ((RouteInfo) getItem(i)).isEnabled();
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final RouteInfo routeInfo = (RouteInfo) getItem(i);
            if (routeInfo.isEnabled() && MediaRouteChooserDialog.this.mOnItemClickTask == null) {
                MediaRouteChooserDialog.this.mOnItemClickTask = new AsyncTask<Void, Void, Void>() {
                    protected Void doInBackground(Void... voidArr) {
                        RouteComparator.getInstance(RouteAdapter.this.getContext()).storeRouteUsageScores(routeInfo.getId());
                        return null;
                    }

                    protected void onPostExecute(Void voidR) {
                        MediaRouteChooserDialog.this.dismiss();
                        MediaRouteChooserDialog.this.mOnItemClickTask = null;
                    }

                    protected void onPreExecute() {
                        routeInfo.select();
                    }
                }.execute(new Void[0]);
            }
        }
    }

    private static final class RouteComparator implements Comparator<RouteInfo> {
        private static final float MIN_USAGE_SCORE = 0.1f;
        private static final String PREF_ROUTE_IDS = "android.support.v7.app.MediaRouteChooserDialog_route_ids";
        private static final String PREF_USAGE_SCORE_PREFIX = "android.support.v7.app.MediaRouteChooserDialog_route_usage_score_";
        private static final float USAGE_SCORE_DECAY_FACTOR = 0.95f;
        private static RouteComparator sInstance;
        private final SharedPreferences mPreferences;
        private final HashMap<String, Float> mRouteUsageScoreMap = new HashMap();

        private RouteComparator(Context context) {
            this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }

        public static RouteComparator getInstance(Context context) {
            if (sInstance == null) {
                sInstance = new RouteComparator(context);
            }
            return sInstance;
        }

        private void loadRouteUsageScores(List<RouteInfo> list) {
            for (RouteInfo routeInfo : list) {
                if (this.mRouteUsageScoreMap.get(routeInfo.getId()) == null) {
                    this.mRouteUsageScoreMap.put(routeInfo.getId(), Float.valueOf(this.mPreferences.getFloat(PREF_USAGE_SCORE_PREFIX + routeInfo.getId(), 0.0f)));
                }
            }
        }

        private void storeRouteUsageScores(String str) {
            Editor edit = this.mPreferences.edit();
            List<String> arrayList = new ArrayList(Arrays.asList(this.mPreferences.getString(PREF_ROUTE_IDS, "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (String str2 : arrayList) {
                String str3 = PREF_USAGE_SCORE_PREFIX + str2;
                float f = this.mPreferences.getFloat(str3, 0.0f) * USAGE_SCORE_DECAY_FACTOR;
                if (str.equals(str2)) {
                    f += 1.0f;
                }
                if (f < MIN_USAGE_SCORE) {
                    this.mRouteUsageScoreMap.remove(str2);
                    edit.remove(str2);
                } else {
                    this.mRouteUsageScoreMap.put(str2, Float.valueOf(f));
                    edit.putFloat(str3, f);
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(',');
                    }
                    stringBuilder.append(str2);
                }
            }
            edit.putString(PREF_ROUTE_IDS, stringBuilder.toString());
            edit.commit();
        }

        public int compare(RouteInfo routeInfo, RouteInfo routeInfo2) {
            int i = -1;
            if (routeInfo == null) {
                return routeInfo2 == null ? 0 : -1;
            } else {
                if (routeInfo2 == null) {
                    return 1;
                }
                Float f = (Float) this.mRouteUsageScoreMap.get(routeInfo.getId());
                Float valueOf = f == null ? Float.valueOf(0.0f) : f;
                f = (Float) this.mRouteUsageScoreMap.get(routeInfo2.getId());
                if (f == null) {
                    f = Float.valueOf(0.0f);
                }
                if (valueOf.equals(f)) {
                    return routeInfo.getName().compareTo(routeInfo2.getName());
                }
                if (valueOf.floatValue() <= f.floatValue()) {
                    i = 1;
                }
                return i;
            }
        }
    }

    public MediaRouteChooserDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteChooserDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context, i), i);
        this.mSelector = MediaRouteSelector.EMPTY;
        this.mRouter = MediaRouter.getInstance(getContext());
        this.mCallback = new MediaRouterCallback();
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(this.mSelector, this.mCallback, 1);
        refreshRoutes();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        setTitle(R.string.mr_chooser_title);
        this.mRoutes = new ArrayList();
        this.mAdapter = new RouteAdapter(getContext(), this.mRoutes);
        this.mListView = (ListView) findViewById(R.id.mr_chooser_list);
        this.mListView.setAdapter(this.mAdapter);
        this.mListView.setOnItemClickListener(this.mAdapter);
        this.mListView.setEmptyView(findViewById(16908292));
        updateLayout();
    }

    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mRouter.removeCallback(this.mCallback);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(@NonNull RouteInfo routeInfo) {
        return !routeInfo.isDefaultOrBluetooth() && routeInfo.isEnabled() && routeInfo.matchesSelector(this.mSelector);
    }

    public void onFilterRoutes(@NonNull List<RouteInfo> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (onFilterRoute((RouteInfo) list.get(i))) {
                size = i;
            } else {
                list.remove(i);
                size = i;
            }
        }
    }

    public void refreshRoutes() {
        if (this.mAttachedToWindow) {
            if (this.mRefreshRoutesTask != null) {
                this.mRefreshRoutesTask.cancel(true);
                this.mRefreshRoutesTask = null;
            }
            this.mRefreshRoutesTask = new AsyncTask<Void, Void, Void>() {
                private ArrayList<RouteInfo> mNewRoutes;

                protected Void doInBackground(Void... voidArr) {
                    synchronized (MediaRouteChooserDialog.this) {
                        if (!isCancelled()) {
                            RouteComparator.getInstance(MediaRouteChooserDialog.this.getContext()).loadRouteUsageScores(this.mNewRoutes);
                        }
                    }
                    return null;
                }

                protected void onPostExecute(Void voidR) {
                    MediaRouteChooserDialog.this.mRoutes.clear();
                    MediaRouteChooserDialog.this.mRoutes.addAll(this.mNewRoutes);
                    Collections.sort(MediaRouteChooserDialog.this.mRoutes, RouteComparator.sInstance);
                    MediaRouteChooserDialog.this.mAdapter.notifyDataSetChanged();
                    MediaRouteChooserDialog.this.mRefreshRoutesTask = null;
                }

                protected void onPreExecute() {
                    this.mNewRoutes = new ArrayList(MediaRouteChooserDialog.this.mRouter.getRoutes());
                    MediaRouteChooserDialog.this.onFilterRoutes(this.mNewRoutes);
                }
            }.execute(new Void[0]);
        }
    }

    public void setRouteSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(mediaRouteSelector)) {
            this.mSelector = mediaRouteSelector;
            if (this.mAttachedToWindow) {
                this.mRouter.removeCallback(this.mCallback);
                this.mRouter.addCallback(mediaRouteSelector, this.mCallback, 1);
            }
            refreshRoutes();
        }
    }

    void updateLayout() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidth(getContext()), -2);
    }
}
