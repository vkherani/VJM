package com.example.vjm.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vjm.POJO.CategoryFields;
import com.example.vjm.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder> {
    Context context;
    List<CategoryFields> mCategory;
    int count = 0;

    public CategoryAdapter(Context context, List<CategoryFields> mCategory) {
        this.context = context;
        this.mCategory = mCategory;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.categoryitem,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.txtCategory.setText(mCategory.get(position).getCategory());
    }

    @Override
    public int getItemCount() {
        return mCategory.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView txtCategory;
        CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtCategory = itemView.findViewById(R.id.txtCategory);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
