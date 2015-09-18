package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText t11=(EditText)findViewById(R.id.t1);
        final EditText t22=(EditText)findViewById(R.id.t2);
       final TextView v1=(TextView) findViewById(R.id.vv);
         final Button pb1 = (Button) findViewById(R.id.b1);
        final Button pb2 = (Button) findViewById(R.id.b2);
        final Button pb3 = (Button) findViewById(R.id.b3);
        final Button pb4 = (Button) findViewById(R.id.b4);
        final Button pb5 = (Button) findViewById(R.id.b5);

      pb1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

             int a,b,c;
              a=Integer.parseInt(t11.getText().toString());
              b=Integer.parseInt(t22.getText().toString());
              c=a+b;
              v1.setText(Double.toString(c));


          }
      });



        pb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a,b,c;
                a=Integer.parseInt(t11.getText().toString());
                b=Integer.parseInt(t22.getText().toString());
                c=a-b;
                v1.setText(Double.toString(c));


            }
        });

        pb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a,b,c;
                a=Integer.parseInt(t11.getText().toString());
                b=Integer.parseInt(t22.getText().toString());
                c=a*b;
                v1.setText(Double.toString(c));


            }
        });

        pb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a,b,c;
                a=Integer.parseInt(t11.getText().toString());
                b=Integer.parseInt(t22.getText().toString());
                c=a/b;
                v1.setText(Double.toString(c));


            }
        });

        pb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,c;
                a=Integer.parseInt(t11.getText().toString());
                b=Integer.parseInt(t22.getText().toString());
                c=Math.pow(a,b);
                v1.setText(Double.toString(c));


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
