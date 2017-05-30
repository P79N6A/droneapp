package com.fimi.soul.module.setting.newhand;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class NewHandStartPagerFragment extends BaseNewHandFragment {
    private TextView c;
    private TextView d;
    private Button e;

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_newhand_start, null);
    }

    protected void a() {
    }

    protected void a(View view) {
        this.c = (TextView) view.findViewById(R.id.newhand_title_tv);
        this.d = (TextView) view.findViewById(R.id.newhand_content_tv);
        this.e = (Button) view.findViewById(R.id.newhand_start_btn);
        this.e.setOnClickListener(this);
        ao.a(getActivity().getAssets(), this.c, this.d, this.e);
    }

    protected String b() {
        return null;
    }

    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.newhand_start_btn:
                Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).a().getCurrentItem());
                ((NewHandActivity) getActivity()).a().setCurrentItem(((NewHandActivity) getActivity()).a().getCurrentItem() + 1, true);
                return;
            default:
                return;
        }
    }
}
