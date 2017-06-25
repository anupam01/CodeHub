package com.anupam.codehub.ProfileFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anupam.codehub.Adapters.SecondAdapter;
import com.anupam.codehub.Models.SecondCardModel;
import com.anupam.codehub.R;

import java.util.ArrayList;

/**
 * Created by Anupam on 25-06-2017.
 */

public class SecondFragment extends Fragment {

    ArrayList<SecondCardModel> secondCardModels;

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    View view;

    ArrayList<Integer> videoImage = new ArrayList<Integer>();
    public SecondFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.second_fragment, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerItems(view);

        return view;
    }

    private void recyclerItems(View view) {


        if(videoImage!=null){
            videoImage.clear();
        }
        //Video 1//
        videoImage.add(R.drawable.ic_background);

        //Video 2//
        videoImage.add(R.drawable.ic_background);

        //Video 3//
        videoImage.add(R.drawable.ic_background);

        //Video 4//
        videoImage.add(R.drawable.ic_background);

        //Video 5//
        videoImage.add(R.drawable.ic_background);

        secondCardModels = new ArrayList<SecondCardModel>();

        for (int i = 0; i <= videoImage.size()-1; i++) {

            secondCardModels.add(new SecondCardModel(videoImage.get(i)));
        }
        recyclerViewAdapter  = new SecondAdapter(getActivity(), secondCardModels);
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}