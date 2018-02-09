package com.cloudjibe.counterwithlifecycle;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;


public class ActivityB extends AppCompatActivity {

    TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        tvTotal = (TextView) findViewById(R.id.tvCounter);
        int s = ((BaseApplicationClass) getApplication()).getCounterVar();
        tvTotal.setText("Thread Counter: "+s);


//        Intent intent = new Intent(this, activity_b.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);

    }

    @Override
    protected void onPause() {
        super.onPause();
        // set counter increment
        ((BaseApplicationClass) getApplication()).setIncrementCounterVar();
    }

    public void finishActivityB(View v) {
        ActivityB.this.finish();
    }
}
