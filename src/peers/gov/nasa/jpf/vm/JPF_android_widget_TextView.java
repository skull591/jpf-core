package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_widget_TextView extends NativePeer{
	@MJI
	public static void $clinit____V (MJIEnv env, int clsObjRef) {
	  }
	@MJI
		public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int contextRef){
//			System.out.println("@TextView constructor 1");
		}
		@MJI
		public static void $init__Landroid_content_Context_2Landroid_util_AttributeSet_2__V(MJIEnv env, int objRef, int contextRef, int attriRef){
//			System.out.println("@TextView constructor 2");
		}
		@MJI
		public static void $init__Landroid_content_Context_2Landroid_util_AttributeSet_2I__V(MJIEnv env, int objRef, int contextRef, int attriRef, int defStyle){
//			System.out.println("@TextView constructor 3");
		}
  @MJI
  public static void append__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
  }
  @MJI
  public static void append__Ljava_lang_CharSequence_2II__V (MJIEnv env, int objRef, int rCharSequence0, int v1, int v2) {
  }
  @MJI
  public static int length____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void debug__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setError__Ljava_lang_CharSequence_2Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rCharSequence0, int rDrawable1) {
  }
  @MJI
  public static void setError__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
  }
  @MJI
  public static void setTypeface__Landroid_graphics_Typeface_2I__V (MJIEnv env, int objRef, int rTypeface0, int v1) {
  }
  @MJI
  public static void setTypeface__Landroid_graphics_Typeface_2__V (MJIEnv env, int objRef, int rTypeface0) {
  }
  @MJI
  public static boolean getDefaultEditable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getDefaultMovementMethod____Landroid_text_method_MovementMethod_2 (MJIEnv env, int objRef) {
    int rMovementMethod = MJIEnv.NULL;
    return rMovementMethod;
  }
  @MJI
  public static int getText____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
    int rCharSequence = env.getReferenceField(objRef, "mText");
    if(env.getHeap().get(rCharSequence) == null){
    	rCharSequence = env.newString("input");
    }
    return rCharSequence;
  }
  @MJI
  public static int getEditableText____Landroid_text_Editable_2 (MJIEnv env, int objRef) {
    int rEditable = MJIEnv.NULL;
    return rEditable;
  }
  @MJI
  public static int getLineHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getLayout____Landroid_text_Layout_2 (MJIEnv env, int objRef) {
    int rLayout = MJIEnv.NULL;
    return rLayout;
  }
  @MJI
  public static int getKeyListener____Landroid_text_method_KeyListener_2 (MJIEnv env, int objRef) {
    int rKeyListener = MJIEnv.NULL;
    return rKeyListener;
  }
  @MJI
  public static void setKeyListener__Landroid_text_method_KeyListener_2__V (MJIEnv env, int objRef, int rKeyListener0) {
  }
  @MJI
  public static int getMovementMethod____Landroid_text_method_MovementMethod_2 (MJIEnv env, int objRef) {
    int rMovementMethod = MJIEnv.NULL;
    return rMovementMethod;
  }
  @MJI
  public static void setMovementMethod__Landroid_text_method_MovementMethod_2__V (MJIEnv env, int objRef, int rMovementMethod0) {
  }
  @MJI
  public static int getTransformationMethod____Landroid_text_method_TransformationMethod_2 (MJIEnv env, int objRef) {
    int rTransformationMethod = MJIEnv.NULL;
    return rTransformationMethod;
  }
  @MJI
  public static void setTransformationMethod__Landroid_text_method_TransformationMethod_2__V (MJIEnv env, int objRef, int rTransformationMethod0) {
  }
  @MJI
  public static int getCompoundPaddingTop____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getCompoundPaddingBottom____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getCompoundPaddingLeft____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getCompoundPaddingRight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getExtendedPaddingTop____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getExtendedPaddingBottom____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTotalPaddingLeft____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTotalPaddingRight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTotalPaddingTop____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTotalPaddingBottom____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setCompoundDrawables__Landroid_graphics_drawable_Drawable_2Landroid_graphics_drawable_Drawable_2Landroid_graphics_drawable_Drawable_2Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0, int rDrawable1, int rDrawable2, int rDrawable3) {
  }
  @MJI
  public static void setCompoundDrawablesWithIntrinsicBounds__Landroid_graphics_drawable_Drawable_2Landroid_graphics_drawable_Drawable_2Landroid_graphics_drawable_Drawable_2Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0, int rDrawable1, int rDrawable2, int rDrawable3) {
  }
  @MJI
  public static void setCompoundDrawablesWithIntrinsicBounds__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static int getCompoundDrawables_____3Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
  @MJI
  public static void setCompoundDrawablePadding__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getCompoundDrawablePadding____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setPadding__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
  @MJI
  public static int getAutoLinkMask____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setTextAppearance__Landroid_content_Context_2I__V (MJIEnv env, int objRef, int rContext0, int v1) {
  }
  @MJI
  public static float getTextSize____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
  @MJI
  public static void setTextSize__F__V (MJIEnv env, int objRef, float v0) {
  }
  @MJI
  public static void setTextSize__IF__V (MJIEnv env, int objRef, int v0, float v1) {
  }
  @MJI
  public static float getTextScaleX____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
  @MJI
  public static void setTextScaleX__F__V (MJIEnv env, int objRef, float v0) {
  }
  @MJI
  public static int getTypeface____Landroid_graphics_Typeface_2 (MJIEnv env, int objRef) {
    int rTypeface = MJIEnv.NULL;
    return rTypeface;
  }
  @MJI
  public static void setTextColor__Landroid_content_res_ColorStateList_2__V (MJIEnv env, int objRef, int rColorStateList0) {
  }
  @MJI
  public static void setTextColor__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getTextColors____Landroid_content_res_ColorStateList_2 (MJIEnv env, int objRef) {
    int rColorStateList = MJIEnv.NULL;
    return rColorStateList;
  }
  @MJI
  public static int getTextColors__Landroid_content_Context_2Landroid_content_res_TypedArray_2__Landroid_content_res_ColorStateList_2 (MJIEnv env, int clsObjRef, int rContext0, int rTypedArray1) {
    int rColorStateList = MJIEnv.NULL;
    return rColorStateList;
  }
  @MJI
  public static int getCurrentTextColor____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setHighlightColor__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setShadowLayer__FFFI__V (MJIEnv env, int objRef, float v0, float v1, float v2, int v3) {
  }
  @MJI
  public static int getPaint____Landroid_text_TextPaint_2 (MJIEnv env, int objRef) {
    int rTextPaint = MJIEnv.NULL;
    return rTextPaint;
  }
  @MJI
  public static void setAutoLinkMask__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setLinksClickable__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean getLinksClickable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getUrls_____3Landroid_text_style_URLSpan_2 (MJIEnv env, int objRef) {
    int rURLSpan = MJIEnv.NULL;
    return rURLSpan;
  }
  @MJI
  public static void setHintTextColor__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setHintTextColor__Landroid_content_res_ColorStateList_2__V (MJIEnv env, int objRef, int rColorStateList0) {
  }
  @MJI
  public static int getHintTextColors____Landroid_content_res_ColorStateList_2 (MJIEnv env, int objRef) {
    int rColorStateList = MJIEnv.NULL;
    return rColorStateList;
  }
  @MJI
  public static int getCurrentHintTextColor____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setLinkTextColor__Landroid_content_res_ColorStateList_2__V (MJIEnv env, int objRef, int rColorStateList0) {
  }
  @MJI
  public static void setLinkTextColor__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getLinkTextColors____Landroid_content_res_ColorStateList_2 (MJIEnv env, int objRef) {
    int rColorStateList = MJIEnv.NULL;
    return rColorStateList;
  }
  @MJI
  public static void setGravity__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getGravity____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getPaintFlags____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setPaintFlags__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setHorizontallyScrolling__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setMinLines__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMinHeight__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMaxLines__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMaxHeight__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setLines__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setHeight__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMinEms__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMinWidth__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMaxEms__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setMaxWidth__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setEms__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setWidth__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setLineSpacing__FF__V (MJIEnv env, int objRef, float v0, float v1) {
  }
  @MJI
  public static void drawableStateChanged____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int onSaveInstanceState____Landroid_os_Parcelable_2 (MJIEnv env, int objRef) {
    int rParcelable = MJIEnv.NULL;
    return rParcelable;
  }
  @MJI
  public static void onRestoreInstanceState__Landroid_os_Parcelable_2__V (MJIEnv env, int objRef, int rParcelable0) {
  }
  @MJI
  public static void setFreezesText__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean getFreezesText____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setEditableFactory__Landroid_text_Editable$Factory_2__V (MJIEnv env, int objRef, int rEditable$Factory0) {
  }
  @MJI
  public static void setSpannableFactory__Landroid_text_Spannable$Factory_2__V (MJIEnv env, int objRef, int rSpannable$Factory0) {
  }
  @MJI
  public static void setText__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setText___3CII__V (MJIEnv env, int objRef, int rC0, int v1, int v2) {
  }
  @MJI
  public static void setText__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
	  env.getHeap().get(objRef).setReferenceField("mText", rCharSequence0);
  }
  @MJI
  public static void setText__Ljava_lang_CharSequence_2Landroid_widget_TextView$BufferType_2__V (MJIEnv env, int objRef, int rCharSequence0, int rTextView$BufferType1) {
  }
  @MJI
  public static void setText__ILandroid_widget_TextView$BufferType_2__V (MJIEnv env, int objRef, int v0, int rTextView$BufferType1) {
  }
  @MJI
  public static void setTextKeepState__Ljava_lang_CharSequence_2Landroid_widget_TextView$BufferType_2__V (MJIEnv env, int objRef, int rCharSequence0, int rTextView$BufferType1) {
  }
  @MJI
  public static void setTextKeepState__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
  }
  @MJI
  public static void setHint__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setHint__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
  }
  @MJI
  public static int getHint____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
  @MJI
  public static void setInputType__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setRawInputType__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getInputType____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setImeOptions__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getImeOptions____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setImeActionLabel__Ljava_lang_CharSequence_2I__V (MJIEnv env, int objRef, int rCharSequence0, int v1) {
  }
  @MJI
  public static int getImeActionLabel____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
  @MJI
  public static int getImeActionId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setOnEditorActionListener__Landroid_widget_TextView$OnEditorActionListener_2__V (MJIEnv env, int objRef, int rTextView$OnEditorActionListener0) {
  }
  @MJI
  public static void onEditorAction__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static void setPrivateImeOptions__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
  @MJI
  public static int getPrivateImeOptions____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static void setInputExtras__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getInputExtras__Z__Landroid_os_Bundle_2 (MJIEnv env, int objRef, boolean v0) {
    int rBundle = MJIEnv.NULL;
    return rBundle;
  }
  @MJI
  public static int getError____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
  @MJI
  public static boolean setFrame__IIII__Z (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setFilters___3Landroid_text_InputFilter_2__V (MJIEnv env, int objRef, int rInputFilter0) {
  }
  @MJI
  public static int getFilters_____3Landroid_text_InputFilter_2 (MJIEnv env, int objRef) {
    int rInputFilter = MJIEnv.NULL;
    return rInputFilter;
  }
  @MJI
  public static boolean onPreDraw____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void onAttachedToWindow____V (MJIEnv env, int objRef) {
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
  public static int getRightPaddingOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static boolean verifyDrawable__Landroid_graphics_drawable_Drawable_2__Z (MJIEnv env, int objRef, int rDrawable0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void invalidateDrawable__Landroid_graphics_drawable_Drawable_2__V (MJIEnv env, int objRef, int rDrawable0) {
  }
  @MJI
  public static void onDraw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
  @MJI
  public static void getFocusedRect__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
  @MJI
  public static int getLineCount____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getLineBounds__ILandroid_graphics_Rect_2__I (MJIEnv env, int objRef, int v0, int rRect1) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getBaseline____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static boolean onKeyDown__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyMultiple__IILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int v1, int rKeyEvent2) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onKeyUp__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
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
  public static boolean extractText__Landroid_view_inputmethod_ExtractedTextRequest_2Landroid_view_inputmethod_ExtractedText_2__Z (MJIEnv env, int objRef, int rExtractedTextRequest0, int rExtractedText1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setExtractedText__Landroid_view_inputmethod_ExtractedText_2__V (MJIEnv env, int objRef, int rExtractedText0) {
  }
  @MJI
  public static void onCommitCompletion__Landroid_view_inputmethod_CompletionInfo_2__V (MJIEnv env, int objRef, int rCompletionInfo0) {
  }
  @MJI
  public static void beginBatchEdit____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void endBatchEdit____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onBeginBatchEdit____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onEndBatchEdit____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean onPrivateIMECommand__Ljava_lang_String_2Landroid_os_Bundle_2__Z (MJIEnv env, int objRef, int rString0, int rBundle1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setIncludeFontPadding__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void onMeasure__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static boolean bringPointIntoView__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean moveCursorToVisibleOffset____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void computeScroll____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int getSelectionStart____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getSelectionEnd____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static boolean hasSelection____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setSingleLine__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setSingleLine____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void setEllipsize__Landroid_text_TextUtils$TruncateAt_2__V (MJIEnv env, int objRef, int rTextUtils$TruncateAt0) {
  }
  @MJI
  public static void setMarqueeRepeatLimit__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getEllipsize____Landroid_text_TextUtils$TruncateAt_2 (MJIEnv env, int objRef) {
    int rTextUtils$TruncateAt = MJIEnv.NULL;
    return rTextUtils$TruncateAt;
  }
  @MJI
  public static void setSelectAllOnFocus__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void setCursorVisible__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void onTextChanged__Ljava_lang_CharSequence_2III__V (MJIEnv env, int objRef, int rCharSequence0, int v1, int v2, int v3) {
  }
  @MJI
  public static void onSelectionChanged__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
  @MJI
  public static void addTextChangedListener__Landroid_text_TextWatcher_2__V (MJIEnv env, int objRef, int rTextWatcher0) {
  }
  @MJI
  public static void removeTextChangedListener__Landroid_text_TextWatcher_2__V (MJIEnv env, int objRef, int rTextWatcher0) {
  }
  @MJI
  public static void onStartTemporaryDetach____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onFinishTemporaryDetach____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void onFocusChanged__ZILandroid_graphics_Rect_2__V (MJIEnv env, int objRef, boolean v0, int v1, int rRect2) {
  }
  @MJI
  public static void onWindowFocusChanged__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void onVisibilityChanged__Landroid_view_View_2I__V (MJIEnv env, int objRef, int rView0, int v1) {
  }
  @MJI
  public static void clearComposingText____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void setSelected__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static boolean onTouchEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean didTouchFocusSelect____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void cancelLongPress____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean onTrackballEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setScroller__Landroid_widget_Scroller_2__V (MJIEnv env, int objRef, int rScroller0) {
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
  public static int computeHorizontalScrollRange____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeVerticalScrollRange____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int computeVerticalScrollExtent____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getTextColor__Landroid_content_Context_2Landroid_content_res_TypedArray_2I__I (MJIEnv env, int clsObjRef, int rContext0, int rTypedArray1, int v2) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static boolean onKeyShortcut__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean isInputMethodTarget____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean onTextContextMenuItem__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean performLongClick____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
}
