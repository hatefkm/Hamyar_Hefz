package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ShowNoteActivity extends AppCompatActivity {

    private ListView noteListView;
    NoteAdapter noteAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_note);

        initWidgets();
        setNoteAdapter();


        noteListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {


                noteAdapter.notifyDataSetChanged();
                noteAdapter.remove(Note.noteArrayList.remove(i));

                return false;
            }
        });



    }


    private void initWidgets()
    {
        noteListView = findViewById(R.id.noteListView_main);
    }
    private void setNoteAdapter()
    {
        noteAdapter = new NoteAdapter(getApplicationContext() ,Note.noteArrayList);
        noteListView.setAdapter(noteAdapter);

    }

    public void newNote(View view)
    {
        Intent newNoteIntent = new Intent(this,NoteDetailActivity.class);
        startActivity(newNoteIntent);
    }


    @Override
    protected void onResume() {



        super.onResume();
        initWidgets();
        setNoteAdapter();

    }

    @Override
    protected void onStop() {

        super.onStop();
        initWidgets();
        setNoteAdapter();

    }
}