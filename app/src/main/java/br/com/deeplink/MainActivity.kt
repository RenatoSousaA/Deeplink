package br.com.deeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uri = intent.data
        if(uri != null) {
            val endPoint = uri.getQueryParameter("endPoint")

            if(endPoint == "cadastro") {
                tvProductId.text = "VAMOS CADASTRAR O SEU NOME"
            } else if (endPoint == "alteracao") {
                tvProductId.text = "VAMOS ALTERAR O SEU NOME"
            } else {
                tvProductId.text = "VAMOS EXCLUIR O SEU NOME"
            }
        }
    }
}
