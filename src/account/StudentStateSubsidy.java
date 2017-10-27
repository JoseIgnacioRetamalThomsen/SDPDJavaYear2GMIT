package account;

public interface StudentStateSubsidy extends StateSubsidy
{
	//this is implicitly public
	float STUDENT_SUBSIDY = 1000;
	
	void addStudentStateSubsidy(float ST);
}
