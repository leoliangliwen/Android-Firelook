package com.laioffer.eventreporter;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements EventFragment.OnItemSelectListener
{
    private EventFragment mListFragment;
    private CommentFragment mGridFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add list view
        mListFragment = new EventFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.event_container,     mListFragment).commit();


        //add Gridview
        if (isTablet()) {
            mGridFragment = new CommentFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.comment_container, mGridFragment).commit();
        }


    }

    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) >=
                Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    @Override
    public void onItemSelected(int position){
        if (isTablet())
            mGridFragment.onItemSelected(position);
        //mListFragment.onItemSelected(position);
    }


}
