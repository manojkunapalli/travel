package com.bhargava.travel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class homepage extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    mainGrid = (GridLayout)findViewById(R.id.mainGrid);

            setSingleEvent(mainGrid);

    }

    private void setSingleEvent(GridLayout mainGrid)
    {
        for(int i = 0; i < mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i ;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(homepage.this,"Clicked at index " +finalI,Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}
