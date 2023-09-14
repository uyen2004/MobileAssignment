package vamk.fi.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        Bundle extras = getIntent().getExtras();
        Button backButton = findViewById(R.id.backButton);

        if (extras != null) {
            String firstName = extras.getString("firstName", "");
            String lastName = extras.getString("lastName", "");
            String phoneNumber = extras.getString("phoneNumber", "");
            String comment = extras.getString("comment", "");

            TextView displayFirstName = findViewById(R.id.displayFirstName);
            TextView displayLastName = findViewById(R.id.displayLastname);
            TextView displayPhoneNumber = findViewById(R.id.displayPhoneNumber);
            TextView displayComment = findViewById(R.id.displayComment);

            displayFirstName.setText("First Name: " + firstName);
            displayLastName.setText("Last Name: " + lastName);
            displayPhoneNumber.setText("Phone Number: " + phoneNumber);
            displayComment.setText("Comment: " + comment);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DisplayActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}