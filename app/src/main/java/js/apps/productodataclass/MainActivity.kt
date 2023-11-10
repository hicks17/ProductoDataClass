package js.apps.productodataclass

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import js.apps.productodataclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var producto: Producto
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.crearProducto.setOnClickListener { validar() }

    }

    private fun validar() {
        if (!binding.etNombre.text.isNullOrEmpty() && !binding.etDesc.text.isNullOrEmpty()
            && !binding.etId.text.isNullOrEmpty()
        ) {
            producto = Producto(
                nombre = binding.etNombre.text.toString(),
                id = binding.etId.text.toString(),
                desc = binding.etDesc.text.toString(),
                precio = binding.etPrecio.text.toString().toInt()
            )


            mostrarDatos()
        } else {
            Toast.makeText(this, "rellena todos los campos", Toast.LENGTH_SHORT).show()
        }
    }




    private fun mostrarDatos() {
        val intent = Intent(this, MostrarDatos::class.java)
        Log.w(ContentValues.TAG, producto.toString())
        intent.putExtra("producto", producto)
        startActivity(intent)
    }
}