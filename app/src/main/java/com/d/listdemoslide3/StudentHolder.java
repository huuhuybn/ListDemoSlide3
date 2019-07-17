package com.d.listdemoslide3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class StudentHolder extends RecyclerView.ViewHolder {

    public TextView tvId,tvName,tvPhone,tvDate;

    public StudentHolder(@NonNull View itemView) {
        super(itemView);

        tvId = itemView.findViewById(R.id.tvId);

        tvName = itemView.findViewById(R.id.tvName);

        tvPhone = itemView.findViewById(R.id.tvNumber);

        tvDate = itemView.findViewById(R.id.tvDate);
    }

}
