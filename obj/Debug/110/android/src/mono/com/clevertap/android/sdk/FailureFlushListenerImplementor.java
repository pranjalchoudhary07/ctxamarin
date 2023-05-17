package mono.com.clevertap.android.sdk;


public class FailureFlushListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.FailureFlushListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_failureFlush:(Landroid/content/Context;)V:GetFailureFlush_Landroid_content_Context_Handler:Com.Clevertap.Android.Sdk.IFailureFlushListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.IFailureFlushListenerImplementor, CleverTap.Bindings.Android", FailureFlushListenerImplementor.class, __md_methods);
	}


	public FailureFlushListenerImplementor ()
	{
		super ();
		if (getClass () == FailureFlushListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.IFailureFlushListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void failureFlush (android.content.Context p0)
	{
		n_failureFlush (p0);
	}

	private native void n_failureFlush (android.content.Context p0);

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
