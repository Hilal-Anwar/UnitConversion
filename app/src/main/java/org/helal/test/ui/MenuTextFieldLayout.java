package org.helal.test.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.google.android.material.textfield.TextInputEditText;

import org.helal.test.R;

public class MenuTextFieldLayout extends LinearLayout {

    private TextInputEditText textInputEditText;
    private LinearLayoutCompat linearLayout;
    private TextView textView;
    private ImageView endIcon;

    public MenuTextFieldLayout(Context context) {
        super(context);
    }

    public MenuTextFieldLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MenuTextFieldLayout, 0, 0);
        String titleText = a.getString(R.styleable.MenuTextFieldLayout_titleText);
        int focus_color = a.getColor(R.styleable.MenuTextFieldLayout_focusColorValue,
                getResources().getColor(android.R.color.holo_blue_light, context.getTheme()));
        int label_text_fill = a.getColor(R.styleable.MenuTextFieldLayout_labelTextFillColor,
                getResources().getColor(android.R.color.holo_blue_light, context.getTheme()));
        a.recycle();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.menu_text_editor, this, true);
        linearLayout = findViewById(R.id.menu_text_main);
        textInputEditText = findViewById(R.id.textInputEditText);
        textView = findViewById(R.id.title_lable);
        endIcon = findViewById(R.id.endIcon);
        textInputEditText.setFocusableInTouchMode(true);
        textInputEditText.setOnFocusChangeListener((v, hasFocus) -> actionOnFocus(hasFocus, focus_color, label_text_fill));

    }

    public MenuTextFieldLayout(Context context, AttributeSet attrs, int defStyleAttr,
                               int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public MenuTextFieldLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void actionOnFocus(boolean hasFocus, int focus_color, int label_text_fill) {
        if (hasFocus) {
            linearLayout.setBackgroundResource(R.drawable.menu_textfield_selected);
            textView.setTextColor(focus_color);
        } else {
            linearLayout.setBackgroundResource(R.drawable.menu_textfield_normal);
            textView.setTextColor(label_text_fill);
        }
    }
}
