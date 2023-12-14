package com.dicoding.storyapp.ui.maps

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.storyapp.data.StoryRepository
import com.dicoding.storyapp.model.Story

class MapViewModel(private val storyRepository: StoryRepository) : ViewModel() {
    fun getStories() = storyRepository.getStories()

    val location : LiveData<List<Story>> = storyRepository.listStoryWithLocation
}