package com.melih.bottomnavigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.melih.bottomnavigationkullanimi.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {

    private var _binding:FragmentBirinciBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBirinciBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val name = binding.editTextName.text.toString()

            val gecis =BirinciFragmentDirections.ikincifragmentgecis(name)

            Navigation.findNavController(it).navigate(gecis)
        }

    }
}