package com.fimi.kernel.utils;

import android.util.SparseArray;
import android.view.View;

public class o {
    public static <T extends View> T a(View view, int i) {
        SparseArray sparseArray;
        SparseArray sparseArray2 = (SparseArray) view.getTag();
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray();
            view.setTag(sparseArray2);
            sparseArray = sparseArray2;
        } else {
            sparseArray = sparseArray2;
        }
        View view2 = (View) sparseArray.get(i);
        if (view2 != null) {
            return view2;
        }
        T findViewById = view.findViewById(i);
        sparseArray.put(i, findViewById);
        return findViewById;
    }
}
