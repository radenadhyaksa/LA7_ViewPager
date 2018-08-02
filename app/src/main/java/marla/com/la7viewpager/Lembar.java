package marla.com.la7viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Taufiq on 6/5/2017.
 */

public class Lembar extends Fragment {

    int mCurrentPage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle data = getArguments();
        mCurrentPage = data.getInt("current_page", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = null;

        if(mCurrentPage ==1){
            v = inflater.inflate(R.layout.layout1,container, false);
        }
        else if(mCurrentPage ==2){
            v = inflater.inflate(R.layout.layout2,container, false);
        }
        else if (mCurrentPage ==3){
            v = inflater.inflate(R.layout.layout3,container, false);
        }
        return v;
    }
}

