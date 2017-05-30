package com.fimi.soul.module.push;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.a.b;
import com.fimi.soul.utils.ao;
import java.util.List;

public class HistoryMessageActivity
  extends BaseActivity
  implements AdapterView.OnItemClickListener
{
  private a a;
  private ListView b;
  private List<HistoryPushMessage> c;
  private b d;
  private TextView e;
  private ImageView f;
  
  private void a()
  {
    TextView localTextView = (TextView)findViewById(2131690327);
    localTextView.setText(2131362699);
    Button localButton = (Button)findViewById(2131690535);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        HistoryMessageActivity.this.finish();
      }
    });
    this.b = ((ListView)findViewById(2131689775));
    this.b.setOnItemClickListener(this);
    this.b.setOverScrollMode(2);
    this.e = ((TextView)findViewById(2131689777));
    this.f = ((ImageView)findViewById(2131689776));
    ao.a(getAssets(), new View[] { localTextView, localButton, this.e });
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(128, 128);
    setContentView(2130968617);
    a();
    this.d = b.a(this);
    this.c = this.d.a();
    if (this.c.size() > 0)
    {
      this.e.setVisibility(8);
      this.f.setVisibility(8);
      this.a = new a(this, this.c);
      this.b.setAdapter(this.a);
      return;
    }
    this.e.setVisibility(0);
    this.f.setVisibility(0);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Intent(this, MessageDetailActivity.class);
    paramAdapterView.putExtra("redirectURL", ((HistoryPushMessage)this.c.get(paramInt)).getRedirectURL());
    startActivity(paramAdapterView);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/push/HistoryMessageActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */