package com.d.listdemoslide3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStudents = findViewById(R.id.rvStudents);

        List<Student> studentList = new ArrayList<>();


        // tạo dữ liệu mẫu là List
        for (int i = 0; i < 20; i++) {
            Student student = new Student();

            student.id = String.valueOf(i);

            student.name = "Huy Nguyen " + i;
            student.phone = "091903019" + i;
            student.birthday = "1990/01/" + i;

            studentList.add(student);
        }

        // định nghĩa RV hiển thị theo list chiều dọc
        LinearLayoutManager linearVertical =
                new LinearLayoutManager(MainActivity.this);


        // định nghĩa RV hiển thị theo list chiều ngang

        LinearLayoutManager linearHorizontal =
                new LinearLayoutManager(MainActivity.this,
                        LinearLayoutManager.HORIZONTAL, false);


        // định nghĩa RV hiển thị theo dạng lưới grid
        // spanCount là số cột

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(MainActivity.this, 3);


        // định nghĩa RV hiển thị theo dạng Stagger

        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);


        rvStudents.setLayoutManager(staggeredGridLayoutManager);

        StudentAdapter studentAdapter = new StudentAdapter(MainActivity.this, studentList);

        rvStudents.setAdapter(studentAdapter);



    }
}
