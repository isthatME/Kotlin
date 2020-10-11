package com.example.form.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.EditText
import android.widget.Toast
import com.example.form.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val senha:com.google.android.material.textfield.TextInputEditText = findViewById(R.id.password);
        val disciplina:com.google.android.material.textfield.TextInputEditText = findViewById(R.id.disciplina);
        val nome:com.google.android.material.textfield.TextInputEditText = findViewById(R.id.name);
        val email: EditText = findViewById(R.id.email);
        val turma: EditText = findViewById(R.id.turma);
        val telefone: EditText = findViewById(R.id.phone);
        var sexo: String = "masculino".toString();

        radioGroup.setOnCheckedChangeListener{group, checkedId ->
            if(checkedId == R.id.radioButton){
                sexo = "feminino".toString();
                //debugging
                //Toast.makeText(this,"feminino",Toast.LENGTH_SHORT).show();
            }else{
                sexo = "masculino".toString();
                //Toast.makeText(this,"masculino",Toast.LENGTH_SHORT).show();
            }
        }

        registerActivityBtn.setOnClickListener(){

            //checando qual radioButton foi selecionado

            if(turma.text.toString().isEmpty() && email.text.toString().isEmpty() && senha.text.toString().isEmpty() && telefone.text.toString().isEmpty()){
                Toast.makeText(this,"Não pode haver campos vazios",Toast.LENGTH_SHORT).show();
            }
            else if(password.text.toString().length <= 6){
                Toast.makeText(this,"A senha deve ter ao menos 6 caracteres",Toast.LENGTH_SHORT).show();
            }else{
                val usuario = Usuario(nome.toString(), sexo, email.toString(),senha.toString(), telefone.toString(),disciplina.toString(),turma.toString());

                val intent = Intent(this, LoginActivity::class.java);
                startActivity(intent);

                intent.putExtra("email", nome.toString());
                intent.putExtra("senha", senha.toString());
            }




        }
    }
}
