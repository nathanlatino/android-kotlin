package ch.hearc.gcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    /*
     * Construct your activity inside this method.
     *
     * Do not use any constructor.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Add a search field, a list of strings and an "add" button in res/layout/activity_main.xml

        // TODO Add a random string inside the list when clicking (tapping) the button

        // TODO Filter the list of strings when changing the text inside the search field

        var counter = 0

        val adapter = ArrayAdapter(this, R.layout.listview_item, city);
        val listView: ListView = findViewById(R.id.lstView)
        listView.setAdapter(adapter)

        val btnAdd = findViewById(R.id.btnAdd) as Button
        btnAdd.setOnClickListener{
            adapter.add("Bonjour"+counter++)
        }
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
