package main.challenger.Features.Home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import main.challenger.Features.Profile.ChallengesFragment;
import main.challenger.Features.Profile.ProfileFragment;
import main.challenger.Features.Search.SearchFragment;


public class MainPagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<String> tabItems = new ArrayList<>();
    private final ArrayList<Fragment> fragments = new ArrayList<>();
    private Context context;

    public MainPagerAdapter(FragmentManager supportFragmentManager, Context context) {
        super(supportFragmentManager);
        this.context = context;
        fragments.add(new HomeFragment());
        fragments.add(new SearchFragment());
        fragments.add(new ProfileFragment());
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabItems.get(position);
    }

}