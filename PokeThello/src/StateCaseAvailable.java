
public class StateCaseAvailable implements StateCase {
	
	private static StateCase stateCase=new StateCaseAvailable();
	
	private StateCaseAvailable(){}
	public static StateCase getEtat(){ return stateCase;}
	
	
	
	@Override
	public StateCase toAvalaible() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public StateCase toUnvalaible() {
		// TODO Auto-generated method stub
		return StateCaseUnvailable.getEtat();
	}

	@Override
	public String getImg() {
		// TODO Auto-generated method stub
		return null;
	}

}
