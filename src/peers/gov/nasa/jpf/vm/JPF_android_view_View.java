package gov.nasa.jpf.vm;

import java.lang.reflect.Method;
import java.util.ArrayList;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_View extends NativePeer{
	@MJI
	public static void $clinit____V (MJIEnv env, int clsObjRef){
		
	}
	@MJI
	public static void $init____V(MJIEnv env, int objref){
		System.out.println("constructing view");
		
	}
	@MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int contextRef){
//		System.out.println("@View constructor 1");
	}
	@MJI
	public static void $init__Landroid_content_Context_2Landroid_util_AttributeSet_2__V(MJIEnv env, int objRef, int contextRef, int attriRef){
//		System.out.println("@View constructor 2");
	}
	@MJI
	public static void $init__Landroid_content_Context_2Landroid_util_AttributeSet_2I__V(MJIEnv env, int objRef, int contextRef, int attriRef, int defStyle){
//		System.out.println("@View constructor 3");
	}	
	@MJI
  public static int getParent____Landroid_view_ViewParent_2 (MJIEnv env, int objRef) {
    int rViewParent = MJIEnv.NULL;
    return rViewParent;
  }
	@MJI
  public static int getResources____Landroid_content_res_Resources_2 (MJIEnv env, int objRef) {
    int rResources = MJIEnv.NULL;
    return rResources;
  }
	@MJI
  public static int getContext____Landroid_content_Context_2 (MJIEnv env, int objRef) {
    int rContext = env.newObject("android.content.Context");
    return rContext;
  }
	@MJI
  public static int getId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static boolean isOpaque____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int getHandler____Landroid_os_Handler_2 (MJIEnv env, int objRef) {
    int rHandler = MJIEnv.NULL;
    return rHandler;
  }
	@MJI
  public static int inflate__Landroid_content_Context_2ILandroid_view_ViewGroup_2__Landroid_view_View_2 (MJIEnv env, int clsObjRef, int rContext0, int v1, int rViewGroup2) {
    int rView = env.newObject("android.view.View");
    return rView;
  }
	@MJI
  public static void initializeFadingEdge__Landroid_content_res_TypedArray_2__V (MJIEnv env, int objRef, int rTypedArray0) {
  }
	@MJI
  public static int getVerticalFadingEdgeLength____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static void setFadingEdgeLength__I__V (MJIEnv env, int objRef, int v0) {
  }
	@MJI
  public static int getHorizontalFadingEdgeLength____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static int getVerticalScrollbarWidth____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static int getHorizontalScrollbarHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static void initializeScrollbars__Landroid_content_res_TypedArray_2__V (MJIEnv env, int objRef, int rTypedArray0) {
  }
	@MJI
  public static void setOnFocusChangeListener__Landroid_view_View$OnFocusChangeListener_2__V (MJIEnv env, int objRef, int rView$OnFocusChangeListener0) {
  }
	@MJI
  public static int getOnFocusChangeListener____Landroid_view_View$OnFocusChangeListener_2 (MJIEnv env, int objRef) {
    int rView$OnFocusChangeListener = MJIEnv.NULL;
    return rView$OnFocusChangeListener;
  }
//	@MJI
 // public static void setOnClickListener__Landroid_view_View$OnClickListener_2__V (MJIEnv env, int objRef, int rView$OnClickListener0) {
//	  env.getHeap().get(objRef).setReferenceField("mOnClickListener", rView$OnClickListener0);
 // }
//	@MJI
 // public static void setOnLongClickListener__Landroid_view_View$OnLongClickListener_2__V (MJIEnv env, int objRef, int rView$OnLongClickListener0) {
  //}
	@MJI
  public static void setOnCreateContextMenuListener__Landroid_view_View$OnCreateContextMenuListener_2__V (MJIEnv env, int objRef, int rView$OnCreateContextMenuListener0) {
  }
//	@MJI
//  public static boolean performClick____Z (MJIEnv env, int objRef) {
  //  boolean v = false;
   // return v;
  //}

//  public static boolean performLongClick____Z (MJIEnv env, int objRef) {
  //  boolean v = false;
   // return v;
  //}
  @MJI
  public static boolean showContextMenu____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setOnKeyListener__Landroid_view_View$OnKeyListener_2__V (MJIEnv env, int objRef, int rView$OnKeyListener0) {
  }
 // @MJI
  //public static void setOnTouchListener__Landroid_view_View$OnTouchListener_2__V (MJIEnv env, int objRef, int rView$OnTouchListener0) {
  //}
  @MJI
  public static boolean requestRectangleOnScreen__Landroid_graphics_Rect_2Z__Z (MJIEnv env, int objRef, int rRect0, boolean v1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean requestRectangleOnScreen__Landroid_graphics_Rect_2__Z (MJIEnv env, int objRef, int rRect0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void clearFocus____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean hasFocus____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean hasFocusable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void onFocusChanged__ZILandroid_graphics_Rect_2__V (MJIEnv env, int objRef, boolean v0, int v1, int rRect2) {
  }
  @MJI
  public static void sendAccessibilityEvent__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void sendAccessibilityEventUnchecked__Landroid_view_accessibility_AccessibilityEvent_2__V (MJIEnv env, int objRef, int rAccessibilityEvent0) {
  }
  @MJI
  public static boolean dispatchPopulateAccessibilityEvent__Landroid_view_accessibility_AccessibilityEvent_2__Z (MJIEnv env, int objRef, int rAccessibilityEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getContentDescription____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
  @MJI
  public static void setContentDescription__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
  }
  @MJI
  public static boolean isFocused____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int findFocus____Landroid_view_View_2 (MJIEnv env, int objRef) {
    int rView = MJIEnv.NULL;
    return rView;
  }
  @MJI
  public static void setScrollContainer__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static int getDrawingCacheQuality____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setDrawingCacheQuality__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static boolean getKeepScreenOn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setKeepScreenOn__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static int getNextFocusLeftId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setNextFocusLeftId__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getNextFocusRightId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setNextFocusRightId__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getNextFocusUpId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setNextFocusUpId__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getNextFocusDownId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setNextFocusDownId__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static boolean isShown____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean fitSystemWindows__Landroid_graphics_Rect_2__Z (MJIEnv env, int objRef, int rRect0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getVisibility____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setVisibility__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static boolean isEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setFocusable__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setFocusableInTouchMode__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setSoundEffectsEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isSoundEffectsEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setHapticFeedbackEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isHapticFeedbackEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setWillNotDraw__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean willNotDraw____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setWillNotCacheDrawing__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean willNotCacheDrawing____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean isClickable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  //@MJI
//  public static void setClickable__Z__V (MJIEnv env, int objRef, boolean v0) {
 // }

 // public static boolean isLongClickable____Z (MJIEnv env, int objRef) {
 //   boolean v = false;
 //   return v;
 // }
 // @MJI
  //public static void setLongClickable__Z__V (MJIEnv env, int objRef, boolean v0) {
  //}
  @MJI
  public static void setPressed__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void dispatchSetPressed__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isPressed____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
 // @MJI
 // public static boolean isSaveEnabled____Z (MJIEnv env, int objRef) {
   // boolean v = false;
    //return v;
  //}
  //@MJI
  //public static void setSaveEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  //}
  //@MJI
  //public static boolean getFilterTouchesWhenObscured____Z (MJIEnv env, int objRef) {
   // boolean v = false;
    //return v;
  //}
  //@MJI
  //public static void setFilterTouchesWhenObscured__Z__V (MJIEnv env, int objRef, boolean v0) {
  //}
  //@MJI
  //public static boolean isFocusable____Z (MJIEnv env, int objRef) {
   // boolean v = false;
    //return v;
  //}
  //@MJI
  //public static boolean isFocusableInTouchMode____Z (MJIEnv env, int objRef) {
   // boolean v = false;
    //return v;
  //}
  @MJI
  public static int focusSearch__I__Landroid_view_View_2 (MJIEnv env, int objRef, int v0) {
    int rView = MJIEnv.NULL;
    return rView;
  }
  @MJI
  public static boolean dispatchUnhandledMove__Landroid_view_View_2I__Z (MJIEnv env, int objRef, int rView0, int v1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getFocusables__I__Ljava_util_ArrayList_2 (MJIEnv env, int objRef, int v0) {
    int rArrayList = MJIEnv.NULL;
    return rArrayList;
  }
  @MJI
  public static void addFocusables__Ljava_util_ArrayList_2II__V (MJIEnv env, int objRef, int rArrayList0, int v1, int v2) {
  }
  @MJI
  public static void addFocusables__Ljava_util_ArrayList_2I__V (MJIEnv env, int objRef, int rArrayList0, int v1) {
  }
  @MJI
  public static int getTouchables____Ljava_util_ArrayList_2 (MJIEnv env, int objRef) {
    int rArrayList = MJIEnv.NULL;
    return rArrayList;
  }
  @MJI
  public static void addTouchables__Ljava_util_ArrayList_2__V (MJIEnv env, int objRef, int rArrayList0) {
  }
  @MJI
  public static boolean requestFocus__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean requestFocus____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean requestFocus__ILandroid_graphics_Rect_2__Z (MJIEnv env, int objRef, int v0, int rRect1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean requestFocusFromTouch____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void onStartTemporaryDetach____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onFinishTemporaryDetach____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int getKeyDispatcherState____Landroid_view_KeyEvent$DispatcherState_2 (MJIEnv env, int objRef) {
    int rKeyEvent$DispatcherState = MJIEnv.NULL;
    return rKeyEvent$DispatcherState;
  }
  @MJI
  public static boolean dispatchKeyEventPreIme__Landroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int rKeyEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean dispatchKeyEvent__Landroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int rKeyEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean dispatchKeyShortcutEvent__Landroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int rKeyEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean dispatchTouchEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onFilterTouchEventForSecurity__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean dispatchTrackballEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void dispatchWindowFocusChanged__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void onWindowFocusChanged__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean hasWindowFocus____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void dispatchVisibilityChanged__Landroid_view_View_2I__V (MJIEnv env, int objRef, int rView0, int v1) {
  }
  @MJI
  public static void onVisibilityChanged__Landroid_view_View_2I__V (MJIEnv env, int objRef, int rView0, int v1) {
  }
  @MJI
  public static void dispatchDisplayHint__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void onDisplayHint__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void dispatchWindowVisibilityChanged__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void onWindowVisibilityChanged__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getWindowVisibility____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void getWindowVisibleDisplayFrame__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
  @MJI
  public static void dispatchConfigurationChanged__Landroid_content_res_Configuration_2__V (MJIEnv env, int objRef, int rConfiguration0) {
  }
  @MJI
  public static void onConfigurationChanged__Landroid_content_res_Configuration_2__V (MJIEnv env, int objRef, int rConfiguration0) {
  }
  @MJI
  public static boolean isInTouchMode____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyPreIme__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyDown__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyLongPress__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyUp__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyMultiple__IILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int v1, int rKeyEvent2) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyShortcut__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onCheckIsTextEditor____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int onCreateInputConnection__Landroid_view_inputmethod_EditorInfo_2__Landroid_view_inputmethod_InputConnection_2 (MJIEnv env, int objRef, int rEditorInfo0) {
    int rInputConnection = MJIEnv.NULL;
    return rInputConnection;
  }
  @MJI
  public static boolean checkInputConnectionProxy__Landroid_view_View_2__Z (MJIEnv env, int objRef, int rView0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void createContextMenu__Landroid_view_ContextMenu_2__V (MJIEnv env, int objRef, int rContextMenu0) {
  }
  @MJI
  public static int getContextMenuInfo____Landroid_view_ContextMenu$ContextMenuInfo_2 (MJIEnv env, int objRef) {
    int rContextMenu$ContextMenuInfo = MJIEnv.NULL;
    return rContextMenu$ContextMenuInfo;
  }
  @MJI
  public static void onCreateContextMenu__Landroid_view_ContextMenu_2__V (MJIEnv env, int objRef, int rContextMenu0) {
  }
  @MJI
  public static boolean onTrackballEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onTouchEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void cancelLongPress____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void setTouchDelegate__Landroid_view_TouchDelegate_2__V (MJIEnv env, int objRef, int rTouchDelegate0) {
  }
  @MJI
  public static int getTouchDelegate____Landroid_view_TouchDelegate_2 (MJIEnv env, int objRef) {
    int rTouchDelegate = MJIEnv.NULL;
    return rTouchDelegate;
  }
  @MJI
  public static void bringToFront____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onScrollChanged__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static void onSizeChanged__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static void dispatchDraw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
  @MJI
  public static int getScrollX____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getScrollY____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getWidth____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void getDrawingRect__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
  @MJI
  public static int getMeasuredWidth____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getMeasuredHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTop____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getBottom____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getLeft____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getRight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void getHitRect__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
  @MJI
  public static void getFocusedRect__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
  @MJI
  public static boolean getGlobalVisibleRect__Landroid_graphics_Rect_2__Z (MJIEnv env, int objRef, int rRect0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean getGlobalVisibleRect__Landroid_graphics_Rect_2Landroid_graphics_Point_2__Z (MJIEnv env, int objRef, int rRect0, int rPoint1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean getLocalVisibleRect__Landroid_graphics_Rect_2__Z (MJIEnv env, int objRef, int rRect0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void offsetTopAndBottom__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void offsetLeftAndRight__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getLayoutParams____Landroid_view_ViewGroup$LayoutParams_2 (MJIEnv env, int objRef) {
    int rViewGroup$LayoutParams = MJIEnv.NULL;
    return rViewGroup$LayoutParams;
  }
  @MJI
  public static void setLayoutParams__Landroid_view_ViewGroup$LayoutParams_2__V (MJIEnv env, int objRef, int rViewGroup$LayoutParams0) {
  }
  @MJI
  public static void scrollTo__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static void scrollBy__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static boolean awakenScrollBars____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean awakenScrollBars__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean awakenScrollBars__IZ__Z (MJIEnv env, int objRef, int v0, boolean v1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void invalidate__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static void invalidate__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
  @MJI
  public static void invalidate____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean post__Ljava_lang_Runnable_2__Z (MJIEnv env, int objRef, int rRunnable0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean postDelayed__Ljava_lang_Runnable_2J__Z (MJIEnv env, int objRef, int rRunnable0, long v1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean removeCallbacks__Ljava_lang_Runnable_2__Z (MJIEnv env, int objRef, int rRunnable0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void postInvalidate____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void postInvalidate__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static void postInvalidateDelayed__JIIII__V (MJIEnv env, int objRef, long v0, int v1, int v2, int v3, int v4) {
  }
  @MJI
  public static void postInvalidateDelayed__J__V (MJIEnv env, int objRef, long v0) {
  }
  @MJI
  public static void computeScroll____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean isHorizontalFadingEdgeEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setHorizontalFadingEdgeEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isVerticalFadingEdgeEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setVerticalFadingEdgeEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static float getTopFadingEdgeStrength____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
  @MJI
  public static float getBottomFadingEdgeStrength____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
  @MJI
  public static float getLeftFadingEdgeStrength____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
  @MJI
  public static float getRightFadingEdgeStrength____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
  @MJI
  public static boolean isHorizontalScrollBarEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setHorizontalScrollBarEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isVerticalScrollBarEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setVerticalScrollBarEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setScrollbarFadingEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isScrollbarFadingEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setScrollBarStyle__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getScrollBarStyle____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeHorizontalScrollRange____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeHorizontalScrollOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeHorizontalScrollExtent____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeVerticalScrollRange____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeVerticalScrollOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeVerticalScrollExtent____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void onDrawScrollBars__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
  @MJI
  public static void onDraw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
  @MJI
  public static void onAttachedToWindow____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onDetachedFromWindow____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int getWindowAttachCount____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getWindowToken____Landroid_os_IBinder_2 (MJIEnv env, int objRef) {
    int rIBinder = MJIEnv.NULL;
    return rIBinder;
  }
  @MJI
  public static int getApplicationWindowToken____Landroid_os_IBinder_2 (MJIEnv env, int objRef) {
    int rIBinder = MJIEnv.NULL;
    return rIBinder;
  }
  @MJI
  public static void saveHierarchyState__Landroid_util_SparseArray_2__V (MJIEnv env, int objRef, int rSparseArray0) {
  }
  @MJI
  public static void dispatchSaveInstanceState__Landroid_util_SparseArray_2__V (MJIEnv env, int objRef, int rSparseArray0) {
  }
  @MJI
  public static int onSaveInstanceState____Landroid_os_Parcelable_2 (MJIEnv env, int objRef) {
    int rParcelable = MJIEnv.NULL;
    return rParcelable;
  }
  @MJI
  public static void restoreHierarchyState__Landroid_util_SparseArray_2__V (MJIEnv env, int objRef, int rSparseArray0) {
  }
  @MJI
  public static void dispatchRestoreInstanceState__Landroid_util_SparseArray_2__V (MJIEnv env, int objRef, int rSparseArray0) {
  }
  @MJI
  public static void onRestoreInstanceState__Landroid_os_Parcelable_2__V (MJIEnv env, int objRef, int rParcelable0) {
  }
  @MJI
  public static long getDrawingTime____J (MJIEnv env, int objRef) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static void setDuplicateParentStateEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isDuplicateParentStateEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setDrawingCacheEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isDrawingCacheEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getDrawingCache____Landroid_graphics_Bitmap_2 (MJIEnv env, int objRef) {
    int rBitmap = MJIEnv.NULL;
    return rBitmap;
  }
  @MJI
  public static int getDrawingCache__Z__Landroid_graphics_Bitmap_2 (MJIEnv env, int objRef, boolean v0) {
    int rBitmap = MJIEnv.NULL;
    return rBitmap;
  }
  @MJI
  public static void destroyDrawingCache____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void setDrawingCacheBackgroundColor__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getDrawingCacheBackgroundColor____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void buildDrawingCache__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void buildDrawingCache____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean isInEditMode____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean isPaddingOffsetRequired____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getLeftPaddingOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getRightPaddingOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTopPaddingOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getBottomPaddingOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void draw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
  @MJI
  public static int getSolidColor____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static boolean isLayoutRequested____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void layout__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static void onLayout__ZIIII__V (MJIEnv env, int objRef, boolean v0, int v1, int v2, int v3, int v4) {
  }
  @MJI
  public static void onFinishInflate____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void invalidateDrawable__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
  }
  @MJI
  public static void scheduleDrawable__Landroid_graphics_drawable_Drawable_2Ljava_lang_Runnable_2J__V (MJIEnv env, int objRef, int rDrawable0, int rRunnable1, long v2) {
  }
  @MJI
  public static void unscheduleDrawable__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
  }
  @MJI
  public static void unscheduleDrawable__Landroid_graphics_drawable_Drawable_2Ljava_lang_Runnable_2__V (MJIEnv env, int objRef, int rDrawable0, int rRunnable1) {
  }
  @MJI
  public static boolean verifyDrawable__Landroid_graphics_drawable_Drawable_2__Z (MJIEnv env, int objRef, int rDrawable0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void drawableStateChanged____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void refreshDrawableState____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int getDrawableState_____3I (MJIEnv env, int objRef) {
    int rI = MJIEnv.NULL;
    return rI;
  }
  @MJI
  public static int onCreateDrawableState__I___3I (MJIEnv env, int objRef, int v0) {
    int rI = MJIEnv.NULL;
    return rI;
  }
  @MJI
  public static int mergeDrawableStates___3I_3I___3I (MJIEnv env, int clsObjRef, int rI0, int rI1) {
    int rI = MJIEnv.NULL;
    return rI;
  }
  @MJI
  public static void setBackgroundColor__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setBackgroundResource__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setBackgroundDrawable__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
  }
  @MJI
  public static int getBackground____Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
  @MJI
  public static void setPadding__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static int getPaddingTop____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getPaddingBottom____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getPaddingLeft____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getPaddingRight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setSelected__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void dispatchSetSelected__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean isSelected____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getViewTreeObserver____Landroid_view_ViewTreeObserver_2 (MJIEnv env, int objRef) {
    int rViewTreeObserver = MJIEnv.NULL;
    return rViewTreeObserver;
  }
  @MJI
  public static int getRootView____Landroid_view_View_2 (MJIEnv env, int objRef) {
    int rView = MJIEnv.NULL;
    return rView;
  }
  @MJI
  public static void getLocationOnScreen___3I__V (MJIEnv env, int objRef, int rI0) {
  }
  @MJI
  public static void getLocationInWindow___3I__V (MJIEnv env, int objRef, int rI0) {
  }
  
  /**
   * Here, we do exactly the same thing as we did in Activity. Here is for Fragment or so
   * @param env
   * @param objRef will not be used, referring view; will use fragRef
   * @param v0
   * @return
   */
  @MJI
  public static int findViewById__I__Landroid_view_View_2 (MJIEnv env, int objRef, int v0) {
	int viewRef=-1;
	Views.Tuple viewInfo=null;
	int fragRef=getLastFragment();
	for(Views.Tuple t : Views.createdView){
		if(t.objRef==fragRef && t.viewId==v0){
			viewRef=t.viewRef;
			viewInfo=t;
			break;
		}
	}
	ElementInfo obj;
	if(viewRef>0){
		obj=env.getHeap().get(viewRef);
		if(obj != null && obj.instanceOf(getTypeJPFForm(fragRef,v0))){
			return viewRef;
		}else{
			Views.createdView.remove(viewInfo);
		}	
	}
	String type=getType(fragRef,v0);
	viewRef=env.newObject(type);
	String text=getText(fragRef,v0);
	int strRef=env.newString(text);
	obj=env.heap.get(viewRef);
	if(text!=null && obj.instanceOf("Landroid/widget/TextView;")){
		JPF_android_widget_TextView.setText__Ljava_lang_CharSequence_2__V(env, viewRef, strRef);
	}
	Views.createdView.remove(viewInfo);
	Views.Tuple newViewInfo = new Views.Tuple();
	newViewInfo.objRef=fragRef;
	newViewInfo.viewId=v0;
	newViewInfo.viewRef=viewRef;
	Views.createdView.add(newViewInfo);
	setRef(viewRef,fragRef,v0);
    return viewRef;
  }
  
  public static int getLastFragment() {
	int objRef=-1;
	try {
		Class cls = Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
		Method m= cls.getMethod("getLastFragment", null);
		objRef=(int)m.invoke(null, null);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return objRef;
  }
  public static void setRef(int objRef, int fragmentRef, int id) {
	try {
		Class cls = Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
		Method m= cls.getMethod("setObjRef", int.class, int.class,int.class);
		m.invoke(null, objRef,fragmentRef,id);
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  public static String getTypeJPFForm(int fragmentRef, int id){
	  String type=null;
	  try {
		Class cls=Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
		Method m=cls.getMethod("getGUIElementType", int.class,int.class);
		type=(String)m.invoke(null, fragmentRef,id);
	  } catch (Exception e) {
		e.printStackTrace();
	  }
	  if (type==null) {
		return "Landroid/view/View;";
	  }else{
		  type=type.replace('.', '/');
		  type='L'+type;
		  type=type.concat(";");
		  return type;
	  }
  }
  public static String getType(int fragmentRef, int id){
	  String type=null;
	  try {
		Class cls=Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
		Method m=cls.getMethod("getGUIElementType", int.class,int.class);
		type=(String)m.invoke(null, fragmentRef,id);
	  } catch (Exception e) {
		e.printStackTrace();
	  }
	  if (type==null) {
		return "Landroid/view/View;";
	  }else{
		  return type;
	  }
  }
  public static String  getText(int fragmentRef, int id) {
	String text=null;
	try {
		Class cls =Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
		Method m=cls.getMethod("getUIElementText", int.class, int.class);
		text = (String) m.invoke(null, fragmentRef,id);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}
  @MJI
  public static int findViewWithTag__Ljava_lang_Object_2__Landroid_view_View_2 (MJIEnv env, int objRef, int rObject0) {
    int rView = MJIEnv.NULL;
    return rView;
  }
  @MJI
  public static void setId__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getTag__I__Ljava_lang_Object_2 (MJIEnv env, int objRef, int v0) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
  @MJI
  public static int getTag____Ljava_lang_Object_2 (MJIEnv env, int objRef) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
  @MJI
  public static void setTag__ILjava_lang_Object_2__V (MJIEnv env, int objRef, int v0, int rObject1) {
  }
  @MJI
  public static void setTag__Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rObject0) {
  }
  @MJI
  public static int getBaseline____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void requestLayout____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void forceLayout____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void measure__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static void onMeasure__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static void setMeasuredDimension__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static int resolveSize__II__I (MJIEnv env, int clsObjRef, int v0, int v1) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getDefaultSize__II__I (MJIEnv env, int clsObjRef, int v0, int v1) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getSuggestedMinimumHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getSuggestedMinimumWidth____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setMinimumHeight__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMinimumWidth__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getAnimation____Landroid_view_animation_Animation_2 (MJIEnv env, int objRef) {
    int rAnimation = MJIEnv.NULL;
    return rAnimation;
  }
  @MJI
  public static void startAnimation__Landroid_view_animation_Animation_2__V (MJIEnv env, int objRef, int rAnimation0) {
  }
  @MJI
  public static void clearAnimation____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void setAnimation__Landroid_view_animation_Animation_2__V (MJIEnv env, int objRef, int rAnimation0) {
  }
  @MJI
  public static void onAnimationStart____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onAnimationEnd____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean onSetAlpha__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void playSoundEffect__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static boolean performHapticFeedback__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean performHapticFeedback__II__Z (MJIEnv env, int objRef, int v0, int v1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean overScrollBy__IIIIIIIIZ__Z (MJIEnv env, int objRef, int v0, int v1, int v2, int v3, int v4, int v5, int v6, int v7, boolean v8) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void onOverScrolled__IIZZ__V (MJIEnv env, int objRef, int v0, int v1, boolean v2, boolean v3) {
  }
  @MJI
  public static int getOverScrollMode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setOverScrollMode__I__V (MJIEnv env, int objRef, int v0) {
  }
}
