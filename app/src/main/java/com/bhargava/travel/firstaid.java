package com.bhargava.travel;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class firstaid extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.cold,R.drawable.cough,R.drawable.fever,R.drawable.headache,R.drawable.jointpains,R.drawable.muscleache,R.drawable.pnemonia,R.drawable.sorethrout,R.drawable.brochitis};

    public static String [] prgmNameList={"Cold","Cough","Fever","Head Ache","Joint Pains","Muscle Ache","Pnemonia","Sore Throught","Brochitis"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);
        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0) {
                    Intent intent = new Intent(firstaid.this, Cold_info.class);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent = new Intent(firstaid.this, Cough_info.class);
                    startActivity(intent);
                }
                else if(i==2){
                    Intent intent = new Intent(firstaid.this, Fever_info.class);
                    startActivity(intent);
                }
                else if(i==3){
                    Intent intent = new Intent(firstaid.this, headache_info.class);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent = new Intent(firstaid.this,jointpains_info.class);
                    startActivity(intent);
                }
                else if(i==5){
                    Intent intent = new Intent(firstaid.this,muscleache_info.class);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent = new Intent(firstaid.this,pnemonia_info.class);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent = new Intent(firstaid.this, sorethroat_info.class);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent = new Intent(firstaid.this,Bronchitis_info.class);
                    startActivity(intent);
                }
            }
        });

    }





    public class CustomAdapter extends ArrayAdapter {
        String [] result;
        Context context;
        int [] imageId;

        private LayoutInflater inflater=null;
        public CustomAdapter(Context co, String[] prgmNameList, int[] prgmImages) {
            super(co,R.layout.program_list,R.id.textView1,prgmNameList);
            result=prgmNameList;
            context=co;
            imageId=prgmImages;


        }


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            LayoutInflater li = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView=li.inflate(R.layout.program_list,parent,false);
            TextView tv=(TextView) rowView.findViewById(R.id.textView1);
            ImageView img=(ImageView) rowView.findViewById(R.id.imageView1);
            tv.setText(result[position]);
            img.setImageResource(imageId[position]);
            return rowView;
        }

    }
}