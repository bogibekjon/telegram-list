package uz.data.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<Home>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        list = loadList()
        var rvHome=findViewById<RecyclerView>(R.id.rv_home)
        val adapter = HomeAdapter(list)
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvHome.adapter=adapter
        rvHome.layoutManager=layoutManager
    }

    private fun loadList(): ArrayList<Home> {
        var myList = ArrayList<Home>()
        myList.add(Home("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/bltdfd80688a01e1708/63903c30d47af7091ed3a77a/Ronny_cover.jpg?auto=webp&format=jpg", "Ogabek", "salom aka", "fri"))
        myList.add(Home("https://fcb-abj-pre.s3.amazonaws.com/img/jugadors/MESSI.jpg", "Abdurahmon", "uyga vazifa", "today"))
        myList.add(Home("https://i.pinimg.com/originals/32/af/4c/32af4c234782000614a8d24d97957652.jpg", "Abror", "ina ustoz", "thu"))
        myList.add(Home("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg", "Mansurbek", "https://github.com...", "fri"))
        myList.add(Home("", "Ogabek", "salom aka", "fri"))
        myList.add(Home("", "Abdurahmon", "uyga vazifa", "today"))
        myList.add(Home("", "Abror", "ina ustoz", "thu"))
        myList.add(Home("", "Mansurbek", "https://github.com...", "fri"))
//        myList.add(Home("", "Ogabek", "salom aka", "fri"))
//        myList.add(Home("", "Abdurahmon", "uyga vazifa", "today"))
//        myList.add(Home("", "Abror", "ina ustoz", "thu"))
//        myList.add(Home("", "Mansurbek", "https://github.com...", "fri"))
//        myList.add(Home("", "Ogabek", "salom aka", "fri"))
//        myList.add(Home("", "Abdurahmon", "uyga vazifa", "today"))
//        myList.add(Home("", "Abror", "ina ustoz", "thu"))
//        myList.add(Home("", "Mansurbek", "https://github.com...", "fri"))
//        myList.add(Home("", "Ogabek", "salom aka", "fri"))
//        myList.add(Home("", "Abdurahmon", "uyga vazifa", "today"))
//        myList.add(Home("", "Abror", "ina ustoz", "thu"))
//        myList.add(Home("", "Mansurbek", "https://github.com...", "fri"))
//        myList.add(Home("", "Ogabek", "salom aka", "fri"))
//        myList.add(Home("", "Abdurahmon", "uyga vazifa", "today"))
//        myList.add(Home("", "Abror", "ina ustoz", "thu"))
//        myList.add(Home("", "Mansurbek", "https://github.com...", "fri"))
        return myList
    }
}