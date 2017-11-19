package nyc.c4q.inclass1119.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.inclass1119.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private View rootView;
    EditText editText;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button button01 = (Button) rootView.findViewById(R.id.button1);
        Button button02 = (Button) rootView.findViewById(R.id.button2);
        Button button03 = (Button) rootView.findViewById(R.id.button3);
        Button button04 = (Button) rootView.findViewById(R.id.button4);
        Button button05 = (Button) rootView.findViewById(R.id.button5);

        editText = (EditText) rootView.findViewById(R.id.main_fragment_edittext);


        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment01 fragment01 = new Fragment01();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                String textFromEditText = editText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("text", textFromEditText);
                fragment01.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_fragment, fragment01).addToBackStack("fragment01");
                fragmentTransaction.commit();

            }
        });
        return rootView;
    }

}
