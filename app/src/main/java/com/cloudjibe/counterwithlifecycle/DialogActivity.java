package com.cloudjibe.counterwithlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mk194903 on 2/8/18.
 */

public class DialogActivity  extends AppCompatActivity {
    TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);

        Window window = this.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setGravity(Gravity.CENTER);

        tvTotal = (TextView) findViewById(R.id.tvCounter);
        int s = ((BaseApplicationClass) getApplication()).getCounterVar();
        tvTotal.setText("Thread Counter: "+s);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // set counter increment
        ((BaseApplicationClass) getApplication()).setIncrementCounterVar();
    }

    /**
     * Callback method defined by the View
     * @param v
     */
    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}
