package com.example.asyncdemo

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.asyncdemo.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun buttonClick(view: View) {

        val task = MyTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR)
        val cpu_cores = Runtime.getRuntime().availableProcessors()
    }

    private inner class MyTask : AsyncTask<String, Int, String>() {

        override fun onPreExecute() {
            super.onPreExecute()
        }

        override fun doInBackground(vararg params: String?): String {
            var i = 0
            while (i <= 20) {
                try {
                    Thread.sleep(1000)
                    publishProgress(i)
                    i++
                } catch (e: Exception) {
                    return (e.localizedMessage)
                }
            }
            return "Button Pressed"
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            val counter = values.get(0)
            binding.tvHelloWorld.text = "Counter = $counter"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            binding.tvHelloWorld.text = result
        }
    }
}

