package com.ritesh.whatsapp2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatListAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] names;
    private final int[] avatars;

    public ChatListAdapter(Activity context, String[] names, int[] avatars) {
        this.context = context;
        this.names = names;
        this.avatars = avatars;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // ViewHolder pattern can be added for better performance
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.chat_list_item, parent, false);
        }

        TextView nameText = convertView.findViewById(R.id.nameText);
        ImageView avatarImage = convertView.findViewById(R.id.avatarImage);

        nameText.setText(names[position]);
        avatarImage.setImageResource(avatars[position]);

        return convertView;
    }
}
