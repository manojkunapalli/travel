package com.bhargava.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class diet_main extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_main);


        mainGrid = findViewById(R.id.mainGrid);

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
                    if(finalI==0) {
                        Intent intent = new Intent(diet_main.this, diet_about.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at about " + finalI, Toast.LENGTH_SHORT).show();


                    }

                    else if(finalI==1) {
                        Intent intent = new Intent(diet_main.this, diet_d1.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }

                    if(finalI==2) {
                        Intent intent = new Intent(diet_main.this, diet_d2.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                    if(finalI==3) {
                        Intent intent = new Intent(diet_main.this, diet_d3.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                    if(finalI==4) {
                        Intent intent = new Intent(diet_main.this, diet_d4.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                    if(finalI==5) {
                        Intent intent = new Intent(diet_main.this, diet_d5.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                    if(finalI==6) {
                        Intent intent = new Intent(diet_main.this, diet_d6.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                    if(finalI==7) {
                        Intent intent = new Intent(diet_main.this, deit_d7.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                    if(finalI==8) {
                        Intent intent = new Intent(diet_main.this, diet_recipe.class);
                        startActivity(intent);
                        Toast.makeText(diet_main.this, "Clicked at day1 " + finalI, Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }


}
