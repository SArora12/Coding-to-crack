package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	String directory;
	List<FileSystem> files;
	
	public Directory(String directory) {
		this.directory=directory;
		files=new ArrayList<>();
	}
	
	public void add(FileSystem fileObj) {
		files.add(fileObj);
	}
	
	@Override
	public void ls() {
		System.out.println("Directory Name:"+directory);
		
		for(FileSystem fileObj:files) {
			fileObj.ls();
		}
		
	}
	
}
