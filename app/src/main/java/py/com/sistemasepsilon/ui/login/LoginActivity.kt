package py.com.sistemasepsilon.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import py.com.sistemasepsilon.R
import py.com.sistemasepsilon.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}