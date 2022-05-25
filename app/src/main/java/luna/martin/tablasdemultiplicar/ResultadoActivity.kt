package luna.martin.tablasdemultiplicar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class ResultadoActivity : AppCompatActivity() {
    lateinit var animView:LottieAnimationView
    lateinit var Regresar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        animView = findViewById(R.id.animation)

        val extras = intent.extras
        val respuestaCorrecta = extras!!.getBoolean("Respuesta")
        if(respuestaCorrecta){
            animView.setAnimation(R.raw.success)
        }else{
            animView.setAnimation(R.raw.bouncyfail)
        }

        Regresar = findViewById(R.id.btnRegresar)
        Regresar.setOnClickListener {
            val intRegr = Intent(this, Activity2::class.java)
            startActivity(intRegr)
        }
    }
}