package com.bhargava.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


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
                        Intent intent=new Intent(menu.this,emergencycall.class);
                        startActivity(intent);
                        Toast.makeText(menu.this, "Clicked at call " + finalI, Toast.LENGTH_SHORT).show();

                    }
                    else if(finalI==1)
                    {
                        Intent intent=new Intent(menu.this,MapsActivity2.class);
                        startActivity(intent);
                        Toast.makeText(menu.this, "Clicked at find medicine" + finalI, Toast.LENGTH_SHORT).show();

                    }
                    else if(finalI==2)
                    {
                        Intent intent=new Intent(menu.this,firstaid.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at firstaid" + finalI, Toast.LENGTH_SHORT).show();

                    }
                    else if(finalI==3)


                    {
                        Intent intent=new Intent(menu.this,notify.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at Notification" + finalI, Toast.LENGTH_SHORT).show();

                    }
                    else if(finalI==4)


                    {
                        Intent intent=new Intent(menu.this,d_history.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at dieseas history" + finalI, Toast.LENGTH_SHORT).show();

                    }



                    else if(finalI==5)
                    {
                        Intent intent=new Intent(menu.this,MapsActivity.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at Map Hospital" + finalI, Toast.LENGTH_SHORT).show();

                    }

                    else if(finalI==6)


                    {
                        Intent intent=new Intent(menu.this,diet_main.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at diet" + finalI, Toast.LENGTH_SHORT).show();

                    }
                    else if(finalI==7)


                    {
                        Intent intent=new Intent(menu.this,sleeping.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at sleeping" + finalI, Toast.LENGTH_SHORT).show();

                    }

                    else if(finalI==8)


                    {
                        Intent intent=new Intent(menu.this,share.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at share" + finalI, Toast.LENGTH_SHORT).show();

                    }
                    else if(finalI==9)


                    {
                        Intent intent=new Intent(menu.this,info.class);
                        startActivity(intent);

                        Toast.makeText(menu.this, "Clicked at Info" + finalI, Toast.LENGTH_SHORT).show();

                    }

                }
            });
        }
    }


}
