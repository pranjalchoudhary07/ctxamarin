package mono.com.clevertap.android.sdk.task;


public class OnFailureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.task.OnFailureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailure:(Ljava/lang/Object;)V:GetOnFailure_Ljava_lang_Object_Handler:Com.Clevertap.Android.Sdk.Task.IOnFailureListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Task.IOnFailureListenerImplementor, CleverTap.Bindings.Android", OnFailureListenerImplementor.class, __md_methods);
	}


	public OnFailureListenerImplementor ()
	{
		super ();
		if (getClass () == OnFailureListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Task.IOnFailureListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFailure (java.lang.Object p0)
	{
		n_onFailure (p0);
	}

	private native void n_onFailure (java.lang.Object p0);

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
