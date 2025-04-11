package com.example.coffeegeysha.ui.coffee_bag_form

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.coffeegeysha.databinding.FragmentCoffeeBagFormBinding

class CoffeeBagFormFragment : Fragment() {

    private var _binding: FragmentCoffeeBagFormBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val coffeeBagFormViewModel =
            ViewModelProvider(this)[CoffeeBagFormViewModel::class.java]

        _binding = FragmentCoffeeBagFormBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCoffeeListTitle
        coffeeBagFormViewModel.text.observe(viewLifecycleOwner) {
            textView.text = textView.text
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}