
public class BMI {
	String str;
	
	float weight(String str)
	{
		String s1[] = str.split("@"); 
		String p=s1[0].replace('-','.');
	 // System.out.println(p);
	  
	  float w=Float.parseFloat(p);
		System.out.println(w);
		return w;
	  
	// return p;
	}
	
	float height(String str)
	{
		String s2[] = str.split("@");
		String q=s2[1].replace('-','.');
		
		
		// System.out.println(q);
	//	return f;
		
		
		
		float h=Float.parseFloat(q);
		System.out.println(h);
		return h;
	}
	
	
	float calculateBMI(float w,float h)
	{
	
			
		if (w==0 || h==0)
		{
			return -1;
		}
		else {
			float bmi = 0;
			try {
		bmi=(w/(h*h));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println(bmi);
		
		return bmi;
		}
	
	}
	
	String checkStatus(float bmi)
	{
		if(bmi>=20 && bmi<=24)
		{
			System.out.println("nourished");
			return "nourished";
		
		}
		else
		{
			System.out.println("malnourished");
			return "malnourished";
		}
		
		
	}
	
	
	
public static void main(String[] args) {
//	System.out.println("HELLO ");
	
	
	BMI o=new BMI();
//	o.weight("68-33@1-78");
//	o.height("68-33@1-78");
//	 o.calculateBMI(o.weight("68-33@1-78"),o.height("68-33@1-78"));
	 o.checkStatus(o.calculateBMI(o.weight("68-33@1-78"),o.height("68-33@1-78")));
}
}
