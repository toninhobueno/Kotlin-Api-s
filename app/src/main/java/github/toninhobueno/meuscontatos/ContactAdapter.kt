package github.toninhobueno.meuscontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

// Recycler view com seus construtores
class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val list: MutableList<Contact> = mutableListOf()

    //Infla o layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
        return ContactAdapterViewHolder(view)
    }

    //altera a posição baseado no cursor
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    // tamanho da lista
    override fun getItemCount(): Int {
        return list.size
    }

    //atualiza a lista
    fun updateList(list: List<Contact>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    //Adapter recebe os itens do cardview
    class ContactAdapterViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        private  val tvName : TextView = itemView.findViewById(R.id.tv_name)
        private  val tvPhone : TextView = itemView.findViewById(R.id.tv_phone)
        private  val ivPhotograph : ImageView = itemView.findViewById(R.id.iv_photograph)

        fun bind(contact : Contact){
            tvName.text = contact.name
            tvPhone.text = contact.fone
        }
    }
}