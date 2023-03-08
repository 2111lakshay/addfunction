package com.example.addfunction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.ednum1);
        e2 = (EditText) findViewById(R.id.ednum2);
        tv1 = (TextView) findViewById(R.id.txtanswer);
        tv2 = (TextView) findViewById(R.id.txtmsg);
    }
    public void add(View view){
        int a,b,ans;
        a = Integer.parseInt(e1.getText().toString());
        b = Integer.parseInt(e2.getText().toString());
        ans = a + b;
        tv1.setText("Sum = " + Integer.toString(ans));
    }

}