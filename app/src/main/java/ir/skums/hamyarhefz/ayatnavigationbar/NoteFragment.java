package ir.skums.hamyarhefz.ayatnavigationbar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.skums.hamyarhefz.NoteDetailActivity;
import ir.skums.hamyarhefz.R;
import ir.skums.hamyarhefz.ShowNoteActivity;


import android.widget.Button;
import android.widget.ListView;


public class NoteFragment extends Fragment {
    private ListView noteListView;
    private Button btn_addNewNote;
    private Button btn_ShowNote;

    public NoteFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static NoteFragment newInstance(String param1, String param2) {
        NoteFragment fragment = new NoteFragment();
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
        View view = inflater.inflate(R.layout.fragment_note, container, false);

        btn_addNewNote=view.findViewById(R.id.btn_addNewNote);
        btn_ShowNote=view.findViewById(R.id.btn_ShowNote);





        btn_addNewNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NoteDetailActivity.class);
                startActivity(intent);






            }
        });

        btn_ShowNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ShowNoteActivity.class);
                startActivity(intent);






            }
        });


        return view;
    }


}