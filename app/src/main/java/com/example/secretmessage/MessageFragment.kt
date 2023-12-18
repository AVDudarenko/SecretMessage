package com.example.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class MessageFragment : Fragment() {

	private lateinit var btnNext: Button
	private lateinit var etSecretMessage: EditText

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_message, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		initViews(view)
		btnNext.setOnClickListener {
			val message = etSecretMessage.text.toString().reversed()
			val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
			view.findNavController().navigate(action)
		}
	}

	private fun initViews(view: View) {
		btnNext = view.findViewById(R.id.btnNext)
		etSecretMessage = view.findViewById(R.id.etSecretMessage)
	}
}