package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText6, editText7;
    Button button2;
    TextView txv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ (Mapping)
        editText6 = findViewById(R.id.editTextText6);
        editText7 = findViewById(R.id.editTextText7);
        button2 = findViewById(R.id.button2);
        txv11 = findViewById(R.id.txv11);

        // Xử lý sự kiện khi nút được nhấn
        button2.setOnClickListener(v -> {
            // Hàm tính tổng
            tinhTong();
        });
    }

    // Định nghĩa hàm tính tổng
    private void tinhTong() {
            // Lấy giá trị từ ô nhập liệu thứ nhất
            String str1 = editText6.getText().toString();
            float so1 = Float.parseFloat(str1);

            // Lấy giá trị từ ô nhập liệu thứ hai
            String str2 = editText7.getText().toString();
            float so2 = Float.parseFloat(str2);

            // Tính tổng
            float tong = so1 + so2;

            // Hiển thị kết quả trên TextView
            txv11.setText("Kết quả: " + String.valueOf(tong));
        }

}
