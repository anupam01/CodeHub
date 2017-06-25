package com.anupam.codehub.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.anupam.codehub.Models.SecondCardModel;
import com.anupam.codehub.R;

import java.util.ArrayList;

/**
 * Created by Anupam on 25-06-2017.
 */

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder>{

    public ArrayList<SecondCardModel> seconsCardModels;
    Context context;

    public SecondAdapter(Context context, ArrayList<SecondCardModel> seconsCardModels) {
        this.seconsCardModels = seconsCardModels;
        this.context = context;
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    };

    @Override
    public SecondAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        itemLayoutView.setOnClickListener(onClickListener);
        return viewHolder;

    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        final ImageView imageViewImage = (ImageView) viewHolder.image.findViewById(R.id.second_image);

        imageViewImage.setImageResource(seconsCardModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return seconsCardModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            image = (ImageView) itemLayoutView .findViewById(R.id.second_image);
        }
    }
}