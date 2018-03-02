package org.cord4handai.circlemikke;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.cord4handai.circlemikke.model.Circle;

import java.util.List;

/**
 * Created by ryosuke on 2018/03/02.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private OnEventItemClickListener onEventItemClickListener;

    private List<Circle> items;

    public MyRecyclerViewAdapter(Context context, OnEventItemClickListener onEventItemClickListener) {

        this.context = context;
        this.onEventItemClickListener = onEventItemClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Circle item = getItemAt(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEventItemClickListener.onEventItemClick(item);
            }
        });

        //TODO それぞれのコンテンツを代入
        holder.activityContent.setText("");
        holder.activeDay.setText("");
    }

    private Circle getItemAt(int position) {
        return items.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView activityContent;
        private final TextView activeDay;

        public MyViewHolder(View itemView) {
            super(itemView);
            activityContent = (TextView)itemView.findViewById(R.id.activity_content);
            activeDay = (TextView)itemView.findViewById(R.id.day_text);
        }


    }

    public interface OnEventItemClickListener {
        void onEventItemClick(Circle item);
    }
}
