package com.example.myapplication.ui.climas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentGalleryBinding
import com.example.myapplication.ui.gallery.GalleryViewModel

class ClimasFragment  : Fragment() {
    private lateinit var climasViewModel: ClimasViewModel
    private var _binding: FragmentGalleryBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_climas, container, false)
    }

}


