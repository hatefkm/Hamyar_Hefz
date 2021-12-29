package ir.skums.hamyarhefz;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NoteDetailActivity extends AppCompatActivity {

    private EditText edtNameSure, edtNumberAye, edtAye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);
        initWidgets();
    }

    private void initWidgets()
    {
        edtNameSure = findViewById(R.id.edtNameSure_note);
        edtNumberAye = findViewById(R.id.edtNumberAye_note);
        edtAye = findViewById(R.id.edtAye_note);
    }

    public void saveNote(View view)
    {
        String nameSure = String.valueOf(edtNameSure.getText());
        String numberAye = String.valueOf(edtNumberAye.getText());
        String aye = String.valueOf(edtAye.getText());

        int id = Note.noteArrayList.size();
        Note newNote = new Note(id,nameSure,numberAye,aye);
        Note.noteArrayList.add(newNote);
        finish();

    }
}