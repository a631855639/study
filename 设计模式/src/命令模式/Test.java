package ����ģʽ;

public class Test {

	/**
	 * @author ����ΰ
	 * 2014-10-23 ����11:23:34
	 * @����:
	 */
	public static void main(String[] args) {
		CompanyArmy ����=new CompanyArmy();//���������
		Command command=new ConcreateCommand(����);//�����������ָ��������
		//ArmySuperior ָ�ӹ�=new ArmySuperior(command);//1�����������췽��
		ArmySuperior ָ�ӹ�=new ArmySuperior();//2���޲ι��췽��
		ָ�ӹ�.setCommand(command);
		ָ�ӹ�.startExecutCommand();
	}

}
