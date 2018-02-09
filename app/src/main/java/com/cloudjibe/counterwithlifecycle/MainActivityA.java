package com.cloudjibe.counterwithlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivityA extends AppCompatActivity {

    TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        tvTotal = (TextView) findViewById(R.id.tvCounter);


//        Button calcBtn = (Button) findViewById(R.id.btnStartActivityB);
//        calcBtn.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//
//
// 		        // set
// 		        //((BaseApplicationClass) getApplication()).setIncrementCounterVar();
//
// 		        // get
// 		        int s = ((BaseApplicationClass) getApplication()).getCounterVar();
// 		        tvTotal.setText("Thread Counter: "+s);
//                //Toast.makeText(getBaseContext(), "a", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivityA.this, ActivityB.class);
//                startActivity(intent);
//
//            }
//        });


       // Intent intent = new Intent(this, ActivityB.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
       // startActivity(intent);
    }

    public void startActivityB(View v) {
        int s = ((BaseApplicationClass) getApplication()).getCounterVar();
        tvTotal.setText("Thread Counter: "+s);

        Intent intent = new Intent(MainActivityA.this, ActivityB.class);
        startActivity(intent);
    }

    public void startDialog(View v) {
        Intent intent = new Intent(MainActivityA.this, DialogActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int s = ((BaseApplicationClass) getApplication()).getCounterVar();
        tvTotal.setText("Thread Counter: "+s);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // set counter increment
        ((BaseApplicationClass) getApplication()).setIncrementCounterVar();
    }

    public void finishActivityA(View v) {
        MainActivityA.this.finish();
    }

}
