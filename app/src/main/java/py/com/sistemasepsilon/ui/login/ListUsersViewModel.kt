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
            User("Liam Benjamin", "Rodriguez Patel", "pass1"),
            User("Emily Sofia", "Nguyen Kim", "pass2"),
            User("Liam Benjamin", "Rodriguez Patel", "pass1"),
            User("Emily Sofia", "Nguyen Kim", "pass2"),
            User("Liam Benjamin", "Rodriguez Patel", "pass1"),
            User("Emily Sofia", "Nguyen Kim", "pass2"),
            User("Liam Benjamin", "Rodriguez Patel", "pass1"),
            User("Emily Sofia", "Nguyen Kim", "pass2"),
            User("Liam Benjamin", "Rodriguez Patel", "pass1"),
            User("Emily Sofia", "Nguyen Kim", "pass2"),
            User("Liam Benjamin", "Rodriguez Patel", "pass1"),
            User("Emily Sofia", "Nguyen Kim", "pass2"),
        )

        this._users.value = tempUsers
    }
}