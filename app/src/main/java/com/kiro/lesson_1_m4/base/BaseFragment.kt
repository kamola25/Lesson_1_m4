package com.kiro.lesson_1_m4.base
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
typealias Inflate<T> = (LayoutInflater,ViewGroup?,Boolean)->T
abstract class BaseFragment<Binding: ViewBinding>(private val inflate: Inflate<Binding>) :Fragment(){
    //Generic - это обобщение, даем неявный тип данных
    private var _binding:Binding?=null
    protected val binding:Binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    //bundle - тут отвечает за сохранность, и запоминание
    ): View? {
        _binding = inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupObverse()
    }
    abstract fun setupUI()
    open fun setupObverse(){

    }
}