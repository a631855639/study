package ����ģʽ;

public class RequestMakedir {
	private Command command;
	/*
	 * ִ������
	 */
	public void startExcutCommand(String name){
		command.execute(name);
	}
	/*
	 * ��������
	 */
	public void undoCommand(){
		command.undo();
	}
	public void setCommand(Command command) {
		this.command = command;
	}
}
