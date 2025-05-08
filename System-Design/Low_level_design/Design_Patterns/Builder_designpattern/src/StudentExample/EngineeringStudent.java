package StudentExample;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends StudentBuilder{

	@Override
	public
	StudentBuilder setStubjects() {
		List<String> sub=new ArrayList<>();
		sub.add("OS");
		sub.add("DSA");
		sub.add("CN");
		this.subjects=sub;
		return this;
	}
	
	
	
}
