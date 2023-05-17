package mono.com.clevertap.android.sdk.pushnotification;


public class CTPushProviderListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.pushnotification.CTPushProviderListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNewToken:(Ljava/lang/String;Lcom/clevertap/android/sdk/pushnotification/PushConstants$PushType;)V:GetOnNewToken_Ljava_lang_String_Lcom_clevertap_android_sdk_pushnotification_PushConstants_PushType_Handler:Com.Clevertap.Android.Sdk.Pushnotification.ICTPushProviderListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Pushnotification.ICTPushProviderListenerImplementor, CleverTap.Bindings.Android", CTPushProviderListenerImplementor.class, __md_methods);
	}


	public CTPushProviderListenerImplementor ()
	{
		super ();
		if (getClass () == CTPushProviderListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Pushnotification.ICTPushProviderListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onNewToken (java.lang.String p0, com.clevertap.android.sdk.pushnotification.PushConstants.PushType p1)
	{
		n_onNewToken (p0, p1);
	}

	private native void n_onNewToken (java.lang.String p0, com.clevertap.android.sdk.pushnotification.PushConstants.PushType p1);

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
