// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package phonenumberutil.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;

/**
 * Gets an invalid number for the specified region. Returns empty if there is invalid data or code 001 is passed.
 */
public class GetInvalidExampleNumber extends CustomJavaAction<java.lang.String>
{
	private java.lang.String RegionCode;
	private phonenumberutil.proxies.Format Format;

	public GetInvalidExampleNumber(IContext context, java.lang.String RegionCode, java.lang.String Format)
	{
		super(context);
		this.RegionCode = RegionCode;
		this.Format = Format == null ? null : phonenumberutil.proxies.Format.valueOf(Format);
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		PhoneNumberUtil pnu = PhoneNumberUtil.getInstance();
		PhoneNumber phoneNumber = pnu.getExampleNumber(this.RegionCode);
		return pnu.format(phoneNumber, PhoneNumberFormat.valueOf(this.Format.toString()));	
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetInvalidExampleNumber";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
