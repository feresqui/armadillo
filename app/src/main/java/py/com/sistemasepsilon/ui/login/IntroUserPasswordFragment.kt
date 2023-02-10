package py.com.sistemasepsilon.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import py.com.sistemasepsilon.R

class IntroUserPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = IntroUserPasswordFragment()
    }

    private lateinit var viewModel: IntroUserPasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_intro_user_password, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IntroUserPasswordViewModel::class.java)
        // TODO: Use the ViewModel
    }

}