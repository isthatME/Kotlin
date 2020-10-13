package Fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.form.Activity.MainActivity
import com.example.form.Activity.RegisterActivity
import com.example.form.Activity.Usuario
import com.example.form.R
import com.example.form.R.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [loginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class loginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(layout.fragment_login, container, false)
        val buttonRegister: Button = view.findViewById(R.id.registerBtn)
        val buttonLogin: Button = view.findViewById(R.id.loginBtn)
        val senha: EditText = view.findViewById(R.id.senha);
        val email: EditText = view.findViewById(R.id.email);

        val intent = Intent(this.context, MainActivity::class.java);
        val user = intent.extras?.getParcelable<Usuario>("user");

        buttonLogin.setOnClickListener(){
            if(senha.text.toString().length < 6){
                Toast.makeText(this.context, "A senha deve conter pelo menos 6 dígitos",Toast.LENGTH_SHORT).show();
            }
            user?.let {
                if(email.text.toString() == user.email && senha.text.toString() == user.senha){

                    startActivity(intent)
                }else{
                    Toast.makeText(this.context, "Digite um usuário válido",Toast.LENGTH_SHORT).show();
                }
                startActivity(intent)
            }
            startActivity(intent)
        }
        buttonRegister.setOnClickListener(){
            val intent = Intent(this.context, RegisterActivity::class.java);
            startActivity(intent);
        }
        return view;
    }
}