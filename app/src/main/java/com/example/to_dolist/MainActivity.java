package com.example.to_dolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tabMode);

        for (int i = 1; i <= 30; i++) createLine(i);
    }

    public void createLine(int num){
        TableRow addTableRow = new TableRow(this);
        CheckBox checkBox = new CheckBox(this);
        TextView textView = new TextView(this);

        textView.setText(num + ". Some business.");
        addTableRow.addView(checkBox);
        addTableRow.addView(textView);
        tableLayout.addView(addTableRow);
    }
}
