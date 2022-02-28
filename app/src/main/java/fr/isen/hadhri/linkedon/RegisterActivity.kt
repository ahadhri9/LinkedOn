package fr.isen.hadhri.linkedon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import fr.isen.hadhri.linkedon.databinding.ActivityLoginBinding
import fr.isen.hadhri.linkedon.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth
    val TAG = "RegisterActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val database = Firebase.database("https://linkedon-b7c62-default-rtdb.europe-west1.firebasedatabase.app")
        val TAG = "LoginActivity"
        val myRef = database.getReference("post")
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        listenClick()

    }


    private fun reload() {
        TODO("Not yet implemented")
    }

    private fun listenClick() {
        auth.signInWithEmailAndPassword(binding.EmailAddress.text.toString(),binding.Password.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithEmail:success")
                    val user = auth.currentUser
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()

                }
            }
    }

    private fun updateUI(user: FirebaseUser?) {
        TODO("Not yet implemented")
    }

//test@gmail.com


}