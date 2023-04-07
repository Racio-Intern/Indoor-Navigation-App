package com.example.indoornavigationapp.repository

import com.example.indoornavigationapp.model.Tag
import java.util.concurrent.ConcurrentHashMap

class MemoryTagRepository: TagRepository{

    private val store = ConcurrentHashMap<Int, Tag>()

    override fun findTagById(id: Int) :Tag?{
        return store[id]
    }
}