package com.cloudjibe.counterwithlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
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

//    private Context mContext;
//    private PopupWindow mPopupWindow;
//    public void startDialog(View v) {
//        // Initialize a new instance of LayoutInflater service
//        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        // Inflate the custom layout/view
//        View customView = inflater.inflate(R.layout.custom_layout,null);
//
//                /*
//                    public PopupWindow (View contentView, int width, int height)
//                        Create a new non focusable popup window which can display the contentView.
//                        The dimension of the window must be passed to this constructor.
//
//                        The popup does not provide any background. This should be handled by
//                        the content view.
//
//                    Parameters
//                        contentView : the popup's content
//                        width : the popup's width
//                        height : the popup's height
//                */
//        // Initialize a new instance of popup window
//        mPopupWindow = new PopupWindow(
//                customView,
//                LayoutParams.WRAP_CONTENT,
//                LayoutParams.WRAP_CONTENT
//        );
//
//        // Set an elevation value for popup window
//        // Call requires API level 21
//        if(Build.VERSION.SDK_INT>=21){
//            mPopupWindow.setElevation(5.0f);
//        }
//
//        // Get a reference for the custom view close button
//        ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);
//
//        // Set a click listener for the popup window close button
//        closeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Dismiss the popup window
//                mPopupWindow.dismiss();
//            }
//        });
//        mPopupWindow.showAtLocation(mRelativeLayout, Gravity.CENTER,0,0);
//    }

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
