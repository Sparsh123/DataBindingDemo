package com.example.databindingdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingdemo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final MyModel myModel = new MyModel();
        myModel.setName("Rocket Flyer");
        myModel.setType("IT Company");

        binding.setModel(myModel);

        binding.btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Value from model class: " +  myModel.getMessage(), Toast.LENGTH_LONG).show();


                Toast.makeText(getApplicationContext(), "Value from Edittext box: "+binding.edtMessage.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
