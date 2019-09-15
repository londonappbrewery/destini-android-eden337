package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryView;
    Button mAns1;
    Button mAns2;

    int currentState=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryView=findViewById(R.id.storyTextView);
        mAns1 = findViewById(R.id.buttonTop);
        mAns2 = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentState==1 || currentState==2) {
                    mStoryView.setText(R.string.T3_Story);
                    mAns1.setText(R.string.T3_Ans1);
                    mAns2.setText(R.string.T3_Ans2);
                    currentState=3;
                }
                else if(currentState==3){
                    mStoryView.setText(R.string.T6_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentState==1) {
                    mStoryView.setText(R.string.T2_Story);
                    mAns1.setText(R.string.T2_Ans1);
                    mAns2.setText(R.string.T2_Ans2);
                    currentState = 2;
                }
                else if(currentState==2){
                    mStoryView.setText(R.string.T4_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }
                else if(currentState==3){
                    mStoryView.setText(R.string.T5_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }
            }

        });


    }
    /*private void updateStory(int mIndex){
        if(mIndex%mStoryBank.length==0) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("The adventure is over...");
            alert.setCancelable(false);
            alert.setMessage("You completed the story...");
            alert.setPositiveButton("Close App", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.show();
        }
    }*/
}
