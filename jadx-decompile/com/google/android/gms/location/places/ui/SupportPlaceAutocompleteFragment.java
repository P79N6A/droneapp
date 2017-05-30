package com.google.android.gms.location.places.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.b;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.d;
import com.google.android.gms.location.places.ui.a.a;
import com.google.android.gms.maps.model.LatLngBounds;

public class SupportPlaceAutocompleteFragment extends Fragment {
    private View a;
    private View b;
    private EditText c;
    private boolean d;
    @Nullable
    private LatLngBounds e;
    @Nullable
    private AutocompleteFilter f;
    @Nullable
    private c g;

    private void a() {
        int i = 0;
        int i2 = !this.c.getText().toString().isEmpty() ? 1 : 0;
        View view = this.b;
        if (i2 == 0) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void b() {
        int i;
        int a;
        try {
            Intent a2 = new a(2).a(this.e).a(this.f).a(this.c.getText().toString()).a(1).a(getActivity());
            this.d = true;
            startActivityForResult(a2, 30421);
            i = -1;
        } catch (Throwable e) {
            a = e.a();
            Log.e("Places", "Could not open autocomplete activity", e);
            i = a;
        } catch (Throwable e2) {
            a = e2.a;
            Log.e("Places", "Could not open autocomplete activity", e2);
            i = a;
        }
        if (i != -1) {
            b.a().b(getActivity(), i, 30422);
        }
    }

    public void a(@Nullable AutocompleteFilter autocompleteFilter) {
        this.f = autocompleteFilter;
    }

    public void a(c cVar) {
        this.g = cVar;
    }

    public void a(@Nullable LatLngBounds latLngBounds) {
        this.e = latLngBounds;
    }

    public void a(CharSequence charSequence) {
        this.c.setText(charSequence);
        a();
    }

    public void b(CharSequence charSequence) {
        this.c.setHint(charSequence);
        this.a.setContentDescription(charSequence);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.d = false;
        if (i == 30421) {
            if (i2 == -1) {
                d a = a.a(getActivity(), intent);
                if (this.g != null) {
                    this.g.a(a);
                }
                a(a.g().toString());
            } else if (i2 == 2) {
                Status b = a.b(getActivity(), intent);
                if (this.g != null) {
                    this.g.a(b);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.place_autocomplete_fragment, viewGroup, false);
        this.a = inflate.findViewById(R.id.place_autocomplete_search_button);
        this.b = inflate.findViewById(R.id.place_autocomplete_clear_button);
        this.c = (EditText) inflate.findViewById(R.id.place_autocomplete_search_input);
        OnClickListener anonymousClass1 = new OnClickListener(this) {
            final /* synthetic */ SupportPlaceAutocompleteFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (!this.a.d) {
                    this.a.b();
                }
            }
        };
        this.a.setOnClickListener(anonymousClass1);
        this.c.setOnClickListener(anonymousClass1);
        this.b.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SupportPlaceAutocompleteFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.a((CharSequence) "");
            }
        });
        a();
        return inflate;
    }

    public void onDestroyView() {
        this.a = null;
        this.b = null;
        this.c = null;
        super.onDestroyView();
    }
}
