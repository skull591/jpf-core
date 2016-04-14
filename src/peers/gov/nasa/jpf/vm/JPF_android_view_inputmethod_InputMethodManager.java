package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_inputmethod_InputMethodManager extends NativePeer{
	  @MJI
	  public static int getInstance__Landroid_os_Looper_2__Landroid_view_inputmethod_InputMethodManager_2 (MJIEnv env, int clsObjRef, int rLooper0) {
	    int rInputMethodManager = MJIEnv.NULL;
	    return rInputMethodManager;
	  }
	  @MJI
	  public static int getInstance__Landroid_content_Context_2__Landroid_view_inputmethod_InputMethodManager_2 (MJIEnv env, int clsObjRef, int rContext0) {
	    int rInputMethodManager = MJIEnv.NULL;
	    return rInputMethodManager;
	  }
	  @MJI
	  public static int peekInstance____Landroid_view_inputmethod_InputMethodManager_2 (MJIEnv env, int clsObjRef) {
	    int rInputMethodManager = MJIEnv.NULL;
	    return rInputMethodManager;
	  }
	  @MJI
	  public static int getClient____Lcom_android_internal_view_IInputMethodClient_2 (MJIEnv env, int objRef) {
	    int rIInputMethodClient = MJIEnv.NULL;
	    return rIInputMethodClient;
	  }
	  @MJI
	  public static int getInputContext____Lcom_android_internal_view_IInputContext_2 (MJIEnv env, int objRef) {
	    int rIInputContext = MJIEnv.NULL;
	    return rIInputContext;
	  }
	  @MJI
	  public static int getInputMethodList____Ljava_util_List_2 (MJIEnv env, int objRef) {
	    int rList = MJIEnv.NULL;
	    return rList;
	  }
	  @MJI
	  public static int getEnabledInputMethodList____Ljava_util_List_2 (MJIEnv env, int objRef) {
	    int rList = MJIEnv.NULL;
	    return rList;
	  }
	  @MJI
	  public static void showStatusIcon__Landroid_os_IBinder_2Ljava_lang_String_2I__V (MJIEnv env, int objRef, int rIBinder0, int rString1, int v2) {
	  }
	  @MJI
	  public static void hideStatusIcon__Landroid_os_IBinder_2__V (MJIEnv env, int objRef, int rIBinder0) {
	  }
	  @MJI
	  public static void setFullscreenMode__Z__V (MJIEnv env, int objRef, boolean v0) {
	  }
	  @MJI
	  public static boolean isFullscreenMode____Z (MJIEnv env, int objRef) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean isActive____Z (MJIEnv env, int objRef) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean isActive__Landroid_view_View_2__Z (MJIEnv env, int objRef, int rView0) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean isAcceptingText____Z (MJIEnv env, int objRef) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static void clearBindingLocked____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void clearConnectionLocked____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void finishInputLocked____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void reportFinishInputConnection__Landroid_view_inputmethod_InputConnection_2__V (MJIEnv env, int objRef, int rInputConnection0) {
	  }
	  @MJI
	  public static void displayCompletions__Landroid_view_View_2_3Landroid_view_inputmethod_CompletionInfo_2__V (MJIEnv env, int objRef, int rView0, int rCompletionInfo1) {
	  }
	  @MJI
	  public static void updateExtractedText__Landroid_view_View_2ILandroid_view_inputmethod_ExtractedText_2__V (MJIEnv env, int objRef, int rView0, int v1, int rExtractedText2) {
	  }
	  @MJI
	  public static boolean showSoftInput__Landroid_view_View_2I__Z (MJIEnv env, int objRef, int rView0, int v1) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean showSoftInput__Landroid_view_View_2ILandroid_os_ResultReceiver_2__Z (MJIEnv env, int objRef, int rView0, int v1, int rResultReceiver2) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static void showSoftInputUnchecked__ILandroid_os_ResultReceiver_2__V (MJIEnv env, int objRef, int v0, int rResultReceiver1) {
	  }
	  @MJI
	  public static boolean hideSoftInputFromWindow__Landroid_os_IBinder_2I__Z (MJIEnv env, int objRef, int rIBinder0, int v1) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean hideSoftInputFromWindow__Landroid_os_IBinder_2ILandroid_os_ResultReceiver_2__Z (MJIEnv env, int objRef, int rIBinder0, int v1, int rResultReceiver2) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static void toggleSoftInputFromWindow__Landroid_os_IBinder_2II__V (MJIEnv env, int objRef, int rIBinder0, int v1, int v2) {
	  }
	  @MJI
	  public static void toggleSoftInput__II__V (MJIEnv env, int objRef, int v0, int v1) {
	  }
	  @MJI
	  public static void restartInput__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
	  }
	  @MJI
	  public static void startInputInner____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void windowDismissed__Landroid_os_IBinder_2__V (MJIEnv env, int objRef, int rIBinder0) {
	  }
	  @MJI
	  public static void focusIn__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
	  }
	  @MJI
	  public static void focusInLocked__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
	  }
	  @MJI
	  public static void focusOut__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
	  }
	  @MJI
	  public static void scheduleCheckFocusLocked__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
	  }
	  @MJI
	  public static void checkFocus____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void closeCurrentInput____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void onWindowFocus__Landroid_view_View_2Landroid_view_View_2IZI__V (MJIEnv env, int objRef, int rView0, int rView1, int v2, boolean v3, int v4) {
	  }
	  @MJI
	  public static void startGettingWindowFocus__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
	  }
	  @MJI
	  public static void updateSelection__Landroid_view_View_2IIII__V (MJIEnv env, int objRef, int rView0, int v1, int v2, int v3, int v4) {
	  }
	  @MJI
	  public static boolean isWatchingCursor__Landroid_view_View_2__Z (MJIEnv env, int objRef, int rView0) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static void updateCursor__Landroid_view_View_2IIII__V (MJIEnv env, int objRef, int rView0, int v1, int v2, int v3, int v4) {
	  }
	  @MJI
	  public static void sendAppPrivateCommand__Landroid_view_View_2Ljava_lang_String_2Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rView0, int rString1, int rBundle2) {
	  }
	  @MJI
	  public static void setInputMethod__Landroid_os_IBinder_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rIBinder0, int rString1) {
	  }
	  @MJI
	  public static void hideSoftInputFromInputMethod__Landroid_os_IBinder_2I__V (MJIEnv env, int objRef, int rIBinder0, int v1) {
	  }
	  @MJI
	  public static void showSoftInputFromInputMethod__Landroid_os_IBinder_2I__V (MJIEnv env, int objRef, int rIBinder0, int v1) {
	  }
	  @MJI
	  public static void dispatchKeyEvent__Landroid_content_Context_2ILandroid_view_KeyEvent_2Lcom_android_internal_view_IInputMethodCallback_2__V (MJIEnv env, int objRef, int rContext0, int v1, int rKeyEvent2, int rIInputMethodCallback3) {
	  }
	  @MJI
	  public static void dispatchTrackballEvent__Landroid_content_Context_2ILandroid_view_MotionEvent_2Lcom_android_internal_view_IInputMethodCallback_2__V (MJIEnv env, int objRef, int rContext0, int v1, int rMotionEvent2, int rIInputMethodCallback3) {
	  }
	  @MJI
	  public static void showInputMethodPicker____V (MJIEnv env, int objRef) {
	  }
	  @MJI
	  public static void doDump__Ljava_io_FileDescriptor_2Ljava_io_PrintWriter_2_3Ljava_lang_String_2__V (MJIEnv env, int objRef, int rFileDescriptor0, int rPrintWriter1, int rString2) {
	  }
	}
