package thigk2.lehoangquan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TinhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tinh);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XuLyTinh(View view) {
        //Tìm tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtChieuDai);
        EditText editTextSoB = findViewById(R.id.edtChieuRong);
        EditText editTextKetQuaCV = findViewById(R.id.edtCV);
        EditText editTextKetQuaDT = findViewById(R.id.edtDT);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoB.getText().toString();
        //Chuyển dữ liệu sang dạng số
        double so_A = Double.parseDouble(strA);
        double so_B = Double.parseDouble(strB);
        //Tính toán theo yêu cầu
        double tinhCV = (so_A + so_B) * 2;
        double tinhDT = so_A * so_B;
        String strTinhCV = String.valueOf(tinhCV);
        String strTinhDT = String.valueOf(tinhDT);
        //Hiện ra màn hình
        editTextKetQuaCV.setText(strTinhCV);
        editTextKetQuaDT.setText(strTinhDT);
    }



    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}