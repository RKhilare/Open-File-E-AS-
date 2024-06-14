package com.example.viewapplicationex_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.viewapplicationex_2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.btnOpen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFile();
            }
        });
    }

    private void openFile() {
        // Path to the file you want to open
        String filePath = "Downloads/Hibiscus flower image.jpg";

        // Create an intent with the action ACTION_VIEW
        Intent intent = new Intent(Intent.ACTION_VIEW);

        // Set the data and type of the file to be opened
        intent.setDataAndType(Uri.parse(filePath), "*/*");

        // Verify that the intent will resolve to an activity
        if (intent.resolveActivity(getPackageManager()) != null) {
            // Start the activity
            startActivity(intent);
        } else {
            Toast.makeText(this, "File this is not there", Toast.LENGTH_SHORT).show();
        }
    }
}
