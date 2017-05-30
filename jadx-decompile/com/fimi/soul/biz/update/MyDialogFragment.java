package com.fimi.soul.biz.update;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.R;

public class MyDialogFragment extends DialogFragment {
    private String a;

    public void a(String str) {
        this.a = str;
    }

    public boolean isCancelable() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new Builder(getActivity()).setMessage(this.a).setPositiveButton(R.string.finish, new OnClickListener(this) {
            final /* synthetic */ MyDialogFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }).create();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDetach() {
        super.onDetach();
    }

    public void setShowsDialog(boolean z) {
        super.setShowsDialog(z);
    }
}
