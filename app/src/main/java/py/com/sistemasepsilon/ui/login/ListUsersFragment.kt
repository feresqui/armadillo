package py.com.sistemasepsilon.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import py.com.sistemasepsilon.databinding.FragmentListUsersBinding

class ListUsersFragment : Fragment() {

    companion object {
        fun newInstance() = ListUsersFragment()
    }

    private lateinit var binding: FragmentListUsersBinding
    private lateinit var viewModel: ListUsersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this.binding = FragmentListUsersBinding.inflate(inflater, container, false)

        return this.binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListUsersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}