package com.example.emulador_20230621_emely.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.emulador_20230621_emely.R
import com.example.emulador_20230621_emely.databinding.FragmentNotificationsBinding

class DashboardFragment : Fragment() {

private var _binding: FragmentNotificationsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

    _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val imprimir = root.findViewById<Button>(R.id.btnimprimir)
    val textView = root.findViewById<TextView>(R.id.textView)

    imprimir.setOnClickListener{
        textView.setText("Emely Mariana Benitez Lovo")
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}