package mono.com.clevertap.android.sdk.interfaces;


public class OnInitCleverTapIDListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitCleverTapID:(Ljava/lang/String;)V:GetOnInitCleverTapID_Ljava_lang_String_Handler:Com.Clevertap.Android.Sdk.Interfaces.IOnInitCleverTapIDListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Interfaces.IOnInitCleverTapIDListenerImplementor, CleverTap.Bindings.Android", OnInitCleverTapIDListenerImplementor.class, __md_methods);
	}


	public OnInitCleverTapIDListenerImplementor ()
	{
		super ();
		if (getClass () == OnInitCleverTapIDListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Interfaces.IOnInitCleverTapIDListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onInitCleverTapID (java.lang.String p0)
	{
		n_onInitCleverTapID (p0);
	}

	private native void n_onInitCleverTapID (java.lang.String p0);

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
