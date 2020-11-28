package com.platzi.conf.view.ui.fragments


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment

import com.platzi.conf.R
import com.platzi.conf.model.Speaker
import kotlinx.android.synthetic.main.fragment_speakers_detail_dialog.*

class SpeakersDetailDialogFragment : DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_speakers_detail_dialog, container, false)
        setStyle(STYLE_NORMAL, R.style.FullScreenDialogStyle)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.onViewCreated(view, savedInstanceState)
        tolbar.navigationIcon = ContextCompat.getDrawable(view.context, R.drawable.ic_close)
        tolbar.setTitleTextColor(Color.WHITE)
        tolbar.setNavigationOnClickListener{
            dismiss()
        }

        val speaker = arguments?.getSerializable("speaker") as Speaker

        tolbar.title = speaker.name
        tvDetailSpeakerNme.text = speaker.name
        tvDetailSpeakJobTitle.text = speaker.jobtitle
        tvDetailSpeakerBiography.text = speaker.biography
        tvDetailWorkPlace.text = speaker.workplace
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    }
}
