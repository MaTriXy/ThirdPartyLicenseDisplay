package org.ligi.thirdpartylicensedisplay.lib.ui


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.ligi.thirdpartylicensedisplay.lib.R
import  org.ligi.thirdpartylicensedisplay.lib.model.LicenseInfoEntry

class LicenseInfoAdapter(val list: List<LicenseInfoEntry>, val data: String) : RecyclerView.Adapter<LicenceInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            LicenceInfoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_license_entry, parent, false))

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: LicenceInfoViewHolder, position: Int) {
        holder.bind(list[position], data)
    }
}