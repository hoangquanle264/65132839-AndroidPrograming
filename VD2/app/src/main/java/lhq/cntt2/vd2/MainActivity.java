package lhq.cntt2.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai bao cac dieu khien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
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
        TimDieuKhien();
    }


    //Xử lý cộng
        public void XuLyCong(View v){
        //Code xu ly cong
        //b1.Lay du lieu tu 2 so
        //b1.1 Tim edit text so 1 va 2

        //b1.2 lay du lieu tu 2 dieu khien
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        //b1.3 chuyen du lieu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 tinh toan
        float Tong = soA + soB;
        //b3 hien ket qua
        //b3.1

        //b3.2 chuan bi du lieu xuat bien thanh dnag chuoi
        String chuoiKQ = String.valueOf(Tong);
        //B3.3 cho ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }



    //Xử lý tru
    public void XuLyTru(View v){
        //Code xu ly tru
        //b1.Lay du lieu tu 2 so
        //b1.1 Tim edit text so 1 va 2

        //b1.2 lay du lieu tu 2 dieu khien
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        //b1.3 chuyen du lieu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 tinh toan
        float Hieu = soA - soB;
        //b3 hien ket qua
        //b3.1

        //b3.2 chuan bi du lieu xuat bien thanh dnag chuoi
        String chuoiKQ = String.valueOf(Hieu);
        //B3.3 cho ket qua len dk
        editTextKQ.setText(chuoiKQ);

    }
    //Xử lý nhan
    public void XuLyNhan(View v){
        //Code xu ly nhan
        //b1.Lay du lieu tu 2 so
        //b1.1 Tim edit text so 1 va 2

        //b1.2 lay du lieu tu 2 dieu khien
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        //b1.3 chuyen du lieu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 tinh toan
        float Tich = soA * soB;
        //b3 hien ket qua
        //b3.1

        //b3.2 chuan bi du lieu xuat bien thanh dnag chuoi
        String chuoiKQ = String.valueOf(Tich);
        //B3.3 cho ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
    //Xử lý chia
    public void XuLyChia(View v){
        //Code xu ly chia
        //Code xu ly cong
        //b1.Lay du lieu tu 2 so
        //b1.1 Tim edit text so 1 va 2

        //b1.2 lay du lieu tu 2 dieu khien
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        //b1.3 chuyen du lieu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 tinh toan
        float Thuong = soA / soB;
        //b3 hien ket qua
        //b3.1

        //b3.2 chuan bi du lieu xuat bien thanh dnag chuoi
        String chuoiKQ = String.valueOf(Thuong);
        //B3.3 cho ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
}