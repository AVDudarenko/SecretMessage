package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

	private lateinit var btnStart: Button

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_welcome, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		initViews(view)
		btnStart.setOnClickListener {
			view.findNavController().navigate(R.id.action_welcomeFragment_to_messageFragment)
		}
	}

	private fun initViews(view: View) {
		btnStart = view.findViewById(R.id.btnStart)
	}

}