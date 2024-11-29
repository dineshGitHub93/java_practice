package java_practice.collections.Lambda;

public class EligibilityCheckDemo implements IConditionCheck{

	@Override
	public boolean ageConditionCheck(int num) {
		// TODO Auto-generated method stub
		if (num >=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
