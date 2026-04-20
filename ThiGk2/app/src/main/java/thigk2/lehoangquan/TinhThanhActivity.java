package thigk2.lehoangquan;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TinhThanhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tinh_thanh2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ===== PHẦN THÊM VÀO ĐỂ HIỂN THỊ LISTVIEW =====

        // Bước 1: Tìm ListView trong layout (giả sử id là listViewTinhThanh)
        ListView listView = findViewById(R.id.listViewTinhThanh);

        // Bước 2: Tạo dữ liệu mẫu (danh sách tỉnh/thành)
        String[] danhSachTinhThanh = {
                "Hà Nội",
                "Hồ Chí Minh",
                "Đà Nẵng",
                "Hải Phòng",
                "Cần Thơ",
                "Đồng Nai",
                "Bình Dương",
                "Khánh Hòa",
                "Quảng Ninh",
                "Thừa Thiên Huế",
                "Lâm Đồng",
                "Bà Rịa - Vũng Tàu",
                "Long An",
                "Tiền Giang",
                "Bến Tre"
        };

        // Bước 3: Tạo Adapter (cầu nối giữa dữ liệu và ListView)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,                                    // Context
                android.R.layout.simple_list_item_1,     // Layout cho mỗi dòng
                danhSachTinhThanh                        // Dữ liệu
        );

        // Bước 4: Gán Adapter cho ListView
        listView.setAdapter(adapter);

        // Bước 5: Xử lý sự kiện khi click vào item
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = danhSachTinhThanh[position];
            Toast.makeText(
                    TinhThanhActivity.this,
                    "Bạn chọn: " + selectedItem,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}