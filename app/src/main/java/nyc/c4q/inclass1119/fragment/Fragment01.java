package nyc.c4q.inclass1119.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import nyc.c4q.inclass1119.R;

public class Fragment01 extends Fragment {

    private View rootView;
    private Text textView;

    public Fragment01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_01, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragment01_textView);

        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("text", "Nothing passed");
        textView.setText(textFromEditText);
        return rootView;
    }

}
