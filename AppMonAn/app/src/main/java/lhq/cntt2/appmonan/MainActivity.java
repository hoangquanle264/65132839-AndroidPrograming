package lhq.cntt2.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        MonAn mon1 = new MonAn("Cơm tấm sườn","20000","đậm đà");
        MonAn mon2 = new MonAn("Cơm tấm sườn trứng","20000","đậm đà");
        MonAn mon3 = new MonAn("Cơm tấm sườn bì chả","20000","đậm đà");
        MonAn mon4 = new MonAn("Cơm tấm đặc biệt","20000","đậm đà");
        MonAn mon5 = new MonAn("Cơm tấm ","20000","đậm đà");

        MonAnAdapter anAdapter = new MonAnAdapter(dsMonAn, this);
        lvDSMonAn.setAdapter(anAdapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                MonAn monAnChon = dsMonAn.get(i);
                Toast.makeText( MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}