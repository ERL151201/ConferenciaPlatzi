package com.platzi.conf.view.adapter

import com.platzi.conf.model.Conferences


interface ScheduleListener {
      fun onConferenceClicked(conference: Conferences, position: Int)
}