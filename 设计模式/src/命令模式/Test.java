package ����ģʽ;

public class Test {

	/**
	 * @author ����ΰ
	 * 2014-10-23 ����11:23:34
	 * @����:
	 */
	public static void main(String[] args) {
		/*CompanyArmy ����=new CompanyArmy();//���������
		Command command=new ConcreateCommand(����);//�����������ָ��������
		//ArmySuperior ָ�ӹ�=new ArmySuperior(command);//1�����������췽��
		ArmySuperior ָ�ӹ�=new ArmySuperior();//2���޲ι��췽��
		ָ�ӹ�.setCommand(command);
		ָ�ӹ�.startExecutCommand();*/
		//�����ļ���ɾ���ļ�
		MakeDir makeDir=new MakeDir();//����������
		Command command=new ConcreateCommand(makeDir);//������������,��ָ��������
		RequestMakedir requestMakedir=new RequestMakedir();//����������
		requestMakedir.setCommand(command);//��������
		requestMakedir.startExcutCommand("jiafei");//����jiafeiĿ¼
		requestMakedir.startExcutCommand("tom");//����tomĿ¼
		requestMakedir.startExcutCommand("jerry");//����jerryĿ¼
		requestMakedir.undoCommand();//ɾ��jerryĿ¼
		requestMakedir.undoCommand();//ɾ��tomĿ¼
		requestMakedir.undoCommand();//ɾ��jiafeiĿ¼
	}

}
