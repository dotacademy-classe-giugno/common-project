package entities;

public class Employee extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String smartphoneKind;
	private String skill;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Employee() {
		super();
		super.setJob("employee");
	}
	
	public String getSmartphoneKind() {
		return smartphoneKind;
	}

	public void setSmartphoneKind(String smartphoneKind) {
		this.smartphoneKind = smartphoneKind;
	}

	@Override
	public String toString() {
		return "Employee ["+ super.toString() + "smartphoneKind=" + smartphoneKind + "skill=" + skill +  "]";
	}
	
	@Override
	public String toJson() {
		// TODO Auto-generated method stub
		return super.toJson()+",\"smartphoneKind\":"+"\""+smartphoneKind+",\"skill\":\""+skill+"\"";
	}
	
}
