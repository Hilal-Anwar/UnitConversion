package org.helal.test.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.google.android.material.textfield.TextInputEditText;

import org.helal.test.R;

public class MenuTextFieldLayout extends LinearLayout {

    private TextInputEditText textInputEditText;
    private LinearLayoutCompat linearLayout;

    public MenuTextFieldLayout(Context context) {
        super(context);
    }

    public MenuTextFieldLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.menu_text_editor, this, true);
        linearLayout = findViewById(R.id.menu_text_main);
        textInputEditText = findViewById(R.id.textInputEditText);
        textInputEditText.setOnClickListener(v -> {

        });
    }

    public MenuTextFieldLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MenuTextFieldLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
