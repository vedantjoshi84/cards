package com.e.cards;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<HouseViewHolder>{

    private Context mContext;
    private List<HouseRent> myHouseList;


    public MyAdapter(Context mContext, List<HouseRent> myHouseList) {
        this.mContext = mContext;
        this.myHouseList = myHouseList;
    }

    @Override
    public HouseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item,parent,false);

        return new HouseViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final HouseViewHolder holder, int position) {

        holder.imageView.setImageResource(myHouseList.get(position).getItemImage());
        holder.mTitle.setText(myHouseList.get(position).getItemName());
        holder.mDescription.setText(myHouseList.get(position).getItemDescription());
        holder.mprice.setText(myHouseList.get(position).getItemPrice());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext,DetailActivity.class);
                intent.putExtra("Image", myHouseList.get(holder.getAdapterPosition()).getItemImage());
                intent.putExtra("Description", myHouseList.get(holder.getAdapterPosition()).getItemDescription());
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return myHouseList.size();
    }
}

class HouseViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle,mDescription,mprice;

    CardView mCardView;

    public HouseViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mprice = itemView.findViewById(R.id.tvPrice);

        mCardView = itemView.findViewById(R.id.myCardView);

    }
}