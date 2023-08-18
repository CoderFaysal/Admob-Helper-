package com.coderfaysal.funnyvideos.Ads;


import android.content.Context;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Admob {


    public static void setBanner(LinearLayout banner, Context context){

        if (AdsUnit.isAds){

            MobileAds.initialize(context, initializationStatus -> {
            });
            AdView adView = new AdView(context);
            banner.addView(adView);
            adView.setAdUnitId(AdsUnit.BANNER);
            adView.setAdSize(AdSize.BANNER);
            AdRequest adRequest = new AdRequest.Builder().build();
            adView.loadAd(adRequest);

        }
    }



}
