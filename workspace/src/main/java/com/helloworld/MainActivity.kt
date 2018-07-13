package com.helloworld

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView

class MainActivity : Activity(), AdapterView.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onItemClick(container: AdapterView<*>, view: View, position: Int, id: Long) {
    }
}
