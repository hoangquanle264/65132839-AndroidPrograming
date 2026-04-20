package thigk2.lehoangquan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
    }

    public void ChuyenManHinh (View v) {
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, TinhActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }

    public void ChuyenTinhThanh (View v) {
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, TinhThanhActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }

    public void ChuyenGioiThieu (View v) {
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, ActivityGioiThieu.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }
}