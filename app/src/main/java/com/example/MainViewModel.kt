package com.example

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import kotlinx.coroutines.flow.collect

class MainViewModel(private val repository: Repository) : ViewModel() {

    private val _repos = MutableLiveData<Unit>()

    val repos = _repos.switchMap {
        liveData {
            repository.getRepos().collect {
                emit(it)
            }
        }
    }

    fun fetchRepos() {
        _repos.postValue(Unit)
    }

}