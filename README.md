# Android Counter With Activity Life cycle
An Android app project to test life cycle event. 

####                                                                                                     By Manoj Kumar
## Introduction 
An Android app project to test life cycle event. Defines global counter which gets incremented on pause event while navigating to different activities. 


## How to Run
1.	Prerequisite: Android Studio, some Java knowledge
2.	Download or clone project code and open in Android studio.
3.	Run in Nexus 5X API 26 emulator.


## Technologies Used
1.	Java.
2.	Android Studio


## Application Screenshots
#### Activity nevigation increses counter on Pause event.
<img src="images/Android Emulator - Nexus_5X_API_265554 2018-02-18 18-58-19.png">


#### Broadcast message is received in TestReceiver class.
<img src="images/Android Emulator - Nexus_5X_API_265554 2018-02-18 18-58-37.png">

## Code - Counter is maintained in Base application class by extending Application
```
 public class BaseApplicationClass extends android.app.Application {
    private int counterVar;

    public int getCounterVar() {
        return counterVar;
    }

    public void setIncrementCounterVar() {
        this.counterVar = this.counterVar + 1;
    }
}

 @Override
    protected void onResume() {
        super.onResume();
        int s = ((BaseApplicationClass) getApplication()).getCounterVar();
        tvTotal.setText("Thread Counter: "+s);
    }


    @Override
    protected void onPause() {
        super.onPause();
        // set counter increment
        ((BaseApplicationClass) getApplication()).setIncrementCounterVar();
    }
   ``` 
  
  ## AndroidManifest
```
  <application
        android:name=".BaseApplicationClass"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivityA" android:launchMode="singleTask">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".ActivityB" />

        <activity android:name=".DialogActivity">
        </activity>
    </application>
```
## Refrence
- SJSU.edu

## Thank You
#### [*Manoj Kumar*](https://www.linkedin.com/in/manojkumar19/)
#### Solutions Architect
