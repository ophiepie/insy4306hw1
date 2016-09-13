public class CommercialProperty extends Property
{
	private String businessName;
	private String stateCode;

	public CommercialProperty()
	{
		super.setPropertyAddress(new Address());
		super.setMarketValue(0.0);
		super.setSquareFeet(0);
		super.setFloodZone(false);
		this.setBusinessName("");
		this.setStateCode("");
	}
	public CommercialProperty(Address a, double v, int f, boolean z, String b, String c)
	{
		super.setPropertyAddress(a);
		super.setMarketValue(v);
		super.setSquareFeet(f);
		super.setFloodZone(z);
		this.setBusinessName(b);
		this.setStateCode(c);
	}
	public String getBusinessName()
	{
		return this.businessName;
	}
	public String getStateCode()
	{
		return this.stateCode;
	}
	public void setBusinessName(String n)
	{
		this.businessName = n;
	}
	public void setStateCode(String c)
	{
		this.stateCode = c;
	}
	public String toString()
	{
		String str = super.toString() + "Business Name: " + businessName + "\nState Code: " + stateCode;
		return str;
	}
	public double calculateTaxes()
	{
		return 0.0;
	}
}