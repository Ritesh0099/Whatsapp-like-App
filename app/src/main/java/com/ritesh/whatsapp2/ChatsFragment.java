package com.ritesh.whatsapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

public class ChatsFragment extends Fragment {

    String[] names = {"Ritesh", "Amit", "Sneha", "Priya", "Raj"};
    int[] avatars = {
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4,
            R.drawable.avatar5
    };

    public ChatsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        ListView listView = view.findViewById(R.id.chatListView);

        ChatListAdapter adapter = new ChatListAdapter(getActivity(), names, avatars);
        listView.setAdapter(adapter);

        // ✅ Add this click listener to open ChatActivity
        listView.setOnItemClickListener((AdapterView<?> parent, View v, int position, long id) -> {
            Intent intent = new Intent(getActivity(), ChatActivity.class);
            intent.putExtra("name", names[position]);
            intent.putExtra("avatar", avatars[position]);
            startActivity(intent);
        });

        return view;
    }
}
