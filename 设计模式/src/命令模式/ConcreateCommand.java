package ����ģʽ;

import java.util.ArrayList;

/**
 * 
 * @author ����ΰ
 * 2014-10-23 ����11:19:56
 * TODO �������ʵ��������ӿ�
 */
public class ConcreateCommand implements Command {
	//ָ�ӹ���ʿ��������
	private CompanyArmy army;
	public ConcreateCommand() {
	}
	public ConcreateCommand(CompanyArmy army) {
		this.army=army;
	}
	@Override
	public void execute() {
		army.sneakAttack();
	}
	
	//�����ļ��볷�������ļ�(ɾ���ļ�)������
	private ArrayList<String> dirNameList;
	MakeDir makeDir;
	
	public ConcreateCommand(MakeDir makeDir){
		dirNameList=new ArrayList<String>();
		this.makeDir=makeDir;
	}
	@Override
	public void execute(String fileName) {
		makeDir.createDir(fileName);
		dirNameList.add(fileName);
	}
	@Override
	public void undo() {
		if(dirNameList.size()>0){
			int m=dirNameList.size();
			String str=dirNameList.get(m-1);
			makeDir.deleteDir(str);
			dirNameList.remove(m-1);
		}
	}
}
