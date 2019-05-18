package ideafactory.bit.agh.ddapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_knowledge.*

class KnowledgeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        var name : String = "ola ma psa"
        val textView: TextView = findViewById(R.id.information_view) as TextView
        textView.setOnClickListener {
            textView.text = "ola"
        }
    }

}
