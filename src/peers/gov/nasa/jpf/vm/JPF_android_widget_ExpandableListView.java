package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_widget_ExpandableListView extends NativePeer{
	  @MJI
	  public static void $clinit (MJIEnv env, int clsObjRef) {
	  }
	  @MJI
	  public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int ctxRef){
	  }
	  @MJI
	  public static void dispatchDraw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
	  }
	  @MJI
	  public static int getIndicator__Landroid_widget_ExpandableListConnector$PositionMetadata_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rExpandableListConnector$PositionMetadata0) {
	    int rDrawable = MJIEnv.NULL;
	    return rDrawable;
	  }
	  @MJI
	  public static void setChildDivider__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
	  }
	  @MJI
	  public static void drawDivider__Landroid_graphics_Canvas_2Landroid_graphics_Rect_2I__V (MJIEnv env, int objRef, int rCanvas0, int rRect1, int v2) {
	  }
	  @MJI
	  public static void setAdapter__Landroid_widget_ListAdapter_2__V (MJIEnv env, int objRef, int rListAdapter0) {
	  }
	  @MJI
	  public static void setAdapter__Landroid_widget_Adapter_2__V (MJIEnv env, int objRef, int rAdapter0) {
	  }
	  @MJI
	  public static void setAdapter__Landroid_widget_ExpandableListAdapter_2__V (MJIEnv env, int objRef, int rExpandableListAdapter0) {
	  }
	  @MJI
	  public static int getAdapter____Landroid_widget_Adapter_2 (MJIEnv env, int objRef) {
	    int rAdapter = MJIEnv.NULL;
	    return rAdapter;
	  }
	  @MJI
	  public static int getAdapter____Landroid_widget_ListAdapter_2 (MJIEnv env, int objRef) {
	    int rListAdapter = MJIEnv.NULL;
	    return rListAdapter;
	  }
	  @MJI
	  public static void setOnItemClickListener__Landroid_widget_AdapterView$OnItemClickListener_2__V (MJIEnv env, int objRef, int rAdapterView$OnItemClickListener0) {
	  }
	  @MJI
	  public static int getExpandableListAdapter____Landroid_widget_ExpandableListAdapter_2 (MJIEnv env, int objRef) {
	    int rExpandableListAdapter = MJIEnv.NULL;
	    return rExpandableListAdapter;
	  }
	  @MJI
	  public static boolean isHeaderOrFooterPosition__I__Z (MJIEnv env, int objRef, int v0) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static int getFlatPositionForConnector__I__I (MJIEnv env, int objRef, int v0) {
	    int v = (int)0;
	    return v;
	  }
	  @MJI
	  public static int getAbsoluteFlatPosition__I__I (MJIEnv env, int objRef, int v0) {
	    int v = (int)0;
	    return v;
	  }
	  @MJI
	  public static boolean performItemClick__Landroid_view_View_2IJ__Z (MJIEnv env, int objRef, int rView0, int v1, long v2) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean handleItemClick__Landroid_view_View_2IJ__Z (MJIEnv env, int objRef, int rView0, int v1, long v2) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean expandGroup__I__Z (MJIEnv env, int objRef, int v0) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean collapseGroup__I__Z (MJIEnv env, int objRef, int v0) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static void setOnGroupCollapseListener__Landroid_widget_ExpandableListView$OnGroupCollapseListener_2__V (MJIEnv env, int objRef, int rExpandableListView$OnGroupCollapseListener0) {
	  }
	  @MJI
	  public static void setOnGroupExpandListener__Landroid_widget_ExpandableListView$OnGroupExpandListener_2__V (MJIEnv env, int objRef, int rExpandableListView$OnGroupExpandListener0) {
	  }
	  @MJI
	  public static void setOnGroupClickListener__Landroid_widget_ExpandableListView$OnGroupClickListener_2__V (MJIEnv env, int objRef, int rExpandableListView$OnGroupClickListener0) {
	  }
	  @MJI
	  public static void setOnChildClickListener__Landroid_widget_ExpandableListView$OnChildClickListener_2__V (MJIEnv env, int objRef, int rExpandableListView$OnChildClickListener0) {
	  }
	  @MJI
	  public static long getExpandableListPosition__I__J (MJIEnv env, int objRef, int v0) {
	    long v = (long)0;
	    return v;
	  }
	  @MJI
	  public static int getFlatListPosition__J__I (MJIEnv env, int objRef, long v0) {
	    int v = (int)0;
	    return v;
	  }
	  @MJI
	  public static long getSelectedPosition____J (MJIEnv env, int objRef) {
	    long v = (long)0;
	    return v;
	  }
	  @MJI
	  public static long getSelectedId____J (MJIEnv env, int objRef) {
	    long v = (long)0;
	    return v;
	  }
	  @MJI
	  public static void setSelectedGroup__I__V (MJIEnv env, int objRef, int v0) {
	  }
	  @MJI
	  public static boolean setSelectedChild__IIZ__Z (MJIEnv env, int objRef, int v0, int v1, boolean v2) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static boolean isGroupExpanded__I__Z (MJIEnv env, int objRef, int v0) {
	    boolean v = false;
	    return v;
	  }
	  @MJI
	  public static int getPackedPositionType__J__I (MJIEnv env, int clsObjRef, long v0) {
	    int v = (int)0;
	    return v;
	  }
	  @MJI
	  public static int getPackedPositionGroup__J__I (MJIEnv env, int clsObjRef, long v0) {
	    int v = (int)0;
	    return v;
	  }
	  @MJI
	  public static int getPackedPositionChild__J__I (MJIEnv env, int clsObjRef, long v0) {
	    int v = (int)0;
	    return v;
	  }
	  @MJI
	  public static long getPackedPositionForChild__II__J (MJIEnv env, int clsObjRef, int v0, int v1) {
	    long v = (long)0;
	    return v;
	  }
	  @MJI
	  public static long getPackedPositionForGroup__I__J (MJIEnv env, int clsObjRef, int v0) {
	    long v = (long)0;
	    return v;
	  }
	  @MJI
	  public static int createContextMenuInfo__Landroid_view_View_2IJ__Landroid_view_ContextMenu$ContextMenuInfo_2 (MJIEnv env, int objRef, int rView0, int v1, long v2) {
	    int rContextMenu$ContextMenuInfo = MJIEnv.NULL;
	    return rContextMenu$ContextMenuInfo;
	  }
	  @MJI
	  public static long getChildOrGroupId__Landroid_widget_ExpandableListPosition_2__J (MJIEnv env, int objRef, int rExpandableListPosition0) {
	    long v = (long)0;
	    return v;
	  }
	  @MJI
	  public static void setChildIndicator__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
	  }
	  @MJI
	  public static void setChildIndicatorBounds__II__V (MJIEnv env, int objRef, int v0, int v1) {
	  }
	  @MJI
	  public static void setGroupIndicator__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
	  }
	  @MJI
	  public static void setIndicatorBounds__II__V (MJIEnv env, int objRef, int v0, int v1) {
	  }
	  @MJI
	  public static int onSaveInstanceState____Landroid_os_Parcelable_2 (MJIEnv env, int objRef) {
	    int rParcelable = MJIEnv.NULL;
	    return rParcelable;
	  }
	  @MJI
	  public static void onRestoreInstanceState__Landroid_os_Parcelable_2__V (MJIEnv env, int objRef, int rParcelable0) {
	  }
	}  

