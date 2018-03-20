package br.com.ocimara.fakezap

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by logonrm on 19/03/2018.
 */

class ViewPagerAdapter(fragmentManager: FragmentManager)
    : FragmentPagerAdapter(fragmentManager) {

    val meusFragments = ArrayList<Fragment>()


    override fun getItem(position: Int): Fragment {
        return meusFragments[position]
        //ou também posso fazer assim
        //return meusFragments.get(position)
    }

    override fun getCount(): Int {
        return meusFragments.size

    }

    fun adicionar(fragment: Fragment){
        meusFragments.add(fragment)

    }


}