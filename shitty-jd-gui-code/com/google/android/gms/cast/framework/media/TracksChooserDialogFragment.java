package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.google.android.gms.R.id;
import com.google.android.gms.R.layout;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.MediaTrack.a;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TracksChooserDialogFragment
  extends DialogFragment
{
  private List<MediaTrack> a;
  private List<MediaTrack> b;
  private long[] c;
  private Dialog d;
  
  private static int a(List<MediaTrack> paramList, long[] paramArrayOfLong, int paramInt)
  {
    if ((paramArrayOfLong == null) || (paramList == null)) {}
    for (;;)
    {
      return paramInt;
      int i = 0;
      while (i < paramList.size())
      {
        int k = paramArrayOfLong.length;
        int j = 0;
        while (j < k)
        {
          if (paramArrayOfLong[j] == ((MediaTrack)paramList.get(i)).b()) {
            return i;
          }
          j += 1;
        }
        i += 1;
      }
    }
  }
  
  private MediaTrack a()
  {
    return new MediaTrack.a(-1L, 1).c(getActivity().getString(R.string.cast_tracks_chooser_dialog_none)).a(2).a("").a();
  }
  
  public static TracksChooserDialogFragment a(MediaInfo paramMediaInfo, long[] paramArrayOfLong)
  {
    if (paramMediaInfo == null) {}
    Object localObject;
    do
    {
      do
      {
        return null;
        localObject = paramMediaInfo.g();
      } while (localObject == null);
      paramMediaInfo = a((List)localObject, 2);
      localObject = a((List)localObject, 1);
    } while ((paramMediaInfo.isEmpty()) && (((ArrayList)localObject).isEmpty()));
    TracksChooserDialogFragment localTracksChooserDialogFragment = new TracksChooserDialogFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelableArrayList("extra_tracks_type_audio", paramMediaInfo);
    localBundle.putParcelableArrayList("extra_tracks_type_text", (ArrayList)localObject);
    localBundle.putLongArray("extra_active_track_ids", paramArrayOfLong);
    localTracksChooserDialogFragment.setArguments(localBundle);
    return localTracksChooserDialogFragment;
  }
  
  @NonNull
  private static ArrayList<MediaTrack> a(List<MediaTrack> paramList, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        MediaTrack localMediaTrack = (MediaTrack)paramList.next();
        if (localMediaTrack.c() == paramInt) {
          localArrayList.add(localMediaTrack);
        }
      }
    }
    return localArrayList;
  }
  
  private void a(View paramView, h paramh1, h paramh2)
  {
    ListView localListView2 = (ListView)paramView.findViewById(R.id.text_list_view);
    ListView localListView1 = (ListView)paramView.findViewById(R.id.audio_list_view);
    TextView localTextView2 = (TextView)paramView.findViewById(R.id.text_empty_message);
    TextView localTextView1 = (TextView)paramView.findViewById(R.id.audio_empty_message);
    localListView2.setAdapter(paramh1);
    localListView1.setAdapter(paramh2);
    paramView = (TabHost)paramView.findViewById(R.id.tab_host);
    paramView.setup();
    TabHost.TabSpec localTabSpec = paramView.newTabSpec("textTab");
    if (paramh1.getCount() == 0)
    {
      localListView2.setVisibility(4);
      localTabSpec.setContent(R.id.text_empty_message);
      localTabSpec.setIndicator(getActivity().getString(R.string.cast_tracks_chooser_dialog_subtitles));
      paramView.addTab(localTabSpec);
      paramh1 = paramView.newTabSpec("audioTab");
      if (paramh2.getCount() != 0) {
        break label194;
      }
      localListView1.setVisibility(4);
      paramh1.setContent(R.id.audio_empty_message);
    }
    for (;;)
    {
      paramh1.setIndicator(getActivity().getString(R.string.cast_tracks_chooser_dialog_audio));
      paramView.addTab(paramh1);
      return;
      localTextView2.setVisibility(4);
      localTabSpec.setContent(R.id.text_list_view);
      break;
      label194:
      localTextView1.setVisibility(4);
      paramh1.setContent(R.id.audio_list_view);
    }
  }
  
  private void a(h paramh1, h paramh2)
  {
    ArrayList localArrayList = new ArrayList();
    paramh1 = paramh1.a();
    if (paramh1.b() != -1L) {
      localArrayList.add(paramh1);
    }
    paramh1 = paramh2.a();
    if (paramh1 != null) {
      localArrayList.add(paramh1);
    }
    paramh1 = com.google.android.gms.cast.framework.c.a(getContext()).b().b();
    if ((paramh1 != null) && (paramh1.o()))
    {
      paramh1 = paramh1.a();
      if (paramh1 != null)
      {
        paramh2 = new long[localArrayList.size()];
        int i = 0;
        while (i < localArrayList.size())
        {
          paramh2[i] = ((MediaTrack)localArrayList.get(i)).b();
          i += 1;
        }
        paramh1.a(paramh2);
      }
    }
    if (this.d != null)
    {
      this.d.cancel();
      this.d = null;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRetainInstance(true);
    this.a = getArguments().getParcelableArrayList("extra_tracks_type_text");
    this.a.add(0, a());
    this.b = getArguments().getParcelableArrayList("extra_tracks_type_audio");
    this.c = getArguments().getLongArray("extra_active_track_ids");
  }
  
  @NonNull
  public Dialog onCreateDialog(final Bundle paramBundle)
  {
    int i = a(this.a, this.c, 0);
    int j = a(this.b, this.c, -1);
    paramBundle = new h(getActivity(), this.a, i);
    final h localh = new h(getActivity(), this.b, j);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    View localView = getActivity().getLayoutInflater().inflate(R.layout.cast_tracks_chooser_dialog_layout, null);
    a(localView, paramBundle, localh);
    localBuilder.setView(localView).setPositiveButton(getActivity().getString(R.string.cast_tracks_chooser_dialog_ok), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        TracksChooserDialogFragment.a(TracksChooserDialogFragment.this, paramBundle, localh);
      }
    }).setNegativeButton(R.string.cast_tracks_chooser_dialog_cancel, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (TracksChooserDialogFragment.a(TracksChooserDialogFragment.this) != null)
        {
          TracksChooserDialogFragment.a(TracksChooserDialogFragment.this).cancel();
          TracksChooserDialogFragment.a(TracksChooserDialogFragment.this, null);
        }
      }
    });
    if (this.d != null)
    {
      this.d.cancel();
      this.d = null;
    }
    this.d = localBuilder.create();
    return this.d;
  }
  
  public void onDestroyView()
  {
    if ((getDialog() != null) && (getRetainInstance())) {
      getDialog().setDismissMessage(null);
    }
    super.onDestroyView();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/TracksChooserDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */