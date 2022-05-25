package luna.martin.tablasdemultiplicar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPracticar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPracticar = findViewById(R.id.btnPract)
        btnPracticar.setOnClickListener{
            val intentP = Intent(this,Activity2::class.java)
            startActivity(intentP)
        }
    }
}