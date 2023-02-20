package py.com.sistemasepsilon.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import py.com.sistemasepsilon.R
import py.com.sistemasepsilon.databinding.FragmentIntroUserPasswordBinding
import py.com.sistemasepsilon.databinding.FragmentListUsersBinding

class IntroUserPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = IntroUserPasswordFragment()
    }

    private lateinit var binding: FragmentIntroUserPasswordBinding
    private lateinit var viewModel: IntroUserPasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this.binding = FragmentIntroUserPasswordBinding.inflate(inflater, container, false)

        return this.binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[IntroUserPasswordViewModel::class.java]
        // TODO: Use the ViewModel
    }

}