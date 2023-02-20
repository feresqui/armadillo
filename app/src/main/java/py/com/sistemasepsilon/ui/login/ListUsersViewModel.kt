package py.com.sistemasepsilon.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import py.com.sistemasepsilon.model.User

class ListUsersViewModel : ViewModel() {
    private val _users = MutableLiveData<ArrayList<User>>()
    val users: LiveData<ArrayList<User>>
        get() = _users


    init {
        loadUsers()
    }

    private fun loadUsers() {
        val tempUsers = arrayListOf(
            User("Nombre1", "Apellido1", "pass1"),
            User("Nombre2", "Apellido2", "pass2")
        )

        this._users.value = tempUsers
    }
}