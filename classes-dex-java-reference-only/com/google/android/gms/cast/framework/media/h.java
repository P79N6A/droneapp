package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.R.id;
import com.google.android.gms.R.layout;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;

public class h
  extends ArrayAdapter<MediaTrack>
  implements View.OnClickListener
{
  private final Context a;
  private int b;
  
  public h(Context paramContext, List<MediaTrack> paramList, int paramInt) {}
  
  public MediaTrack a()
  {
    if ((this.b >= 0) && (this.b < getCount())) {
      return (MediaTrack)getItem(this.b);
    }
    return null;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(R.layout.cast_tracks_chooser_dialog_row_layout, paramViewGroup, false);
      paramViewGroup = new a((TextView)paramView.findViewById(R.id.text), (RadioButton)paramView.findViewById(R.id.radio), null);
      paramView.setTag(paramViewGroup);
    }
    while (paramViewGroup == null)
    {
      return null;
      paramViewGroup = (a)paramView.getTag();
    }
    paramViewGroup.b.setTag(Integer.valueOf(paramInt));
    Object localObject = paramViewGroup.b;
    if (this.b == paramInt) {}
    for (boolean bool = true;; bool = false)
    {
      ((RadioButton)localObject).setChecked(bool);
      paramView.setOnClickListener(this);
      String str = ((MediaTrack)getItem(paramInt)).f();
      localObject = str;
      if (TextUtils.isEmpty(str)) {
        localObject = this.a.getString(R.string.cast_tracks_chooser_dialog_default_track_name, new Object[] { Integer.valueOf(paramInt) });
      }
      paramViewGroup.a.setText((CharSequence)localObject);
      return paramView;
    }
  }
  
  public void onClick(View paramView)
  {
    this.b = ((Integer)((a)paramView.getTag()).b.getTag()).intValue();
    notifyDataSetChanged();
  }
  
  private class a
  {
    final TextView a;
    final RadioButton b;
    
    private a(TextView paramTextView, RadioButton paramRadioButton)
    {
      this.a = paramTextView;
      this.b = paramRadioButton;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */