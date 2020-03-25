package tantowi.hitungumuroke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {

            val tahunLahir = etInputUmur.text.toString()
            val tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            var umur = 0
            if (tahunLahir.toIntOrNull() !=null){
                umur = tahun - tahunLahir.toInt()
                tvUmur.text = "Umur = $umur tahun"
            } else {
                tvUmur.text = "Tahun Tidak Valid"
            }

        }
    }
}
