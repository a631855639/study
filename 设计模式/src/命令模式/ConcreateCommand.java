package ����ģʽ;
/**
 * 
 * @author ����ΰ
 * 2014-10-23 ����11:19:56
 * TODO �������ʵ��������ӿ�
 */
public class ConcreateCommand implements Command {
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
}
