package marla.com.la7viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LembarAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;

    public LembarAdapter(FragmentManager fm){
    super(fm);
}

    @Override
    public Fragment getItem(int arg0){
    Lembar myFragment = new Lembar();
    Bundle data = new Bundle();
    data.putInt("current_page",arg0+1);
    myFragment.setArguments(data);
    return myFragment;
}
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Halaman #" + (position + 1);
    }
}
