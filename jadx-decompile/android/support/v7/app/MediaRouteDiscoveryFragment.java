package android.support.v7.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;

public class MediaRouteDiscoveryFragment extends Fragment {
    private final String ARGUMENT_SELECTOR = "selector";
    private Callback mCallback;
    private MediaRouter mRouter;
    private MediaRouteSelector mSelector;

    private void ensureRouteSelector() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = MediaRouteSelector.fromBundle(arguments.getBundle("selector"));
            }
            if (this.mSelector == null) {
                this.mSelector = MediaRouteSelector.EMPTY;
            }
        }
    }

    private void ensureRouter() {
        if (this.mRouter == null) {
            this.mRouter = MediaRouter.getInstance(getContext());
        }
    }

    public MediaRouter getMediaRouter() {
        ensureRouter();
        return this.mRouter;
    }

    public MediaRouteSelector getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
    }

    public Callback onCreateCallback() {
        return new Callback() {
        };
    }

    public int onPrepareCallbackFlags() {
        return 4;
    }

    public void onStart() {
        super.onStart();
        ensureRouteSelector();
        ensureRouter();
        this.mCallback = onCreateCallback();
        if (this.mCallback != null) {
            this.mRouter.addCallback(this.mSelector, this.mCallback, onPrepareCallbackFlags());
        }
    }

    public void onStop() {
        if (this.mCallback != null) {
            this.mRouter.removeCallback(this.mCallback);
            this.mCallback = null;
        }
        super.onStop();
    }

    public void setRouteSelector(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        ensureRouteSelector();
        if (!this.mSelector.equals(mediaRouteSelector)) {
            this.mSelector = mediaRouteSelector;
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBundle("selector", mediaRouteSelector.asBundle());
            setArguments(arguments);
            if (this.mCallback != null) {
                this.mRouter.removeCallback(this.mCallback);
                this.mRouter.addCallback(this.mSelector, this.mCallback, onPrepareCallbackFlags());
            }
        }
    }
}
