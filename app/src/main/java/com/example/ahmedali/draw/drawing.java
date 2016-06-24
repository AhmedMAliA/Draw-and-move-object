package com.example.ahmedali.draw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Ahmed Ali on 12/10/2015.
 */
public class drawing extends View {

    Bitmap bit;
    int change;

    public drawing(Context context) {
        super(context);
        bit= BitmapFactory.decodeResource(getResources(),R.drawable.greenball);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        Paint p=new Paint();
        p.setColor(Color.BLUE);
        canvas.drawRect(100,150,200,250,p);

        p.setColor(Color.BLUE);
        canvas.drawRect(300,150,300,250,p);

     //   p.setColor(Color.RED);
       // canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,50,p);


        Paint p1=new Paint();
        canvas.drawBitmap(bit,change,canvas.getHeight()/2,p1);
        if(change < canvas.getWidth())
        {
            change +=10;
        }
        else
        {
            change=0;
        }

        invalidate();


    }
}
