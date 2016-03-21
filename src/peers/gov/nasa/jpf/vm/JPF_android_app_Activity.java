//ALex wang
//2015/12/21
package gov.nasa.jpf.vm;

import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

import javax.swing.text.View;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;


public class JPF_android_app_Activity extends NativePeer{
	
	@MJI
	public static void $init____V(MJIEnv env, int objref){
	}
	@MJI
	public static void onCreate__Landroid_os_Bundle_2__V(MJIEnv env, int clsRef, int argsRef){
	}
	@MJI
	public static void onRestart____V(MJIEnv env, int clsRef){}
	@MJI
	public static void onStart____V(MJIEnv env, int clsRef){}
	@MJI
	public static void onStop____V(MJIEnv env, int clsRef){}
	@MJI
	public static void onResume____V(MJIEnv env, int clsRef){}
	@MJI
	public static void onPause____V(MJIEnv env, int clsRef){}
	@MJI
	public static void onDestroy____V(MJIEnv env, int clsRef){}
	@MJI
	public static boolean onCreateOptionsMenu__Landroid_view_Menu_2__Z(MJIEnv env, int clsRef, int argsRef){
		boolean v=false;
		return v;
	}
	@MJI
	public static void setContentView__I__V(MJIEnv env, int clsRef, int layoutResID){ }
	@MJI
	public static int getMenuInflater____Landroid_view_MenuInflater_2(MJIEnv env, int clsRef) {
		int MenuInflaterRef= env.newObject("android.view.MenuInflater");
		return MenuInflaterRef;
	}
	
	/**
	 * 
	 * @author Alex Wang
	 *This hook is called whenever an item in your options menu is selected. 
	 *The default implementation simply returns false to have the normal processing happen (calling the item's Runnable or sending a message to its Handler as appropriate). 
	 *You can use this method for any items for which you would like to do processing without those other facilities. 
	 */
	@MJI
	public static boolean onOptionsItemSelected__Landroid_view_MenuItem_2__Z(MJIEnv nev, int clsRef, int argsRef) {
		boolean v= false;
		return v;
	}
	//needView
	@MJI
	public static int findViewById__I__Landroid_view_View_2(MJIEnv env, int objRef, int v0){
		int viewRef=-1;
		Views.Tuple viewInfo=null;
		for(Views.Tuple t: Views.createdView){
			if (t.objRef==objRef && t.viewId==v0) {
				viewRef=t.viewRef;
				viewInfo=t;
				break;
			}
		}
		if(viewRef>0){
			ElementInfo obj = env.heap.get(viewRef);
			if(obj==null || !obj.instanceOf(getTypeJPFFrom(objRef,v0))){
				String type=getType(objRef,v0);
				viewRef=env.newObject(type);
				String text=getText(objRef,v0);
				int strRef=env.newString(text);
				obj=env.heap.get(viewRef);
				if(text!=null && obj.instanceOf("Landroid/widget/TextView")){
					JPF_android_widget_TextView.setText__Ljava_lang_CharSequence_2__V(env,viewRef,strRef);
				}
				Views.createdView.remove(viewInfo);
				Views.Tuple newViewInfo = new Views.Tuple();
				newViewInfo.objRef=objRef;
				newViewInfo.viewId=v0;
				newViewInfo.viewRef=viewRef;
				Views.createdView.add(newViewInfo);
				setRef(viewRef,objRef,v0);
			}
			return viewRef;
		}else {
			  String type=getType(objRef,v0);
			 // System.out.println("Type: "+type);
			  int rView = env.newObject(type);
			 // System.out.println("checked");
			  String text = getText(objRef, v0);
			  int strRef = env.newString(text);
			  ElementInfo obj = env.heap.get(rView);
			  if(text != null && obj.instanceOf("Landroid/widget/TextView;") ){
				  JPF_android_widget_TextView.setText__Ljava_lang_CharSequence_2__V(env, rView, strRef);
			  }
			  Views.Tuple newViewInfo = new Views.Tuple();
			  newViewInfo.objRef = objRef;
			  newViewInfo.viewId = v0;
			  newViewInfo.viewRef = viewRef;
			  Views.createdView.add(newViewInfo);
			  //System.out.println(rView);
			  setRef(rView,objRef,v0);
			  return rView;
		}
	}
	
	public static void setRef(int objRef, int activityRef, int id) {
		try {
			Class cls=Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
			Method m =cls.getMethod("setObjRef", int.class,int.class,int.class);
			m.invoke(null, objRef,activityRef,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getTypeJPFFrom(int activityRef, int id) {
		String type = null;
		try {
			Class cls=Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
			Method m =cls.getMethod("getGUIElementType", int.class,int.class);
			type=(String) m.invoke(null, activityRef,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(type==null){
			return "Landroid/view/View;";
		}else{
			type=type.replace('.', '/');
			type='L'+type;
			type=type.concat(";");
			return type;
		}
		
	}
	public static String getType(int activityRef, int id) {
		String type = null;
		try {
			Class cls=Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
			Method m =cls.getMethod("getGUIElementType", int.class,int.class);
			type=(String) m.invoke(null, activityRef,id);
			//System.out.println(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(type==null){
			return "android.view.View;";
		}else{
			return type;
		}
	}
	public static String getText(int activityRef, int id){
		  String text = null;
		  try{
			  Class cls = Class.forName("edu.nju.Alex.GreenDroid.MethodInvocationListener");
			  Method m = cls.getMethod("getUIElementText", int.class, int.class);
			  text = (String) m.invoke(null, activityRef, id);
		  } catch(Exception e){
			  e.printStackTrace();
		  }

		  return text;
	  }
  @MJI
public static int getParent____Landroid_app_Activity_2 (MJIEnv env, int objRef) {
  int rActivity = MJIEnv.NULL;
  return rActivity;
}
  @MJI
public static int getIntent____Landroid_content_Intent_2 (MJIEnv env, int objRef) {
	  int intentRef = env.getReferenceField(objRef, "mIntent");
	  
  if(intentRef == -1){
  	return env.newObject("android.content.Intent");
  } else{
  	return intentRef;
  }
}
  @MJI
public static void setIntent__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
}
  @MJI
public static int getApplication____Landroid_app_Application_2 (MJIEnv env, int objRef) {
  int rApplication = MJIEnv.NULL;
  return rApplication;
}
  @MJI
public static boolean isChild____Z (MJIEnv env, int objRef) {
  boolean v = false;
  return v;
}
  @MJI
public static int getWindowManager____Landroid_view_WindowManager_2 (MJIEnv env, int objRef) {
  int rWindowManager = env.newObject("android.view.WindowManager");
  return rWindowManager;
}
  @MJI
public static int getWindow____Landroid_view_Window_2 (MJIEnv env, int objRef) {
  int rWindow = env.newObject("android.view.Window");
  return rWindow;
}
  @MJI
public static int getCurrentFocus____Landroid_view_View_2 (MJIEnv env, int objRef) {
  int rView = MJIEnv.NULL;
  return rView;
}

  @MJI
public static void onRestoreInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
}
  @MJI
public static void onPostCreate__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
}

  @MJI
public static void onPostResume____V (MJIEnv env, int objRef) {
}
  @MJI
public static void onNewIntent__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
}
  @MJI
public static void onSaveInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
}

  @MJI
public static void onUserLeaveHint____V (MJIEnv env, int objRef) {
}
  @MJI
public static boolean onCreateThumbnail__Landroid_graphics_Bitmap_2Landroid_graphics_Canvas_2__Z (MJIEnv env, int objRef, int rBitmap0, int rCanvas1) {
  boolean v = false;
  return v;
}
  @MJI
public static int onCreateDescription____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
  int rCharSequence = MJIEnv.NULL;
  return rCharSequence;
}


  @MJI
public static void onConfigurationChanged__Landroid_content_res_Configuration_2__V (MJIEnv env, int objRef, int rConfiguration0) {
}
  @MJI
public static int getChangingConfigurations____I (MJIEnv env, int objRef) {
  int v = (int)0;
  return v;
}
  @MJI
public static int getLastNonConfigurationInstance____Ljava_lang_Object_2 (MJIEnv env, int objRef) {
  int rObject = MJIEnv.NULL;
  return rObject;
}
  @MJI
public static int onRetainNonConfigurationInstance____Ljava_lang_Object_2 (MJIEnv env, int objRef) {
  int rObject = MJIEnv.NULL;
  return rObject;
}
  @MJI
public static void onLowMemory____V (MJIEnv env, int objRef) {
}
  @MJI
public static int managedQuery__Landroid_net_Uri_2_3Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rUri0, int rString1, int rString2, int rString3, int rString4) {
  int rCursor = env.newObject("android.database.Cursor");
  return rCursor;
}
  @MJI
public static void startManagingCursor__Landroid_database_Cursor_2__V (MJIEnv env, int objRef, int rCursor0) {
}
  @MJI
public static void stopManagingCursor__Landroid_database_Cursor_2__V (MJIEnv env, int objRef, int rCursor0) {
}
  @MJI
public static void setPersistent__Z__V (MJIEnv env, int objRef, boolean v0) {
}

  @MJI
public static void setContentView__Landroid_view_View_2Landroid_view_ViewGroup$LayoutParams_2__V (MJIEnv env, int objRef, int rView0, int rViewGroup$LayoutParams1) {
}
  @MJI
public static void setContentView__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
}
  @MJI
public static void addContentView__Landroid_view_View_2Landroid_view_ViewGroup$LayoutParams_2__V (MJIEnv env, int objRef, int rView0, int rViewGroup$LayoutParams1) {
}
  @MJI
public static void setDefaultKeyMode__I__V (MJIEnv env, int objRef, int v0) {
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
public static void onBackPressed____V (MJIEnv env, int objRef) {
}
  @MJI
public static boolean onTouchEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean onTrackballEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
  boolean v = false;
  return v;
}
  @MJI
public static void onUserInteraction____V (MJIEnv env, int objRef) {
}
  @MJI
public static void onWindowAttributesChanged__Landroid_view_WindowManager$LayoutParams_2__V (MJIEnv env, int objRef, int rWindowManager$LayoutParams0) {
}
  @MJI
public static void onContentChanged____V (MJIEnv env, int objRef) {
}
  @MJI
public static void onWindowFocusChanged__Z__V (MJIEnv env, int objRef, boolean v0) {
}
  @MJI
public static void onAttachedToWindow____V (MJIEnv env, int objRef) {
}
  @MJI
public static void onDetachedFromWindow____V (MJIEnv env, int objRef) {
}
  @MJI
public static boolean hasWindowFocus____Z (MJIEnv env, int objRef) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean dispatchKeyEvent__Landroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int rKeyEvent0) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean dispatchTouchEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean dispatchTrackballEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean dispatchPopulateAccessibilityEvent__Landroid_view_accessibility_AccessibilityEvent_2__Z (MJIEnv env, int objRef, int rAccessibilityEvent0) {
  boolean v = false;
  return v;
}
  @MJI
public static int onCreatePanelView__I__Landroid_view_View_2 (MJIEnv env, int objRef, int v0) {
  int rView = MJIEnv.NULL;
  return rView;
}
  @MJI
public static boolean onCreatePanelMenu__ILandroid_view_Menu_2__Z (MJIEnv env, int objRef, int v0, int rMenu1) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean onPreparePanel__ILandroid_view_View_2Landroid_view_Menu_2__Z (MJIEnv env, int objRef, int v0, int rView1, int rMenu2) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean onMenuOpened__ILandroid_view_Menu_2__Z (MJIEnv env, int objRef, int v0, int rMenu1) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean onMenuItemSelected__ILandroid_view_MenuItem_2__Z (MJIEnv env, int objRef, int v0, int rMenuItem1) {
  boolean v = false;
  return v;
}
  @MJI
public static void onPanelClosed__ILandroid_view_Menu_2__V (MJIEnv env, int objRef, int v0, int rMenu1) {
}
  @MJI
public static boolean onPrepareOptionsMenu__Landroid_view_Menu_2__Z (MJIEnv env, int objRef, int rMenu0) {
  boolean v = false;
  return v;
}

  @MJI
public static void onOptionsMenuClosed__Landroid_view_Menu_2__V (MJIEnv env, int objRef, int rMenu0) {
}
  @MJI
public static void openOptionsMenu____V (MJIEnv env, int objRef) {
}
  @MJI
public static void closeOptionsMenu____V (MJIEnv env, int objRef) {
}
  @MJI
public static void onCreateContextMenu__Landroid_view_ContextMenu_2Landroid_view_View_2Landroid_view_ContextMenu$ContextMenuInfo_2__V (MJIEnv env, int objRef, int rContextMenu0, int rView1, int rContextMenu$ContextMenuInfo2) {
}
  @MJI
public static void registerForContextMenu__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
}
  @MJI
public static void unregisterForContextMenu__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
}
  @MJI
public static void openContextMenu__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
}
  @MJI
public static void closeContextMenu____V (MJIEnv env, int objRef) {
}
  @MJI
public static boolean onContextItemSelected__Landroid_view_MenuItem_2__Z (MJIEnv env, int objRef, int rMenuItem0) {
  boolean v = false;
  return v;
}
  @MJI
public static void onContextMenuClosed__Landroid_view_Menu_2__V (MJIEnv env, int objRef, int rMenu0) {
}
  @MJI
public static int onCreateDialog__ILandroid_os_Bundle_2__Landroid_app_Dialog_2 (MJIEnv env, int objRef, int v0, int rBundle1) {
  int rDialog = MJIEnv.NULL;
  return rDialog;
}
  @MJI
public static int onCreateDialog__I__Landroid_app_Dialog_2 (MJIEnv env, int objRef, int v0) {
  int rDialog = MJIEnv.NULL;
  return rDialog;
}
  @MJI
public static void onPrepareDialog__ILandroid_app_Dialog_2__V (MJIEnv env, int objRef, int v0, int rDialog1) {
}
  @MJI
public static void onPrepareDialog__ILandroid_app_Dialog_2Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int v0, int rDialog1, int rBundle2) {
}
  @MJI
public static boolean showDialog__ILandroid_os_Bundle_2__Z (MJIEnv env, int objRef, int v0, int rBundle1) {
  boolean v = false;
  return v;
}
  @MJI
public static void showDialog__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static void dismissDialog__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static void removeDialog__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static boolean onSearchRequested____Z (MJIEnv env, int objRef) {
  boolean v = false;
  return v;
}
  @MJI
public static void startSearch__Ljava_lang_String_2ZLandroid_os_Bundle_2Z__V (MJIEnv env, int objRef, int rString0, boolean v1, int rBundle2, boolean v3) {
}
  @MJI
public static void triggerSearch__Ljava_lang_String_2Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rString0, int rBundle1) {
}
  @MJI
public static void takeKeyEvents__Z__V (MJIEnv env, int objRef, boolean v0) {
}
  @MJI
public static boolean requestWindowFeature__I__Z (MJIEnv env, int objRef, int v0) {
  boolean v = false;
  return v;
}
  @MJI
public static void setFeatureDrawableResource__II__V (MJIEnv env, int objRef, int v0, int v1) {
}
  @MJI
public static void setFeatureDrawableUri__ILandroid_net_Uri_2__V (MJIEnv env, int objRef, int v0, int rUri1) {
}
  @MJI
public static void setFeatureDrawable__ILandroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int v0, int rDrawable1) {
}
  @MJI
public static void setFeatureDrawableAlpha__II__V (MJIEnv env, int objRef, int v0, int v1) {
}
  @MJI
public static int getLayoutInflater____Landroid_view_LayoutInflater_2 (MJIEnv env, int objRef) {
  int rLayoutInflater = MJIEnv.NULL;
  return rLayoutInflater;
}
  @MJI
public static void onApplyThemeResource__Landroid_content_res_Resources$Theme_2IZ__V (MJIEnv env, int objRef, int rResources$Theme0, int v1, boolean v2) {
}
  @MJI
public static void startActivityForResult__Landroid_content_Intent_2I__V (MJIEnv env, int objRef, int rIntent0, int v1) {
}
  @MJI
public static void startIntentSenderForResult__Landroid_content_IntentSender_2ILandroid_content_Intent_2III__V (MJIEnv env, int objRef, int rIntentSender0, int v1, int rIntent2, int v3, int v4, int v5) {
}
  @MJI
public static void startActivity__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
	  System.out.println("using this?");
}
  @MJI
public static void startIntentSender__Landroid_content_IntentSender_2Landroid_content_Intent_2III__V (MJIEnv env, int objRef, int rIntentSender0, int rIntent1, int v2, int v3, int v4) {
}
  @MJI
public static boolean startActivityIfNeeded__Landroid_content_Intent_2I__Z (MJIEnv env, int objRef, int rIntent0, int v1) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean startNextMatchingActivity__Landroid_content_Intent_2__Z (MJIEnv env, int objRef, int rIntent0) {
  boolean v = false;
  return v;
}
  @MJI
public static void startActivityFromChild__Landroid_app_Activity_2Landroid_content_Intent_2I__V (MJIEnv env, int objRef, int rActivity0, int rIntent1, int v2) {
}
  @MJI
public static void startIntentSenderFromChild__Landroid_app_Activity_2Landroid_content_IntentSender_2ILandroid_content_Intent_2III__V (MJIEnv env, int objRef, int rActivity0, int rIntentSender1, int v2, int rIntent3, int v4, int v5, int v6) {
}
  @MJI
public static void overridePendingTransition__II__V (MJIEnv env, int objRef, int v0, int v1) {
}
  @MJI
public static void setResult__ILandroid_content_Intent_2__V (MJIEnv env, int objRef, int v0, int rIntent1) {
}
  @MJI
public static void setResult__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static int getCallingPackage____Ljava_lang_String_2 (MJIEnv env, int objRef) {
  int rString = MJIEnv.NULL;
  return rString;
}
  @MJI
public static int getCallingActivity____Landroid_content_ComponentName_2 (MJIEnv env, int objRef) {
  int rComponentName = MJIEnv.NULL;
  return rComponentName;
}
  @MJI
public static void setVisible__Z__V (MJIEnv env, int objRef, boolean v0) {
}
  @MJI
public static boolean isFinishing____Z (MJIEnv env, int objRef) {
  boolean v = false;
  return v;
}
  @MJI
public static void finish____V (MJIEnv env, int objRef) {
}
  @MJI
public static void finishFromChild__Landroid_app_Activity_2__V (MJIEnv env, int objRef, int rActivity0) {
}
  @MJI
public static void finishActivity__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static void finishActivityFromChild__Landroid_app_Activity_2I__V (MJIEnv env, int objRef, int rActivity0, int v1) {
}
  @MJI
public static void onActivityResult__IILandroid_content_Intent_2__V (MJIEnv env, int objRef, int v0, int v1, int rIntent2) {
}
  @MJI
public static int createPendingResult__ILandroid_content_Intent_2I__Landroid_app_PendingIntent_2 (MJIEnv env, int objRef, int v0, int rIntent1, int v2) {
  int rPendingIntent = MJIEnv.NULL;
  return rPendingIntent;
}
  @MJI
public static void setRequestedOrientation__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static int getRequestedOrientation____I (MJIEnv env, int objRef) {
  int v = (int)0;
  return v;
}
  @MJI
public static int getTaskId____I (MJIEnv env, int objRef) {
  int v = (int)0;
  return v;
}
  @MJI
public static boolean isTaskRoot____Z (MJIEnv env, int objRef) {
  boolean v = false;
  return v;
}
  @MJI
public static boolean moveTaskToBack__Z__Z (MJIEnv env, int objRef, boolean v0) {
  boolean v = false;
  return v;
}
  @MJI
public static int getLocalClassName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
  int rString = MJIEnv.NULL;
  return rString;
}
  @MJI
public static int getComponentName____Landroid_content_ComponentName_2 (MJIEnv env, int objRef) {
  int rComponentName = MJIEnv.NULL;
  return rComponentName;
}
  @MJI
public static int getPreferences__I__Landroid_content_SharedPreferences_2 (MJIEnv env, int objRef, int v0) {
  int rSharedPreferences = MJIEnv.NULL;
  return rSharedPreferences;
}
  @MJI
public static int getSystemService__Ljava_lang_String_2__Ljava_lang_Object_2 (MJIEnv env, int objRef, int rString0) {
	  String type = env.getStringObject(rString0);
	  int lm = env.NULL;
	  if(type.equals("power")){
		  lm = env.newObject("android.os.PowerManager");
	  } else if(type.equals("window")){
		  lm = env.newObject("android.view.WindowsManager");
	  } else if(type.equals("audio")){
		  lm = env.newObject("android.media.AudioManager");
	  } else if(type.equals("alarm")){
		  lm = env.newObject("android.app.AlarmManager");
	  } else if(type.equals("notification")){
		  lm = env.newObject("android.app.NotificationManager");
	  } else if(type.equals("location")){
		  lm = env.newObject("android.location.LocationManager");
	  } else if(type.equals("search")){
		  lm = env.newObject("android.app.SearchManager");
	  } else if(type.equals("vibrator")){
		  lm = env.newObject("android.os.Vibrator");
	  } else if(type.equals("wifi")){
		  lm = env.newObject("android.net.wifi.WifiManager");
	  } else if(type.equals("download")){
		  lm = env.newObject("android.app.DownloadManager");
	  } else if(type.equals("layout_inflater")){
		  lm = env.newObject("android.view.LayoutInflater");
	  } else if(type.equals("connectivity")){
		  lm = env.newObject("android.net.ConnectivityManager");
	  } else if(type.equals("sensor")){
		  lm = env.newObject("android.hardware.SensorManager");
	  } else if(type.equals("input_method")){
		  lm = env.newObject("android.view.inputmethod.InputMethodManager");
	  } else if(type.equals("account")){
		  lm = env.newObject("android.accounts.AccountManager");
	  } else {
		  env.throwException("java.lang.UnsupportedOperationException", "System service '"+type+"' is not available");
	  }
	  return lm;
}
  @MJI
public static void setTitle__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static void setTitle__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
}
  @MJI
public static void setTitleColor__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static int getTitle____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
  int rCharSequence = MJIEnv.NULL;
  return rCharSequence;
}
  @MJI
public static int getTitleColor____I (MJIEnv env, int objRef) {
  int v = (int)0;
  return v;
}
  @MJI
public static void onTitleChanged__Ljava_lang_CharSequence_2I__V (MJIEnv env, int objRef, int rCharSequence0, int v1) {
}
  @MJI
public static void onChildTitleChanged__Landroid_app_Activity_2Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rActivity0, int rCharSequence1) {
}
  @MJI
public static void setProgressBarVisibility__Z__V (MJIEnv env, int objRef, boolean v0) {
}
  @MJI
public static void setProgressBarIndeterminateVisibility__Z__V (MJIEnv env, int objRef, boolean v0) {
}
  @MJI
public static void setProgressBarIndeterminate__Z__V (MJIEnv env, int objRef, boolean v0) {
}
  @MJI
public static void setProgress__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static void setSecondaryProgress__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static void setVolumeControlStream__I__V (MJIEnv env, int objRef, int v0) {
}
  @MJI
public static int getVolumeControlStream____I (MJIEnv env, int objRef) {
  int v = (int)0;
  return v;
}
  @MJI
public static void runOnUiThread__Ljava_lang_Runnable_2__V (MJIEnv env, int objRef, int rRunnable0) {
}
  @MJI
public static int onCreateView__Ljava_lang_String_2Landroid_content_Context_2Landroid_util_AttributeSet_2__Landroid_view_View_2 (MJIEnv env, int objRef, int rString0, int rContext1, int rAttributeSet2) {
  int rView = MJIEnv.NULL;
  return rView;
}
}
