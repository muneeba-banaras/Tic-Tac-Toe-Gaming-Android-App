package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
String  b,b1,b2,b3,b4,b5,b6,b7,b8;
int flag=0;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         init();
    }

    public void init()
    {
        btn=findViewById(R.id.button);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
    }

    public  void check(View v)
    {
        Button btncurrent=(Button) v;
        if(btncurrent.getText().toString().equals(""))
        {
        count++;
       if (flag==0)
       {
           btncurrent.setText("x");
           flag=1;
    }
         else
       {
           btncurrent.setText("o");
       flag=0;
       }



         if(count>4)
         {

             b=btn.getText().toString();
             b1=btn1.getText().toString();
             b2=btn2.getText().toString();
             b3=btn3.getText().toString();
             b4=btn4.getText().toString();
             b5=btn5.getText().toString();
             b6=btn6.getText().toString();
             b7=btn7.getText().toString();
             b8=btn8.getText().toString();


             if(b.equals(b1) && b1.equals(b2) && !b.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b ,Toast.LENGTH_SHORT).show();
              restart();
             }
            else if(b3.equals(b4)&&b4.equals(b5)&&!b3.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b3 ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(b6.equals(b7)&&b7.equals(b8)&&!b6.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b6 ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(b.equals(b4)&&b4.equals(b8)&&!b.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(b2.equals(b4)&&b4.equals(b6)&&!b2.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b2 ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(b.equals(b3)&&b3.equals(b6)&&!b.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(b1.equals(b4)&&b4.equals(b7)&&!b1.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b1 ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(b2.equals(b5)&&b5.equals(b8)&&!b2.equals(""))
             {
                 Toast.makeText(this,"WINNER IS " + b2 ,Toast.LENGTH_SHORT).show();
                 restart();
             }
             else if(count==9)
             {
                 Toast.makeText(this,"DRAW",Toast.LENGTH_SHORT).show();
                 restart();

             }
       }
    }}

    public void restart()
    {
        btn.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        flag=0;
        count=0;
    }
}