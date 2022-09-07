package com.melih.bottomnavigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.melih.bottomnavigationkullanimi.databinding.FragmentBirinciBinding
import com.melih.bottomnavigationkullanimi.databinding.FragmentIkincifragmentBinding


class Ikincifragment : Fragment() {

    private var _binding: FragmentIkincifragmentBinding? = null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIkincifragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            val bundle:IkincifragmentArgs by navArgs()
            val gelenad = bundle.name
            binding.textViewname.text = gelenad

    }


}