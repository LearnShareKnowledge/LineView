package com.mypackage.lineview;

import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    PointF pointA = new PointF(100,600);

    PointF pointB = new PointF(500,70);

    private LineView mLineView ;


    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mLineView = (LineView) findViewById(R.id.lineView);

        mLineView.setPointA(pointA);

        mLineView.setPointB(pointB);

        mLineView.draw();

    }
}
