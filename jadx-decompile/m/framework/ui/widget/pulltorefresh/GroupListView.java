package m.framework.ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class GroupListView extends ListView {

    public static abstract class a {
        private BaseAdapter a;

        private void a(BaseAdapter baseAdapter) {
            this.a = baseAdapter;
        }

        public abstract int a();

        public abstract View a(int i, int i2, View view, ViewGroup viewGroup);

        public abstract View a(int i, View view, ViewGroup viewGroup);

        public abstract Object a(int i, int i2);

        public abstract String a(int i);

        public abstract int b(int i);

        public void b() {
            this.a.notifyDataSetChanged();
        }
    }

    private static class b {
        public LinearLayout a;
        public View b;
        public View c;

        private b() {
        }
    }

    public GroupListView(Context context) {
        super(context);
    }

    public GroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAdapter(final a aVar) {
        BaseAdapter anonymousClass1 = new BaseAdapter(this) {
            final /* synthetic */ GroupListView a;

            private int[] a(int i) {
                int[] iArr = new int[]{-1, -2};
                int a = aVar.a();
                int i2 = 0;
                for (int i3 = 0; i3 < a; i3++) {
                    int b = aVar.b(i3) + 1;
                    if (i2 + b > i) {
                        iArr[0] = i3;
                        iArr[1] = (i - i2) - 1;
                        break;
                    }
                    i2 += b;
                }
                return iArr;
            }

            public int getCount() {
                int i = 0;
                int i2 = 0;
                while (i < aVar.a()) {
                    i2 += aVar.b(i) + 1;
                    i++;
                }
                return i2;
            }

            public Object getItem(int i) {
                int[] a = a(i);
                int i2 = a[0];
                int i3 = a[1];
                if (i2 > -1) {
                    if (i3 == -1) {
                        return aVar.a(i3);
                    }
                    if (i3 > -1) {
                        return aVar.a(i2, i3);
                    }
                }
                return null;
            }

            public long getItemId(int i) {
                return (long) i;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                int[] a = a(i);
                int i2 = a[0];
                int i3 = a[1];
                b bVar;
                if (view == null) {
                    bVar = new b();
                    bVar.a = new LinearLayout(viewGroup.getContext());
                    bVar.a.setOrientation(1);
                    bVar.a.setTag(bVar);
                    if (i2 > -1) {
                        if (i3 == -1) {
                            bVar.b = aVar.a(i2, bVar.b, bVar.a);
                            bVar.a.addView(bVar.b);
                        } else if (i3 > -1) {
                            bVar.c = aVar.a(i2, i3, bVar.c, bVar.a);
                            bVar.a.addView(bVar.c);
                        }
                    }
                    return bVar.a;
                }
                bVar = (b) view.getTag();
                if (i2 <= -1) {
                    return view;
                }
                if (i3 == -1) {
                    bVar.b = aVar.a(i2, bVar.b, bVar.a);
                    if (bVar.c == null) {
                        return view;
                    }
                    bVar.a.removeView(bVar.c);
                    return view;
                } else if (i3 <= -1) {
                    return view;
                } else {
                    bVar.c = aVar.a(i2, i3, bVar.c, bVar.a);
                    if (bVar.b == null) {
                        return view;
                    }
                    bVar.a.removeView(bVar.b);
                    return view;
                }
            }
        };
        aVar.a(anonymousClass1);
        super.setAdapter(anonymousClass1);
    }
}
