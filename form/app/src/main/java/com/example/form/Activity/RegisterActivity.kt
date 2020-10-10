package com.example.form.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.isEmpty
import androidx.core.view.size
import com.example.form.R
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val password:com.google.android.material.textfield.TextInputEditText = findViewById(R.id.password);
        val disciplina:com.google.android.material.textfield.TextInputEditText = findViewById(R.id.disciplina);
        val name:com.google.android.material.textfield.TextInputEditText = findViewById(R.id.name);
        val email: EditText = findViewById(R.id.email);
        val turma: EditText = findViewById(R.id.turma);
        val phone: EditText = findViewById(R.id.phone);


        registerActivityBtn.setOnClickListener(){
            if(turma.text.toString().isEmpty() && email.text.toString().isEmpty() && phone.text.toString().isEmpty() && disciplina.text.toString().isEmpty() && name.text.toString().isEmpty()){
                Toast.makeText(this,"Não pode haver campos vazios",Toast.LENGTH_SHORT).show();
            }
            if(password.text.toString().length <= 6){
                Toast.makeText(this,"A senha deve ter ao menos 6 caracteres",Toast.LENGTH_SHORT).show();
            }
        }
    }
}