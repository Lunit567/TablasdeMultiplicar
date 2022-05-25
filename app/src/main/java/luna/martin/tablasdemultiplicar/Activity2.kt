package luna.martin.tablasdemultiplicar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class Activity2 : AppCompatActivity() {
    lateinit var tvFactor1:TextView
    lateinit var tvFactor2:TextView
    lateinit var etRespuesta:EditText
    lateinit var Verificar:Button
    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0
    var respuestaCorrecta = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        initUI()

        Verificar.setOnClickListener {
            val strRespuesta = etRespuesta.text.toString()
            if (strRespuesta.equals("")){
                Toast.makeText(this, "No hay nada escrito", Toast.LENGTH_LONG).show()
            }else{
                respuestaCorrecta = producto ==strRespuesta.toInt()
                generarMultiplicacion()
                val mostrarResultado = Intent(this, ResultadoActivity::class.java)
                mostrarResultado.putExtra("Respuesta", respuestaCorrecta)
                startActivity(mostrarResultado)
            }
        }
    }

    fun initUI(){
        tvFactor1 = findViewById(R.id.F1)
        tvFactor2 = findViewById(R.id.F2)
        etRespuesta = findViewById(R.id.Respuesta)
        Verificar = findViewById(R.id.btnVerificar)
        generarMultiplicacion()
    }

    fun generarMultiplicacion(){
        factor1 = Random.nextInt(0,10)
        factor2 = Random.nextInt(0,10)
        producto = factor1*factor2
        tvFactor1.text = "$factor1"
        tvFactor2.text = "$factor2"
        etRespuesta.text.clear()
    }
}