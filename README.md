## MainActivity

```
public Helper helper;
```


### onCreateView
```
//------------ Google Ads -----------
helper = new Helper(getActivity());
//------------ Google Ads -----------
```

### setOnClickListener
```
helper.showInterstitialAd();

// Counter 
helper.showCounterInterstitialAd(2);	
```
