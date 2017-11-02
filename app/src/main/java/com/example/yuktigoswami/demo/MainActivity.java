package com.example.yuktigoswami.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,gt;
    Button b1,b2,b3,b4,b5,b6,b7,b8,or;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    int a=1,b=1,c=1,d=1,e=1,f=1,g=1,h=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.total1);
        t2=(TextView)findViewById(R.id.total2);
        t3=(TextView)findViewById(R.id.total3);
        t4=(TextView)findViewById(R.id.total4);
        t5=(TextView)findViewById(R.id.total5);
        t6=(TextView)findViewById(R.id.total6);
        t7=(TextView)findViewById(R.id.total7);
        t8=(TextView)findViewById(R.id.total8);
        gt=(TextView)findViewById(R.id.grandTotal);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        or=(Button)findViewById(R.id.order);

        c1=(CheckBox)findViewById(R.id.pizza);
        c2=(CheckBox)findViewById(R.id.pasta);
        c3=(CheckBox)findViewById(R.id.shakes);
        c4=(CheckBox)findViewById(R.id.sizzlers);
        c5=(CheckBox)findViewById(R.id.burger);
        c6=(CheckBox)findViewById(R.id.Sandwich);
        c7=(CheckBox)findViewById(R.id.friedrice);
        c8=(CheckBox)findViewById(R.id.garlicBread);

        c1.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c1.isChecked()==true){
                            t1.setText("100");
                        }
                        else{
                            t1.setText("0");
                            b1.setText("+");
                            a=1;
                        }

                    }
                }
        );

        c2.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c2.isChecked()==true){
                            t2.setText("150");
                        }
                        else{
                            t2.setText("0");
                            b2.setText("+");
                            b=1;
                        }

                    }
                }
        );

        c3.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c3.isChecked()==true){
                            t3.setText("50");
                        }
                        else{
                            t3.setText("0");
                            b3.setText("+");
                            c=1;
                        }

                    }
                }
        );

        c4.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c4.isChecked()==true){
                            t4.setText("200");
                        }
                        else{
                            t4.setText("0");
                            b4.setText("+");
                            d=1;
                        }

                    }
                }
        );

        c5.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c5.isChecked()==true){
                            t5.setText("30");
                        }
                        else{
                            t5.setText("0");
                            b5.setText("+");
                            e=1;
                        }

                    }
                }
        );

        c6.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c6.isChecked()==true){
                            t6.setText("25");
                        }
                        else{
                            t6.setText("0");
                            b6.setText("+");
                            f=1;
                        }

                    }
                }
        );

        c7.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c7.isChecked()==true){
                            t7.setText("80");
                        }
                        else{
                            t7.setText("0");
                            b7.setText("+");
                            g=1;
                        }

                    }
                }
        );

        c8.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(c8.isChecked()==true){
                            t8.setText("40");
                        }
                        else{
                            t8.setText("0");
                            b8.setText("+");
                            h=1;
                        }

                    }
                }
        );




        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c1.isChecked()==true){
                            a=a+1;
                            t=100;
                            t=t*a;
                            String s=String.valueOf(a);
                            b1.setText(s);
                            String j=String.valueOf(t);
                            t1.setText(j);
                        }
                    }
                }
        );

        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c2.isChecked()==true){
                            b=b+1;
                            t=150;
                            t=t*b;
                            String s=String.valueOf(b);
                            b2.setText(s);
                            String j=String.valueOf(t);
                            t2.setText(j);
                        }
                    }
                }
        );

        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c3.isChecked()==true){
                            c=c+1;
                            t=50;
                            t=t*c;
                            String s=String.valueOf(c);
                            b3.setText(s);
                            String j=String.valueOf(t);
                            t3.setText(j);
                        }
                    }
                }
        );

        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c4.isChecked()==true){
                            d=d+1;
                            t=200;
                            t=t*d;
                            String s=String.valueOf(d);
                            b4.setText(s);
                            String j=String.valueOf(t);
                            t4.setText(j);
                        }
                    }
                }
        );

        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c5.isChecked()==true){
                            e=e+1;
                            t=30;
                            t=t*e;
                            String s=String.valueOf(e);
                            b5.setText(s);
                            String j=String.valueOf(t);
                            t5.setText(j);
                        }
                    }
                }
        );

        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c6.isChecked()==true){
                            f=f+1;
                            t=25;
                            t=t*f;
                            String s=String.valueOf(f);
                            b6.setText(s);
                            String j=String.valueOf(t);
                            t6.setText(j);
                        }
                    }
                }
        );

        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c7.isChecked()==true){
                            g=g+1;
                            t=80;
                            t=t*g;
                            String s=String.valueOf(g);
                            b7.setText(s);
                            String j=String.valueOf(t);
                            t7.setText(j);
                        }
                    }
                }
        );

        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int t;
                        if(c8.isChecked()==true){
                            h=h+1;
                            t=40;
                            t=t*h;
                            String s=String.valueOf(h);
                            b8.setText(s);
                            String j=String.valueOf(t);
                            t8.setText(j);
                        }
                    }
                }
        );

        or.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        int k1,k2,k3,k4,k5,k6,k7,k8,k;
                        String a1,a2,a3,a4,a5,a6,a7,a8;
                       a1= t1.getText().toString();
                       a2= t2.getText().toString();
                       a3= t3.getText().toString();
                       a4 =t4.getText().toString();
                       a5= t5.getText().toString();
                       a6= t6.getText().toString();
                        a7=t7.getText().toString();
                       a8= t8.getText().toString();

                        k1=Integer.parseInt(a1);
                        k2=Integer.parseInt(a2);
                        k3=Integer.parseInt(a3);
                        k4=Integer.parseInt(a4);
                        k5=Integer.parseInt(a5);
                        k6=Integer.parseInt(a6);
                        k7=Integer.parseInt(a7);
                        k8=Integer.parseInt(a8);

                        k=k1+k2+k3+k4+k5+k6+k7+k8;
                        String res=String.valueOf(k);
                        gt.setText(res);




                    }
                }
        );




    }
}
