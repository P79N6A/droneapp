package com.fimi.soul.media.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.TextView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.view.HackyViewPager;
import java.util.ArrayList;

public class ImagePagerActivity
  extends BaseActivity
{
  public static final String a = "image_index";
  public static final String b = "image_urls";
  public static final String c = "image_native";
  private static final String d = "STATE_POSITION";
  private HackyViewPager e;
  private int f;
  private TextView g;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968707);
    this.f = getIntent().getIntExtra("image_index", 0);
    Object localObject = getIntent().getStringArrayListExtra("image_urls");
    boolean bool = getIntent().getBooleanExtra("image_native", false);
    this.e = ((HackyViewPager)findViewById(2131689779));
    localObject = new a(getSupportFragmentManager(), (ArrayList)localObject, bool);
    this.e.setAdapter((PagerAdapter)localObject);
    this.g = ((TextView)findViewById(2131689780));
    if (this.e.getAdapter().getCount() == 1) {
      this.g.setVisibility(4);
    }
    localObject = getString(2131362904, new Object[] { Integer.valueOf(1), Integer.valueOf(this.e.getAdapter().getCount()) });
    this.g.setText((CharSequence)localObject);
    this.e.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
    {
      public void onPageScrollStateChanged(int paramAnonymousInt) {}
      
      public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2) {}
      
      public void onPageSelected(int paramAnonymousInt)
      {
        String str = ImagePagerActivity.this.getString(2131362904, new Object[] { Integer.valueOf(paramAnonymousInt + 1), Integer.valueOf(ImagePagerActivity.a(ImagePagerActivity.this).getAdapter().getCount()) });
        ImagePagerActivity.b(ImagePagerActivity.this).setText(str);
      }
    });
    if (paramBundle != null) {
      this.f = paramBundle.getInt("STATE_POSITION");
    }
    this.e.setCurrentItem(this.f);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("STATE_POSITION", this.e.getCurrentItem());
  }
  
  private class a
    extends FragmentStatePagerAdapter
  {
    public ArrayList<String> a;
    public boolean b;
    
    public a(ArrayList<String> paramArrayList, boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
      boolean bool;
      this.b = bool;
    }
    
    public int getCount()
    {
      if (this.a == null) {
        return 0;
      }
      return this.a.size();
    }
    
    public Fragment getItem(int paramInt)
    {
      return ImageDetailFragment.a((String)this.a.get(paramInt), this.b);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/ImagePagerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */