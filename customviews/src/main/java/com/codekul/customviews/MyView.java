package com.codekul.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatEditText;
import android.view.Gravity;

/**
 * Created by aniruddha on 19/5/17.
 */

public class MyView extends AppCompatEditText {

    private Paint paint;

    public MyView(Context context) {
        super(context);
        // java code

        initPaint();
    }

    public MyView(Context context, AttributeSet attr) {
        super(context, attr);

        // xml

        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        paint.setStrokeWidth(2.5f);
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setGravity(Gravity.TOP | Gravity.LEFT);
        //canvas.drawCircle(100, 100, 50, paint);

        paint.setColor(Color.BLUE);
        for (int i = 10; i < getHeight(); i += 90) {
            canvas.drawLine(10, i, getWidth(), i, paint);
        }

        paint.setColor(Color.RED);
        canvas.drawLine(150, 0, 150, getHeight(), paint);
        //canvas.drawLine(100, 100, 500,100,paint);
    }
}
