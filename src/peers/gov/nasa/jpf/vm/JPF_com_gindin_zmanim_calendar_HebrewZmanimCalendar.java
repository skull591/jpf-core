package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_gindin_zmanim_calendar_HebrewZmanimCalendar extends NativePeer{
	/*****************we are going to carefully model these************************/
	
//	public static void $init__Lcom_gindin_zmanim_android_location_ZmanimLocation_2Lcom_gindin_zmanim_calendar_HebrewDateFormatter_2Ljava_util_Calendar_2__V(MJIEnv env, int objRef, int argRef1, int argRef2, int argRef3){
//		
//	}
//	
	  @MJI
	public static int formatHebrewDate____Ljava_lang_String_2(MJIEnv env, int objRef){
		return env.newString("hello hebrew");
	}
//	
//	public static int formatSecularDate____Ljava_lang_String_2(MJIEnv env, int objRef){
//		return env.newString("hello secular");
//	}
//	
//	
	  @MJI
	public static int getTodaysDescription____Ljava_lang_String_2(MJIEnv env, int objRef){
		return env.newString("hello today");
	}
//	
//	public static boolean showCandlelighting____Z(MJIEnv env, int objRef){
//		return false;
//	}
//	
//	public static boolean showHavdalah____Z(MJIEnv env, int objRef){
//		return false;
//	}
//	
//	public static int isTodayATaanit____Lcom_gindin_zmanim_calendar_JewishHoliday_2(MJIEnv env, int objRef){
//		return MJIEnv.NULL;
//	}
//	
//	public static int getSecularDate____Ljava_util_Calendar_2(MJIEnv env, int objRef){
//		
//		return env.newObject("java.util.Calendar");
//	}
//	
//	public static void addListener__Lcom_gindin_zmanim_calendar_HebrewZmanimCalendar$Listener_2__V(MJIEnv env, int objRef, int listenerRef){
//	}
//	
//	public static void removeListener__Lcom_gindin_zmanim_calendar_HebrewZmanimCalendar$Listener_2__V(MJIEnv env, int objRef, int listenerRef){
//	}
	

}
