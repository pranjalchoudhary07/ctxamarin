package mono.com.clevertap.android.sdk.interfaces;


public class NotificationRenderedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.interfaces.NotificationRenderedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNotificationRendered:(Z)V:GetOnNotificationRendered_ZHandler:Com.Clevertap.Android.Sdk.Interfaces.INotificationRenderedListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Interfaces.INotificationRenderedListenerImplementor, CleverTap.Bindings.Android", NotificationRenderedListenerImplementor.class, __md_methods);
	}


	public NotificationRenderedListenerImplementor ()
	{
		super ();
		if (getClass () == NotificationRenderedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Interfaces.INotificationRenderedListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onNotificationRendered (boolean p0)
	{
		n_onNotificationRendered (p0);
	}

	private native void n_onNotificationRendered (boolean p0);

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
