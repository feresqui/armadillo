package py.com.sistemasepsilon.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import py.com.sistemasepsilon.databinding.ItemUserBinding
import py.com.sistemasepsilon.model.User

class UsersAdapter(
    private val users: ArrayList<User>,
    private val onItemClicked: (position: Int) -> Unit
) : RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {
    inner class UserViewHolder(
        private val binding: ItemUserBinding,
        private val onItemClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        fun bindItem(user: User) {
            this.binding.textViewName.text = user.name
            this.binding.textViewSurname.text = user.surname
        }

        init {
            this.itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            this.onItemClicked(this.adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), onItemClicked
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindItem(user = this.users[position])
    }

    override fun getItemCount(): Int {
        return this.users.size
    }
}
