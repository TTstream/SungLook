package com.example.sungkyulmarket;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderevalu extends RecyclerView.ViewHolder {
    TextView tv1,tv2;

    public ViewHolderevalu(@NonNull View itemView) {
        super(itemView);
        tv1=itemView.findViewById(R.id.textView1);
        tv2=itemView.findViewById(R.id.textView2);
    }

    public void onBind(Data data){
        tv1.setText(data.getId());
        tv2.setText(data.getReview());
    }
}
