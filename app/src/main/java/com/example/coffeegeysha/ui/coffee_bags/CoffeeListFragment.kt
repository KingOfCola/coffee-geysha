package com.example.coffeegeysha.ui.coffee_bags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.coffeegeysha.databinding.FragmentCoffeeListBinding
import com.example.coffeegeysha.datasources.CoffeeSource

class CoffeeListFragment : Fragment() {

    private var _binding: FragmentCoffeeListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[CoffeeListViewModel::class.java]

        _binding = FragmentCoffeeListBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCoffeeListTitle
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // Gets the coffee list
        val coffeeList = CoffeeSource(this.requireContext()).getCoffeeList()

        val coffeeItems = binding.coffeeItemList
        coffeeItems.adapter = CoffeeItemAdapter(coffeeList)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}