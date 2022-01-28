package ir.skums.hamyarhefz.ayatnavigationbar;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import ir.skums.hamyarhefz.R;

public class NamSoreFragment10 extends Fragment {

    TextView txtView_Tarjome;
    public NamSoreFragment10() {
        // Required empty public constructor
    }

    public static NamSoreFragment10 newInstance(String param1, String param2) {
        NamSoreFragment10 fragment = new NamSoreFragment10();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_namsore10, container, false);



        txtView_Tarjome=view.findViewById(R.id.txtView_Tarjome);
        Typeface type=Typeface.createFromAsset(getActivity().getAssets(), "fonts/b_titr.TTF");
        txtView_Tarjome.setTypeface(type);


        return view;
    }
}