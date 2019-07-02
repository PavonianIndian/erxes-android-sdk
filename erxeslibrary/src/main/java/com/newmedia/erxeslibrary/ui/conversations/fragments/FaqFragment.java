package com.newmedia.erxeslibrary.ui.conversations.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newmedia.erxeslibrary.ErxesObserver;
import com.newmedia.erxeslibrary.R;
import com.newmedia.erxeslibrary.SimpleDividerItemDecoration;
import com.newmedia.erxeslibrary.configuration.Config;
import com.newmedia.erxeslibrary.configuration.ErxesRequest;
import com.newmedia.erxeslibrary.configuration.ReturnType;
import com.newmedia.erxeslibrary.ui.conversations.adapter.FaqAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class FaqFragment extends Fragment {

    public FaqFragment() {
        // Required empty public constructor
    }

    private ErxesRequest erxesRequest;
    private Config config;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_faq, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        return v;
    }

    public void init() {
        if (isAdded() && recyclerView != null) {
            recyclerView.setAdapter(new FaqAdapter(this.getActivity()));
            LinearLayoutManager ln = new LinearLayoutManager(this.getContext());
            recyclerView.setLayoutManager(ln);
//        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this.getContext()));
        }
    }
}
