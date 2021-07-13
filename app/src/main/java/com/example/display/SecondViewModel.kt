package com.example.display

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.example.network.Repository
import com.example.display.model.SecondRequest
import kotlinx.coroutines.flow.collect

class SecondViewModel(private val repository: Repository) : ViewModel() {

    private val _repos = MutableLiveData<SecondRequest>()

    val repos = _repos.switchMap {
        liveData {
            repository.getMerges(it).collect {
                emit(it)
            }
        }
    }

    fun fetchRepos(secondRequest : SecondRequest) {
        _repos.postValue(secondRequest)
    }


}