package com.ritesh.whatsapp2;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    private TextView chatUserName;
    private ImageView chatUserImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        chatUserName = findViewById(R.id.chat_user_name);
        chatUserImage = findViewById(R.id.chat_user_image);

        // ✅ Receive data from intent
        String name = getIntent().getStringExtra("name");
        int avatarRes = getIntent().getIntExtra("avatar", R.drawable.avatar1);

        chatUserName.setText(name);
        chatUserImage.setImageResource(avatarRes);
    }
}
