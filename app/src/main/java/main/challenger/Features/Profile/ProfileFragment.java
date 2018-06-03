package main.challenger.Features.Profile;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import main.challenger.R;
import main.challenger.Utils.Challenge;
import main.challenger.Utils.ChallengeAdapter;

public class ProfileFragment extends Fragment implements View.OnTouchListener {

    private static final String TAG = ChallengesFragment.class.getSimpleName();
    private View rootView;
    private RecyclerView recyclerView;
    private ChallengeAdapter adapter;
    private List<Challenge> currentChallengeList = new ArrayList<>();
    private LinearLayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.profile_fragment, container, false);
        getMockData();
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews(view);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ChallengeAdapter(currentChallengeList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void findViews(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.challenge_cycler);
    }

    private void getMockData(){
        currentChallengeList.add(new Challenge("Create a new Challenge","Description"));
        currentChallengeList.add(new Challenge("Create a new Challenge","Description"));
        currentChallengeList.add(new Challenge("Create a new Challenge","Description"));
        currentChallengeList.add(new Challenge("Create a new Challenge","Description"));
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
