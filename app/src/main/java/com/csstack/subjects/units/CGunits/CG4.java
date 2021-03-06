package com.csstack.subjects.units.CGunits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csstack.R;
import com.csstack.subjects.units.pointsAdapter;
import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.florent37.materialviewpager.adapter.RecyclerViewMaterialAdapter;

import java.util.ArrayList;

/**
 * Created by nandhu on 25/5/16.
 */
public class CG4 extends Fragment {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.unit_list_layout,container,false);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getParentFragment().getContext()));
        mRecyclerView.setAdapter(new RecyclerViewMaterialAdapter(mAdapter));
        MaterialViewPagerHelper.registerRecyclerView(this.getActivity(),mRecyclerView,null);

        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> points=new ArrayList<>();
        points.add("Multimedia");
        points.add("Animations");
        points.add("Compression & Types");
        points.add("Image Compression");

        points.add("Video Compression");
        points.add("File Format ");
        points.add("Multimedia Data structres-KD Trees , R-Trees");
        points.add("");
        points.add("");
        points.add("");

       // mAdapter=new pointsAdapter(points);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
