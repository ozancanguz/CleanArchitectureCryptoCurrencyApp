package com.ozancanguz.mvmmcurrenciesforusd.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ozancanguz.mvmmcurrenciesforusd.data.Repository
import com.ozancanguz.mvmmcurrenciesforusd.model.Rates
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RatesViewModel @Inject constructor(private val repository: Repository,

                                         application: Application):AndroidViewModel(application)

{
               var ratesList=MutableLiveData<List<Rates>>()
               var job: Job?=null

          private fun requestAllData(){
              job= CoroutineScope(Dispatchers.IO).launch {
                  val response=repository.remote.getAllRates()
                  if(response.isSuccessful){
                      ratesList.postValue(response.body())
                  }else{
                      Log.d("veri" ,"veri cekilemedi")
                  }

              }




          }








                                         }



