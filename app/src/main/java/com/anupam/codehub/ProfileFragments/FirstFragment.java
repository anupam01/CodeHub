package com.anupam.codehub.ProfileFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anupam.codehub.Adapters.FirstAdapter;
import com.anupam.codehub.Models.FirstCardModel;
import com.anupam.codehub.R;

import java.util.ArrayList;

/**
 * Created by Anupam on 25-06-2017.
 */

public class FirstFragment extends Fragment {


    ArrayList<FirstCardModel> firstCardModels;

    ArrayList<Integer> videoImage = new ArrayList<Integer>();
    ArrayList<String> videoTitle = new ArrayList<String>();
    ArrayList<String> videoTime = new ArrayList<String>();
    ArrayList<String> videoDescription = new ArrayList<String>();

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    View view;

    public FirstFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.first_fragment, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerItems(view);

        return view;
    }

    private void recyclerItems(View view) {


        if(videoImage!=null){
            videoImage.clear();
        }
        if(videoTitle!=null){
            videoTitle.clear();
        }
        if(videoTime!=null){
            videoTime.clear();
        }
        if(videoDescription!=null){
            videoDescription.clear();
        }
        //Video 1//
        videoImage.add(R.drawable.ic_background);
        videoTitle.add(getResources().getString(R.string.title1));
        videoTime.add(getResources().getString(R.string.time1));
        videoDescription.add(getResources().getString(R.string.artist1));

        //Video 2//
        videoImage.add(R.drawable.ic_background);
        videoTitle.add(getResources().getString(R.string.title2));
        videoTime.add(getResources().getString(R.string.time2));
        videoDescription.add(getResources().getString(R.string.artist2));

        //Video 3//
        videoImage.add(R.drawable.ic_background);
        videoTitle.add(getResources().getString(R.string.title3));
        videoTime.add(getResources().getString(R.string.time3));
        videoDescription.add(getResources().getString(R.string.artist3));

        //Video 4//
        videoImage.add(R.drawable.ic_background);
        videoTitle.add(getResources().getString(R.string.title4));
        videoTime.add(getResources().getString(R.string.time4));
        videoDescription.add(getResources().getString(R.string.artist4));

        //Video 5//
        videoImage.add(R.drawable.ic_background);
        videoTitle.add(getResources().getString(R.string.title5));
        videoTime.add(getResources().getString(R.string.time5));
        videoDescription.add(getResources().getString(R.string.artist5));

        firstCardModels = new ArrayList<FirstCardModel>();

        for (int i = 0; i <= videoImage.size()-1; i++) {

            firstCardModels.add(new FirstCardModel(videoImage.get(i), videoTitle.get(i), videoTime.get(i), videoDescription.get(i)));
        }
        recyclerViewAdapter  = new FirstAdapter(getActivity(), firstCardModels);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

}