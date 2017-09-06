package com.example.mkels.snapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.mkels.snapp.MESSAGE";
    public static final String EXTRA_WORKOUT_NAME = "com.example.mkels.snapp.WORKOUT_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user taps the Create button */
    public void setupNewWorkout(View view){
        Intent intent = new Intent(this, SetupNewWorkoutActivity.class);
        EditText workoutNameText = (EditText) findViewById(R.id.workoutNameTextbox);
        String newWorkoutName = workoutNameText.getText().toString();
        intent.putExtra(EXTRA_WORKOUT_NAME, newWorkoutName);
        startActivity(intent);
    }
}
