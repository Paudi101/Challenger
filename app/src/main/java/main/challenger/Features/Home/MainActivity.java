package main.challenger.Features.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import main.challenger.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar myToolBar;
    private ViewPager pager;
    private BottomNavigationView navigation;
    private TextView toolBarTitle;
    private MainPagerAdapter adapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    toolBarTitle.setText(R.string.title_home);
                    pager.setCurrentItem(0, true);
                    return true;
                case R.id.navigation_search:
                    toolBarTitle.setText(R.string.title_search);
                    pager.setCurrentItem(1, true);
                    return true;
                case R.id.navigation_personal:
                    toolBarTitle.setText(R.string.title_personal);
                    pager.setCurrentItem(2, true);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle(null);
        getViews();

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setSupportActionBar(myToolBar);

        adapter = new MainPagerAdapter(getSupportFragmentManager(),this);
        pager.setAdapter(adapter);

        pager.addOnPageChangeListener (new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageSelected(int position)
            {
                switch (position) {
                    case 0:
                        navigation.setSelectedItemId(R.id.navigation_home);
                        break;
                    case 1:
                        navigation.setSelectedItemId(R.id.navigation_search);
                        break;
                    case 2:
                        navigation.setSelectedItemId(R.id.navigation_personal);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {}

            @Override
            public void onPageScrolled(int position, float arg1, int arg2) {}
        });

    }

    public void getViews(){
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        myToolBar = (Toolbar) findViewById(R.id.toolbar);
        toolBarTitle = (TextView) myToolBar.findViewById(R.id.toolbar_title);
        pager = (ViewPager) findViewById(R.id.viewPager);
        toolBarTitle.setText(R.string.title_home);
    }

}
