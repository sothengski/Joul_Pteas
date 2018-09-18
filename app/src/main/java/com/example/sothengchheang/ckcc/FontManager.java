package com.example.sothengchheang.ckcc;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

//public class IconTextView extends TextView {
//public class IconTextView extends android.support.v7.widget.AppCompatTextView {

//    private Context context;
//
//    public IconTextView(Context context) {
//        super(context);
//        this.context = context;
//        createView();
//    }
//
//    public IconTextView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        this.context = context;
//        createView();
//    }
//
//    private void createView(){
//        Typeface typerface = Typeface.createFromAsset(getContext().getAssets(), path: "fa-regular-400.ttf");
//        setTypeface(typerface);
////        setGravity(Gravity.CENTER);
////        setTypeface(FontTypeface.get("FontAwesome.otf", context));
//    }
public class FontManager {

    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fa-regular-400.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}