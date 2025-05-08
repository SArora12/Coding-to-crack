package StudentExample;

import java.util.ArrayList;
import java.util.List;

public class MBAstudent extends StudentBuilder {

	@Override
	public
	StudentBuilder setStubjects() {
		List<String> sub=new ArrayList<>();
		sub.add("Business management");
		sub.add("Managerial studies");
		this.subjects=sub;
		return this;
	}

}
