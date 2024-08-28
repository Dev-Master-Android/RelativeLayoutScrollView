package com.example.relativelayoutscrollview


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loadButton: Button
    private lateinit var outputTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadButton = findViewById(R.id.loadButton)
        outputTextView = findViewById(R.id.outputTextView)

        loadButton.setOnClickListener {
            val bookText = Database.text
            val wordList = loadBook(bookText)
            outputTextView.text = wordList.joinToString(" ")
        }
    }

    private fun loadBook(text: String): List<String> {
        return text.split("\\s+".toRegex())
    }
}
