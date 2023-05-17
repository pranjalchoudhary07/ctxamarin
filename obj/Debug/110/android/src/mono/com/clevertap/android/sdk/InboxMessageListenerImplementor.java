package mono.com.clevertap.android.sdk;


public class InboxMessageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.InboxMessageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInboxItemClicked:(Lcom/clevertap/android/sdk/inbox/CTInboxMessage;)V:GetOnInboxItemClicked_Lcom_clevertap_android_sdk_inbox_CTInboxMessage_Handler:Com.Clevertap.Android.Sdk.IInboxMessageListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.IInboxMessageListenerImplementor, CleverTap.Bindings.Android", InboxMessageListenerImplementor.class, __md_methods);
	}


	public InboxMessageListenerImplementor ()
	{
		super ();
		if (getClass () == InboxMessageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.IInboxMessageListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onInboxItemClicked (com.clevertap.android.sdk.inbox.CTInboxMessage p0)
	{
		n_onInboxItemClicked (p0);
	}

	private native void n_onInboxItemClicked (com.clevertap.android.sdk.inbox.CTInboxMessage p0);

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
