package com.d.listdemoslide3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentHolder> {


    private Context context;
    private List<Student> studentList;

    // ham khởi tạo để truyền dữ liêu và context từ MainActivity

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }


    // phuong thuc khoi tao layout cho 1 item trong RV
    @NonNull
    @Override
    public StudentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate
                (R.layout.student, viewGroup, false);

        StudentHolder studentHolder = new StudentHolder(view);


        return studentHolder;
    }

    // phuong thuc fill data vao item cho RV
    @Override
    public void onBindViewHolder(@NonNull StudentHolder studentHolder, int i) {

        final Student student = studentList.get(i);

        studentHolder.tvId.setText(student.id);
        studentHolder.tvName.setText(student.name);
        studentHolder.tvPhone.setText(student.phone);
        studentHolder.tvDate.setText(student.birthday);

        studentHolder.tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"CLick Phone " + student.phone,Toast.LENGTH_SHORT).show();
            }
        });

        studentHolder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"CLick Name " + student.name,Toast.LENGTH_SHORT).show();
            }
        });

    }


    // so item ma RV se hien thi
    @Override
    public int getItemCount() {
        return studentList.size();
    }


}
