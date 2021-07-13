package github.toninhobueno.meuscontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_List)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bindView()
        updateList()
    }

    private fun bindView() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)

    }


    private fun updateList() {
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Antonio Carlos",
                    "(00) 00000-0000",
                    "img.png",

                ),
                Contact(
                    "Antonio Carlos",
                    "(00) 00000-0000",
                    "img.png"
                )
            )
        )
    }
}

