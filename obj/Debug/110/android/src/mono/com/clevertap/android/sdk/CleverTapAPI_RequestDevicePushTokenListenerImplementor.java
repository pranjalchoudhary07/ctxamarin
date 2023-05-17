package mono.com.clevertap.android.sdk;


public class CleverTapAPI_RequestDevicePushTokenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.CleverTapAPI.RequestDevicePushTokenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDevicePushToken:(Ljava/lang/String;Lcom/clevertap/android/sdk/pushnotification/PushConstants$PushType;)V:GetOnDevicePushToken_Ljava_lang_String_Lcom_clevertap_android_sdk_pushnotification_PushConstants_PushType_Handler:Com.Clevertap.Android.Sdk.CleverTapAPI/IRequestDevicePushTokenListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.CleverTapAPI+IRequestDevicePushTokenListenerImplementor, CleverTap.Bindings.Android", CleverTapAPI_RequestDevicePushTokenListenerImplementor.class, __md_methods);
	}


	public CleverTapAPI_RequestDevicePushTokenListenerImplementor ()
	{
		super ();
		if (getClass () == CleverTapAPI_RequestDevicePushTokenListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.CleverTapAPI+IRequestDevicePushTokenListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDevicePushToken (java.lang.String p0, com.clevertap.android.sdk.pushnotification.PushConstants.PushType p1)
	{
		n_onDevicePushToken (p0, p1);
	}

	private native void n_onDevicePushToken (java.lang.String p0, com.clevertap.android.sdk.pushnotification.PushConstants.PushType p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
