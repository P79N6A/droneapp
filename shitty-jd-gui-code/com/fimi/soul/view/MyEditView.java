package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

public class MyEditView
  extends EditText
{
  private b a;
  
  public MyEditView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MyEditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MyEditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return new a(super.onCreateInputConnection(paramEditorInfo), false);
  }
  
  public void setOnFinishComposingListener(b paramb)
  {
    this.a = paramb;
  }
  
  public class a
    extends InputConnectionWrapper
  {
    public a(InputConnection paramInputConnection, boolean paramBoolean)
    {
      super(paramBoolean);
    }
    
    public boolean finishComposingText()
    {
      boolean bool = super.finishComposingText();
      if ((MyEditView.a(MyEditView.this) != null) && (MyEditView.this.isFocusable())) {
        MyEditView.a(MyEditView.this).a();
      }
      return bool;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MyEditView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */