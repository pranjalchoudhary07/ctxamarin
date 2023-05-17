package mono.com.clevertap.android.sdk.inbox;


public class CTInboxActivity_InboxActivityListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.inbox.CTInboxActivity.InboxActivityListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_messageDidClick:(Lcom/clevertap/android/sdk/inbox/CTInboxActivity;Lcom/clevertap/android/sdk/inbox/CTInboxMessage;Landroid/os/Bundle;Ljava/util/HashMap;Z)V:GetMessageDidClick_Lcom_clevertap_android_sdk_inbox_CTInboxActivity_Lcom_clevertap_android_sdk_inbox_CTInboxMessage_Landroid_os_Bundle_Ljava_util_HashMap_ZHandler:Com.Clevertap.Android.Sdk.Inbox.CTInboxActivity/IInboxActivityListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_messageDidShow:(Lcom/clevertap/android/sdk/inbox/CTInboxActivity;Lcom/clevertap/android/sdk/inbox/CTInboxMessage;Landroid/os/Bundle;)V:GetMessageDidShow_Lcom_clevertap_android_sdk_inbox_CTInboxActivity_Lcom_clevertap_android_sdk_inbox_CTInboxMessage_Landroid_os_Bundle_Handler:Com.Clevertap.Android.Sdk.Inbox.CTInboxActivity/IInboxActivityListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Inbox.CTInboxActivity+IInboxActivityListenerImplementor, CleverTap.Bindings.Android", CTInboxActivity_InboxActivityListenerImplementor.class, __md_methods);
	}


	public CTInboxActivity_InboxActivityListenerImplementor ()
	{
		super ();
		if (getClass () == CTInboxActivity_InboxActivityListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Inbox.CTInboxActivity+IInboxActivityListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void messageDidClick (com.clevertap.android.sdk.inbox.CTInboxActivity p0, com.clevertap.android.sdk.inbox.CTInboxMessage p1, android.os.Bundle p2, java.util.HashMap p3, boolean p4)
	{
		n_messageDidClick (p0, p1, p2, p3, p4);
	}

	private native void n_messageDidClick (com.clevertap.android.sdk.inbox.CTInboxActivity p0, com.clevertap.android.sdk.inbox.CTInboxMessage p1, android.os.Bundle p2, java.util.HashMap p3, boolean p4);


	public void messageDidShow (com.clevertap.android.sdk.inbox.CTInboxActivity p0, com.clevertap.android.sdk.inbox.CTInboxMessage p1, android.os.Bundle p2)
	{
		n_messageDidShow (p0, p1, p2);
	}

	private native void n_messageDidShow (com.clevertap.android.sdk.inbox.CTInboxActivity p0, com.clevertap.android.sdk.inbox.CTInboxMessage p1, android.os.Bundle p2);

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
