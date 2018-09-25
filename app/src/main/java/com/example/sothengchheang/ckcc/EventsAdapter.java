package com.example.sothengchheang.ckcc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventViewHolder> {

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_events,viewGroup,false);

        EventViewHolder eventViewHolder = new EventViewHolder(view);
        return eventViewHolder;
//        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class EventViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_events;
        private TextView txt_title;
        private  TextView txt_date;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            img_events = itemView.findViewById(R.id.img_events);
            txt_title = itemView.findViewById(R.id.txt_title);
            txt_date = itemView.findViewById(R.id.txt_date);
        }
    }

}
