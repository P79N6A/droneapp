package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

public class MyEditView extends EditText {
    private b a;

    public interface b {
        void a();
    }

    public class a extends InputConnectionWrapper {
        final /* synthetic */ MyEditView a;

        public a(MyEditView myEditView, InputConnection inputConnection, boolean z) {
            this.a = myEditView;
            super(inputConnection, z);
        }

        public boolean finishComposingText() {
            boolean finishComposingText = super.finishComposingText();
            if (this.a.a != null && this.a.isFocusable()) {
                this.a.a.a();
            }
            return finishComposingText;
        }
    }

    public MyEditView(Context context) {
        super(context);
    }

    public MyEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(this, super.onCreateInputConnection(editorInfo), false);
    }

    public void setOnFinishComposingListener(b bVar) {
        this.a = bVar;
    }
}
