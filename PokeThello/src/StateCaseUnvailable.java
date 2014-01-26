
public class StateCaseUnvailable implements StateCase {
	
	private static StateCase stateCase=new StateCaseUnvailable();
	
	private StateCaseUnvailable(){}
	public static StateCase getEtat(){ return stateCase;}
	
	
	@Override
	public StateCase toAvalaible() {
		// TODO Auto-generated method stub
		return StateCaseAvailable.getEtat();
	}

	@Override
	public StateCase toUnvalaible() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String getImg() {
		// TODO Auto-generated method stub
		return null;
	}

}
