package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptFragment : Fragment() {

	private lateinit var encryptedMessage: TextView

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_encrypt, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		initViews(view)

		val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
		encryptedMessage.text = message
	}

	private fun initViews(view: View) {
		encryptedMessage = view.findViewById(R.id.encrypted_message)
	}
}