package io.github.suzhenyu.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet atts) {
        super(context, atts);
        LayoutInflater.from(context).inflate(R.layout.title, this);

        Button titleBack = findViewById(R.id.title_back);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });

        Button titleEdit = findViewById(R.id.title_edit);
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You clicked edit button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
