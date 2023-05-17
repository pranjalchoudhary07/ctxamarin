package mono.com.clevertap.android.sdk.task;


public class OnSuccessListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.task.OnSuccessListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSuccess:(Ljava/lang/Object;)V:GetOnSuccess_Ljava_lang_Object_Handler:Com.Clevertap.Android.Sdk.Task.IOnSuccessListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Task.IOnSuccessListenerImplementor, CleverTap.Bindings.Android", OnSuccessListenerImplementor.class, __md_methods);
	}


	public OnSuccessListenerImplementor ()
	{
		super ();
		if (getClass () == OnSuccessListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Task.IOnSuccessListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onSuccess (java.lang.Object p0)
	{
		n_onSuccess (p0);
	}

	private native void n_onSuccess (java.lang.Object p0);

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
