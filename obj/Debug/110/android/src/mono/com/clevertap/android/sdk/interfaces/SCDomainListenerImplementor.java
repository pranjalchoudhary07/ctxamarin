package mono.com.clevertap.android.sdk.interfaces;


public class SCDomainListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.interfaces.SCDomainListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSCDomainAvailable:(Ljava/lang/String;)V:GetOnSCDomainAvailable_Ljava_lang_String_Handler:Com.Clevertap.Android.Sdk.Interfaces.ISCDomainListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_onSCDomainUnavailable:()V:GetOnSCDomainUnavailableHandler:Com.Clevertap.Android.Sdk.Interfaces.ISCDomainListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Interfaces.ISCDomainListenerImplementor, CleverTap.Bindings.Android", SCDomainListenerImplementor.class, __md_methods);
	}


	public SCDomainListenerImplementor ()
	{
		super ();
		if (getClass () == SCDomainListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Interfaces.ISCDomainListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onSCDomainAvailable (java.lang.String p0)
	{
		n_onSCDomainAvailable (p0);
	}

	private native void n_onSCDomainAvailable (java.lang.String p0);


	public void onSCDomainUnavailable ()
	{
		n_onSCDomainUnavailable ();
	}

	private native void n_onSCDomainUnavailable ();

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
