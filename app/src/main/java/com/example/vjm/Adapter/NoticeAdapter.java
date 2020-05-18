package com.example.vjm.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vjm.POJO.NoticeFields;
import com.example.vjm.R;

import org.w3c.dom.Text;

import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder> {

    List<NoticeFields> mNotice;

    public NoticeAdapter(List<NoticeFields> mNotice) {
        this.mNotice = mNotice;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.noticeitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txttitle.setText(mNotice.get(position).getTitle());
        holder.txtdescription.setText(mNotice.get(position).getDescription());
        holder.txtdate.setText(mNotice.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return mNotice.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txttitle,txtdescription,txtdate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txttitle = itemView.findViewById(R.id.txtTitle);
            txtdescription = itemView.findViewById(R.id.txtDescription);
            txtdate = itemView.findViewById(R.id.txtDate);
        }
    }
}
