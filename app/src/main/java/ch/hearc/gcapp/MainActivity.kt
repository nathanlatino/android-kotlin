package ch.hearc.gcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    /*
     * Construct your activity inside this method.
     *
     * Do not use any constructor.
     */
    private lateinit var btnAdd :Button
    private lateinit var adapter : ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //INIT
        btnAdd = findViewById(R.id.btnAdd)
        val cities = mutableListOf("Neuchâtel")


        adapter = ArrayAdapter(this, R.layout.listview_item, cities)
        val listView: ListView = findViewById(R.id.lstView)
        listView.setAdapter(adapter)
        btnAdd.isClickable = false

        initEvent()

    }

    fun initEvent() {
        var counter = 0
        btnAdd.setOnClickListener{adapter.add("Bonjour ${counter++}")}
    }

    companion object {

        /*
     * Use this TAG for logging. Examples:
     *
     * Log.i(TAG, "CREATE");
     * Log.e(TAG, "ERROR", exception);
     */
        private val TAG = MainActivity::class.java.simpleName
    }
}
