package ����ģʽ;

import java.io.File;

public class MakeDir {
	/**
	 * 
	 * @author ����ΰ
	 * 2014-10-24 ����9:39:03
	 * @����: �����ļ�
	 */
	public void createDir(String name){
		File dir=new File(name);
		dir.mkdir();
	}
	
	public void deleteDir(String name){
		File dir=new File(name);
		if(dir.exists()){
			dir.delete();
		}
	}
}
