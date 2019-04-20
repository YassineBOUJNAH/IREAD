package com.adib.iread.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adib.iread.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParamPageFragment extends Fragment {
    public static com.adib.iread.Fragment.NewsPageFragment newInstance() {
        return (new com.adib.iread.Fragment.NewsPageFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_param_page, container, false);
    }

}
