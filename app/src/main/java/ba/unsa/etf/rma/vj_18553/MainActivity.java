package ba.unsa.etf.rma.vj_18553;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private ListView listView;
    private ArrayList<Movie> entries;
    private MovieListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        listView = (ListView)findViewById(R.id.listView);

        entries = new ArrayList<Movie>();
        adapter = new MovieListAdapter(this, R.layout.list_element, R.id.itemName, entries);
        listView.setAdapter(adapter);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                entries.add(0,editText.getText().toString());
//                adapter.notifyDataSetChanged();
//                editText.setText("");
//            }
//        });



    }
}
