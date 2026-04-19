package lhq.cntt2.ontapgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_bmi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XuLyTinh(View view) {
        //Tìm tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtChieuCao);
        EditText editTextSoB = findViewById(R.id.edtCanNang);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoB.getText().toString();
        //Chuyển dữ liệu sang dạng số
        double so_A = Double.parseDouble(strA);
        double so_B = Double.parseDouble(strB);
        //Tính toán theo yêu cầu
        double bmi = so_B / (so_A * so_A);
        String strBMI = String.valueOf(bmi);
        //Hiện ra màn hình
        editTextKetQua.setText(strBMI);
    }

    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }






}