package br.com.digitalhouse.aula0210

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    var cont: Int = 0

    // Chamado na criação da activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "Chegando no onCreate")

        val click = View.OnClickListener { view->
            when(view.getId()){
                R.id.btn_contador -> incremento()
            }
        }
        
        btn_contador.setOnClickListener(click)
        tv_display.setText(cont.toString())

    }

    fun incremento(){
        tv_display.setText(cont.toString())
        cont++
    }


    // Após On  Stop, caso reiniciada
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "Chegando no onRestart")

    }

    // Quando a activity se torna visivel ao usuário
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Chegando no onStart")

    }

    // Quando a activity fica disponível para interagir
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Chegando no onResume")

    }

    // QUando a activity perde foco brevemente
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Chegando no onPause")

    }

    // Quando a perda de foco leva a outra activity
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Chegando no onStop")
    }

    // Quando o desenvolvedor chama o finish() ou quando o sistema precisa de memória
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Chegando no onDestroy")
    }

}