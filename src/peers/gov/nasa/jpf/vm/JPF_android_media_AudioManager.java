package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_media_AudioManager extends NativePeer{
	  @MJI
  public static void $clinit (MJIEnv env, int clsObjRef) {
  }
	  @MJI
  public static int access$100__Landroid_media_AudioManager_2Ljava_lang_String_2__Landroid_media_AudioManager$OnAudioFocusChangeListener_2 (MJIEnv env, int clsObjRef, int rAudioManager0, int rString1) {
    int rAudioManager$OnAudioFocusChangeListener = MJIEnv.NULL;
    return rAudioManager$OnAudioFocusChangeListener;
  }
	  @MJI
  public static int access$000__Landroid_media_AudioManager_2__Ljava_lang_Object_2 (MJIEnv env, int clsObjRef, int rAudioManager0) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
	  @MJI
  public static int access$200__Landroid_media_AudioManager_2__Landroid_media_AudioManager$FocusEventHandlerDelegate_2 (MJIEnv env, int clsObjRef, int rAudioManager0) {
    int rAudioManager$FocusEventHandlerDelegate = MJIEnv.NULL;
    return rAudioManager$FocusEventHandlerDelegate;
  }
	  @MJI
  public static int getParameters__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getService____Landroid_media_IAudioService_2 (MJIEnv env, int clsObjRef) {
    int rIAudioService = MJIEnv.NULL;
    return rIAudioService;
  }
	  @MJI
  public static void adjustStreamVolume__III__V (MJIEnv env, int objRef, int v0, int v1, int v2) {
  }
	  @MJI
  public static void adjustVolume__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static void adjustSuggestedStreamVolume__III__V (MJIEnv env, int objRef, int v0, int v1, int v2) {
  }
	  @MJI
  public static int getRingerMode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getStreamMaxVolume__I__I (MJIEnv env, int objRef, int v0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getStreamVolume__I__I (MJIEnv env, int objRef, int v0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setRingerMode__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void setStreamVolume__III__V (MJIEnv env, int objRef, int v0, int v1, int v2) {
  }
	  @MJI
  public static void setStreamSolo__IZ__V (MJIEnv env, int objRef, int v0, boolean v1) {
  }
	  @MJI
  public static void setStreamMute__IZ__V (MJIEnv env, int objRef, int v0, boolean v1) {
  }
	  @MJI
  public static boolean shouldVibrate__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int getVibrateSetting__I__I (MJIEnv env, int objRef, int v0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setVibrateSetting__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static void setSpeakerphoneOn__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isSpeakerphoneOn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean isBluetoothScoAvailableOffCall____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void startBluetoothSco____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void stopBluetoothSco____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void setBluetoothScoOn__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isBluetoothScoOn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setBluetoothA2dpOn__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isBluetoothA2dpOn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setWiredHeadsetOn__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isWiredHeadsetOn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setMicrophoneMute__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isMicrophoneMute____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setMode__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getMode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setRouting__III__V (MJIEnv env, int objRef, int v0, int v1, int v2) {
  }
	  @MJI
  public static int getRouting__I__I (MJIEnv env, int objRef, int v0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static boolean isMusicActive____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setParameter__Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0, int rString1) {
  }
	  @MJI
  public static void setParameters__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static void playSoundEffect__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void playSoundEffect__IF__V (MJIEnv env, int objRef, int v0, float v1) {
  }
	  @MJI
  public static boolean querySoundEffectsEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void loadSoundEffects____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void unloadSoundEffects____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int findFocusListener__Ljava_lang_String_2__Landroid_media_AudioManager$OnAudioFocusChangeListener_2 (MJIEnv env, int objRef, int rString0) {
    int rAudioManager$OnAudioFocusChangeListener = MJIEnv.NULL;
    return rAudioManager$OnAudioFocusChangeListener;
  }
	  @MJI
  public static int getIdForAudioFocusListener__Landroid_media_AudioManager$OnAudioFocusChangeListener_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rAudioManager$OnAudioFocusChangeListener0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static void registerAudioFocusListener__Landroid_media_AudioManager$OnAudioFocusChangeListener_2__V (MJIEnv env, int objRef, int rAudioManager$OnAudioFocusChangeListener0) {
  }
	  @MJI
  public static void unregisterAudioFocusListener__Landroid_media_AudioManager$OnAudioFocusChangeListener_2__V (MJIEnv env, int objRef, int rAudioManager$OnAudioFocusChangeListener0) {
  }
	  @MJI
  public static int requestAudioFocus__Landroid_media_AudioManager$OnAudioFocusChangeListener_2II__I (MJIEnv env, int objRef, int rAudioManager$OnAudioFocusChangeListener0, int v1, int v2) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int abandonAudioFocus__Landroid_media_AudioManager$OnAudioFocusChangeListener_2__I (MJIEnv env, int objRef, int rAudioManager$OnAudioFocusChangeListener0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void registerMediaButtonEventReceiver__Landroid_content_ComponentName_2__V (MJIEnv env, int objRef, int rComponentName0) {
  }
	  @MJI
  public static void unregisterMediaButtonEventReceiver__Landroid_content_ComponentName_2__V (MJIEnv env, int objRef, int rComponentName0) {
  }
	  @MJI
  public static void reloadAudioSettings____V (MJIEnv env, int objRef) {
  }
}  
